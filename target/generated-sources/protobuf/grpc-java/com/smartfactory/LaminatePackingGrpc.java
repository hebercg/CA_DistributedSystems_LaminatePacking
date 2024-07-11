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
  private static volatile io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.ProductionLineControlRequest,
      com.smartfactory.Laminatepacking.ProductionLineControlResponse> getProductionLineControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProductionLineControl",
      requestType = com.smartfactory.Laminatepacking.ProductionLineControlRequest.class,
      responseType = com.smartfactory.Laminatepacking.ProductionLineControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.ProductionLineControlRequest,
      com.smartfactory.Laminatepacking.ProductionLineControlResponse> getProductionLineControlMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.ProductionLineControlRequest, com.smartfactory.Laminatepacking.ProductionLineControlResponse> getProductionLineControlMethod;
    if ((getProductionLineControlMethod = LaminatePackingGrpc.getProductionLineControlMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getProductionLineControlMethod = LaminatePackingGrpc.getProductionLineControlMethod) == null) {
          LaminatePackingGrpc.getProductionLineControlMethod = getProductionLineControlMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.Laminatepacking.ProductionLineControlRequest, com.smartfactory.Laminatepacking.ProductionLineControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProductionLineControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.ProductionLineControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.ProductionLineControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("ProductionLineControl"))
              .build();
        }
      }
    }
    return getProductionLineControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.StartProductionRequest,
      com.smartfactory.Laminatepacking.StartProductionResponse> getStartProductionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartProduction",
      requestType = com.smartfactory.Laminatepacking.StartProductionRequest.class,
      responseType = com.smartfactory.Laminatepacking.StartProductionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.StartProductionRequest,
      com.smartfactory.Laminatepacking.StartProductionResponse> getStartProductionMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.StartProductionRequest, com.smartfactory.Laminatepacking.StartProductionResponse> getStartProductionMethod;
    if ((getStartProductionMethod = LaminatePackingGrpc.getStartProductionMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getStartProductionMethod = LaminatePackingGrpc.getStartProductionMethod) == null) {
          LaminatePackingGrpc.getStartProductionMethod = getStartProductionMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.Laminatepacking.StartProductionRequest, com.smartfactory.Laminatepacking.StartProductionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartProduction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.StartProductionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.StartProductionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("StartProduction"))
              .build();
        }
      }
    }
    return getStartProductionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.StopProductionRequest,
      com.smartfactory.Laminatepacking.StopProductionResponse> getStopProductionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopProduction",
      requestType = com.smartfactory.Laminatepacking.StopProductionRequest.class,
      responseType = com.smartfactory.Laminatepacking.StopProductionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.StopProductionRequest,
      com.smartfactory.Laminatepacking.StopProductionResponse> getStopProductionMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.StopProductionRequest, com.smartfactory.Laminatepacking.StopProductionResponse> getStopProductionMethod;
    if ((getStopProductionMethod = LaminatePackingGrpc.getStopProductionMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getStopProductionMethod = LaminatePackingGrpc.getStopProductionMethod) == null) {
          LaminatePackingGrpc.getStopProductionMethod = getStopProductionMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.Laminatepacking.StopProductionRequest, com.smartfactory.Laminatepacking.StopProductionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopProduction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.StopProductionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.StopProductionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("StopProduction"))
              .build();
        }
      }
    }
    return getStopProductionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.AddOrderRequest,
      com.smartfactory.Laminatepacking.AddOrderResponse> getAddOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOrder",
      requestType = com.smartfactory.Laminatepacking.AddOrderRequest.class,
      responseType = com.smartfactory.Laminatepacking.AddOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.AddOrderRequest,
      com.smartfactory.Laminatepacking.AddOrderResponse> getAddOrderMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.AddOrderRequest, com.smartfactory.Laminatepacking.AddOrderResponse> getAddOrderMethod;
    if ((getAddOrderMethod = LaminatePackingGrpc.getAddOrderMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getAddOrderMethod = LaminatePackingGrpc.getAddOrderMethod) == null) {
          LaminatePackingGrpc.getAddOrderMethod = getAddOrderMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.Laminatepacking.AddOrderRequest, com.smartfactory.Laminatepacking.AddOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.AddOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.AddOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("AddOrder"))
              .build();
        }
      }
    }
    return getAddOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.UpdateOrderRequest,
      com.smartfactory.Laminatepacking.UpdateOrderResponse> getUpdateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrder",
      requestType = com.smartfactory.Laminatepacking.UpdateOrderRequest.class,
      responseType = com.smartfactory.Laminatepacking.UpdateOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.UpdateOrderRequest,
      com.smartfactory.Laminatepacking.UpdateOrderResponse> getUpdateOrderMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.UpdateOrderRequest, com.smartfactory.Laminatepacking.UpdateOrderResponse> getUpdateOrderMethod;
    if ((getUpdateOrderMethod = LaminatePackingGrpc.getUpdateOrderMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getUpdateOrderMethod = LaminatePackingGrpc.getUpdateOrderMethod) == null) {
          LaminatePackingGrpc.getUpdateOrderMethod = getUpdateOrderMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.Laminatepacking.UpdateOrderRequest, com.smartfactory.Laminatepacking.UpdateOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.UpdateOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.UpdateOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("UpdateOrder"))
              .build();
        }
      }
    }
    return getUpdateOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.ProductionSurveillanceRequest,
      com.smartfactory.Laminatepacking.ProductionSurveillanceResponse> getProductionSurveillanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProductionSurveillance",
      requestType = com.smartfactory.Laminatepacking.ProductionSurveillanceRequest.class,
      responseType = com.smartfactory.Laminatepacking.ProductionSurveillanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.ProductionSurveillanceRequest,
      com.smartfactory.Laminatepacking.ProductionSurveillanceResponse> getProductionSurveillanceMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.ProductionSurveillanceRequest, com.smartfactory.Laminatepacking.ProductionSurveillanceResponse> getProductionSurveillanceMethod;
    if ((getProductionSurveillanceMethod = LaminatePackingGrpc.getProductionSurveillanceMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getProductionSurveillanceMethod = LaminatePackingGrpc.getProductionSurveillanceMethod) == null) {
          LaminatePackingGrpc.getProductionSurveillanceMethod = getProductionSurveillanceMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.Laminatepacking.ProductionSurveillanceRequest, com.smartfactory.Laminatepacking.ProductionSurveillanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProductionSurveillance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.ProductionSurveillanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.ProductionSurveillanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("ProductionSurveillance"))
              .build();
        }
      }
    }
    return getProductionSurveillanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.PackagingLineJamAlertsRequest,
      com.smartfactory.Laminatepacking.PackagingLineJamAlertsResponse> getPackagingLineJamAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PackagingLineJamAlerts",
      requestType = com.smartfactory.Laminatepacking.PackagingLineJamAlertsRequest.class,
      responseType = com.smartfactory.Laminatepacking.PackagingLineJamAlertsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.PackagingLineJamAlertsRequest,
      com.smartfactory.Laminatepacking.PackagingLineJamAlertsResponse> getPackagingLineJamAlertsMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.PackagingLineJamAlertsRequest, com.smartfactory.Laminatepacking.PackagingLineJamAlertsResponse> getPackagingLineJamAlertsMethod;
    if ((getPackagingLineJamAlertsMethod = LaminatePackingGrpc.getPackagingLineJamAlertsMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getPackagingLineJamAlertsMethod = LaminatePackingGrpc.getPackagingLineJamAlertsMethod) == null) {
          LaminatePackingGrpc.getPackagingLineJamAlertsMethod = getPackagingLineJamAlertsMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.Laminatepacking.PackagingLineJamAlertsRequest, com.smartfactory.Laminatepacking.PackagingLineJamAlertsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PackagingLineJamAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.PackagingLineJamAlertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.PackagingLineJamAlertsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("PackagingLineJamAlerts"))
              .build();
        }
      }
    }
    return getPackagingLineJamAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.ProductionSchedulingRequest,
      com.smartfactory.Laminatepacking.ProductionSchedulingResponse> getProductionSchedulingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProductionScheduling",
      requestType = com.smartfactory.Laminatepacking.ProductionSchedulingRequest.class,
      responseType = com.smartfactory.Laminatepacking.ProductionSchedulingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.ProductionSchedulingRequest,
      com.smartfactory.Laminatepacking.ProductionSchedulingResponse> getProductionSchedulingMethod() {
    io.grpc.MethodDescriptor<com.smartfactory.Laminatepacking.ProductionSchedulingRequest, com.smartfactory.Laminatepacking.ProductionSchedulingResponse> getProductionSchedulingMethod;
    if ((getProductionSchedulingMethod = LaminatePackingGrpc.getProductionSchedulingMethod) == null) {
      synchronized (LaminatePackingGrpc.class) {
        if ((getProductionSchedulingMethod = LaminatePackingGrpc.getProductionSchedulingMethod) == null) {
          LaminatePackingGrpc.getProductionSchedulingMethod = getProductionSchedulingMethod =
              io.grpc.MethodDescriptor.<com.smartfactory.Laminatepacking.ProductionSchedulingRequest, com.smartfactory.Laminatepacking.ProductionSchedulingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProductionScheduling"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.ProductionSchedulingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartfactory.Laminatepacking.ProductionSchedulingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaminatePackingMethodDescriptorSupplier("ProductionScheduling"))
              .build();
        }
      }
    }
    return getProductionSchedulingMethod;
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
    public void productionLineControl(com.smartfactory.Laminatepacking.ProductionLineControlRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.ProductionLineControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProductionLineControlMethod(), responseObserver);
    }

    /**
     */
    public void startProduction(com.smartfactory.Laminatepacking.StartProductionRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.StartProductionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartProductionMethod(), responseObserver);
    }

    /**
     */
    public void stopProduction(com.smartfactory.Laminatepacking.StopProductionRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.StopProductionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopProductionMethod(), responseObserver);
    }

    /**
     */
    public void addOrder(com.smartfactory.Laminatepacking.AddOrderRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.AddOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddOrderMethod(), responseObserver);
    }

    /**
     */
    public void updateOrder(com.smartfactory.Laminatepacking.UpdateOrderRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.UpdateOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrderMethod(), responseObserver);
    }

    /**
     */
    public void productionSurveillance(com.smartfactory.Laminatepacking.ProductionSurveillanceRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.ProductionSurveillanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProductionSurveillanceMethod(), responseObserver);
    }

    /**
     */
    public void packagingLineJamAlerts(com.smartfactory.Laminatepacking.PackagingLineJamAlertsRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.PackagingLineJamAlertsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPackagingLineJamAlertsMethod(), responseObserver);
    }

    /**
     */
    public void productionScheduling(com.smartfactory.Laminatepacking.ProductionSchedulingRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.ProductionSchedulingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProductionSchedulingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProductionLineControlMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.Laminatepacking.ProductionLineControlRequest,
                com.smartfactory.Laminatepacking.ProductionLineControlResponse>(
                  this, METHODID_PRODUCTION_LINE_CONTROL)))
          .addMethod(
            getStartProductionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.Laminatepacking.StartProductionRequest,
                com.smartfactory.Laminatepacking.StartProductionResponse>(
                  this, METHODID_START_PRODUCTION)))
          .addMethod(
            getStopProductionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.Laminatepacking.StopProductionRequest,
                com.smartfactory.Laminatepacking.StopProductionResponse>(
                  this, METHODID_STOP_PRODUCTION)))
          .addMethod(
            getAddOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.Laminatepacking.AddOrderRequest,
                com.smartfactory.Laminatepacking.AddOrderResponse>(
                  this, METHODID_ADD_ORDER)))
          .addMethod(
            getUpdateOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.Laminatepacking.UpdateOrderRequest,
                com.smartfactory.Laminatepacking.UpdateOrderResponse>(
                  this, METHODID_UPDATE_ORDER)))
          .addMethod(
            getProductionSurveillanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.Laminatepacking.ProductionSurveillanceRequest,
                com.smartfactory.Laminatepacking.ProductionSurveillanceResponse>(
                  this, METHODID_PRODUCTION_SURVEILLANCE)))
          .addMethod(
            getPackagingLineJamAlertsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.Laminatepacking.PackagingLineJamAlertsRequest,
                com.smartfactory.Laminatepacking.PackagingLineJamAlertsResponse>(
                  this, METHODID_PACKAGING_LINE_JAM_ALERTS)))
          .addMethod(
            getProductionSchedulingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartfactory.Laminatepacking.ProductionSchedulingRequest,
                com.smartfactory.Laminatepacking.ProductionSchedulingResponse>(
                  this, METHODID_PRODUCTION_SCHEDULING)))
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
    public void productionLineControl(com.smartfactory.Laminatepacking.ProductionLineControlRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.ProductionLineControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProductionLineControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startProduction(com.smartfactory.Laminatepacking.StartProductionRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.StartProductionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartProductionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopProduction(com.smartfactory.Laminatepacking.StopProductionRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.StopProductionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopProductionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addOrder(com.smartfactory.Laminatepacking.AddOrderRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.AddOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOrder(com.smartfactory.Laminatepacking.UpdateOrderRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.UpdateOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void productionSurveillance(com.smartfactory.Laminatepacking.ProductionSurveillanceRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.ProductionSurveillanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProductionSurveillanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void packagingLineJamAlerts(com.smartfactory.Laminatepacking.PackagingLineJamAlertsRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.PackagingLineJamAlertsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPackagingLineJamAlertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void productionScheduling(com.smartfactory.Laminatepacking.ProductionSchedulingRequest request,
        io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.ProductionSchedulingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProductionSchedulingMethod(), getCallOptions()), request, responseObserver);
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
    public com.smartfactory.Laminatepacking.ProductionLineControlResponse productionLineControl(com.smartfactory.Laminatepacking.ProductionLineControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProductionLineControlMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfactory.Laminatepacking.StartProductionResponse startProduction(com.smartfactory.Laminatepacking.StartProductionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartProductionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfactory.Laminatepacking.StopProductionResponse stopProduction(com.smartfactory.Laminatepacking.StopProductionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopProductionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfactory.Laminatepacking.AddOrderResponse addOrder(com.smartfactory.Laminatepacking.AddOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfactory.Laminatepacking.UpdateOrderResponse updateOrder(com.smartfactory.Laminatepacking.UpdateOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfactory.Laminatepacking.ProductionSurveillanceResponse productionSurveillance(com.smartfactory.Laminatepacking.ProductionSurveillanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProductionSurveillanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfactory.Laminatepacking.PackagingLineJamAlertsResponse packagingLineJamAlerts(com.smartfactory.Laminatepacking.PackagingLineJamAlertsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPackagingLineJamAlertsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartfactory.Laminatepacking.ProductionSchedulingResponse productionScheduling(com.smartfactory.Laminatepacking.ProductionSchedulingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProductionSchedulingMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.Laminatepacking.ProductionLineControlResponse> productionLineControl(
        com.smartfactory.Laminatepacking.ProductionLineControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProductionLineControlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.Laminatepacking.StartProductionResponse> startProduction(
        com.smartfactory.Laminatepacking.StartProductionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartProductionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.Laminatepacking.StopProductionResponse> stopProduction(
        com.smartfactory.Laminatepacking.StopProductionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopProductionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.Laminatepacking.AddOrderResponse> addOrder(
        com.smartfactory.Laminatepacking.AddOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.Laminatepacking.UpdateOrderResponse> updateOrder(
        com.smartfactory.Laminatepacking.UpdateOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.Laminatepacking.ProductionSurveillanceResponse> productionSurveillance(
        com.smartfactory.Laminatepacking.ProductionSurveillanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProductionSurveillanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.Laminatepacking.PackagingLineJamAlertsResponse> packagingLineJamAlerts(
        com.smartfactory.Laminatepacking.PackagingLineJamAlertsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPackagingLineJamAlertsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartfactory.Laminatepacking.ProductionSchedulingResponse> productionScheduling(
        com.smartfactory.Laminatepacking.ProductionSchedulingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProductionSchedulingMethod(), getCallOptions()), request);
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
          serviceImpl.productionLineControl((com.smartfactory.Laminatepacking.ProductionLineControlRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.ProductionLineControlResponse>) responseObserver);
          break;
        case METHODID_START_PRODUCTION:
          serviceImpl.startProduction((com.smartfactory.Laminatepacking.StartProductionRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.StartProductionResponse>) responseObserver);
          break;
        case METHODID_STOP_PRODUCTION:
          serviceImpl.stopProduction((com.smartfactory.Laminatepacking.StopProductionRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.StopProductionResponse>) responseObserver);
          break;
        case METHODID_ADD_ORDER:
          serviceImpl.addOrder((com.smartfactory.Laminatepacking.AddOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.AddOrderResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORDER:
          serviceImpl.updateOrder((com.smartfactory.Laminatepacking.UpdateOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.UpdateOrderResponse>) responseObserver);
          break;
        case METHODID_PRODUCTION_SURVEILLANCE:
          serviceImpl.productionSurveillance((com.smartfactory.Laminatepacking.ProductionSurveillanceRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.ProductionSurveillanceResponse>) responseObserver);
          break;
        case METHODID_PACKAGING_LINE_JAM_ALERTS:
          serviceImpl.packagingLineJamAlerts((com.smartfactory.Laminatepacking.PackagingLineJamAlertsRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.PackagingLineJamAlertsResponse>) responseObserver);
          break;
        case METHODID_PRODUCTION_SCHEDULING:
          serviceImpl.productionScheduling((com.smartfactory.Laminatepacking.ProductionSchedulingRequest) request,
              (io.grpc.stub.StreamObserver<com.smartfactory.Laminatepacking.ProductionSchedulingResponse>) responseObserver);
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
      return com.smartfactory.Laminatepacking.getDescriptor();
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
              .build();
        }
      }
    }
    return result;
  }
}
