package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "CalculatorWS")
public class CalculatorWS 
{

    @WebMethod(operationName = "addition")
    public int addition(@WebParam(name = "a") int a, @WebParam(name = "b") int b)  
    {
        return a+b;
    }
    
    @WebMethod(operationName = "multiplication")
    public int multiplication(@WebParam(name = "a") int a, @WebParam(name = "b") int b)  
    {
        return a*b;
    }
    
    @WebMethod(operationName = "division")
    public int division(@WebParam(name = "a") int a, @WebParam(name = "b") int b)  
    {
        return a/b;
    }
    
    @WebMethod(operationName = "modulodivision")
    public int modulodivision(@WebParam(name = "a") int a, @WebParam(name = "b") int b)  
    {
        return a%b;
    }
    
    @WebMethod(operationName = "substraction")
    public int substraction(@WebParam(name = "a") int a, @WebParam(name = "b") int b)  
    {
        return a-b;
    }
}
