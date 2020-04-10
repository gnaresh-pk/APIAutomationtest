package apiDevopsIP.RestAssuredAPIDevops;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CategoryAPITest {
	@Test
	public void validate_response_headers_test() throws Exception {
		RestAssured.baseURI = "http://localhost:8090/categorization-proxy-governance/";
		RequestSpecification httpRequest = RestAssured.given();
		CategoryPage categoryPage = new CategoryPage();
		categoryPage.buildHeaders();
	
							
		// using request body in String format.
		String operationName = "Create Category";
		String requestBody = "{\"categoryName\":\"5348120280092032\",\"categoryDesc\":\"30080\"}";
		httpRequest.body(requestBody);
		Response response = httpRequest.post("/Create Category"); //resource uri
		Reporter.log("response status code : " + response.getStatusCode());
		Assert.assertTrue(response.statusCode() == 200, "Create Category Successfully : \n"
				+ response.getBody().asString() + "\n" + "operationName : " + operationName);
	} 
 

}
