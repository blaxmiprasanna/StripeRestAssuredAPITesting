package shettyAcademy;

import com.CTS.StripeRestAssuredAPI.PayloadToCreatePostRequest;
import io.restassured.response.Response;
import utilityClass.HelperClass;
import utilityClass.JsonPostRequest;

public class CreatePlaceIdAPIUsingPostRequest {
	
	public static Object postRequest() throws Exception {
		
//		RestAssured.baseURI = HelperClass.readDataFromPropertyFile().getBaseURL();
		
		Response response=JsonPostRequest.createPostRequest(HelperClass.readDataFromPropertyFile().getKey(), 
				HelperClass.readDataFromPropertyFile().getContentType(), PayloadToCreatePostRequest.postRequest(), 
				HelperClass.readDataFromPropertyFile().getBaseURL(),
				HelperClass.readDataFromPropertyFile().getBasePathForPost());	
		
			return response.jsonPath().get("place_id");
		
//		System.out.println(response.jsonPath().get("place_id"));
	}


}
