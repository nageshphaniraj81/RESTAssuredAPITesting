package test.api.postmessage;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;

public class TC_006_POSTMethodObject {

	public class TC_005_POSTMethodTestcase {

		@Test
		public void validate_TC_006_POSTMethodObject() {

			// Using BDD methods of rest assured
			PostMessage postObj = new PostMessage();
			postObj.setId(7);
			postObj.setAuthor("Nagesh");
			postObj.setTitle("Geetha");
			given().contentType(ContentType.JSON).body(postObj)
			.when().post("http://localhost:3000/posts")
			.then().statusCode(201).contentType(ContentType.JSON);
		}
	}

}
