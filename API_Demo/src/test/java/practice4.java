import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class practice4 
{
@Test
public void pratice4postmethod()
{
	//declare payload
	String payload = "{\n"
			+ "  \"phoneNumber\": \"+918885144196\",\n"
			+ "  \"countryCode\": \"IN\",\n"
			+ "  \"registrationConsent\": true\n"
			+ "}";
	//declare request
	RequestSpecification request = RestAssured.given();
	request.header("contentType","application/json");
	request.body(payload);
	//declare response
	Response a = request.post("/accounts");
	String responsebody = a.getBody().asString();
	int statusCode = a.getStatusCode();
	System.out.println("body is" + responsebody);
	System.out.println("status is" + statusCode);
	
}
}

public class apimethods {
	@Test
	
	// To create the method
		public void createResource() {
			// To inititate the payload
			String requestBody = "{\n"
					+ "    \"name\": \"morpheus\",\n"
					+ "    \"job\": \"leader\"\n"
					+ "}";
			// To Specify input data format and payload
			RequestSpecification request = RestAssured.given();
				request.header("contentType","application/Json");
				request.body(requestBody);
			// To send the request and the response will be stored in a variable	
				Response response = request.post("https://reqres.in/api/users");
				String ResponseBody = response.getBody().asString();
				int StatusCode = response.getStatusCode();
				System.out.println("Status Code is"+StatusCode);
				System.out.println("Response Body is"+ResponseBody);
