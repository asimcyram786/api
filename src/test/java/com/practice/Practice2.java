package com.practice;

import groovy.transform.ASTTest;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice2 {


    @Test
    public void test_GET() {
        RestAssured.baseURI = "https://61a8f71233e9df0017ea3c1a.mockapi.io/companies";

        RestAssured
                .given()
                .request(Method.GET)
                .prettyPeek()
                .then()
                .assertThat()
                .statusCode(200);


    }

    @Test
    public void test_UPDATE() {

        JSONObject object = new JSONObject();
        object.put("carname","BWW");
        object.put("model","e350");
        object.put("year","2020");
        object.put("id", "202");
        RestAssured.baseURI = "https://61a8f71233e9df0017ea3c1a.mockapi.io";
        RestAssured
                .given()
                .header("Content-Type","application/json")
                .and()
                .body(object.toString())
                .when()
                .put("/companies/5")
                .prettyPeek()
                .then()
                .assertThat()
                .statusCode(200);

    }

    @Test
    public void test_POST() {
        JSONObject object = new JSONObject();
        object.put("carname","BWW");
        object.put("model","e350");
        object.put("year","2020");
        object.put("id", "272");
        RestAssured.baseURI = "https://61a8f71233e9df0017ea3c1a.mockapi.io/";

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .and()
                .body(object.toString())
                .when()
                .post("/companies")
                .then()
                .assertThat()
                .statusCode(201);
    }

    @Test
    public void test_DELETE() {
        RestAssured.baseURI = "https://61a8f71233e9df0017ea3c1a.mockapi.io/companies/29";

        RestAssured
                .given()
                .request(Method.GET)
                .then()
                .assertThat()
                .statusCode(200);
    }
}
