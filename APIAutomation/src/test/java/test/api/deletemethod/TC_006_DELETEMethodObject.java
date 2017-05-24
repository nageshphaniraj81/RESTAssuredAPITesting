package test.api.deletemethod;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;


	public class TC_006_DELETEMethodObject {

		@Test
		public void validate_TC_006_PATCHMethodObject() {			
			 given().contentType(ContentType.JSON)
			.when().delete("http://localhost:3000/posts/3")
			.then().statusCode(200);
		}
	}


