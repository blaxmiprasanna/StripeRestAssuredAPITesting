package utilityClass;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JsonUpdateRequest {

	public static Response jsonUpdateRequest(String contentType, Object object,String baseURI,String basePath) throws Exception{
		
		return RestAssured.given().header("Content-Type",contentType).body(object)
		.when().put(baseURI+"/"+basePath).then().
//		.log().all().
		extract().response();
	}
}
