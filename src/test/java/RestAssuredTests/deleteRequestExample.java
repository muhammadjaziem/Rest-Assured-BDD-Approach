package RestAssuredTests;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class deleteRequestExample {
	
			
	@Test
	public void testDelete()
	{
		
		RestAssured.baseURI="https://reqres.in/api/users/2";
		given()
		
		.when()
		    .delete()
		 
		 .then()
		    .statusCode(204)
		    .statusLine("HTTP/1.1 204 No Content")
		    .log().all()
		    .extract().response();
		    
	}

}
