package test.api.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.response.Response;

public class TC_003_GETCallWithStaticImport {

	@Test
	public void validate_TC_003_GETCallWithStaticImport(){
		
		// We can directly call static methods of the rest assured without using RestAssured class name
		Response responseWithParam = get("https://www.google.com/homepage/hp-firefox.html?utm_source=google.com&utm_medium=callout&utm_campaign=FFDHP");
	    System.out.println(responseWithParam.getStatusCode());
		
		// To validate response code
		Assert.assertEquals(responseWithParam.getStatusCode(),200);
	}
	
}
