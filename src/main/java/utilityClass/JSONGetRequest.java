package utilityClass;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JSONGetRequest {
	
	public static Response getRequest(String key,String contentType,String baseURI,String basePath,Object place_id) throws Exception{
		
	return RestAssured.given().log().all().queryParam("key",key).queryParam("place_id",place_id)
			.header("Content-Type",contentType)
			.when().get(baseURI+"/"+basePath).then().
//			log().all()
//			.assertThat().statusCode(200)
			extract().response();
	}

}
