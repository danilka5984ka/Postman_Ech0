package ru.netology;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class TestResult {
    @Test
    void PostmanTest() {
        // Given - When - Then
// Предусловия
        ValidatableResponse body = given()
                .baseUri("https://postman-echo.com")
                .body("PostmanTest") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("Postman"));
    }
}

