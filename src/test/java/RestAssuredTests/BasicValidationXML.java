package RestAssuredTests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class BasicValidationXML {

		@Test(priority=1)
		void testingSingleContent()
		{
			given()
			
			.when()
				.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15")
				
			.then()
				.body("CUSTOMER.ID",equalTo("15"))
				.log().all();
		}
		
		@Test(priority=2)
		void testingMultipleContent()
		{
			given()
			
			.when()
				.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15")
				
			.then()
				.body("CUSTOMER.ID", equalTo("15"))
				.body("CUSTOMER.FIRSTNAME", equalTo("Bill"))
				.log().all();
		}
		
		@Test(priority=3)
		void testingMultipleContentInOneGo()
		{
			given()
			
			.when()
				.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15")
				
			.then()
				.body("CUSTOMER.text()", equalTo("15Bill"))
				.log().all();
		}
		
		@Test(priority=4)
		void usingXPath()
		{
			given()
			
			.when()
				.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15")
				
			.then()
				.body(hasXPath("/CUSTOMER/FIRSTNAME",containsString("Bill")));
				
		}

}
