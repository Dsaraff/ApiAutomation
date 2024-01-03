package apichaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiChainingTest {
@Test
	public void chainingMethod()
	// Step 1: Make Post request to create new data
	 String payload = "Provide pay load";
	RequestSpecification request = RestAssured.given();
	request.header("ContentType", "Application/json");
	request.body(payload);
	
	Response responseResult0 = request.post("url");
	
	
	//Step2 : Extract newly created post method response Ex: Account_id
	int id = responseResult0.jsonPath().getint("accountId");
	//Step 3: Make a get request to retrieve the data from post method
			Response responseResult1 = request.get("url"+id);
	//Step 4: update post method data using put method
			 String payload = "update pay load";
				RequestSpecification request = RestAssured.given();
				request.header("ContentType", "Application/json");
				request.body(payload);
				
				Response responseResult2 = request.put("url"+id);
	//Step 5: Make another get method to retrieve the updated data
				Response responseResult3 = request.get("url"+id);
	//Step 6: To print response and statuscode
				System.out.println("response is" + responseResult0.asString());
				System.out.println("response is" + responseResult1.asString());
				System.out.println("response is" + responseResult2.asString());
				System.out.println("response is" + responseResult3.asString());
				System.out.println("status code is" + responseResult0.statusCode.getStatusCode());
				System.out.println("status code is" + responseResult1.statusCode.getStatusCode());
				System.out.println("status code is" + responseResult2.statusCode.getStatusCode());
				System.out.println("status code is" + responseResult3.statusCode.getStatusCode());
				
			
	{
}
