package day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class apimethods {
	
	 @BeforeClass
     public void setup() {
	  RestAssured.baseURI="https://dev-api.cookapp.net/user-service/rest";
	  
 }
	 @Test
	// To create the method
		public void createResource() {
			// To inititate the payload
		 
		 String requestBody = "{\n"
		 		+ "  \"phoneNumber\": \"+919550360500\",\n"
		 		+ "  \"countryCode\": \"\",\n"
		 		+ "  \"registrationConsent\": true\n"
		 		+ "}";
			
			// To Specify input data format and payload
			RequestSpecification request = RestAssured.given();
				request.header("contentType","application/Json");
				request.body(requestBody);
			// To send the request and the response will be stored in a variable	
				Response response = request.post("/accounts");
				String ResponseBody = response.getBody().asString();
				int StatusCode = response.getStatusCode();
				System.out.println("Status Code is"+StatusCode);
				System.out.println("Response Body is"+ResponseBody);
		}
	@Test
	public void updateResource() {
		// To inititate the payload
					String requestBody = "{\n"
							+ "    \"name\": \"morpheus\",\n"
							+ "    \"job\": \"Zion Resident\"\n"
							+ "}";
					// To Specify input data format and payload
					RequestSpecification request = RestAssured.given();
						request.header("contentType","application/Json");
						request.body(requestBody);
					// To send the request and the response will be stored in a variable	
						Response response = request.put("https://reqres.in/api/users/2");
						String ResponseBody = response.getBody().asString();
						int StatusCode = response.getStatusCode();
						System.out.println("Status Code is"+StatusCode);
						System.out.println("Response Body is"+ResponseBody);	
	}
	@Test
	public void fetchResource() {
		// To Specify input data format and payload
		RequestSpecification request = RestAssured.given();
			request.header("contentType","application/Json");
		// To send the request and the response will be stored in a variable	
			Response response = request.get("https://reqres.in/api/users/2");
			String ResponseBody = response.getBody().asString();
			int StatusCode = response.getStatusCode();
			System.out.println("Status Code is"+StatusCode);
			System.out.println("Response Body is"+ResponseBody);	
	}
	}


