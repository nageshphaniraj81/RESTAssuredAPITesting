package com.students.logging;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;

import com.student.base.TestBase;

public class LoggingResponseValues extends TestBase {
	
		// This test will print out all the response headers
			@Test
			public void test001(){
				
				System.out.println("------------------Printing response headers---------------");
				given().param("programme", "Computer Science").param("limit", 1)
				.when().get("/list")
				.then().log().headers()
				.statusCode(200);
				
			}
			// This test will print out  the response Status line
			@Test
			public void test002(){
				
				System.out.println("------------------Printing status line---------------");
				given().param("programme", "Computer Science").param("limit", 1)
				.when().get("/list")
				.then().log().status()
				.statusCode(200);
				
			}
			// This test will print out  the response body 
			@Test
			public void test003(){
				
				System.out.println("------------------Printing body---------------");
				given().param("programme", "Computer Science").param("limit", 1)
				.when().get("/list")
				.then().log().body()
				.statusCode(200);
				
			}
			// This test will print out  the response body in case error
						@Test
						public void test004(){
							
							System.out.println("------------------Printing body in case of error---------------");
							given().param("programme", "Computer Science").param("limit", 1)
							.when().get("/list")
							.then().log().ifError()
							.statusCode(200);
							
						}
}
