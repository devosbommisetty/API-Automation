package tests;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Render_Template_With_Via_Data {
	  private static String payload = "{\n"
	  		+ "    \"data\": [\n"
	  		+ "        {\n"
	  		+ "            \"source\": {\n"
	  		+ "                \"entities\": [\n"
	  		+ "                    {\n"
	  		+ "                        \"_EPOCH\": 1669725279238,\n"
	  		+ "                        \"osType\": \"Android\",\n"
	  		+ "                        \"emailId\": \"charu.hasini@gaiansolutions.com\",\n"
	  		+ "                        \"_id\": \"charu.hasini@gaiansolutions.com\",\n"
	  		+ "                        \"userId\": \"614d8fd869ed4500012d003f\",\n"
	  		+ "                        \"deviceId\": \"32:4E:B9:02:99:D7\",\n"
	  		+ "                        \"fcmToken\": \"dJEWs2_RR3uu23XXsRtsCU:APA91bFAeOqzcZQoynPrTJ2n7CyRmr0yqfE1kLCpBZvNsrYs1CBCJuV6fEnulAknREw4LaQmXXgf7fFb1QG5KEQlCKWYaSmjF3Wcf-dvK4gv5wBgXsqx2FoI71SeKzE-o28OQ2zqMm9W\"\n"
	  		+ "                    },\n"
	  		+ "                    {\n"
	  		+ "                        \"_EPOCH\": 0,\n"
	  		+ "                        \"osType\": \"Android\",\n"
	  		+ "                        \"emailId\": \"charu.hasini@gaiansolutions.com\",\n"
	  		+ "                        \"_id\": \"charu.hasini@gaiansolutions.com\",\n"
	  		+ "                        \"userId\": \"614d8fd869ed4500012d003f\",\n"
	  		+ "                        \"deviceId\": \"\",\n"
	  		+ "                        \"fcmToken\": \"eb1KJS7yQwaYZoSPjgg7OZ:APA91bErhFWnM8p33LyRikjvVtRG0Cwh3Tz6BE6UN31RUL4FCCNhu8DPYfN8ITMwiNDlQ-FuM67YrkKrYXyVZ-Uw0I9Mrevt8qL5ivtgSnJxgBBu5Y0PycyPlCYRbBlg71fBzEWSpcV0\"\n"
	  		+ "                    }\n"
	  		+ "                ]\n"
	  		+ "            }\n"
	  		+ "        }\n"
	  		+ "    ],\n"
	  		+ "    \"dataUrls\": null\n"
	  		+ "}";
	    @Test
	    public void postRequest() {

	    Response postResponse=given()
	    .auth().none()
	    .header("Content-Type", "application/json")
	    .when()
	    .body(payload)
	    .post("https://ingress-gateway.gaiansolutions.com/template-service/v2.0/admin/admin/templates/638848e13616a00008bd6d17");
	    
	    System.out.println("Render Template With Via Data" + postResponse.asPrettyString());
	    Assert.assertEquals(200, postResponse.statusCode());
	    }
	}

