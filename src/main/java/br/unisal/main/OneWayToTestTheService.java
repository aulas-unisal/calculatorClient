package br.unisal.main;

import javax.xml.ws.WebServiceRef;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jetherrodrigues.jaxws.calculator.*;

/**
 * 
 * @author jether.rodrigues
 *
 * @WebServiceRef=Essa anotação é usada para definir uma referência para um
 *                     webservice e (opcionalmente) realizar uma injeção deste
 *                     para utilização.
 */
public class OneWayToTestTheService {

	@WebServiceRef(wsdlLocation = "http://localhost:8080/calculator/Calculator?wsdl")
	private static CalculatorService calculatorService = new CalculatorService();
	
	private static final Logger logger = LoggerFactory.getLogger(OneWayToTestTheService.class);

	public static void main(String[] args) {
		Calculable port = calculatorService.getCalculatorServicePort();
		
		try {
			logger.info("Executando 10/2 = {}", port.division(10, 2));
		} catch (SOAPException e) {
			logger.error("Error: ", e.getMessage());
		}
		
		try {
			logger.info("Executando 10/0 = {}", port.division(10, 0));
		} catch (SOAPException e) {
			logger.error("Error: ", e.getMessage());
		}
		
		try {
			logger.info("Executando 10/-1 = {}", port.division(10, -1));
		} catch (SOAPException e) {
			logger.error("Error: ", e.getMessage());
		}
	}

}
