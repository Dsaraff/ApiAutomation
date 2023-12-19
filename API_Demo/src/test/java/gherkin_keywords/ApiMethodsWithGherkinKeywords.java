package gherkin_keywords;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

public class ApiMethodsWithGherkinKeywords {
	//To set or intiate the base uri or endpoint
	  @BeforeClass
	      public void setup() {
		  RestAssured.baseURI="https://reqres.in/api";
		  
	  }
	  @Test
	  public void createData() {
		  //To initiate the payload/request body/declare
		  String requestBody = "{\n"
		  		+ "    \"name\": \"morpheus\",\n"
		  		+ "    \"job\": \"leader\"\n"
		  		+ "}";
		  //To specify the default data/data format,header field details,body
		  Response response =RestAssured.given()
				  .contentType(ContentType.JSON)
				  .body(requestBody)
				  //To send the request
				  .when()
				  .post("/users")
				  //To capture the response
				  .then()
				  .extract().response();
		  //Response Validations/assertions
		  Assert.assertEquals(response.getStatusCode(),201);
		  Assert.assertEquals(response.jsonPath().getString("name"), "morpheus");
		  Assert.assertEquals(response.jsonPath().getString("job"), "leader");
		  //To print the response 
		  String ResponseBody = response.getBody().asString();
		  System.out.println("responsebody"+ResponseBody);
				  
	  
		  
	  }
	 @Test
	 public void updateData() {
// To initiate the payload for updating resource
		 String requestBody = "{\n"
		 		+ "    \"name\": \"Joe\",\n"
		 		+ "    \"job\": \"zion resident\"\n"
		 		+ "}";
		 // to specify payload type , payload data format & provide header fields
		 Response response = RestAssured.given()
				 .contentType(ContentType.JSON)
				 //.acct id (123)
				// .X-Cloud-Client-Type-Id (3BF5575C-AC3E-449C-8191-032B36ACC75C)
				 .body(requestBody)
				 .when()
				 .put("/users/2")
				 .then()
				 .extract().response();
		 //To validate the response
		 Assert.assertEquals(response.getStatusCode(),200);
		 Assert.assertEquals(response.jsonPath().getString("name"), "Joe");
		 Assert.assertEquals(response.jsonPath().getString("job"), "zion resident");
		 //To Print the statuscode and response
		 String responsebody = response.getBody().asString();
		 int StatusCode = response.getStatusCode();
		 System.out.println ("Status code is" + StatusCode);
		 System.out.println ("responsebody is" + responsebody);
		 
	 }
		 			 
	
}
