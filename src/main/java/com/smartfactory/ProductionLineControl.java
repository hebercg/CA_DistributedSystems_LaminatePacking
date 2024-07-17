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
        String orderId = JOptionPane.showInputDialog("Enter Order ID:");
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity:"));

        com.smartfactory.LaminatePackingProto.ProductionLineControlRequest request = com.smartfactory.LaminatePackingProto.ProductionLineControlRequest.newBuilder()
                .setOrderID(orderId)
                .setQuantity(quantity)
                .build();

        com.smartfactory.LaminatePackingProto.ProductionLineControlResponse response = blockingStub.productionLineControl(request);

        JOptionPane.showMessageDialog(null, "Status: " + response.getStatus() + "\nMessage: " + response.getMessage());
    }
    public void startProduction() {
        String orderId = JOptionPane.showInputDialog("Enter Order ID:");

        com.smartfactory.LaminatePackingProto.StartProductionRequest request = com.smartfactory.LaminatePackingProto.StartProductionRequest.newBuilder()
                .setOrderID(orderId)
                .build();

        com.smartfactory.LaminatePackingProto.StartProductionResponse response = blockingStub.startProduction(request);

        JOptionPane.showMessageDialog(null, "Status: " + response.getStatus() + "\nMessage: " + response.getMessage());
    }

    public void stopProduction() {
        String orderId = JOptionPane.showInputDialog("Enter Order ID:");
        String reason = JOptionPane.showInputDialog("Enter Reason for Stopping:");

        com.smartfactory.LaminatePackingProto.StopProductionRequest request = com.smartfactory.LaminatePackingProto.StopProductionRequest.newBuilder()
                .setOrderID(orderId)
                .setReason(reason)
                .build();

        com.smartfactory.LaminatePackingProto.StopProductionResponse response = blockingStub.stopProduction(request);

        JOptionPane.showMessageDialog(null, "Status: " + response.getStatus() + "\nMessage: " + response.getMessage());
    }
    public void updateOrder() {
        String orderId = JOptionPane.showInputDialog("Enter Order ID:");
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity:"));
        String description = JOptionPane.showInputDialog("Enter Description:");

        LaminatePackingProto.UpdateOrderRequest request = LaminatePackingProto.UpdateOrderRequest.newBuilder()
                .setOrderID(orderId)
                .setQuantity(quantity)
                .setDescription(description)
                .build();

        LaminatePackingProto.UpdateOrderResponse response = blockingStub.updateOrder(request);

        JOptionPane.showMessageDialog(null, "Status: " + response.getStatus() + "\nMessage: " + response.getMessage());
    }


    public void productionSurveillance() {
        String stage = JOptionPane.showInputDialog("Enter Production Stage:");
        String inspectionResult = JOptionPane.showInputDialog("Enter Inspection Result:");

        LaminatePackingProto.ProductionSurveillanceRequest request = LaminatePackingProto.ProductionSurveillanceRequest.newBuilder()
                .setStage(stage)
                .setInspectionResult(inspectionResult)
                .build();

        LaminatePackingProto.ProductionSurveillanceResponse response = blockingStub.productionSurveillance(request);

        JOptionPane.showMessageDialog(null, "Status: " + response.getStatus() + "\nMessage: " + response.getMessage());
    }



    public static void main(String[] args) {
        ProductionLineControl controller = new ProductionLineControl();
        controller.addOrder();
        controller.startProduction();
        controller.stopProduction();
        controller.updateOrder();
        controller.productionSurveillance();


    }
}