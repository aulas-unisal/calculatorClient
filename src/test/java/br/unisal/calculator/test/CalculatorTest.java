package br.unisal.calculator.test;

import static org.junit.Assert.*;

import javax.xml.ws.WebServiceRef;

import org.junit.Before;
import org.junit.Test;

import com.jetherrodrigues.jaxws.calculator.*;

public class CalculatorTest {
	@WebServiceRef(wsdlLocation = "http://localhost:8080/calculator/Calculator?wsdl")
	private static CalculatorService calculatorService;
	private static Calculable port;
	
	@Before
	public void initialize() {
		calculatorService = new CalculatorService();
		port = calculatorService.getCalculatorServicePort();
	}
	
	@Test
	public void correctDivision() throws SOAPException {
		double expected = 5.0;
		assertEquals(expected, port.division(10, 2), 0);
	}
	
	@Test(expected=javax.xml.ws.soap.SOAPFaultException.class)
    public void testDivideByZero() throws SOAPException {
        port.division(10, 0);
    }
	
	@Test(expected=javax.xml.ws.soap.SOAPFaultException.class)
    public void testDivideByNegativeNumber() throws SOAPException {
        port.division(10, -1);
    }
}
