package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetAPIAutomation {

    @Test(description = "Verify Get Request")
    public void verifyGetRequest() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";
        SoftAssert sf = new SoftAssert();
        Response response = RestAssured
                .given()
                .log().all()
                .header("ContentType", "application/json")
                .when()
                .get("/1")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();
/*        sf.assertEquals(response.jsonPath().getString("firstname"), "Mary");
        sf.assertEquals(response.jsonPath().getString("lastname"), "Jones");
        sf.assertEquals(response.jsonPath().getString("totalprice"), "530");
        sf.assertEquals(response.jsonPath().getString("bookingdates.checkin"), "2021-04-28");*/

        sf.assertNotNull(response.jsonPath().getString("firstname"));
        sf.assertNotNull(response.jsonPath().getString("lastname"));
        sf.assertNotNull(response.jsonPath().getString("totalprice"));
        sf.assertNotNull(response.jsonPath().getString("bookingdates.checkin"));

        sf.assertAll();
    }
}
