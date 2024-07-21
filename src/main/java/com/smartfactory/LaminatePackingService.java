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
    // RPCs implementation
    @Override
    public void productionLineControl(ProductionLineControlRequest request, StreamObserver<ProductionLineControlResponse> responseObserver) {
        String orderId = request.getOrderID();
        int quantity = request.getQuantity();

        // Process the order
        String status = "Success";
        String message = "Order " + orderId + " quantity " + quantity + " processed successfully.";

        ProductionLineControlResponse response = ProductionLineControlResponse.newBuilder()
                .setStatus(status)
                .setMessage(message)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    // Method to start the production
    @Override
    public void startProduction(StartProductionRequest request, StreamObserver<StartProductionResponse> responseObserver) {
        String orderId = request.getOrderID();

        // Process the start of the production
        String status = "Started";
        String message = "Production for order " + orderId + " has started.";

        StartProductionResponse response = StartProductionResponse.newBuilder()
                .setStatus(status)
                .setMessage(message)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    // Method to stop the production

    @Override
    public void stopProduction(com.smartfactory.LaminatePackingProto.StopProductionRequest request, StreamObserver<com.smartfactory.LaminatePackingProto.StopProductionResponse> responseObserver) {
        String orderId = request.getOrderID();
        String reason = request.getReason();

        String status = "Stropped";
        String message = "Production for order " + orderId + " has stopped. Reason: " + reason;

        com.smartfactory.LaminatePackingProto.StopProductionResponse response = com.smartfactory.LaminatePackingProto.StopProductionResponse.newBuilder()
                .setStatus(status)
                .setMessage(message)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    // Method to add a new order
    @Override
    public void addOrder(LaminatePackingProto.AddOrderRequest request, StreamObserver<LaminatePackingProto.AddOrderResponse> responseObserver) {
        String orderId = request.getOrderID();
        int quantity = request.getQuantity();
        String description = request.getDescription();

        String status = "ADDED";
        String message = "Order " + orderId + " quantity " + quantity + " and description \"" + description + "\" added.";

        LaminatePackingProto.AddOrderResponse response = LaminatePackingProto.AddOrderResponse.newBuilder()
                .setStatus(status)
                .setMessage(message)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    // Method to update current order
    @Override
    public void updateOrder(LaminatePackingProto.UpdateOrderRequest request, StreamObserver<LaminatePackingProto.UpdateOrderResponse> responseObserver) {
        String orderId = request.getOrderID();
        int quantity = request.getQuantity();
        String description = request.getDescription();

        String status = "UPDATED";
        String message = "Order " + orderId + " updated to quantity " + quantity + " with description \"" + description + "\".";

        LaminatePackingProto.UpdateOrderResponse response = LaminatePackingProto.UpdateOrderResponse.newBuilder()
                .setStatus(status)
                .setMessage(message)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Method to monitor the production line

   @Override
    public void productionSurveillance(LaminatePackingProto.ProductionSurveillanceRequest request, StreamObserver<LaminatePackingProto.ProductionSurveillanceResponse> responseObserver) {
        String stage = request.getStage();
        String inspectionResult = request.getInspectionResult();

        String status = "INSPECTED";
        String message = "Inspection at stage " + stage + " result: " + inspectionResult;

        LaminatePackingProto.ProductionSurveillanceResponse response = LaminatePackingProto.ProductionSurveillanceResponse.newBuilder()
                .setStatus(status)
                .setMessage(message)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    // Method to monitor if the packing get stuck during the production
    @Override
    public void packagingLineJamAlerts(LaminatePackingProto.PackagingLineJamAlertsRequest request, StreamObserver<LaminatePackingProto.PackagingLineJamAlertsResponse> responseObserver) {
        String sensorID = request.getSensorID();
        String timestamp = request.getTimestamp();

        String status = "ALERT";
        String message = "Jam alert from sensor " + sensorID + " at " + timestamp;

        LaminatePackingProto.PackagingLineJamAlertsResponse response = LaminatePackingProto.PackagingLineJamAlertsResponse.newBuilder()
                .setStatus(status)
                .setMessage(message)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    // Method to schedule or to add what needs to be produced

    @Override
    public void productionScheduling(LaminatePackingProto.ProductionSchedulingRequest request, StreamObserver<LaminatePackingProto.ProductionSchedulingResponse> responseObserver) {
        String orderId = request.getOrderID();
        String scheduledTime = request.getScheduledTime();

        String status = "SCHEDULED";
        String message = "Order " + orderId + " scheduled for " + scheduledTime;

        LaminatePackingProto.ProductionSchedulingResponse response = LaminatePackingProto.ProductionSchedulingResponse.newBuilder()
                .setStatus(status)
                .setMessage(message)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public void visualInspection(LaminatePackingProto.VisualInspectionRequest request, StreamObserver<LaminatePackingProto.VisualInspectionResponse> responseObserver) {
        // Image processing simulation
        boolean isAnomalyDetected = processImage();

        String status = isAnomalyDetected ? "Anomaly Detected" : "No Anomaly";
        String message = isAnomalyDetected ? "Anomaly detected in the inspection." : "No issues found in the inspection.";

        LaminatePackingProto.VisualInspectionResponse response = LaminatePackingProto.VisualInspectionResponse.newBuilder()
                .setStatus(status)
                .setMessage(message)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private boolean processImage() {
        // Simulating the image processing and problem detection
        // For test purpose randomly return true (Anomaly detected) or false (no Anomaly)
        return Math.random() > 0.5;
    }




    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051)
                .addService(new LaminatePackingService())
                .build()
                .start();

        System.out.println("Server started " + server.getPort());
        server.awaitTermination();
    }
}