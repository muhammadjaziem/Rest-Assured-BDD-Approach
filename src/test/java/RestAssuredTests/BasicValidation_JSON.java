package RestAssuredTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class BasicValidation_JSON {

	@Test(priority = 1)
	public void testStatusCode()
	{
		given()
		
		.when()
			.get("http://jsonplaceholder.typicode.com/posts/5")
		
		.then()
			.statusCode(200);
			//.log().all();	
	}
	
	@Test(priority = 2)
	public void testLogging()
	{
		given()
		
		.when()
			.get("http://jsonplaceholder.typicode.com/posts/5")
		
		.then()
			.statusCode(200)
			.log().all();
	}
	
	@Test(priority = 3)
	public void testSingleContent()
	{
		given()
		
		.when()
			.get("http://jsonplaceholder.typicode.com/posts/5")
		
		.then()
			.statusCode(200)
			.body("x.title",hasItems("nesciunt quas odio"));
	}

}
