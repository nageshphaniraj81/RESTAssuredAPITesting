package test.api.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class TC_001_GETMethod {

	@Test
	public void validate_TC_001_GETMETHOD() {

		// Get request to get response
		Response response = RestAssured.get("http://services.groupkt.com/country/get/iso2code/IN");
		System.out.println(response.asString());

		// To get status code
		System.out.println("Response code is : " + response.getStatusCode());

		// To test invalid response code
		Response invalidResponse = RestAssured.get("http://services.groupkt.com/country/get/iso2codeTEST/IN");
		System.out.println("Invalid Response code is : " + invalidResponse.getStatusCode());

		// To validate response code
		Assert.assertEquals(response.getStatusCode(),200);

		// To validate invalid response code
		//Assert.assertEquals(invalidResponse.getStatusCode(),200);
		
		// To validate content type of the response
		Response responseContent = RestAssured.get("http://services.groupkt.com/country/get/all");
		Assert.assertEquals(responseContent.getContentType(),"application/json;charset=UTF-8");
	}

}
