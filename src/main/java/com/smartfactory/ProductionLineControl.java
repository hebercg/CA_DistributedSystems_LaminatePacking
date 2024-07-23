package com.smartfactory;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;

public class ProductionLineControl {

    private final com.smartfactory.LaminatePackingGrpc.LaminatePackingBlockingStub blockingStub;

    public ProductionLineControl() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        blockingStub = com.smartfactory.LaminatePackingGrpc.newBlockingStub(channel);
    }

    public void addOrder() {
        String orderId = JOptionPane.showInputDialog("Enter Order ID to be added to production:");
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity of boxes to be packed :"));

        com.smartfactory.LaminatePackingProto.ProductionLineControlRequest request = com.smartfactory.LaminatePackingProto.ProductionLineControlRequest.newBuilder()
                .setOrderID(orderId)
                .setQuantity(quantity)
                .build();

        com.smartfactory.LaminatePackingProto.ProductionLineControlResponse response = blockingStub.productionLineControl(request);

        JOptionPane.showMessageDialog(null, "Status: " + response.getStatus() + "\nMessage: " + response.getMessage());
    }
    public void startProduction() {
        String orderId = JOptionPane.showInputDialog("Enter Order ID to start the production:");

        com.smartfactory.LaminatePackingProto.StartProductionRequest request = com.smartfactory.LaminatePackingProto.StartProductionRequest.newBuilder()
                .setOrderID(orderId)
                .build();

        com.smartfactory.LaminatePackingProto.StartProductionResponse response = blockingStub.startProduction(request);

        JOptionPane.showMessageDialog(null, "Status: " + response.getStatus() + "\nMessage: " + response.getMessage());
    }

    public void stopProduction() {
        String orderId = JOptionPane.showInputDialog("Enter Order ID to stop the production:");
        String reason = JOptionPane.showInputDialog("Enter Reason for Stopping : " + "1: Missing material, 2: Wrong order");

        com.smartfactory.LaminatePackingProto.StopProductionRequest request = com.smartfactory.LaminatePackingProto.StopProductionRequest.newBuilder()
                .setOrderID(orderId)
                .setReason(reason)
                .build();

        com.smartfactory.LaminatePackingProto.StopProductionResponse response = blockingStub.stopProduction(request);

        JOptionPane.showMessageDialog(null, "Status: " + response.getStatus() + "\nMessage: " + response.getMessage());
    }
    public void updateOrder() {
        String orderId = JOptionPane.showInputDialog("Enter Order ID to be updated:");
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity to be added or removed from order:"));
        String description = JOptionPane.showInputDialog("Enter reason for update the order: " + "ex.: Increase of order, Wrong colour...");

        LaminatePackingProto.UpdateOrderRequest request = LaminatePackingProto.UpdateOrderRequest.newBuilder()
                .setOrderID(orderId)
                .setQuantity(quantity)
                .setDescription(description)
                .build();

        LaminatePackingProto.UpdateOrderResponse response = blockingStub.updateOrder(request);

        JOptionPane.showMessageDialog(null, "Status: " + response.getStatus() + "\nMessage: " + response.getMessage());
    }

//production stage that has surveillance, multiple stages of the packing line.
    public void productionSurveillance() {
        String stage = JOptionPane.showInputDialog("Enter Production Stage: " + "1: box entry, 2: laminate entry, 3: plastic cover, 4 packing exit ");
        String inspectionResult = JOptionPane.showInputDialog("Enter Inspection Result: " + "passed or failed ");

        LaminatePackingProto.ProductionSurveillanceRequest request = LaminatePackingProto.ProductionSurveillanceRequest.newBuilder()
                .setStage(stage)
                .setInspectionResult(inspectionResult)
                .build();

        LaminatePackingProto.ProductionSurveillanceResponse response = blockingStub.productionSurveillance(request);

        JOptionPane.showMessageDialog(null, "Status: " + response.getStatus() + "\nMessage: " + response.getMessage());
    }

    public void visualInspection() {
        LaminatePackingProto.VisualInspectionRequest request = LaminatePackingProto.VisualInspectionRequest.newBuilder().build();

        LaminatePackingProto.VisualInspectionResponse response = blockingStub.visualInspection(request);

        JOptionPane.showMessageDialog(null, "Status: " + response.getStatus() + "\nMessage: " + response.getMessage());
    }

    public void packagingLineJamAlerts() {
        String sensorID = JOptionPane.showInputDialog("Enter Sensor ID: " + "1: box feed, 2: Laminate feed, 3: Plastic cover");
        String timestamp = JOptionPane.showInputDialog("Enter Timestamp: " + "ex.: 23/07/2024" );

        LaminatePackingProto.PackagingLineJamAlertsRequest request = LaminatePackingProto.PackagingLineJamAlertsRequest.newBuilder()
                .setSensorID(sensorID)
                .setTimestamp(timestamp)
                .build();

        LaminatePackingProto.PackagingLineJamAlertsResponse response = blockingStub.packagingLineJamAlerts(request);

        JOptionPane.showMessageDialog(null, "Status: " + response.getStatus() + "\nMessage: " + response.getMessage());
    }

    public void productionScheduling() {
        String orderId = JOptionPane.showInputDialog("Enter Order ID:");
        String scheduledTime = JOptionPane.showInputDialog("Enter Scheduled Time: " + " ex.: 12:04:00");

        LaminatePackingProto.ProductionSchedulingRequest request = LaminatePackingProto.ProductionSchedulingRequest.newBuilder()
                .setOrderID(orderId)
                .setScheduledTime(scheduledTime)
                .build();

        LaminatePackingProto.ProductionSchedulingResponse response = blockingStub.productionScheduling(request);

        JOptionPane.showMessageDialog(null, "Status: " + response.getStatus() + "\nMessage: " + response.getMessage());
    }



    public static void main(String[] args) {
        ProductionLineControl controller = new ProductionLineControl();
        controller.addOrder();
        controller.startProduction();
        controller.stopProduction();
        controller.updateOrder();
        controller.productionSurveillance();
        controller.packagingLineJamAlerts();
        controller.productionScheduling();
        controller.visualInspection();


    }
}