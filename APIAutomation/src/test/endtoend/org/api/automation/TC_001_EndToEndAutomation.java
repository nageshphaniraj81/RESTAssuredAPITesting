package org.api.automation;

import org.api.library.CreatePost;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;

import static com.jayway.restassured.RestAssured.*;

public class TC_001_EndToEndAutomation {
	
	//*********************  Step 1 *******************************************//
	// Created new resource
	@Test
	public void tcase1(){
		CreatePost cpost = new CreatePost();
		cpost.setId(22);
		cpost.setAuthor("Author1");
		cpost.setTitle("Title1");
		
	 ValidatableResponse res =	given().contentType(ContentType.JSON).body(cpost)
		.when().post("http://localhost:3000/posts")
		.then().contentType(ContentType.JSON);
	 
	  int responseId  = res.extract().path("id");
	  int actualStatusCode = res.extract().response().getStatusCode();
	  
	  Assert.assertEquals(actualStatusCode, 201);
	  
	  
	  //*********************  Step 2 *******************************************//
	  // Validating resources created
	  
	  ValidatableResponse res2 =
			           when().get("http://localhost:3000/posts/"+responseId)
			           .then().contentType(ContentType.JSON);
	  
	  String actualTitle = res2.extract().path("title");
	  String actualAuthor = res2.extract().path("author");
	  
	  Assert.assertEquals(actualTitle, "Title1");
	  Assert.assertEquals(actualAuthor, "Author1");
	
	  //*********************  Step 3 *******************************************//
	  // Update resource created in step 2
	  
	    cpost.setId(20);
		cpost.setAuthor("Author2");
		cpost.setTitle("Title2");
		ValidatableResponse res3 =  given().contentType(ContentType.JSON).body(cpost)
		              .when().put("http://localhost:3000/posts/"+responseId)
		              .then().statusCode(200).contentType(ContentType.JSON);
	  
		   actualTitle = res3.extract().path("title");
		   actualAuthor = res3.extract().path("author");
		  
		  Assert.assertEquals(actualTitle, "Title2");
		  Assert.assertEquals(actualAuthor, "Author2");
		  

		//*********************  Step 4 *******************************************//
		// delete resource created in step 1
		  
		           given().contentType(ContentType.JSON)
	              .when().delete("http://localhost:3000/posts/"+responseId)
	              .then().statusCode(200).contentType(ContentType.JSON);
		           
		           ValidatableResponse res4 =
				           when().get("http://localhost:3000/posts/"+responseId)
				           .then().contentType(ContentType.JSON);
		           
		           int finalStatusCode = res4.extract().response().getStatusCode();
		           Assert.assertNotEquals(finalStatusCode, 201);
	  
	}

}
