package test.api.JSONValidation;

import static com.jayway.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;

public class TC_006_ValidateJSONPath {
	
	@Test
	public void validate_TC_006_ValidateJSONPath(){
		
		String actualAuthor  = when().get("http://localhost:3000/posts/1")
		.then().contentType(ContentType.JSON).extract()
		.path("author");
		
		Assert.assertEquals(actualAuthor, "typicode");
		
		
	}

}
