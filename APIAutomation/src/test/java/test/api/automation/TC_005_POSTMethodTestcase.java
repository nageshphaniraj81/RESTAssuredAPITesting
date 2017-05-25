package test.api.automation;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;

public class TC_005_POSTMethodTestcase {

	@Test
	public void validate_TC_005_POSTMethodTestcase(){

       // Using BDD methods of rest assured		
		given().contentType(ContentType.JSON)
		.body("{\"id\": 10,\"title\": \"Bahubali\",\"author\": \"typicode\" }")
		.when().post("http://localhost:3000/posts")
		.then().statusCode(201).contentType(ContentType.JSON);	       
}}
