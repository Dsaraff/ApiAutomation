package datadriventesting;

import static org.hamcrest.Matchers.notNullValue;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class DDT_Automation {
@Test
public void Createdata() {
   // TO provide the Json file path - to inititate the payload
	String jsonFilePath = "file path location address";
	
	// To Read data from Json file
	String jsonData = "";
	String name = "Morpheus";
	String Job = "Leader";
	jsonData = jsonData.replace("{{name}}", name)
			   .replace("{{job}}",Job);
	


    // To declare authorization details
    //String clientId = "CBC8B951-512C-4C43-B336-039031E080D9";

    // To send the request and capture the response
    RequestSpecification request = RestAssured.given();
   // request.header("X-Cloud-Client-Type-Id", clientId);
    request.header("Content-Type", "application/json");
    request.body(jsonData);

    // To send the request and capture the response
    Response responseResult = request.post("https://api.kicchin.com/user-service/rest/accounts"); // Removed the absolute URL
    String response = responseResult.getBody().asString();
    int statusCode = responseResult.getStatusCode();

    // To print the response and status code
    System.out.println("Response body is" + response);
  //  System.out.println("StatusCode is " + statusCode);

    // To add assertions for response
    Assert.assertEquals(statusCode, 201);
    //responseResult.then().body("", notNullValue());
}
}
	
}
