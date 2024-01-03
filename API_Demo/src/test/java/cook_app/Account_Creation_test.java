							

package cook_app;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.inject.matcher.Matchers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import org.json.simple.JSONObject;
import static org.hamcrest.Matchers.*;

public class Account_Creation_test {
    // To declare the endpoint (base URI)
    //@BeforeClass
   // public void setup() {
       // RestAssured.baseURI = "https://dev-api.cookapp.net/user-service/rest";
   // }

    // To implement API functionality
    @Test
    public void CreateAccount() {
        // Payload details using JSONObject
        JSONObject payload = new JSONObject();
        payload.put("phoneNumber", "");
        payload.put("countryCode", "IN");
        payload.put("registrationConsent", true);

        // To declare authorization details
        String clientId = "CBC8B951-512C-4C43-B336-039031E080D9";

        // To send the request and capture the response
        RequestSpecification request = RestAssured.given();
        request.header("X-Cloud-Client-Type-Id", clientId);
        request.header("Content-Type", "application/json");
        request.body(payload.toJSONString());

        // To send the request and capture the response
        Response responseResult = request.post("https://api.kicchin.com/user-service/rest/accounts"); // Removed the absolute URL
        String response = responseResult.getBody().asString();
        int statusCode = responseResult.getStatusCode();

        // To print the response and status code
        System.out.println("Response body is " + response);
      //  System.out.println("StatusCode is " + statusCode);

        // To add assertions for response
        Assert.assertEquals(statusCode, 400);
        responseResult.then().body("AccountID", notNullValue());
       
     
    }
}