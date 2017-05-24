package test.api.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class TC_002_GETMethodWithParameters {

	@Test
	public void validate_TC_002_GETMethodWithParameters(){
		Response responseWithParam = RestAssured.get("https://www.google.com/homepage/hp-firefox.html?utm_source=google.com&utm_medium=callout&utm_campaign=FFDHP");
	    System.out.println(responseWithParam.getStatusCode());
		
		// To validate response code
		Assert.assertEquals(responseWithParam.getStatusCode(),200);
	}
	
}
