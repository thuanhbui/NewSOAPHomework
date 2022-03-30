//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.30 at 08:20:48 AM ICT 
//


package com.baeldung.springsoap.gen;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.baeldung.springsoap.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.baeldung.springsoap.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculatorResponse }
     * 
     */
    public CalculatorResponse createCalculatorResponse() {
        return new CalculatorResponse();
    }

    /**
     * Create an instance of {@link AddRequest }
     * 
     */
    public AddRequest createAddRequest() {
        return new AddRequest();
    }

    /**
     * Create an instance of {@link MultipleRequest }
     * 
     */
    public MultipleRequest createMultipleRequest() {
        return new MultipleRequest();
    }

    /**
     * Create an instance of {@link DivideRequest }
     * 
     */
    public DivideRequest createDivideRequest() {
        return new DivideRequest();
    }

    /**
     * Create an instance of {@link ExpRequest }
     * 
     */
    public ExpRequest createExpRequest() {
        return new ExpRequest();
    }

    /**
     * Create an instance of {@link MinusRequest }
     * 
     */
    public MinusRequest createMinusRequest() {
        return new MinusRequest();
    }

}