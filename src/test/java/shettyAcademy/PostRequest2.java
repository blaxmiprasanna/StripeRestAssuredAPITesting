package shettyAcademy;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;

public class PostRequest2 {

	@Test
	public void postRequest() {

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put("location.lat", -38.383494);
		map.put("location.lng", 33.427362);
		map.put("accuracy", 60);
		map.put("name", "RaviKumar");
		map.put("phone_number", "(+91) 22 2573 3426");
		map.put("address", "Tiruvannamalai High Road, Tiruvannamalai");
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Chettiar Building");
		list.add("Hall");
		
		map.put("types", list);
		map.put("website", "http://rahulshettyacademy.com");
		map.put("language", "Italy-IN");

	Response response=	RestAssured.given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + 
						"  \"location\": {\r\n" + 
						"    \"lat\": -30.383494,\r\n" + 
						"    \"lng\": 22.427362\r\n" + 
						"  },\r\n" + 
						"  \"accuracy\": 50,\r\n" + 
						"  \"name\": \"amma unavagam \",\r\n" + 
						"  \"phone_number\": \"(+91) 44 2345 3426\",\r\n" + 
						"  \"address\": \"EKAMBARAM STREET, MANALI\",\r\n" + 
						"  \"types\": [\r\n" + 
						"    \"Amma Building\",\r\n" + 
						"    \"Hall\"\r\n" + 
						"  ],\r\n" + 
						"  \"website\": \"http://rahulshettyacademy.com\",\r\n" + 
						"  \"language\": \"French-IN\"\r\n" + 
						"}\r\n" + 
						"")
				.when().post("maps/api/place/add/json")
				.then().
//				body("scope",equalTo("APP"))
				log().all()
				.assertThat().statusCode(200)
				.extract().response();
		
			System.out.println(response.jsonPath().get("place_id"));
			Assert.assertEquals(response.jsonPath().get("status"),"OK");
		
	}

}
