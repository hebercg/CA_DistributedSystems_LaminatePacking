package com;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;


public class LaminatePackingService {
    public class LAminatePackingService extends LaminatePackingGrpc.LaminatePackingImplBase {
        public void productionLineControl(ProductionLineControlRequest request, StreamObserver<ProductionLineControlResponse> responseObserver){
            String orderID = request.getOrderID();
            int quantity = request.getQuantity();

            String status = "Success";
            String message = "Order" + orderID + " quantity " + quantity + " successfully processed  " + status;
        ProductionLineControlResponse  response =   ProductionLineControlREsponse.newBuilder()
                .setStatus(status)
                .setMessage(message)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
        }

        public static void main(String[] args) throws IOException, InterruptedException {
            Server server = ServerBuilder.forPort(50051)
                    .addService(new LaminatePackingService())
                    .build()
                    .start();

            System.out.println("Server started, listening on " + server.getPort());
            server.awaitTermination();
        }
    }

        }

