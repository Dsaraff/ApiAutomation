
package kicchinapp;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Del_productdelete {
@Test
public void del_product() {
	String clientId = "CBC8B951-512C-4C43-B336-039031E080D9";
	String Auth = "eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJGOThDODFBNS1DRjFCLTQ3RjctQkUwRS1CNTZENThGQUQzRTAiLCJpc3MiOiJDTE9VRCIsInN1YiI6IjJCeXJYN2Y3d1hpcXZXcmp0YmZDRkhySTVVTWw1RGNUOUtsTHA5WkdpRys0aitTK2dlRUltMTFSSlFDejRuamZ5Q3d3YkFMTmxHMVNBRGJlTEl1aWdkVDNkZGlZV2xFd2FSNGg3Z09iTXVtWjl6Rkp6RWNid0M1Vnd6TkRVdDJjT0dNQ0pPR1ovWmhiNWVFaUcrNnk4WmRkbE5sYzgyL0ZvVmlpUDJ4OFBCZ0ZvZ2FTNnl3M09TOXN1N0cyaWgzcVc5OVdIVEFNWWNERWJUVVhjMTNkZS9UNW9QdWc5Z00xRDByUlEwWUhGWFRJcXQ2RUZSU1BPUWdna245VVdRQ0w1Q2p0eTRDZnRyYVJOSzRKdktqOVNES0R2cklabFFLT1ZtSGdSNkM3eGpmcVNsdXVyMmx6TjVpS1J1dnZ1QSsyY210NzZMTDh5TzNzV3NTTHRuelZqby90bi9pcy9xWjdUOFQ4MDZPR0Rzc2FKY2pqTXJ5T0s3UnNZNWtNdmc1Wi91MGtJUTBucnV1M1RJVjdyWE9Ub1hTdGJkeUMxVEZDKzhvOG95dnFJVkRSRjh0ajRla3FLMTAwbHpzTWxjOUVKZk1KRVphT0xXUEtidEdwdWxITk5kNHZGQUljV25kdlpaMUVJUFBmdHBiZDhjTVRBNmtDZTRwbkdkUGNLWlNxbnBsTElyRFYvL3pYQzlhV1o2Tm81a0VUd1pLQXhUMkluemVDcWtSWldiU1gwb0FUVWZzZm1iWFk5ZkkyODgzWENUMU5EOVU0VGJHNG9IYzFDdGtjRDhJNlZVVGxJVFo1UHFGQzAwVnFpbTloQTQ5Vmp1MVBsYWtLY1JGWngwYkFSQjk4M1ZmbGNZTWJENFRFV2xyUjVoUndUa1M4c0c1OS9PbkNyTnArdk9hcFV1aTRWWjR2cElwVXNEN3RseVVJNzM1Z2xMZlBSNGI5ejRZY1ZRbHUyazdGU01wS3lwcWtldklUd0FrR3FYNGdKQjZNbU0rOVlVOTVSbkRLVDVuelczUnV5OG9zVmhtaDQ1WkVQdkIrOWczWEkzczJ3L1NKbCtmWU4zTGd6Q3p1UGdydnNHZmtsTzUxVXRDNmJzdzhwK00wcDNFRzFqRGdmTmh6T0JVZ2M5dmZLQXhkY3dwSjcrdGo2anZDL0RJVFArcGNtWHBaV3dCRnJuM1hSTGZ2ZHhMZXNmQzhhRkxLVmMySm9CZW02S25GTEpIaGNPYlFDM3VHTnZQVDRGND0iLCJpYXQiOjE3MDM3NDAwMTMsImV4cCI6MTcwMzgyNjQxMn0.iYgk4q0o7_FOBqzxy8B8hce9PgrHU1xK7dybUaxrpLTR3E0h9d2Onlt73att4hw7FT_U_pyCZboVl0NVMC-iaw";
	
	RequestSpecification request = RestAssured.given();
	request.header("contenttype", "application/json");
	request.header("X-Cloud-Client-Type-Id", clientId);
	request.header("Authorization", "Bearer "+Auth);
	
	Response responseResult = request.delete("https://api.kicchin.com/service-provider-service/rest/serviceproviders/814CDACB-BC4F-4B28-B12C-ABFCB7DCCA6A/products/DE5612A3-6C36-4050-9A40-478C897221AB");
	int statuscode = responseResult.getStatusCode();
	String response = responseResult.body().asString();
	
	System.out.println("statuscode is" + statuscode);
	System.out.println("responsebody is"+ response);
	
}
			
}
