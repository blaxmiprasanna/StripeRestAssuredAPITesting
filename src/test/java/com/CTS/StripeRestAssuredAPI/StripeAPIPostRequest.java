package com.CTS.StripeRestAssuredAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

public class StripeAPIPostRequest {

	public static void main(String[] args) {
		
		String token="Bearer sk_test_51K8FkDDiGnkas9GU0ThoXRp7lszJtenCJnDfdZNN9JGMEcepSbbMxJkTWXqS7uAW8CsiYj5cAo5gzLVQ0iBgmqRg00BUfcOFwT";
		
		Response response = given().header("Authorization",token).param("name", "Ravi Kumar").param("email", "ravi.kumar@gmail.com").
				param("description", "Application Developer")
				.param("country", "US")
//				param("address.line1", "10 Station St").param("address.line2", "Manalapan Township").
//				param("address.city", "new jersy").param("address.state", "NEW JERSY").param("address.postal_code", "07726").
//				param("phone", "+1704901890").param("TIME ZONE", "US - Eastern").param("Language", "English (United States)")
//				.param("currency", "usd")
				.post("https://api.stripe.com/v1/customers");
		
		Assert.assertEquals(response.statusCode(), 200);
		
		System.out.println(response.statusCode());
	}

}
