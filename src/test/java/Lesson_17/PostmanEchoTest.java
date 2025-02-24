package Lesson_17;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class PostmanEchoTest {
    private final static String BASE_URI = "https://postman-echo.com";
    private final String TEST_DATASTRING = "This is expected to be sent back as part of response body.";

    @BeforeEach
    public void init() {
        RestAssured.baseURI = BASE_URI;
    }

    @Test
    public void getRequest() {
        given()
                .when().get("/get?foo1=bar1&foo2=bar2")
                .then()
                .assertThat().statusCode(200)
                .and().body("args.foo1", is("bar1"))
                .and().body("args.foo2", is("bar2"));
    }

    @Test
    public void postRawText() {
        given()
                .body(TEST_DATASTRING)
                .when().post("/post")
                .then()
                .assertThat().statusCode(200)
                .and().body("data", is(TEST_DATASTRING));
    }

    @Test
    public void postFormData() {
        given()
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .header("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
                .when().post("/post")
                .then()
                .assertThat().statusCode(200)
                .and().body("form.foo1", is("bar1"))
                .and().body("form.foo2", is("bar2"));
    }

    @Test
    public void putRequest() {
        given()
                .body(TEST_DATASTRING)
                .when().put("/put")
                .then()
                .assertThat().statusCode(200)
                .and().body("data", is(TEST_DATASTRING));
    }

    @Test
    public void patchRequest() {
        given()
                .body(TEST_DATASTRING)
                .when().patch("/patch")
                .then()
                .assertThat().statusCode(200)
                .and().body("data", is(TEST_DATASTRING));
    }

    @Test
    public void deleteRequest() {
        given()
                .body(TEST_DATASTRING)
                .when().delete("/delete")
                .then()
                .assertThat().statusCode(200)
                .and().body("data", is(TEST_DATASTRING));
    }
}
