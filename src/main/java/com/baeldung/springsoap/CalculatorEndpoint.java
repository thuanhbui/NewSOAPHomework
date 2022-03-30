package com.baeldung.springsoap;

import com.baeldung.springsoap.gen.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculatorEndpoint {

    private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";

    public static CalculatorService cal = new CalculatorService();

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addRequest")
    @ResponsePayload
    public AddResponse add(@RequestPayload AddRequest request) {
        AddResponse response = new AddResponse();
        response.setResult(cal.add(request.getNumber1(),request.getNumber2()));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "minusRequest")
    @ResponsePayload
    public MinusResponse minus(@RequestPayload MinusRequest request) {
        System.out.println("endpoint1");
        MinusResponse response = new MinusResponse();
        System.out.println("endpoint2");
        response.setResult(cal.minus(request.getNumber1(),request.getNumber2()));
        System.out.println(response.getResult());
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "multipleRequest")
    @ResponsePayload
    public MultipleResponse multiple(@RequestPayload MultipleRequest request) {
        MultipleResponse response = new MultipleResponse();
        response.setResult(cal.multiple(request.getNumber1(),request.getNumber2()));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "divideRequest")
    @ResponsePayload
    public DivideResponse divide(@RequestPayload DivideRequest request) {
        DivideResponse response = new DivideResponse();
        response.setResult(cal.divide(request.getNumber1(),request.getNumber2()));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "expRequest")
    @ResponsePayload
    public ExpResponse exp(@RequestPayload ExpRequest request) {
        ExpResponse response = new ExpResponse();
        response.setResult(cal.exp(request.getNumber1(),request.getNumber2()));
        return response;
    }
}