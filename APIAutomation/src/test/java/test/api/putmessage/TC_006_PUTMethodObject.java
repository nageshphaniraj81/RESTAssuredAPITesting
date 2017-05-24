package test.api.putmessage;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;


	public class TC_006_PUTMethodObject {

		@Test
		public void validate_TC_006_PUTMethodObject() {

			// Using BDD methods of rest assured
			PostMessage postObj = new PostMessage();
			postObj.setId(7);
			postObj.setAuthor("SureshUpdated");
			postObj.setTitle("Geetha");
			
			given().contentType(ContentType.JSON)
			.body(postObj)
			.when().put("http://localhost:3000/posts/7")
			.then().statusCode(200).contentType(ContentType.JSON);
		}
	}


