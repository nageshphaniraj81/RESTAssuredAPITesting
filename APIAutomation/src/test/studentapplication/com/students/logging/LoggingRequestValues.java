package com.students.logging;

import com.jayway.restassured.http.ContentType;
import com.student.base.TestBase;
import com.student.model.Student;

import static com.jayway.restassured.RestAssured.*;

import java.util.ArrayList;

import org.junit.Test;

public class LoggingRequestValues extends TestBase {
	
	// This test will print out all the request headers
	@Test
	public void test001(){
		
		System.out.println("------------------Printing Request Headers---------------");
		given().log().headers()
		.when().get("/1")
		.then().statusCode(200);
		
	}
	// This test will print out all the request parameters
		@Test
		public void test002(){
			
			System.out.println("------------------Printing Request parameters---------------");
			given().param("programme", "Computer Science").param("limit", 1)
			.log().params()
			.when().get("/list")
			.then().statusCode(200);
			
		}
		// This test will print out all the request body
		@Test
		public void test003(){
			
			System.out.println("------------------Printing Request body---------------");
			ArrayList<String> courses = new ArrayList<>();
			courses.add("Java");
			courses.add("C#");
			
			Student student = new Student();
			student.setFirstName("Kan");
			student.setLastName("Tan");
			student.setEmail("xyzabc56@gmail.com");
			student.setProgramme("Computer Science");
			student.setCourses(courses);
			
			given().log().body()
			.contentType(ContentType.JSON)
			.when()
			.body(student)
			.post()
			.then()
			.statusCode(201);
			
		}
		
		// This test will print out all the information body
				@Test
				public void test004(){
					
					System.out.println("------------------Printing all the details---------------");
					ArrayList<String> courses = new ArrayList<>();
					courses.add("Java");
					courses.add("C#");
					
					Student student = new Student();
					student.setFirstName("Gan");
					student.setLastName("Pan");
					student.setEmail("xyz12347@gmail.com");
					student.setProgramme("Computer Science");
					student.setCourses(courses);
					
					given().log().all()
					.contentType(ContentType.JSON)
					.when()
					.body(student)
					.post()
					.then()
					.statusCode(201);
					
				}
				
				// This test will print request details if validation fails
				@Test
				public void test005(){
					
					System.out.println("------------------Printing all the details if validation fails---------------");
					ArrayList<String> courses = new ArrayList<>();
					courses.add("Java");
					courses.add("C#");
					
					Student student = new Student();
					student.setFirstName("Gan");
					student.setLastName("Pan");
					student.setEmail("xyz123456@gmail.com");
					student.setProgramme("Computer Science");
					student.setCourses(courses);
					
					given().log().ifValidationFails()
					.contentType(ContentType.JSON)
					.when()
					.body(student)
					.post()
					.then()
					.statusCode(201);
					
				}

}
