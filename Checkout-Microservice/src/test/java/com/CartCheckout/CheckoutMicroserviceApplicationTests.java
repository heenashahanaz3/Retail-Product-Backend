package com.CartCheckout;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
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
class CheckoutMicroserviceApplicationTests {

    @Test
    @Order(1)
    public void testaddorder() {
        String jsonbody="{\"email\":\"heena@gmail.com\",\"cart\":\"3\",\"amount\":\"455\",\"deliveryaddress\":\"Jangaun\"}";
        String res=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(jsonbody)
                .when()
                .post("http://localhost:8087/user/addorder")
                .then()
                .assertThat().statusCode(201)
                .extract().response().asString();
    }
    
   
    
    @Test
    @Order(2)
    public void testgetorderbyid() {
        String result=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .when()
                .get("http://localhost:8087/user/get/yourorders/heena@gmail.com")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }

}
