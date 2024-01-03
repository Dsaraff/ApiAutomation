package moreassertions;

//package moreresponsefieldsvalidation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidatingResponseFields {

    private String clientId = "CBC8B951-512C-4C43-B336-039031E080D9";
    private String authToken = "eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiIwQjg0RTk5NC04Nzk1LTRGOTYtOThFNC02MEFDQUVFN0YzQ0QiLCJpc3MiOiJDTE9VRCIsInN1YiI6IjJCeXJYN2Y3d1hpcXZXcmp0YmZDRkxvWWtLQlZHNEtFM0VUVHNKQ3k2aVc0aitTK2dlRUltMTFSSlFDejRuamZ5Q3d3YkFMTmxHMVNBRGJlTEl1aWdkVDNkZGlZV2xFd2FSNGg3Z09iTXVtWjl6Rkp6RWNid0M1Vnd6TkRVdDJjT0dNQ0pPR1ovWmhiNWVFaUcrNnk4WmRkbE5sYzgyL0ZvVmlpUDJ4OFBCZ0ZvZ2FTNnl3M09TOXN1N0cyaWgzcVc5OVdIVEFNWWNERWJUVVhjMTNkZS9UNW9QdWc5Z00xRDByUlEwWUhGWFRJcXQ2RUZSU1BPUWdna245VVdRQ0w1Q2p0eTRDZnRyYVJOSzRKdktqOVNES0R2cklabFFLT1ZtSGdSNkM3eGpmcVNsdXVyMmx6TjVpS1J1dnZ1QSsyY210NzZMTDh5TzNzV3NTTHRuelZqby90bi9pcy9xWjdUOFQ4MDZPR0Rzc2FKY2pqTXJ5T0s3UnNZNWtNdmc1Wi91MGtJUTBucnV1M1RJVjdyWE9Ub1hTdGJkeUMxVEZDKzhvOG95dnFJVkRSRjh0ajRla3FLMTAwbHpzTWxjOUVKZk1KRVphT0xXUEtidEdwdWxITk5kNHZGQUljV25kdlpaMUVJUFBmdHBiZDhjTVRBNmtDZTRwbkdkUGNLWlNxbnBsTElyRFYvL3pYQzlhV1o2Tm81a0VUd1pLQXhUMkluemVDcWtSWldiU1gwb0FUVWZzZm1iWFk5ZkkyODgzWENUMU5EOVU0VGJHNG9IYzFDdGtjRDhJNlZVVGxJVFo1UHFGQzAwVnFpbTloQTQ5Vmp1MVBsYWtLY1JGWngwYkFSQjk4M1ZmbGNZTWJENFRFV2xyUjVodUo3S1BhTVJ5b2IrWGhHTExjL3dMeHR6Vkl2UWdTK2U5aExsMUoyZTFRR3JHSXpuM2RodGExOGlCU2RYTzQzRTdGU01wS3lwcWtldklUd0FrR3FYNGdKQjZNbU0rOVlVOTVSbkRLVDVuelczUnV5OG9zVmhtaDQ1WkVQdkIrOWczWEkzczJ3L1NKbCtmWU4zTGd6Q3p1UGdydnNHZmtsTzUxVXRDNmJzdzhwK00wcDNFRzFqRGdmTmh6T0JVZ2M5dmZLQXhkY3dwSjcrdGo2anZDL0RJVFArcGNtWHBaV3dCRnJuM1hSTGZ2ZHhMZXNmQzhhRkxLVmMySm9CZW02S25GTEpIaGNPYlFDM3VHTnZQVDRGND0iLCJpYXQiOjE3MDM2NDk4NTEsImV4cCI6MTcwMzczNjI1MX0.zu93ZYrAIWxmWWMBMzBBUNESNA6thtCU0tbAnRHUiCDKntPCPyjH13vLxZYlohSlc9sGGLRN0tjbXJ2Ol0SjNg"; // Replace with your actual auth token

    @BeforeClass
    public void setUp() {
        // Setup SLF4J to avoid warning
        System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "warn");
    }

    @Test
    public void getSpecificProduct() {
        // Request setup
        RequestSpecification request = RestAssured.given()
                .header("X-Cloud-Client-Type-Id", clientId)
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + authToken);

        // Send the request and capture the response
        Response responseResult = request.get("https://api.kicchin.com/service-provider-service/rest/serviceproviders/814CDACB-BC4F-4B28-B12C-ABFCB7DCCA6A/products/E2AC306D-335B-47B8-AD5A-7D874D0F5F04");

        // Extract response details
        String response = responseResult.getBody().asString();
        int statusCode = responseResult.getStatusCode();

        // Print the response and status code
        System.out.println("Response body is " + response);
        System.out.println("StatusCode is " + statusCode);

        // Assertions
        Assert.assertEquals(statusCode, 200);
        Assert.assertNotNull(responseResult.path("id"));
        Assert.assertEquals("Fresh Fruit Juice", responseResult.path("itemName"));
        Assert.assertTrue(responseResult.path("productUrl").startsWith("https://www.youtube.com/"));
        Assert.assertEquals("made with fresh fruits", responseResult.path("itemDescription"));
        Assert.assertTrue(responseResult.path("Category").contains("SWEETS"));
        Assert.assertTrue(responseResult.path("tags").contains("SWEETS"));
        Assert.assertTrue(responseResult.path("variantType").contains("bottle"));
    }
}