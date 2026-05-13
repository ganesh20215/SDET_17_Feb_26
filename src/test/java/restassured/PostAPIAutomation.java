package restassured;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PostAPIAutomation {

    @Test
    public void verifyPostApi(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";
        JSONObject jb = new JSONObject();
        JSONObject jb2 = new JSONObject();
        jb.put("firstname", "Sumit");
        jb.put("lastname", "Kale");
        jb.put("totalprice", "123");
        jb.put("depositpaid", true);
        jb.put("bookingdates",jb2);
        jb.put("additionalneeds", "AutomationTest");

        jb2.put("checkin", "2018-01-01");
        jb2.put("checkout", "2019-01-01");

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(jb.toJSONString())
                .when()
                .log().all()
                .post()
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .body(
                        "booking.firstname", Matchers.is("Sumit"),
                        "booking.lastname", Matchers.is("Kale"),
                        "booking.totalprice", Matchers.is(123));
    }
}
