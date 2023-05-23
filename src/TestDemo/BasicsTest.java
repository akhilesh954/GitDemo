package TestDemo;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class BasicsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//System.out.println("Hello Java");
	// RestAssured working with Given,When,Then
		// Given-all input data
		//When-Submit the resource,Http method
		//Then-Validate the response
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().queryParam("key","qaclick123").header("content-type","aplication/json").body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Frontline house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"https://rahulshettyacademy.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}").when().post("maps/api/place/add/json").then().assertThat().log().all().statusCode(200);
	}

}

