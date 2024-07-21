package com.smartfactory;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: laminatepacking.proto")
public final class LaminatePackingGrpc {

  private LaminatePackingGrpc() {}

  public static final String SERVICE_NAME = "com.smartfactory.LaminatePacking";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.ProductionLineControlRequest,
      com.smartfactory.LaminatePackingProto.ProductionLineControlResponse> getProductionLineControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProductionLineControl",
      requestType = com.smartfactory.LaminatePackingProto.ProductionLineControlRequest.class,
      responseType = com.smartfactory.LaminatePackingProto.ProductionLineControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.ProductionLineControlRequest,
      com.smartfactory.LaminatePackingProto.ProductionLineControlResponse> getProductionLineControlMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.ProductionLineControlRequest, com.smartfactory.LaminatePackingProto.ProductionLineControlResponse> getProductionLineControlMethod;
    if ((getProductionLineControlMethod = LaminatePackingGrpc.getProductionLineControlMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getProductionLineControlMethod = LaminatePackingGrpc.getProductionLineControlMethod) == null) {
          LaminatePackingGrpc.getProductionLineControlMethod = getProductionLineControlMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.LaminatePackingProto.ProductionLineControlRequest, com.smartfactory.LaminatePackingProto.ProductionLineControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProductionLineControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.ProductionLineControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.ProductionLineControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("ProductionLineControl"))
              .build();
        }
      }
    }
    return getProductionLineControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.StartProductionRequest,
      com.smartfactory.LaminatePackingProto.StartProductionResponse> getStartProductionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartProduction",
      requestType = com.smartfactory.LaminatePackingProto.StartProductionRequest.class,
      responseType = com.smartfactory.LaminatePackingProto.StartProductionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.StartProductionRequest,
      com.smartfactory.LaminatePackingProto.StartProductionResponse> getStartProductionMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.StartProductionRequest, com.smartfactory.LaminatePackingProto.StartProductionResponse> getStartProductionMethod;
    if ((getStartProductionMethod = LaminatePackingGrpc.getStartProductionMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getStartProductionMethod = LaminatePackingGrpc.getStartProductionMethod) == null) {
          LaminatePackingGrpc.getStartProductionMethod = getStartProductionMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.LaminatePackingProto.StartProductionRequest, com.smartfactory.LaminatePackingProto.StartProductionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartProduction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.StartProductionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.StartProductionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("StartProduction"))
              .build();
        }
      }
    }
    return getStartProductionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.StopProductionRequest,
      com.smartfactory.LaminatePackingProto.StopProductionResponse> getStopProductionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopProduction",
      requestType = com.smartfactory.LaminatePackingProto.StopProductionRequest.class,
      responseType = com.smartfactory.LaminatePackingProto.StopProductionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.StopProductionRequest,
      com.smartfactory.LaminatePackingProto.StopProductionResponse> getStopProductionMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.StopProductionRequest, com.smartfactory.LaminatePackingProto.StopProductionResponse> getStopProductionMethod;
    if ((getStopProductionMethod = LaminatePackingGrpc.getStopProductionMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getStopProductionMethod = LaminatePackingGrpc.getStopProductionMethod) == null) {
          LaminatePackingGrpc.getStopProductionMethod = getStopProductionMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.LaminatePackingProto.StopProductionRequest, com.smartfactory.LaminatePackingProto.StopProductionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopProduction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.StopProductionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.StopProductionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("StopProduction"))
              .build();
        }
      }
    }
    return getStopProductionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.AddOrderRequest,
      com.smartfactory.LaminatePackingProto.AddOrderResponse> getAddOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOrder",
      requestType = com.smartfactory.LaminatePackingProto.AddOrderRequest.class,
      responseType = com.smartfactory.LaminatePackingProto.AddOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.AddOrderRequest,
      com.smartfactory.LaminatePackingProto.AddOrderResponse> getAddOrderMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.AddOrderRequest, com.smartfactory.LaminatePackingProto.AddOrderResponse> getAddOrderMethod;
    if ((getAddOrderMethod = LaminatePackingGrpc.getAddOrderMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getAddOrderMethod = LaminatePackingGrpc.getAddOrderMethod) == null) {
          LaminatePackingGrpc.getAddOrderMethod = getAddOrderMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.LaminatePackingProto.AddOrderRequest, com.smartfactory.LaminatePackingProto.AddOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.AddOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.AddOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("AddOrder"))
              .build();
        }
      }
    }
    return getAddOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.UpdateOrderRequest,
      com.smartfactory.LaminatePackingProto.UpdateOrderResponse> getUpdateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrder",
      requestType = com.smartfactory.LaminatePackingProto.UpdateOrderRequest.class,
      responseType = com.smartfactory.LaminatePackingProto.UpdateOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.UpdateOrderRequest,
      com.smartfactory.LaminatePackingProto.UpdateOrderResponse> getUpdateOrderMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.UpdateOrderRequest, com.smartfactory.LaminatePackingProto.UpdateOrderResponse> getUpdateOrderMethod;
    if ((getUpdateOrderMethod = LaminatePackingGrpc.getUpdateOrderMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getUpdateOrderMethod = LaminatePackingGrpc.getUpdateOrderMethod) == null) {
          LaminatePackingGrpc.getUpdateOrderMethod = getUpdateOrderMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.LaminatePackingProto.UpdateOrderRequest, com.smartfactory.LaminatePackingProto.UpdateOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.UpdateOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.UpdateOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("UpdateOrder"))
              .build();
        }
      }
    }
    return getUpdateOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.ProductionSurveillanceRequest,
      com.smartfactory.LaminatePackingProto.ProductionSurveillanceResponse> getProductionSurveillanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProductionSurveillance",
      requestType = com.smartfactory.LaminatePackingProto.ProductionSurveillanceRequest.class,
      responseType = com.smartfactory.LaminatePackingProto.ProductionSurveillanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.ProductionSurveillanceRequest,
      com.smartfactory.LaminatePackingProto.ProductionSurveillanceResponse> getProductionSurveillanceMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.ProductionSurveillanceRequest, com.smartfactory.LaminatePackingProto.ProductionSurveillanceResponse> getProductionSurveillanceMethod;
    if ((getProductionSurveillanceMethod = LaminatePackingGrpc.getProductionSurveillanceMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getProductionSurveillanceMethod = LaminatePackingGrpc.getProductionSurveillanceMethod) == null) {
          LaminatePackingGrpc.getProductionSurveillanceMethod = getProductionSurveillanceMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.LaminatePackingProto.ProductionSurveillanceRequest, com.smartfactory.LaminatePackingProto.ProductionSurveillanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProductionSurveillance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.ProductionSurveillanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.ProductionSurveillanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("ProductionSurveillance"))
              .build();
        }
      }
    }
    return getProductionSurveillanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsRequest,
      com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsResponse> getPackagingLineJamAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PackagingLineJamAlerts",
      requestType = com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsRequest.class,
      responseType = com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsRequest,
      com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsResponse> getPackagingLineJamAlertsMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsRequest, com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsResponse> getPackagingLineJamAlertsMethod;
    if ((getPackagingLineJamAlertsMethod = LaminatePackingGrpc.getPackagingLineJamAlertsMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getPackagingLineJamAlertsMethod = LaminatePackingGrpc.getPackagingLineJamAlertsMethod) == null) {
          LaminatePackingGrpc.getPackagingLineJamAlertsMethod = getPackagingLineJamAlertsMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsRequest, com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PackagingLineJamAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("PackagingLineJamAlerts"))
              .build();
        }
      }
    }
    return getPackagingLineJamAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.ProductionSchedulingRequest,
      com.smartfactory.LaminatePackingProto.ProductionSchedulingResponse> getProductionSchedulingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProductionScheduling",
      requestType = com.smartfactory.LaminatePackingProto.ProductionSchedulingRequest.class,
      responseType = com.smartfactory.LaminatePackingProto.ProductionSchedulingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.ProductionSchedulingRequest,
      com.smartfactory.LaminatePackingProto.ProductionSchedulingResponse> getProductionSchedulingMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.ProductionSchedulingRequest, com.smartfactory.LaminatePackingProto.ProductionSchedulingResponse> getProductionSchedulingMethod;
    if ((getProductionSchedulingMethod = LaminatePackingGrpc.getProductionSchedulingMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getProductionSchedulingMethod = LaminatePackingGrpc.getProductionSchedulingMethod) == null) {
          LaminatePackingGrpc.getProductionSchedulingMethod = getProductionSchedulingMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.LaminatePackingProto.ProductionSchedulingRequest, com.smartfactory.LaminatePackingProto.ProductionSchedulingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProductionScheduling"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.ProductionSchedulingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.ProductionSchedulingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("ProductionScheduling"))
              .build();
        }
      }
    }
    return getProductionSchedulingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.VisualInspectionRequest,
      com.smartfactory.LaminatePackingProto.VisualInspectionResponse> getVisualInspectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VisualInspection",
      requestType = com.smartfactory.LaminatePackingProto.VisualInspectionRequest.class,
      responseType = com.smartfactory.LaminatePackingProto.VisualInspectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.VisualInspectionRequest,
      com.smartfactory.LaminatePackingProto.VisualInspectionResponse> getVisualInspectionMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.LaminatePackingProto.VisualInspectionRequest, com.smartfactory.LaminatePackingProto.VisualInspectionResponse> getVisualInspectionMethod;
    if ((getVisualInspectionMethod = LaminatePackingGrpc.getVisualInspectionMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getVisualInspectionMethod = LaminatePackingGrpc.getVisualInspectionMethod) == null) {
          LaminatePackingGrpc.getVisualInspectionMethod = getVisualInspectionMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.LaminatePackingProto.VisualInspectionRequest, com.smartfactory.LaminatePackingProto.VisualInspectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VisualInspection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.VisualInspectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.LaminatePackingProto.VisualInspectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("VisualInspection"))
              .build();
        }
      }
    }
    return getVisualInspectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LaminatePackingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LaminatePackingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LaminatePackingStub>() {
        @java.lang.Override
        public LaminatePackingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LaminatePackingStub(channel, callOptions);
        }
      };
    return LaminatePackingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LaminatePackingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LaminatePackingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LaminatePackingBlockingStub>() {
        @java.lang.Override
        public LaminatePackingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LaminatePackingBlockingStub(channel, callOptions);
        }
      };
    return LaminatePackingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LaminatePackingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LaminatePackingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LaminatePackingFutureStub>() {
        @java.lang.Override
        public LaminatePackingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LaminatePackingFutureStub(channel, callOptions);
        }
      };
    return LaminatePackingFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LaminatePackingImplBase implements io.grpc.BindableService {

    /**
     */
    public void productionLineControl(com.smartfactory.LaminatePackingProto.ProductionLineControlRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.ProductionLineControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProductionLineControlMethod(), responseObserver);
    }

    /**
     */
    public void startProduction(com.smartfactory.LaminatePackingProto.StartProductionRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.StartProductionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartProductionMethod(), responseObserver);
    }

    /**
     */
    public void stopProduction(com.smartfactory.LaminatePackingProto.StopProductionRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.StopProductionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopProductionMethod(), responseObserver);
    }

    /**
     */
    public void addOrder(com.smartfactory.LaminatePackingProto.AddOrderRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.AddOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddOrderMethod(), responseObserver);
    }

    /**
     */
    public void updateOrder(com.smartfactory.LaminatePackingProto.UpdateOrderRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.UpdateOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrderMethod(), responseObserver);
    }

    /**
     */
    public void productionSurveillance(com.smartfactory.LaminatePackingProto.ProductionSurveillanceRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.ProductionSurveillanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProductionSurveillanceMethod(), responseObserver);
    }

    /**
     */
    public void packagingLineJamAlerts(com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPackagingLineJamAlertsMethod(), responseObserver);
    }

    /**
     */
    public void productionScheduling(com.smartfactory.LaminatePackingProto.ProductionSchedulingRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.ProductionSchedulingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProductionSchedulingMethod(), responseObserver);
    }

    /**
     */
    public void visualInspection(com.smartfactory.LaminatePackingProto.VisualInspectionRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.VisualInspectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVisualInspectionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProductionLineControlMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.LaminatePackingProto.ProductionLineControlRequest,
                com.smartfactory.LaminatePackingProto.ProductionLineControlResponse>(
                  this, METHODID_PRODUCTION_LINE_CONTROL)))
          .addMethod(
            getStartProductionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.LaminatePackingProto.StartProductionRequest,
                com.smartfactory.LaminatePackingProto.StartProductionResponse>(
                  this, METHODID_START_PRODUCTION)))
          .addMethod(
            getStopProductionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.LaminatePackingProto.StopProductionRequest,
                com.smartfactory.LaminatePackingProto.StopProductionResponse>(
                  this, METHODID_STOP_PRODUCTION)))
          .addMethod(
            getAddOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.LaminatePackingProto.AddOrderRequest,
                com.smartfactory.LaminatePackingProto.AddOrderResponse>(
                  this, METHODID_ADD_ORDER)))
          .addMethod(
            getUpdateOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.LaminatePackingProto.UpdateOrderRequest,
                com.smartfactory.LaminatePackingProto.UpdateOrderResponse>(
                  this, METHODID_UPDATE_ORDER)))
          .addMethod(
            getProductionSurveillanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.LaminatePackingProto.ProductionSurveillanceRequest,
                com.smartfactory.LaminatePackingProto.ProductionSurveillanceResponse>(
                  this, METHODID_PRODUCTION_SURVEILLANCE)))
          .addMethod(
            getPackagingLineJamAlertsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsRequest,
                com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsResponse>(
                  this, METHODID_PACKAGING_LINE_JAM_ALERTS)))
          .addMethod(
            getProductionSchedulingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.LaminatePackingProto.ProductionSchedulingRequest,
                com.smartfactory.LaminatePackingProto.ProductionSchedulingResponse>(
                  this, METHODID_PRODUCTION_SCHEDULING)))
          .addMethod(
            getVisualInspectionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.LaminatePackingProto.VisualInspectionRequest,
                com.smartfactory.LaminatePackingProto.VisualInspectionResponse>(
                  this, METHODID_VISUAL_INSPECTION)))
          .build();
    }
  }

  /**
   */
  public static final class LaminatePackingStub extends io.grpc.stub.AbstractAsyncStub<LaminatePackingStub> {
    private LaminatePackingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LaminatePackingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LaminatePackingStub(channel, callOptions);
    }

    /**
     */
    public void productionLineControl(com.smartfactory.LaminatePackingProto.ProductionLineControlRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.ProductionLineControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProductionLineControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startProduction(com.smartfactory.LaminatePackingProto.StartProductionRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.StartProductionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartProductionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopProduction(com.smartfactory.LaminatePackingProto.StopProductionRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.StopProductionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopProductionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addOrder(com.smartfactory.LaminatePackingProto.AddOrderRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.AddOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOrder(com.smartfactory.LaminatePackingProto.UpdateOrderRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.UpdateOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void productionSurveillance(com.smartfactory.LaminatePackingProto.ProductionSurveillanceRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.ProductionSurveillanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProductionSurveillanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void packagingLineJamAlerts(com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPackagingLineJamAlertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void productionScheduling(com.smartfactory.LaminatePackingProto.ProductionSchedulingRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.ProductionSchedulingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProductionSchedulingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void visualInspection(com.smartfactory.LaminatePackingProto.VisualInspectionRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.VisualInspectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVisualInspectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LaminatePackingBlockingStub extends io.grpc.stub.AbstractBlockingStub<LaminatePackingBlockingStub> {
    private LaminatePackingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LaminatePackingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LaminatePackingBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.smartfactory.LaminatePackingProto.ProductionLineControlResponse productionLineControl(com.smartfactory.LaminatePackingProto.ProductionLineControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProductionLineControlMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfactory.LaminatePackingProto.StartProductionResponse startProduction(com.smartfactory.LaminatePackingProto.StartProductionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartProductionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfactory.LaminatePackingProto.StopProductionResponse stopProduction(com.smartfactory.LaminatePackingProto.StopProductionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopProductionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfactory.LaminatePackingProto.AddOrderResponse addOrder(com.smartfactory.LaminatePackingProto.AddOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfactory.LaminatePackingProto.UpdateOrderResponse updateOrder(com.smartfactory.LaminatePackingProto.UpdateOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfactory.LaminatePackingProto.ProductionSurveillanceResponse productionSurveillance(com.smartfactory.LaminatePackingProto.ProductionSurveillanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProductionSurveillanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsResponse packagingLineJamAlerts(com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPackagingLineJamAlertsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfactory.LaminatePackingProto.ProductionSchedulingResponse productionScheduling(com.smartfactory.LaminatePackingProto.ProductionSchedulingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProductionSchedulingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfactory.LaminatePackingProto.VisualInspectionResponse visualInspection(com.smartfactory.LaminatePackingProto.VisualInspectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVisualInspectionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LaminatePackingFutureStub extends io.grpc.stub.AbstractFutureStub<LaminatePackingFutureStub> {
    private LaminatePackingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LaminatePackingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LaminatePackingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.LaminatePackingProto.ProductionLineControlResponse> productionLineControl(
        com.smartfactory.LaminatePackingProto.ProductionLineControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProductionLineControlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.LaminatePackingProto.StartProductionResponse> startProduction(
        com.smartfactory.LaminatePackingProto.StartProductionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartProductionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.LaminatePackingProto.StopProductionResponse> stopProduction(
        com.smartfactory.LaminatePackingProto.StopProductionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopProductionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.LaminatePackingProto.AddOrderResponse> addOrder(
        com.smartfactory.LaminatePackingProto.AddOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.LaminatePackingProto.UpdateOrderResponse> updateOrder(
        com.smartfactory.LaminatePackingProto.UpdateOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.LaminatePackingProto.ProductionSurveillanceResponse> productionSurveillance(
        com.smartfactory.LaminatePackingProto.ProductionSurveillanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProductionSurveillanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsResponse> packagingLineJamAlerts(
        com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPackagingLineJamAlertsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.LaminatePackingProto.ProductionSchedulingResponse> productionScheduling(
        com.smartfactory.LaminatePackingProto.ProductionSchedulingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProductionSchedulingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.LaminatePackingProto.VisualInspectionResponse> visualInspection(
        com.smartfactory.LaminatePackingProto.VisualInspectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVisualInspectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PRODUCTION_LINE_CONTROL = 0;
  private static final int METHODID_START_PRODUCTION = 1;
  private static final int METHODID_STOP_PRODUCTION = 2;
  private static final int METHODID_ADD_ORDER = 3;
  private static final int METHODID_UPDATE_ORDER = 4;
  private static final int METHODID_PRODUCTION_SURVEILLANCE = 5;
  private static final int METHODID_PACKAGING_LINE_JAM_ALERTS = 6;
  private static final int METHODID_PRODUCTION_SCHEDULING = 7;
  private static final int METHODID_VISUAL_INSPECTION = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LaminatePackingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LaminatePackingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PRODUCTION_LINE_CONTROL:
          serviceImpl.productionLineControl((com.smartfactory.LaminatePackingProto.ProductionLineControlRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.ProductionLineControlResponse>) responseObserver);
          break;
        case METHODID_START_PRODUCTION:
          serviceImpl.startProduction((com.smartfactory.LaminatePackingProto.StartProductionRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.StartProductionResponse>) responseObserver);
          break;
        case METHODID_STOP_PRODUCTION:
          serviceImpl.stopProduction((com.smartfactory.LaminatePackingProto.StopProductionRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.StopProductionResponse>) responseObserver);
          break;
        case METHODID_ADD_ORDER:
          serviceImpl.addOrder((com.smartfactory.LaminatePackingProto.AddOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.AddOrderResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORDER:
          serviceImpl.updateOrder((com.smartfactory.LaminatePackingProto.UpdateOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.UpdateOrderResponse>) responseObserver);
          break;
        case METHODID_PRODUCTION_SURVEILLANCE:
          serviceImpl.productionSurveillance((com.smartfactory.LaminatePackingProto.ProductionSurveillanceRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.ProductionSurveillanceResponse>) responseObserver);
          break;
        case METHODID_PACKAGING_LINE_JAM_ALERTS:
          serviceImpl.packagingLineJamAlerts((com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.PackagingLineJamAlertsResponse>) responseObserver);
          break;
        case METHODID_PRODUCTION_SCHEDULING:
          serviceImpl.productionScheduling((com.smartfactory.LaminatePackingProto.ProductionSchedulingRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.ProductionSchedulingResponse>) responseObserver);
          break;
        case METHODID_VISUAL_INSPECTION:
          serviceImpl.visualInspection((com.smartfactory.LaminatePackingProto.VisualInspectionRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.LaminatePackingProto.VisualInspectionResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LaminatePackingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LaminatePackingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartfactory.LaminatePackingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LaminatePacking");
    }
  }

  private static final class LaminatePackingFileDescriptorSupplier
      extends LaminatePackingBaseDescriptorSupplier {
    LaminatePackingFileDescriptorSupplier() {}
  }

  private static final class LaminatePackingMethodDescriptorSupplier
      extends LaminatePackingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LaminatePackingMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LaminatePackingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LaminatePackingFileDescriptorSupplier())
              .addMethod(getProductionLineControlMethod())
              .addMethod(getStartProductionMethod())
              .addMethod(getStopProductionMethod())
              .addMethod(getAddOrderMethod())
              .addMethod(getUpdateOrderMethod())
              .addMethod(getProductionSurveillanceMethod())
              .addMethod(getPackagingLineJamAlertsMethod())
              .addMethod(getProductionSchedulingMethod())
              .addMethod(getVisualInspectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
