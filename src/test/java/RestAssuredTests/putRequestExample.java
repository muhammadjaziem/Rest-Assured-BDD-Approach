package RestAssuredTests;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class putRequestExample {
	
	public static HashMap map = new HashMap();
	
	@BeforeClass
	public void setPutData()
	{
		map.put("name", "Johr");
		map.put("job", "Pluvv");
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
	}
	
	@Test
	public void testPut()
	{
		given()
		.contentType("application/json")
		.body(map)
		
		.when()
		
		 .put()
		 
		 .then()
		    .statusCode(200);
		    
	}

}
