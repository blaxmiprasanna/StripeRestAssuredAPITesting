package com.CTS.StripeRestAssuredAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilityClass.HelperClass;
import utilityClass.JsonPostRequest;

public class CreatePlaceId {
	
	@Test
	public void createPlaceId() throws Exception{
		
		RestAssured.baseURI = HelperClass.readDataFromPropertyFile().getBaseURL();
		
//		Response response=JsonPostRequest.createPostRequest(HelperClass.readDataFromPropertyFile().getKey(), 
//				HelperClass.readDataFromPropertyFile().getContentType(), JsonPayload.jsonPayloadObject(), 
//				HelperClass.readDataFromPropertyFile().getBasePathForPost());	
//		
//		System.out.println(response.path("place_id"));
	}

}
