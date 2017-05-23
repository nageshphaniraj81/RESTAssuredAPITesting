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