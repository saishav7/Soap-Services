
import au.edu.unsw.sltf.client.CurrencyConvertServicesStub;
import au.edu.unsw.sltf.client.CurrenyConvertMarketDataFaultException;
import au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument;
import au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument.CurrenyConvertMarketData;
import au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument;
import au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument.CurrenyConvertMarketDataFault;
import au.edu.unsw.sltf.services.CurrenyConvertMarketDataResponseDocument;
import au.edu.unsw.sltf.services.CurrenyConvertMarketDataResponseDocument.CurrenyConvertMarketDataResponse;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web service client that connects to the CurrencyConvertServices
 * Web service.
 */
public class WebServiceClient {

	private static String inputEventSetId;
	private static String inputTargetCurrency;
	private static String outputEventSetId;
    public static void main(String[] args) {
        String wsURL = "http://localhost:8080/axis2/services/CurrencyConvertServices";
        try {
            CurrencyConvertServicesStub stub = new CurrencyConvertServicesStub(wsURL);
            outputEventSetId = callCurrencyConvertMarketDataOperation(stub,inputEventSetId,inputTargetCurrency);
            System.out.println(outputEventSetId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


	public static String callCurrencyConvertMarketDataOperation(CurrencyConvertServicesStub stub, String eventSetId, String targetCurrency) throws Exception {
        // Ready the request for rdthImport operation.
        CurrenyConvertMarketDataDocument reqDoc = CurrenyConvertMarketDataDocument.Factory.newInstance();
        CurrenyConvertMarketData req = reqDoc.addNewCurrenyConvertMarketData();
        req.setEventSetId(eventSetId);
        req.setTargetCurrency(targetCurrency);        

        String result = "";
        try {
        	CurrenyConvertMarketDataResponseDocument respDoc = stub.currenyConvertMarketData(reqDoc);
            CurrenyConvertMarketDataResponse resp = respDoc.getCurrenyConvertMarketDataResponse();
            result += resp.getEventSetId();
        } catch (CurrenyConvertMarketDataFaultException ce) {
        	CurrenyConvertMarketDataFaultDocument faultDoc = ce.getFaultMessage();
        	CurrenyConvertMarketDataFault fault = faultDoc.getCurrenyConvertMarketDataFault();
        	String faultType = fault.getInvalidMarketData().toString();
        	result = "Fault type: " + faultType;
        }

        return result;
    }

	public static String getOutputEventSetId() {
		return outputEventSetId;
	}
	
	 public static String getInputEventSetId() {
		return inputEventSetId;
	}

	public static void setInputEventSetId(String inputEventSetId) {
		WebServiceClient.inputEventSetId = inputEventSetId;
	}

	public static String getInputTargetCurrency() {
		return inputTargetCurrency;
	}

	public static void setInputTargetCurrency(String inputTargetCurrency) {
		WebServiceClient.inputTargetCurrency = inputTargetCurrency;
	}

}