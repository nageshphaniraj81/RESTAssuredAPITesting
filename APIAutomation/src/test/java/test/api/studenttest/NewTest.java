package test.api.studenttest;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {

	@BeforeClass
	public void beforeClass() {
		baseURI="http://localhost";
		port=8085;
		basePath="/student";
	}

	@Test
	public void testStudents() {
	Response res =	given()
		.when().get("/list");
	System.out.println(res.body().prettyPrint());
		
	
	given()
	.when().get("/list")
	.then().statusCode(200);
	}
	
	@Test
	public void testStudents2() {
	Response res =	given()
		.when().get("/1");
	System.out.println(res.body().prettyPrint());
		
	
	given()
	.when().get("/1")
	.then().statusCode(200);
	}


	@AfterClass
	public void afterClass() {
	}

}
