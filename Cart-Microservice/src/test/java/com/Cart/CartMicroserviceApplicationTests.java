package com.Cart;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;


@SuppressWarnings("unused")
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CartMicroserviceApplicationTests {

    @Test
    @Order(1)
    public void testaddcart() {
        String jsonbody="{\"email\":\"heena@gmail.com\",\"cart\":\"3\"}";
        String res=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(jsonbody)
                .when()
                .put("http://localhost:8085/user/addcart")
                .then()
                .assertThat().statusCode(201)
                .extract().response().asString();
    }
   
}