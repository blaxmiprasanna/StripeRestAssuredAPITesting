package utilityClass;

import java.util.LinkedHashMap;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JsonPostRequest {
	
	public static Response createPostRequest(String key, String contentType, Object object,String baseURI, String basePath){
		
	return	RestAssured.given().log().all().queryParam("key", key).header("Content-Type", contentType)
		.body(object)
		.when().post(baseURI+"/"+basePath);
//		.then().extract().response();
//		body("scope",equalTo("APP"))
//		log().all()
//		.assertThat().statusCode(200)
//		.extract().response();
	}

}
