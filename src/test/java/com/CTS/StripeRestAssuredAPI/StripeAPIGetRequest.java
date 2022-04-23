package com.CTS.StripeRestAssuredAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;


public class StripeAPIGetRequest {

	public static void main(String[] args) {
		
		String token="sk_test_51K8FkDDiGnkas9GU0ThoXRp7lszJtenCJnDfdZNN9JGMEcepSbbMxJkTWXqS7uAW8CsiYj5cAo5gzLVQ0iBgmqRg00BUfcOFwT";
		
		Response response = given().auth().basic(token, "").
		get("https://api.stripe.com/v1/customers");
		
//		RequestSpecification response = given().header("Authorization","Bearer"+token).contentType("application/json").get("https://api.stripe.com/v1/customers")
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(),200);
		
		System.out.println(response.jsonPath().get("data[].length"));
		
		
		
	}

}
