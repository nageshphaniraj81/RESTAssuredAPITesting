package api.automation.JIRA;

import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;

public class Testcase_001 {
	
	@Test
	public void tcase1(){
		

		 given().auth().preemptive().basic("nageshphaniraj81", "SD5843col**")
		.when().get("http://localhost:8080/rest/api/2/issue/IMS-1")
		.then().statusCode(200);
		


		
	}

}
