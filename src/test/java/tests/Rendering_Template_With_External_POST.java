package tests;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Rendering_Template_With_External_POST {
	 private static String payload = "{ \n"
	 		+ "\"userId\": \"614d8fd869ed4500012d003f\",\n"
	 		+ "\"emailId\": \"charu.hasini@gaiansolutions.com\"\n"
	 		+ "}";
		    @Test
		    public void postRequest() {

		    Response postResponse=given()
		    .auth().none()
		    .header("Content-Type", "application/json")
		    .when()
		    .body(payload)
		    .post("http://ingress-gateway.gaiansolutions.com/tf-web/v1.0/618b6fdef5dacc0001a6b1b0/groups/60efd8d87981e50007813119/data");
		    
		    System.out.println("Render Template With Via Data" + postResponse.asPrettyString());
		    Assert.assertEquals(200, postResponse.statusCode());
		    }

}
