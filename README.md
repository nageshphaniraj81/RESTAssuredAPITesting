# RESTAssuredAPITesting
Repository to test REST API using RESTAssured using JAVA

SOAP : Simple Object Access Protocol
---------------------------------------------------------------------------------------------
1.SOAP is a wrapper over HTTP protocol (It is a protocol)
2.Message exchange between Server and Appication takes place in XML format
3.Standard conventional & Heavy
4.Use USDL (Web Service definition Language)
5.SOAP uses services Interface to expose the business logic 
6.SOAP defines its own security

WSDL File:
It is a base file used to describe web service and how to access them, written in XML format.
It also describe the location of the web service and operations exposed by web service.

It has 4 elements:
<types> : Describes the data types used by webservice 
<Message> : messages used bt web service
<porttype> : Operations performed by web service
<binding> : communication protocol

REST Service: Representation state Transfer (It is a architectural style)
----------------------------------------------------------------------------------------------
1.RESTful services use HTTP or other similar protocol (Uses standard HTTP operations like GET,POST,PUT & DELETE)
2.A request/ response can be in any format like HTML,XML,plain text,JSON & PDF
3.New and lightweight
4.Uses WADL (Web Application Definition Language)
5.Data and Functionality that client can access from Server is called Resource
6.Each resource in Services can be accessed using unique URI
7.RESTful services inherits security measures from underlying transport layer

URI for practice:
FREE URI 
http://services.groupkt.com/country/get/all
http://services.groupkt.com/country/get/iso2code/IN
http://www.thomas-bayer.com/sqlrest/CUSTOMER/3/
http://www.thomas-bayer.com/sqlrest/CUSTOMER/
http://www.omdbapi.com/?t=Spiderman&y=&plot=short&r=json (REST API with parameters)

List of HTTP Response Code :
https://en.wikipedia.org/wiki/List_of_HTTP_status_codes

REST API request methods:
----------------------------------------------------------------------------------------------------
1.GET : Retrieve some data from server
2.POST : When we want to add new data
3.PUT : When we want to update data 
4.DELETE : When we want to delete the data from Server
5.PATCH : Same as PUT but no need to send data which you do not want to update
6.HEAD : When we want only header
7.OPTIONS :  To get all the list of methods that can be used
8.TRACE : To check request header and request body for debugging 

JSON :

1. Complete JSON file should be written in {}
2. Data in Json is stored in key value pair
3. Each key can have one or more values
4. If we have more than 1 value, than we store it in an array
5. Key can have sub key/values, this is called objects

Example :

   {
      "address" :
	   {
	    "AddressLine1":"H-507 Phillie Street",
		"AddressLine2":"San Fransisco"
	  
	  }
	  
1.  Install NPM
2.  Install JSON Server    npm install -g json-server
3.   Create a db.json file (Anywhere on your machine)
{
  "posts": [
    { "id": 1, "title": "json-server", "author": "typicode" }
  ],
  "comments": [
    { "id": 1, "body": "some comment", "postId": 1 }
  ],
  "profile": { "name": "typicode" }
}

4. Start JSON Server     json-server --watch db.json
   
   }
   
PUT URL : http://localhost:3000/posts/1

JIRA Download: https://br.atlassian.com/software/jira/download
http://localhost:8080/secure/admin/user/ViewUser.jspa?

http://localhost:8080/secure/WelcomeToJIRA.jspa

Key : IMS
User for testing : nageshphaniraj81@gmail.com
SD5843col**
https://docs.atlassian.com/jira/REST/6.1.7/
http://localhost:8080/rest/api/2/issue/IMS-1

----------------------------------------------------------------------------------------------------

ReportNG Reporting :
It needs :velocity-dep.jar, reporting.jar, guice.jar

Dependencies:
<dependency>
			<groupId>org.uncommons</groupId>
			<artifactId>reportng</artifactId>
			<version>1.1.4</version>
		</dependency>
		<dependency>
			<groupId>com.google.inject</groupId>
			<artifactId>guice</artifactId>
			<version>4.1.0</version>
		</dependency>

Need to add Listners:
		
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
	<listeners>
		<listener class-name="org.uncommons.reportng.HTMLReporter"></listener>
		<listener class-name="org.uncommons.reportng.JUnitXMLReporter"></listener>
	</listeners>
	<test name="Test">
		<classes>
			<class name="api.automation.JIRA.Testcase_001" />
		</classes>
	</test> <!-- Test -->
</suite> <!-- Suite -->		
		