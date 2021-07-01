package io.github.jbqneto.simplecms;

import io.github.jbqneto.simplecms.application.representation.CategoryRepresentation;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.util.List;

@Log4j2
public class CategoryControllerTest {

    @Test
    public void mustRetrieveCategories201() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
        RestAssured.basePath = "/v1/categories";

        var response = RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                    .get("")
                .then()
                    .log().all()
                .extract()
                    .body().as(CategoryRepresentation[].class);

    }

}
