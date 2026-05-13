package restassured;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class APIWithQueryParam {

    @Test
    public void verifyAPIWithQueryParam(){
        RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("x-api-key", "pub_d1cfad8ce590cd7ba678d8daa4782cfcdade59d6ba2080782c1f8d597a68dd5c")
                .queryParam("page", "2")
                .log().all()
                .when()
                .get("https://reqres.in/api/users")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
    }
}
