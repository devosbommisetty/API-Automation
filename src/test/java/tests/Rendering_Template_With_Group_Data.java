package tests;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Rendering_Template_With_Group_Data {
	  private static String payload = "{\n"
	  		+ "    \"data\": [],\n"
	  		+ "    \"dataUrls\": {\n"
	  		+ "        \"key\": \"\",\n"
	  		+ "        \"url\": \"https://ingress-gateway.gaiansolutions.com/tf-web/v1.0/618b6fdef5dacc0001a6b1b0/groups/60efd8d87981e50007813119/data?fields=userId%2CemailId%2CdeviceId%2C%20deviceType%2CfcmToken%2CosType\",\n"
	  		+ "        \"method\": \"POST\",\n"
	  		+ "        \"headers\": {\n"
	  		+ "            \"Content-Type\": \"application/json\",\n"
	  		+ "            \"Accept\": \"application/json\"\n"
	  		+ "        },\n"
	  		+ "        \"body\": {\n"
	  		+ "            \"emailId\": \"charu.hasini@gaiansolutions.com\"\n"
	  		+ "        },\n"
	  		+ "        \"paged\": false,\n"
	  		+ "        \"jsonPath\": \"data.model.entities\"\n"
	  		+ "    }\n"
	  		+ "}";
		    @Test
		    public void postRequest() {

		    Response postResponse=given()
		    .auth().none()
		    .header("Content-Type", "application/json")
		    .when()
		    .body(payload)
		    .post("https://ingress-gateway.gaiansolutions.com/template-service/v2.0/admin/admin/templates/638848e13616a00008bd6d17");
		    
		    System.out.println("Render Template With Group Data" + postResponse.asPrettyString());
		    Assert.assertEquals(200, postResponse.statusCode());

}
}
