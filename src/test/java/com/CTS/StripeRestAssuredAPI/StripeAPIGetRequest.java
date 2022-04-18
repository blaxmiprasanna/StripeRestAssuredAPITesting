package com.CTS.StripeRestAssuredAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StripeAPIGetRequest {

	public static void main(String[] args) {
		
		String token="sk_test_51K8FkDDiGnkas9GU0ThoXRp7lszJtenCJnDfdZNN9JGMEcepSbbMxJkTWXqS7uAW8CsiYj5cAo5gzLVQ0iBgmqRg00BUfcOFwT";
		
		Response response = RestAssured.given().contentType("application/json").auth().basic(token, "").
		get("https://dashboard.stripe.com/v1/customers");
		
		System.out.println(response.prettyPrint());
		
	}

}
