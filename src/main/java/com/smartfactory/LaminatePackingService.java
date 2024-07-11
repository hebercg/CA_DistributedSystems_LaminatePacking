package com.smartfactory;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.smartfactory.LaminatePackingProto.ProductionLineControlRequest;
import com.smartfactory.LaminatePackingProto.ProductionLineControlResponse;
import com.smartfactory.LaminatePackingProto.StartProductionRequest;
import com.smartfactory.LaminatePackingProto.StartProductionResponse;

import java.io.IOException;

public class LaminatePackingService extends com.smartfactory.LaminatePackingGrpc.LaminatePackingImplBase {

    @Override
    public void productionLineControl(ProductionLineControlRequest request, StreamObserver<ProductionLineControlResponse> responseObserver) {
        String orderId = request.getOrderID();
        int quantity = request.getQuantity();

        // Process the order
        String status = "SUCCESS";
        String message = "Order " + orderId + " with quantity " + quantity + " processed successfully.";

        ProductionLineControlResponse response = ProductionLineControlResponse.newBuilder()
                .setStatus(status)
                .setMessage(message)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void startProduction(StartProductionRequest request, StreamObserver<StartProductionResponse> responseObserver) {
        String orderId = request.getOrderID();

        // Process the start of the production
        String status = "STARTED";
        String message = "Production for order " + orderId + " has started.";

        StartProductionResponse response = StartProductionResponse.newBuilder()
                .setStatus(status)
                .setMessage(message)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Implement other RPCs

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051)
                .addService(new LaminatePackingService())
                .build()
                .start();

        System.out.println("Server started, listening on " + server.getPort());
        server.awaitTermination();
    }
}