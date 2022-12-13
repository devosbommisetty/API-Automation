package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Rendering_Template_With_External_URL_With_GET {
	@Test
	public void test() {

		Response response = RestAssured.get("http://ingress-gateway.gaiansolutions.com/tf-web/v1.0/618b6fdef5dacc0001a6b1b0/groups/60efd8d87981e50007813119/data");
		System.out.println("Response StatusCode is: " +response.statusCode());
//		System.out.println("Response Body is: " +response.asString());
		System.out.println("Response Body is: " +response.getBody().asPrettyString());
		System.out.println(response.statusLine());
	
		

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");

}
}
