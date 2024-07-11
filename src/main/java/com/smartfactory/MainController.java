package com.smartfactory;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;

public class MainController {

    private final com.smartfactory.LaminatePackingGrpc.LaminatePackingBlockingStub blockingStub;

    public MainController() {
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

    public static void main(String[] args) {
        MainController controller = new MainController();
        controller.addOrder();
    }
}