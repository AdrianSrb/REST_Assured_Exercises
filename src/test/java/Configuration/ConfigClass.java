package Configuration;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class ConfigClass {

    @BeforeClass
    public static void setup() {

        RestAssured.baseURI = "https://videogamedb.uk/";
        RestAssured.basePath = "api/v2/";

        //RestAssured.port = 443;
    }
}
