package apichaining;


	import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	public class Cookappchaining {
		//@BeforeClass  
		//String clientId = "CBC8B951-512C-4C43-B336-039031E080D9";
		// String authToken = "eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJGOThDODFBNS1DRjFCLTQ3RjctQkUwRS1CNTZENThGQUQzRTAiLCJpc3MiOiJDTE9VRCIsInN1YiI6IjJCeXJYN2Y3d1hpcXZXcmp0YmZDRkhySTVVTWw1RGNUOUtsTHA5WkdpRys0aitTK2dlRUltMTFSSlFDejRuamZ5Q3d3YkFMTmxHMVNBRGJlTEl1aWdkVDNkZGlZV2xFd2FSNGg3Z09iTXVtWjl6Rkp6RWNid0M1Vnd6TkRVdDJjT0dNQ0pPR1ovWmhiNWVFaUcrNnk4WmRkbE5sYzgyL0ZvVmlpUDJ4OFBCZ0ZvZ2FTNnl3M09TOXN1N0cyaWgzcVc5OVdIVEFNWWNERWJUVVhjMTNkZS9UNW9QdWc5Z00xRDByUlEwWUhGWFRJcXQ2RUZSU1BPUWdna245VVdRQ0w1Q2p0eTRDZnRyYVJOSzRKdktqOVNES0R2cklabFFLT1ZtSGdSNkM3eGpmcVNsdXVyMmx6TjVpS1J1dnZ1QSsyY210NzZMTDh5TzNzV3NTTHRuelZqby90bi9pcy9xWjdUOFQ4MDZPR0Rzc2FKY2pqTXJ5T0s3UnNZNWtNdmc1Wi91MGtJUTBucnV1M1RJVjdyWE9Ub1hTdGJkeUMxVEZDKzhvOG95dnFJVkRSRjh0ajRla3FLMTAwbHpzTWxjOUVKZk1KRVphT0xXUEtidEdwdWxITk5kNHZGQUljV25kdlpaMUVJUFBmdHBiZDhjTVRBNmtDZTRwbkdkUGNLWlNxbnBsTElyRFYvL3pYQzlhV1o2Tm81a0VUd1pLQXhUMkluemVDcWtSWldiU1gwb0FUVWZzZm1iWFk5ZkkyODgzWENUMU5EOVU0VGJHNG9IYzFDdGtjRDhJNlZVVGxJVFo1UHFGQzAwVnFpbTloQTQ5Vmp1MVBsYWtLY1JGWngwYkFSQjk4M1ZmbGNZTWJENFRFV2xyUjVoUndUa1M4c0c1OS9PbkNyTnArdk9hcFV1aTRWWjR2cElwVXNEN3RseVVJNzM1Z2xMZlBSNGI5ejRZY1ZRbHUyazdGU01wS3lwcWtldklUd0FrR3FYNGdKQjZNbU0rOVlVOTVSbkRLVDVuelczUnV5OG9zVmhtaDQ1WkVQdkIrOWczWEkzczJ3L1NKbCtmWU4zTGd6Q3p1UGdydnNHZmtsTzUxVXRDNmJzdzhwK00wcDNFRzFqRGdmTmh6T0JVZ2M5dmZLQXhkY3dwSjcrdGo2anZDL0RJVFArcGNtWHBaV3dCRnJuM1hSTGZ2ZHhMZXNmQzhhRkxLVmMySm9CZW02S25GTEpIaGNPYlFDM3VHTnZQVDRGND0iLCJpYXQiOjE3MDM3NDAwMTMsImV4cCI6MTcwMzgyNjQxMn0.iYgk4q0o7_FOBqzxy8B8hce9PgrHU1xK7dybUaxrpLTR3E0h9d2Onlt73att4hw7FT_U_pyCZboVl0NVMC-iaw";
		
	@Test
		public void chainingMethod() {
		// Step 1: Make Post request to create new data
		 String payload1 = "{\n"
		 		+ "  \"itemName\": \"Fruits6\",\n"
		 		+ "  \"itemDescription\": \"made with fresh fruits\",\n"
		 		+ "  \"productType\": \"PRODUCT\",\n"
		 		+ "  \"productUrl\": \"https://www.youtube.com/\",\n"
		 		+ "  \"itemType\": [\n"
		 		+ "    \"VEG\"\n"
		 		+ "  ],\n"
		 		+ "\n"
		 		+ " \"categories\": [\n"
		 		+ "    \"SWEETS\"\n"
		 		+ "  ],\n"
		 		+ "  \"tags\": [\n"
		 		+ "    \"SWEETS\"\n"
		 		+ "  ],\n"
		 		+ "  \"variantType\": \"Bottle\"     \n"
		 		+ "    }\n"
		 		+ " \n"
		 		+ "  \n"
		 		+ "}";  
		 
		// To declare authorization details
		 String clientId = "CBC8B951-512C-4C43-B336-039031E080D9";
		 //String authToken = "eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJCMjQ0REY3Ni0yMTBFLTQ2OUUtOTYyQS03MzM0OTkzODRGRTUiLCJpc3MiOiJDTE9VRCIsInN1YiI6IjJCeXJYN2Y3d1hpcXZXcmp0YmZDRkcxQ0p4dXZqU0YvSk1KM1NIeCs2cmk0aitTK2dlRUltMTFSSlFDejRuamZ5Q3d3YkFMTmxHMVNBRGJlTEl1aWdkVDNkZGlZV2xFd2FSNGg3Z09iTXVtWjl6Rkp6RWNid0M1Vnd6TkRVdDJjT0dNQ0pPR1ovWmhiNWVFaUcrNnk4WmRkbE5sYzgyL0ZvVmlpUDJ4OFBCZ0ZvZ2FTNnl3M09TOXN1N0cyaWgzcVc5OVdIVEFNWWNERWJUVVhjMTNkZS9UNW9QdWc5Z00xRDByUlEwWUhGWFRJcXQ2RUZSU1BPUWdna245VVdRQ0w1Q2p0eTRDZnRyYVJOSzRKdktqOVNES0R2cklabFFLT1ZtSGdSNkM3eGpmcVNsdXVyMmx6TjVpS1J1dnZ1QSsyY210NzZMTDh5TzNzV3NTTHRuelZqby90bi9pcy9xWjdUOFQ4MDZPR0Rzc2FKY2pqTXJ5T0s3UnNZNWtNdmc1Wi91MGtJUTBucnV1M1RJVjdyWE9Ub1hTdGJkeUMxVEZDKzhvOG95dnFJVkRSRjh0ajRla3FLMTAwbHpzTWxjOUVKZk1KRVphT0xXUEtidEdwdWxITk5kNHZGQUljV25kdlpaMUVJUFBmdHBiZDhjTVRBNmtDZTRwbkdkUGNLWlNxbnBsTElyRFYvL3pYQzlhV1o2Tm81a0VUd1pLQXhUMkluemVDcWtSWldiU1gwb0FUVWZzZm1iWFk5ZkkyODgzWENUMU5EOVU0VGJHNG9IYzFDdGtjRDhJNlZVVGxJVFo1UHFGQzAwVnFpbTloQTQ5Vmp1MVBsYWtLY1JGWngwYkFSQjk4M1ZmbGNZTWJENFRFV2xyUjVyQ3Jma01YSHdzVmlBQWJHNkxlUUJJMlZMSnZIUjdSQzZuc2ExdUFQZHVXbnVuVUVDaFlOV1VLbXFWTUJibWN2RTdGU01wS3lwcWtldklUd0FrR3FYNGdKQjZNbU0rOVlVOTVSbkRLVDVuelczUnV5OG9zVmhtaDQ1WkVQdkIrOWczWEkzczJ3L1NKbCtmWU4zTGd6Q3p1UGdydnNHZmtsTzUxVXRDNmJzdzhwK00wcDNFRzFqRGdmTmh6T0JVZ2M5dmZLQXhkY3dwSjcrdGo2anZDL0RJVFArcGNtWHBaV3dCRnJuM1hSTGZ2ZHhMZXNmQzhhRkxLVmMySm9CZW02S25GTEpIaGNPYlFDM3VHTnZQVDRGND0iLCJpYXQiOjE3MDI4ODA0MTAsImV4cCI6MTcwMjk2NjgxMH0.4qytB5xQXEUD_ZW2roCqMWEYbrqV4OWehJcCl4FqAWBnVK_VO0kWwIp6gb1WPUofaBK-D2HN5pmETvLYtdA5DQ";
		// String authToken = "eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJCMjQ0REY3Ni0yMTBFLTQ2OUUtOTYyQS03MzM0OTkzODRGRTUiLCJpc3MiOiJDTE9VRCIsInN1YiI6IjJCeXJYN2Y3d1hpcXZXcmp0YmZDRkcxQ0p4dXZqU0YvSk1KM1NIeCs2cmk0aitTK2dlRUltMTFSSlFDejRuamZ5Q3d3YkFMTmxHMVNBRGJlTEl1aWdkVDNkZGlZV2xFd2FSNGg3Z09iTXVtWjl6Rkp6RWNid0M1Vnd6TkRVdDJjT0dNQ0pPR1ovWmhiNWVFaUcrNnk4WmRkbE5sYzgyL0ZvVmlpUDJ4OFBCZ0ZvZ2FTNnl3M09TOXN1N0cyaWgzcVc5OVdIVEFNWWNERWJUVVhjMTNkZS9UNW9QdWc5Z00xRDByUlEwWUhGWFRJcXQ2RUZSU1BPUWdna245VVdRQ0w1Q2p0eTRDZnRyYVJOSzRKdktqOVNES0R2cklabFFLT1ZtSGdSNkM3eGpmcVNsdXVyMmx6TjVpS1J1dnZ1QSsyY210NzZMTDh5TzNzV3NTTHRuelZqby90bi9pcy9xWjdUOFQ4MDZPR0Rzc2FKY2pqTXJ5T0s3UnNZNWtNdmc1Wi91MGtJUTBucnV1M1RJVjdyWE9Ub1hTdGJkeUMxVEZDKzhvOG95dnFJVkRSRjh0ajRla3FLMTAwbHpzTWxjOUVKZk1KRVphT0xXUEtidEdwdWxITk5kNHZGQUljV25kdlpaMUVJUFBmdHBiZDhjTVRBNmtDZTRwbkdkUGNLWlNxbnBsTElyRFYvL3pYQzlhV1o2Tm81a0VUd1pLQXhUMkluemVDcWtSWldiU1gwb0FUVWZzZm1iWFk5ZkkyODgzWENUMU5EOVU0VGJHNG9IYzFDdGtjRDhJNlZVVGxJVFo1UHFGQzAwVnFpbTloQTQ5Vmp1MVBsYWtLY1JGWngwYkFSQjk4M1ZmbGNZTWJENFRFV2xyUjVyQ3Jma01YSHdzVmlBQWJHNkxlUUJJMlZMSnZIUjdSQzZuc2ExdUFQZHVXbnVuVUVDaFlOV1VLbXFWTUJibWN2RTdGU01wS3lwcWtldklUd0FrR3FYNGdKQjZNbU0rOVlVOTVSbkRLVDVuelczUnV5OG9zVmhtaDQ1WkVQdkIrOWczWEkzczJ3L1NKbCtmWU4zTGd6Q3p1UGdydnNHZmtsTzUxVXRDNmJzdzhwK00wcDNFRzFqRGdmTmh6T0JVZ2M5dmZLQXhkY3dwSjcrdGo2anZDL0RJVFArcGNtWHBaV3dCRnJuM1hSTGZ2ZHhMZXNmQzhhRkxLVmMySm9CZW02S25GTEpIaGNPYlFDM3VHTnZQVDRGND0iLCJpYXQiOjE3MDI4ODA0MTAsImV4cCI6MTcwMjk2NjgxMH0.4qytB5xQXEUD_ZW2roCqMWEYbrqV4OWehJcCl4FqAWBnVK_VO0kWwIp6gb1WPUofaBK-D2HN5pmETvLYtdA5DQ";
		 String authToken = "eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJGOThDODFBNS1DRjFCLTQ3RjctQkUwRS1CNTZENThGQUQzRTAiLCJpc3MiOiJDTE9VRCIsInN1YiI6IjJCeXJYN2Y3d1hpcXZXcmp0YmZDRkhySTVVTWw1RGNUOUtsTHA5WkdpRys0aitTK2dlRUltMTFSSlFDejRuamZ5Q3d3YkFMTmxHMVNBRGJlTEl1aWdkVDNkZGlZV2xFd2FSNGg3Z09iTXVtWjl6Rkp6RWNid0M1Vnd6TkRVdDJjT0dNQ0pPR1ovWmhiNWVFaUcrNnk4WmRkbE5sYzgyL0ZvVmlpUDJ4OFBCZ0ZvZ2FTNnl3M09TOXN1N0cyaWgzcVc5OVdIVEFNWWNERWJUVVhjMTNkZS9UNW9QdWc5Z00xRDByUlEwWUhGWFRJcXQ2RUZSU1BPUWdna245VVdRQ0w1Q2p0eTRDZnRyYVJOSzRKdktqOVNES0R2cklabFFLT1ZtSGdSNkM3eGpmcVNsdXVyMmx6TjVpS1J1dnZ1QSsyY210NzZMTDh5TzNzV3NTTHRuelZqby90bi9pcy9xWjdUOFQ4MDZPR0Rzc2FKY2pqTXJ5T0s3UnNZNWtNdmc1Wi91MGtJUTBucnV1M1RJVjdyWE9Ub1hTdGJkeUMxVEZDKzhvOG95dnFJVkRSRjh0ajRla3FLMTAwbHpzTWxjOUVKZk1KRVphT0xXUEtidEdwdWxITk5kNHZGQUljV25kdlpaMUVJUFBmdHBiZDhjTVRBNmtDZTRwbkdkUGNLWlNxbnBsTElyRFYvL3pYQzlhV1o2Tm81a0VUd1pLQXhUMkluemVDcWtSWldiU1gwb0FUVWZzZm1iWFk5ZkkyODgzWENUMU5EOVU0VGJHNG9IYzFDdGtjRDhJNlZVVGxJVFo1UHFGQzAwVnFpbTloQTQ5Vmp1MVBsYWtLY1JGWngwYkFSQjk4M1ZmbGNZTWJENFRFV2xyUjVoUndUa1M4c0c1OS9PbkNyTnArdk9hcFV1aTRWWjR2cElwVXNEN3RseVVJNzM1Z2xMZlBSNGI5ejRZY1ZRbHUyazdGU01wS3lwcWtldklUd0FrR3FYNGdKQjZNbU0rOVlVOTVSbkRLVDVuelczUnV5OG9zVmhtaDQ1WkVQdkIrOWczWEkzczJ3L1NKbCtmWU4zTGd6Q3p1UGdydnNHZmtsTzUxVXRDNmJzdzhwK00wcDNFRzFqRGdmTmh6T0JVZ2M5dmZLQXhkY3dwSjcrdGo2anZDL0RJVFArcGNtWHBaV3dCRnJuM1hSTGZ2ZHhMZXNmQzhhRkxLVmMySm9CZW02S25GTEpIaGNPYlFDM3VHTnZQVDRGND0iLCJpYXQiOjE3MDM3NDAwMTMsImV4cCI6MTcwMzgyNjQxMn0.iYgk4q0o7_FOBqzxy8B8hce9PgrHU1xK7dybUaxrpLTR3E0h9d2Onlt73att4hw7FT_U_pyCZboVl0NVMC-iaw";
		 // To send the request and capture the response
		 RequestSpecification request = RestAssured.given();
		 request.header("X-Cloud-Client-Type-Id", clientId);
		 request.header("Content-Type", "application/json");
		 request.header("Authorization","Bearer "+ authToken);
		 request.body(payload1);
		
		Response responseResult1 = request.post("https://api.kicchin.com/service-provider-service/rest/serviceproviders/814CDACB-BC4F-4B28-B12C-ABFCB7DCCA6A/products");
		
	
		//Step2 : Extract newly created post method response Ex: Account_id
		String productid = responseResult1.jsonPath().getString("id"); 
		//Step 3: Make a get request to retrieve the data from post method
		
	Response responseResult2 = request.get("https://api.kicchin.com/service-provider-service/rest/serviceproviders/814CDACB-BC4F-4B28-B12C-ABFCB7DCCA6A/products/"+productid);
	
	
	//Step 4: update post method data using put method
	
		String payload2 = "{\n"
		 		+ "  \"itemName\": \"Fruits8\",\n"
		 		+ "  \"itemDescription\": \"made with fresh fruits\",\n"
		 		+ "  \"productType\": \"PRODUCT\",\n"
		 		+ "  \"productUrl\": \"https://www.youtube.com/\",\n"
		 		+ "  \"itemType\": [\n"
		 		+ "    \"VEG\"\n"
		 		+ "  ],\n"
		 		+ "\n"
		 		+ " \"categories\": [\n"
		 		+ "    \"SWEETS\"\n"
		 		+ "  ],\n"
		 		+ "  \"tags\": [\n"
		 		+ "    \"SWEETS\"\n"
		 		+ "  ],\n"
		 		+ "  \"variantType\": \"Bottle\"     \n"
		 		+ "    }\n"
		 		+ " \n"
		 		+ "  \n"
		 		+ "}"; 
		//RequestSpecification request2 = RestAssured.given();
		
		// To declare authorization details
				// String clientId = "CBC8B951-512C-4C43-B336-039031E080D9";
				 //String authToken = "eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJCMjQ0REY3Ni0yMTBFLTQ2OUUtOTYyQS03MzM0OTkzODRGRTUiLCJpc3MiOiJDTE9VRCIsInN1YiI6IjJCeXJYN2Y3d1hpcXZXcmp0YmZDRkcxQ0p4dXZqU0YvSk1KM1NIeCs2cmk0aitTK2dlRUltMTFSSlFDejRuamZ5Q3d3YkFMTmxHMVNBRGJlTEl1aWdkVDNkZGlZV2xFd2FSNGg3Z09iTXVtWjl6Rkp6RWNid0M1Vnd6TkRVdDJjT0dNQ0pPR1ovWmhiNWVFaUcrNnk4WmRkbE5sYzgyL0ZvVmlpUDJ4OFBCZ0ZvZ2FTNnl3M09TOXN1N0cyaWgzcVc5OVdIVEFNWWNERWJUVVhjMTNkZS9UNW9QdWc5Z00xRDByUlEwWUhGWFRJcXQ2RUZSU1BPUWdna245VVdRQ0w1Q2p0eTRDZnRyYVJOSzRKdktqOVNES0R2cklabFFLT1ZtSGdSNkM3eGpmcVNsdXVyMmx6TjVpS1J1dnZ1QSsyY210NzZMTDh5TzNzV3NTTHRuelZqby90bi9pcy9xWjdUOFQ4MDZPR0Rzc2FKY2pqTXJ5T0s3UnNZNWtNdmc1Wi91MGtJUTBucnV1M1RJVjdyWE9Ub1hTdGJkeUMxVEZDKzhvOG95dnFJVkRSRjh0ajRla3FLMTAwbHpzTWxjOUVKZk1KRVphT0xXUEtidEdwdWxITk5kNHZGQUljV25kdlpaMUVJUFBmdHBiZDhjTVRBNmtDZTRwbkdkUGNLWlNxbnBsTElyRFYvL3pYQzlhV1o2Tm81a0VUd1pLQXhUMkluemVDcWtSWldiU1gwb0FUVWZzZm1iWFk5ZkkyODgzWENUMU5EOVU0VGJHNG9IYzFDdGtjRDhJNlZVVGxJVFo1UHFGQzAwVnFpbTloQTQ5Vmp1MVBsYWtLY1JGWngwYkFSQjk4M1ZmbGNZTWJENFRFV2xyUjVyQ3Jma01YSHdzVmlBQWJHNkxlUUJJMlZMSnZIUjdSQzZuc2ExdUFQZHVXbnVuVUVDaFlOV1VLbXFWTUJibWN2RTdGU01wS3lwcWtldklUd0FrR3FYNGdKQjZNbU0rOVlVOTVSbkRLVDVuelczUnV5OG9zVmhtaDQ1WkVQdkIrOWczWEkzczJ3L1NKbCtmWU4zTGd6Q3p1UGdydnNHZmtsTzUxVXRDNmJzdzhwK00wcDNFRzFqRGdmTmh6T0JVZ2M5dmZLQXhkY3dwSjcrdGo2anZDL0RJVFArcGNtWHBaV3dCRnJuM1hSTGZ2ZHhMZXNmQzhhRkxLVmMySm9CZW02S25GTEpIaGNPYlFDM3VHTnZQVDRGND0iLCJpYXQiOjE3MDI4ODA0MTAsImV4cCI6MTcwMjk2NjgxMH0.4qytB5xQXEUD_ZW2roCqMWEYbrqV4OWehJcCl4FqAWBnVK_VO0kWwIp6gb1WPUofaBK-D2HN5pmETvLYtdA5DQ";
				// String authToken = "eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJCMjQ0REY3Ni0yMTBFLTQ2OUUtOTYyQS03MzM0OTkzODRGRTUiLCJpc3MiOiJDTE9VRCIsInN1YiI6IjJCeXJYN2Y3d1hpcXZXcmp0YmZDRkcxQ0p4dXZqU0YvSk1KM1NIeCs2cmk0aitTK2dlRUltMTFSSlFDejRuamZ5Q3d3YkFMTmxHMVNBRGJlTEl1aWdkVDNkZGlZV2xFd2FSNGg3Z09iTXVtWjl6Rkp6RWNid0M1Vnd6TkRVdDJjT0dNQ0pPR1ovWmhiNWVFaUcrNnk4WmRkbE5sYzgyL0ZvVmlpUDJ4OFBCZ0ZvZ2FTNnl3M09TOXN1N0cyaWgzcVc5OVdIVEFNWWNERWJUVVhjMTNkZS9UNW9QdWc5Z00xRDByUlEwWUhGWFRJcXQ2RUZSU1BPUWdna245VVdRQ0w1Q2p0eTRDZnRyYVJOSzRKdktqOVNES0R2cklabFFLT1ZtSGdSNkM3eGpmcVNsdXVyMmx6TjVpS1J1dnZ1QSsyY210NzZMTDh5TzNzV3NTTHRuelZqby90bi9pcy9xWjdUOFQ4MDZPR0Rzc2FKY2pqTXJ5T0s3UnNZNWtNdmc1Wi91MGtJUTBucnV1M1RJVjdyWE9Ub1hTdGJkeUMxVEZDKzhvOG95dnFJVkRSRjh0ajRla3FLMTAwbHpzTWxjOUVKZk1KRVphT0xXUEtidEdwdWxITk5kNHZGQUljV25kdlpaMUVJUFBmdHBiZDhjTVRBNmtDZTRwbkdkUGNLWlNxbnBsTElyRFYvL3pYQzlhV1o2Tm81a0VUd1pLQXhUMkluemVDcWtSWldiU1gwb0FUVWZzZm1iWFk5ZkkyODgzWENUMU5EOVU0VGJHNG9IYzFDdGtjRDhJNlZVVGxJVFo1UHFGQzAwVnFpbTloQTQ5Vmp1MVBsYWtLY1JGWngwYkFSQjk4M1ZmbGNZTWJENFRFV2xyUjVyQ3Jma01YSHdzVmlBQWJHNkxlUUJJMlZMSnZIUjdSQzZuc2ExdUFQZHVXbnVuVUVDaFlOV1VLbXFWTUJibWN2RTdGU01wS3lwcWtldklUd0FrR3FYNGdKQjZNbU0rOVlVOTVSbkRLVDVuelczUnV5OG9zVmhtaDQ1WkVQdkIrOWczWEkzczJ3L1NKbCtmWU4zTGd6Q3p1UGdydnNHZmtsTzUxVXRDNmJzdzhwK00wcDNFRzFqRGdmTmh6T0JVZ2M5dmZLQXhkY3dwSjcrdGo2anZDL0RJVFArcGNtWHBaV3dCRnJuM1hSTGZ2ZHhMZXNmQzhhRkxLVmMySm9CZW02S25GTEpIaGNPYlFDM3VHTnZQVDRGND0iLCJpYXQiOjE3MDI4ODA0MTAsImV4cCI6MTcwMjk2NjgxMH0.4qytB5xQXEUD_ZW2roCqMWEYbrqV4OWehJcCl4FqAWBnVK_VO0kWwIp6gb1WPUofaBK-D2HN5pmETvLYtdA5DQ";
				// String authToken = "eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJGOThDODFBNS1DRjFCLTQ3RjctQkUwRS1CNTZENThGQUQzRTAiLCJpc3MiOiJDTE9VRCIsInN1YiI6IjJCeXJYN2Y3d1hpcXZXcmp0YmZDRkhySTVVTWw1RGNUOUtsTHA5WkdpRys0aitTK2dlRUltMTFSSlFDejRuamZ5Q3d3YkFMTmxHMVNBRGJlTEl1aWdkVDNkZGlZV2xFd2FSNGg3Z09iTXVtWjl6Rkp6RWNid0M1Vnd6TkRVdDJjT0dNQ0pPR1ovWmhiNWVFaUcrNnk4WmRkbE5sYzgyL0ZvVmlpUDJ4OFBCZ0ZvZ2FTNnl3M09TOXN1N0cyaWgzcVc5OVdIVEFNWWNERWJUVVhjMTNkZS9UNW9QdWc5Z00xRDByUlEwWUhGWFRJcXQ2RUZSU1BPUWdna245VVdRQ0w1Q2p0eTRDZnRyYVJOSzRKdktqOVNES0R2cklabFFLT1ZtSGdSNkM3eGpmcVNsdXVyMmx6TjVpS1J1dnZ1QSsyY210NzZMTDh5TzNzV3NTTHRuelZqby90bi9pcy9xWjdUOFQ4MDZPR0Rzc2FKY2pqTXJ5T0s3UnNZNWtNdmc1Wi91MGtJUTBucnV1M1RJVjdyWE9Ub1hTdGJkeUMxVEZDKzhvOG95dnFJVkRSRjh0ajRla3FLMTAwbHpzTWxjOUVKZk1KRVphT0xXUEtidEdwdWxITk5kNHZGQUljV25kdlpaMUVJUFBmdHBiZDhjTVRBNmtDZTRwbkdkUGNLWlNxbnBsTElyRFYvL3pYQzlhV1o2Tm81a0VUd1pLQXhUMkluemVDcWtSWldiU1gwb0FUVWZzZm1iWFk5ZkkyODgzWENUMU5EOVU0VGJHNG9IYzFDdGtjRDhJNlZVVGxJVFo1UHFGQzAwVnFpbTloQTQ5Vmp1MVBsYWtLY1JGWngwYkFSQjk4M1ZmbGNZTWJENFRFV2xyUjVoUndUa1M4c0c1OS9PbkNyTnArdk9hcFV1aTRWWjR2cElwVXNEN3RseVVJNzM1Z2xMZlBSNGI5ejRZY1ZRbHUyazdGU01wS3lwcWtldklUd0FrR3FYNGdKQjZNbU0rOVlVOTVSbkRLVDVuelczUnV5OG9zVmhtaDQ1WkVQdkIrOWczWEkzczJ3L1NKbCtmWU4zTGd6Q3p1UGdydnNHZmtsTzUxVXRDNmJzdzhwK00wcDNFRzFqRGdmTmh6T0JVZ2M5dmZLQXhkY3dwSjcrdGo2anZDL0RJVFArcGNtWHBaV3dCRnJuM1hSTGZ2ZHhMZXNmQzhhRkxLVmMySm9CZW02S25GTEpIaGNPYlFDM3VHTnZQVDRGND0iLCJpYXQiOjE3MDM3NDAwMTMsImV4cCI6MTcwMzgyNjQxMn0.iYgk4q0o7_FOBqzxy8B8hce9PgrHU1xK7dybUaxrpLTR3E0h9d2Onlt73att4hw7FT_U_pyCZboVl0NVMC-iaw";
				 // To send the request and capture the response
				 RequestSpecification request2 = RestAssured.given();
				 request.header("X-Cloud-Client-Type-Id", clientId);
				 request.header("Content-Type", "application/json");
				 request.header("Authorization","Bearer "+ authToken);
				 request.body(payload2);
					
		Response responseResult3 = request2.put("https://api.kicchin.com/service-provider-service/rest/serviceproviders/814CDACB-BC4F-4B28-B12C-ABFCB7DCCA6A/products/"+productid);
		//Step 5: Make another get method to retrieve the updated data
		Response responseResult4 = request2.get("https://api.kicchin.com/service-provider-service/rest/serviceproviders/814CDACB-BC4F-4B28-B12C-ABFCB7DCCA6A/products/"+productid);
		//Step 6: To print response and statuscode
					System.out.println("response is" + responseResult1.asString());
					System.out.println("response is" + responseResult2.asString());
					System.out.println("response is" + responseResult3.asString());
					System.out.println("response is" + responseResult4.asString());
					System.out.println("status code is" + responseResult1.getStatusCode());
					System.out.println("status code is" + responseResult2.getStatusCode());
					System.out.println("status code is" + responseResult3.getStatusCode());
					System.out.println("status code is" + responseResult4.getStatusCode());
					
				
		
	}

}
