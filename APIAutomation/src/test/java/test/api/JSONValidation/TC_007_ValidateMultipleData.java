package test.api.JSONValidation;

import static com.jayway.restassured.RestAssured.when;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;

public class TC_007_ValidateMultipleData {

	@Test
	public void validate_TC_007_ValidateMultipleData(){
		
		ValidatableResponse vr  = when().get("http://localhost:3000/posts/1")
		.then().contentType(ContentType.JSON);
		
		String actualAuthor = vr.extract().path("author");
		String actualTitle = vr.extract().path("title");
		int id = vr.extract().path("id");
		
		Assert.assertEquals(actualAuthor, "typicode");
		Assert.assertEquals(actualTitle, "json-server");
		Assert.assertEquals(id, 1);
		
	}
}
