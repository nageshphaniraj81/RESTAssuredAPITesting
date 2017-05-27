package com.responseextraction.rootpath;

//Static Imports
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static com.jayway.restassured.RestAssured.*;

import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.Test;

public class RootPathExamples {
	static HashMap<String, Object> parameters = new HashMap<String, Object>();

	@BeforeClass
	public static void init() {
		baseURI = "https://query.yahooapis.com";
		basePath = "/v1/public";

		parameters.put("q",
				"select * from yahoo.finance.xchange where pair in (\"USDTHB\", \"USDINR\",\"USDCAD\",\"USDAUD\",\"USDEUR\",\"USDBRL\")");
		parameters.put("format", "json");
		parameters.put("env", "store://datatables.org/alltableswithkeys");

	}

	// 1 Adding multiple assertions in single test

	@Test
	public void test001() {
		given().parameters(parameters).when().get("/yql").then().root("query.results.rate")

				.body("Name", hasItem("USD/INR")).body("Name", hasItems("USD/INR", "USD/THB", "USD/BRL"))
				.body("id", hasItem("USDCAD"))
				.root("query")
				.root("query.count")
				.body("", lessThan(10)).body("", greaterThan(4));

	}

}
