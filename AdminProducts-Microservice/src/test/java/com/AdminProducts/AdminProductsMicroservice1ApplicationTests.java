package com.AdminProducts;

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
class AdminProductsMicroservice1ApplicationTests {

    @Test
    @Order(1)
    public void addproducts() {
        String jsonbody="{\"name\":\"Mens Black track pant\",\"price\":\"489\",\"category\":\"Mens Pants\",\"description\":\"Zeffit Mens black Cotton Blend Regular Fit Trackpant\",\"freedelivery\":\"true\",\"categoryimageurl\":\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSC1XTIG_E4G5ZLe_OcMofW3U1yIcebcBalg&usqp=CAU\",\"dateoflaunch\":\"02-09-2012\",\"imageurl\":\"https://m.media-amazon.com/images/I/31hqCztbq5L._AC_UL480_FMwebp_QL65_.jpg\"}";
        String res=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(jsonbody)
                .when()
                .post("http://localhost:8083/productitems/addproducts")
                .then()
                .assertThat().statusCode(201)
                .extract().response().asString();
    }
    
}