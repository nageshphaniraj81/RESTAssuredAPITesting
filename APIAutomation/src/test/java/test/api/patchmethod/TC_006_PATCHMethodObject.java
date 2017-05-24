package test.api.patchmethod;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;


	public class TC_006_PATCHMethodObject {

		@Test
		public void validate_TC_006_PATCHMethodObject() {

			// Using BDD methods of rest assured
			PostMessage postObj = new PostMessage();
			postObj.setAuthor("spiderauthor");
			
			given().contentType(ContentType.JSON)
			.body(postObj)
			.when().patch("http://localhost:3000/posts/3")
			.then().statusCode(200);
		}
	}


