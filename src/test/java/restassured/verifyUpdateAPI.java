package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class verifyUpdateAPI {

    @Test
    public void putVerifyAPI(){

        JSONObject jb1 = new JSONObject();
        jb1.put("username", "admin");
        jb1.put("password", "password123");

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jb1.toJSONString())
                .log().all()
                .when()
                .post("https://restful-booker.herokuapp.com/auth")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        String token  = response.body().jsonPath().getString("token");

        JSONObject jb2 = new JSONObject();
        JSONObject jb3 = new JSONObject();
        jb2.put("firstname", "Sumit");
        jb2.put("lastname", "Kale");
        jb2.put("totalprice", "123");
        jb2.put("depositpaid", true);
        jb2.put("bookingdates",jb3);
        jb2.put("additionalneeds", "AutomationTest");

        jb3.put("checkin", "2018-01-01");
        jb3.put("checkout", "2019-01-01");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Cookie", "token=" + token)
                .body(jb2.toJSONString())
                .log().all()
                .when()
                .put("https://restful-booker.herokuapp.com/booking/3")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .body(
                "firstname", Matchers.is("Sumit"),
                "lastname", Matchers.is("Kale"),
                "totalprice", Matchers.is(123));

    }
}
