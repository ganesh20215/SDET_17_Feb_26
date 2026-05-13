package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class DeleteAPI {

    @Test(description = "Verify delete API for new User")
    public void verifyDeleteAPI(){
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

        RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Cookie", "token=" + token)
                .log().all()
                .when()
                .delete("https://restful-booker.herokuapp.com/booking/9")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_CREATED)
                .extract().response();
    }
}
