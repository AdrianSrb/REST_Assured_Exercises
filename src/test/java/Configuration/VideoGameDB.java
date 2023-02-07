package Configuration;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class VideoGameDB extends ConfigClass {

    @Test
    public void myFirstTest() {
        given()
                .log().all()
                .when()
                .get("https://videogamedb.uk/api/v2/videogame")
                .then()
                .log().all();

    }

}
