package test.api.automation;
import static com.jayway.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class TC_004_BDDTestcase {
	
	@Test
	public void validate_TC_004_BDDTestcase(){

       // Using BDD methods of rest assured		
		given().param("utm_source", "google.com")
			   .param("utm_medium", "callout")
			   .param("utm_campaign","FFDHP")

	    .when().get("https://www.google.com/homepage/hp-firefox.html")	
	    
	    .then().statusCode(200);
		
		
		
	}

}
