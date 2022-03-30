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
    public CalculatorResponse add(@RequestPayload AddRequest request) {
        CalculatorResponse response = new CalculatorResponse();
        response.setResult(cal.add(request.getNumber1(),request.getNumber2()));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "minusRequest")
    @ResponsePayload
    public CalculatorResponse minus(@RequestPayload MinusRequest request) {
        System.out.println("endpoint1");
        CalculatorResponse response = new CalculatorResponse();
        System.out.println("endpoint2");
        response.setResult(cal.minus(request.getNumber1(),request.getNumber2()));
        System.out.println(response.getResult());
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "multipleRequest")
    @ResponsePayload
    public CalculatorResponse multiple(@RequestPayload MultipleRequest request) {
        CalculatorResponse response = new CalculatorResponse();
        response.setResult(cal.multiple(request.getNumber1(),request.getNumber2()));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "divideRequest")
    @ResponsePayload
    public CalculatorResponse divide(@RequestPayload DivideRequest request) {
        CalculatorResponse response = new CalculatorResponse();
        response.setResult(cal.divide(request.getNumber1(),request.getNumber2()));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "expRequest")
    @ResponsePayload
    public CalculatorResponse exp(@RequestPayload ExpRequest request) {
        CalculatorResponse response = new CalculatorResponse();
        response.setResult(cal.exp(request.getNumber1(),request.getNumber2()));
        return response;
    }
}