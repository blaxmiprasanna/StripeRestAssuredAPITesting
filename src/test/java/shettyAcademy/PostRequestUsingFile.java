package shettyAcademy;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.CTS.StripeRestAssuredAPI.PayloadToCreatePostRequestWithFile;
import com.aventstack.extentreports.Status;

import extendedReport.ExtentListeners;
import io.restassured.response.Response;
import utilityClass.HelperClass;

@Listeners(extendedReport.ExtentListeners.class)

public class PostRequestUsingFile extends ExtentListeners {
	
	@Test
	public void postRequestUsingFile() throws Exception{
		
		try {
			testReport.get().log(Status.INFO, "post request using payload from file is started");
			String file = HelperClass.readDataFromPropertyFile().getJsonFile();
			Response response = PayloadToCreatePostRequestWithFile.payloadToCreatePostRequestWithFile(
					HelperClass.readDataFromPropertyFile().getKey(),
					HelperClass.readDataFromPropertyFile().getContentType(), file,
					HelperClass.readDataFromPropertyFile().getBaseURL(),
					HelperClass.readDataFromPropertyFile().getBasePathForPost());
			System.out.println(response.jsonPath().get("place_id"));
			testReport.get().log(Status.PASS, "place is generated");
//Testing report script is not working 
			//Testing the webhook
			
		} catch (Exception e) {
			System.out.println("Hello");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace().toString());
		}
	}
	
	
}
