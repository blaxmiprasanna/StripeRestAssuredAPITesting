package com.CTS.StripeRestAssuredAPI;

import static io.restassured.RestAssured.given;

import org.testng.Assert;import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StripeUpdateAPI {

	public static void main(String[] args) {
		
String token="Bearer sk_test_51K8FkDDiGnkas9GU0ThoXRp7lszJtenCJnDfdZNN9JGMEcepSbbMxJkTWXqS7uAW8CsiYj5cAo5gzLVQ0iBgmqRg00BUfcOFwT";

String json="{\r\n" + 
		"  \"id\": \"cus_Ko6cSslsEovfC8\",\r\n" + 
		"  \"object\": \"customer\",\r\n" + 
		"  \"address\": {\r\n" + 
		"    \"city\": \"charlotte\",\r\n" + 
		"    \"country\": \"US\",\r\n" + 
		"    \"line1\": \"2390 Andrew Corngie\",\r\n" + 
		"    \"line2\": \"Suite # 6500\",\r\n" + 
		"    \"postal_code\": \"28404\",\r\n" + 
		"    \"state\": \"NC\"\r\n" + 
		"  },\r\n" + 
		"  \"balance\": 0,\r\n" + 
		"  \"created\": 1639939591,\r\n" + 
		"  \"currency\": \"usd\",\r\n" + 
		"  \"default_source\": null,\r\n" + 
		"  \"delinquent\": false,\r\n" + 
		"  \"description\": \"learningStripe\",\r\n" + 
		"  \"discount\": null,\r\n" + 
		"  \"email\": \"umar.syedakbhar@gmail.com\",\r\n" + 
		"  \"invoice_prefix\": \"3A547A75\",\r\n" + 
		"  \"invoice_settings\": {\r\n" + 
		"    \"custom_fields\": null,\r\n" + 
		"    \"default_payment_method\": null,\r\n" + 
		"    \"footer\": null\r\n" + 
		"  },\r\n" + 
		"  \"livemode\": false,\r\n" + 
		"  \"metadata\": {\r\n" + 
		"    \"order_id\": \"6735\"\r\n" + 
		"  },\r\n" + 
		"  \"name\": \"Umar syed akbhar\",\r\n" + 
		"  \"next_invoice_sequence\": 1,\r\n" + 
		"  \"phone\": \"+12014892489\",\r\n" + 
		"  \"preferred_locales\": [\r\n" + 
		"    \"en-US\"\r\n" + 
		"  ],\r\n" + 
		"  \"shipping\": {\r\n" + 
		"    \"address\": {\r\n" + 
		"    \"city\": \"charlotte\",\r\n" + 
		"    \"country\": \"US\",\r\n" + 
		"    \"line1\": \"2390 Andrew Corngie\",\r\n" + 
		"    \"line2\": \"Suite # 6500\",\r\n" + 
		"    \"postal_code\": \"28404\",\r\n" + 
		"    \"state\": \"NC\"\r\n" + 
		"  },\r\n" + 
		"    \"name\": \"Umar\",\r\n" + 
		"    \"phone\": \"+12014892489\"\r\n" + 
		"  },\r\n" + 
		"  \"tax_exempt\": \"none\",\r\n" + 
		"  \"test_clock\": null\r\n" + 
		"}";
		
//		Response response = given().auth().basic(token, "").body(json)
//				.when().post("https://api.stripe.com/v1/customers/cus_Ko6cSslsEovfC8");

		Response response = given().header("Authorization", token).body(json).when().post("https://api.stripe.com/v1/customers");
				
//		Response response = given().header("Authorization", token).when().get("https://api.stripe.com/v1/customers/cus_Ko6cSslsEovfC8");
		
//		RequestSpecification response = given().header("Authorization","Bearer"+token).contentType("application/json").get("https://api.stripe.com/v1/customers")
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(),200);

	}

}
