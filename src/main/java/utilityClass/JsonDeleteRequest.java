package utilityClass;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JsonDeleteRequest {
	
	public static Response jsonDeleteRequest(String key,String contentType,Object place_id, String baseURI,String basePath ) throws Exception{
		
		return RestAssured.given().queryParam("key", key).contentType(contentType).body(place_id).
		when().delete(baseURI+"/"+basePath).then().
//		log().all().
		extract().response();
		
	}
}
