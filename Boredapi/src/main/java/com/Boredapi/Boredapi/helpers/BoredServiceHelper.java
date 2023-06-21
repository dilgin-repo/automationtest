package com.Boredapi.Boredapi.helpers;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import com.Boredapi.Boredapi.constants.EndPoints;
import com.Boredapi.Boredapi.model.Activity;
import com.Boredapi.Boredapi.utils.ConfigManager;

import io.restassured.RestAssured;

public class BoredServiceHelper {
	
	
	
		private static final String BASE_URL = ConfigManager.getInstance().getString("base_url");
		private static final String PORT = ConfigManager.getInstance().getString("port");
	
	
	public BoredServiceHelper()
	{
		RestAssured.baseURI=BASE_URL;
		RestAssured.port=Integer.parseInt(PORT);
		RestAssured.useRelaxedHTTPSValidation();
	}
	
	public Response createActivity()
	{
		Activity activity = new Activity();
		
		activity.setActivity("fun with friends");
		activity.setType("Social");
		activity.setParticipants(2);
		activity.setPrice(0.2);
		activity.setLink("");
		activity.setKey("23547125");
		activity.setAccessibility(0.3);
		
		activity.setActivity("fun with family");
		activity.setType("Social");
		activity.setParticipants(2);
		activity.setPrice(0.2);
		activity.setLink("");
		activity.setKey("23547126");
		activity.setAccessibility(0.3);
		
		activity.setActivity("enjoying Holidays");
		activity.setType("Social");
		activity.setParticipants(2);
		activity.setPrice(0.2);
		activity.setLink("");
		activity.setKey("23547127");
		activity.setAccessibility(0.3);
		
		
		Response response =RestAssured.given()
				   .contentType(ContentType.Json);
		           .when()
		           .body(activity)
		           .post(EndPoints.CREATE_Activity)
		           .andReturn();
		           
		  assertEquals(response.getStatusCode(),HttpStatus.SC_CREATED,"created");
		  
		  return response;
	}
	
	

}
