package TestDemo;

import static io.restassured.RestAssured.given;

import Files.getpayloads;
import io.restassured.RestAssured;

public class GetAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().queryParam("key","qaclick123").queryParam("place_id","8d5bcff1d212c14f38a9f2377342f9f0").when().get(getpayloads.GetId()).then().assertThat().log().all().statusCode(200);	}

}
