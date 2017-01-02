package io.grpc.myexample.myservice;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: myexample.proto")
public class PersonServiceGrpc {

  private PersonServiceGrpc() {}

  public static final String SERVICE_NAME = "person.PersonService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.myexample.myservice.Person,
      io.grpc.myexample.myservice.PersonResponse> METHOD_CREATE_PERSON =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "person.PersonService", "createPerson"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.myexample.myservice.Person.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.myexample.myservice.PersonResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.myexample.myservice.Person,
      io.grpc.myexample.myservice.PersonResponse> METHOD_UPDATE_PERSON =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "person.PersonService", "updatePerson"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.myexample.myservice.Person.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.myexample.myservice.PersonResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonServiceStub newStub(io.grpc.Channel channel) {
    return new PersonServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static PersonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createPerson(io.grpc.myexample.myservice.Person request,
        io.grpc.stub.StreamObserver<io.grpc.myexample.myservice.PersonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_PERSON, responseObserver);
    }

    /**
     */
    public void updatePerson(io.grpc.myexample.myservice.Person request,
        io.grpc.stub.StreamObserver<io.grpc.myexample.myservice.PersonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PERSON, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_PERSON,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.myexample.myservice.Person,
                io.grpc.myexample.myservice.PersonResponse>(
                  this, METHODID_CREATE_PERSON)))
          .addMethod(
            METHOD_UPDATE_PERSON,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.myexample.myservice.Person,
                io.grpc.myexample.myservice.PersonResponse>(
                  this, METHODID_UPDATE_PERSON)))
          .build();
    }
  }

  /**
   */
  public static final class PersonServiceStub extends io.grpc.stub.AbstractStub<PersonServiceStub> {
    private PersonServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPerson(io.grpc.myexample.myservice.Person request,
        io.grpc.stub.StreamObserver<io.grpc.myexample.myservice.PersonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_PERSON, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePerson(io.grpc.myexample.myservice.Person request,
        io.grpc.stub.StreamObserver<io.grpc.myexample.myservice.PersonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PERSON, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonServiceBlockingStub extends io.grpc.stub.AbstractStub<PersonServiceBlockingStub> {
    private PersonServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.myexample.myservice.PersonResponse createPerson(io.grpc.myexample.myservice.Person request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_PERSON, getCallOptions(), request);
    }

    /**
     */
    public io.grpc.myexample.myservice.PersonResponse updatePerson(io.grpc.myexample.myservice.Person request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PERSON, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonServiceFutureStub extends io.grpc.stub.AbstractStub<PersonServiceFutureStub> {
    private PersonServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.myexample.myservice.PersonResponse> createPerson(
        io.grpc.myexample.myservice.Person request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_PERSON, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.myexample.myservice.PersonResponse> updatePerson(
        io.grpc.myexample.myservice.Person request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PERSON, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PERSON = 0;
  private static final int METHODID_UPDATE_PERSON = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(PersonServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PERSON:
          serviceImpl.createPerson((io.grpc.myexample.myservice.Person) request,
              (io.grpc.stub.StreamObserver<io.grpc.myexample.myservice.PersonResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PERSON:
          serviceImpl.updatePerson((io.grpc.myexample.myservice.Person) request,
              (io.grpc.stub.StreamObserver<io.grpc.myexample.myservice.PersonResponse>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_CREATE_PERSON,
        METHOD_UPDATE_PERSON);
  }

}
