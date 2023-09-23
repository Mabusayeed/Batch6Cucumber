package restAssuredTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Reqres {


    @Test
    public  void listIsers(){
        given()


                .baseUri("https://reqres.in")
                .queryParam("page", 2)
                .when()
                .get("/api/users")
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);


    }





}
