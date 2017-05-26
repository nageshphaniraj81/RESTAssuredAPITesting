package api.automation.JIRA;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.automationtesting.excelreport.Xl;

import static com.jayway.restassured.RestAssured.*;

public class Testcase_001 {
	
	@BeforeMethod
	public void beforemethod(){
       System.out.println("This is a before method");
	}
	
	@Test
	public void tcase1(){
		 given().auth().preemptive().basic("nageshphaniraj81", "SD5843col**")
		.when().get("http://localhost:8080/rest/api/2/issue/IMS-1")
		.then().statusCode(200);
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("This is a after method");
	}
	
	@AfterSuite
	public void generateReport() throws Exception{
		Xl.generateReport("Report_Excel.xlsx");
	}
	

}
