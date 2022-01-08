package RestAssuredTests;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class postRequestExample {
	
	public static HashMap map = new HashMap();
	
	@BeforeClass
	public void setPostData()
	{
		map.put("name", "Lanado");
		map.put("job", "Plumberss");
		RestAssured.baseURI="https://reqres.in/api/users";
		
	}
	
	@Test
	public void testPost()
	{
		given()
		.contentType("application/json")
		.body(map)
		
		.when()
		
		 .post()
		 
		 .then()
		    .statusCode(201);
		    
	}

}
