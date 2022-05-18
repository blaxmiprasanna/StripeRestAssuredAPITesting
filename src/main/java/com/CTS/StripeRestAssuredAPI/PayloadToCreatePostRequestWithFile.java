package com.CTS.StripeRestAssuredAPI;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PayloadToCreatePostRequestWithFile {
	
	public static Response payloadToCreatePostRequestWithFile(String key, String contentType, String filePath, String BaseURI, Object object){
		 
		return RestAssured.given().queryParam("key", key).contentType(contentType).body(new File(filePath)) 
		 .when().post(BaseURI+"/"+object).then().log().all().extract().response();
		 
//		 return response.path("place_id");
		 
//		 System.out.println(response.getStatusCode());
//		 System.out.println(response.path("place_id"));
	 }

}
