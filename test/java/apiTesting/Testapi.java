package apiTesting;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Testapi {
	@Test

	
	
		public void validateURL()
		{
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("address","pune");
		json.put("city","sample");
		json.put("firstName","sample");
		json.put("id","0");
		json.put("lastName","sample");
		json.put("telephone","1234567890");
		request.body(json.toJSONString()); 
		Response response = request.post("http://20.239.27.227/petclinic/api/owners");
		int code = response.getStatusCode();
		System.out.println("Status Code="+code);
		Assert.assertEquals(code, 201);
		

		
		
	}

}
