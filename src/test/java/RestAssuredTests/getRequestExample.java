package RestAssuredTests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class getRequestExample {
	
	@Test
	public void getAllInfo()
	{
		given()
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
		     .statusCode(200)
		     .statusLine("HTTP/1.1 200 OK");
		     
	}


}
