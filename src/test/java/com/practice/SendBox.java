package com.practice;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SendBox {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://619be7a768ebaa001753c698.mockapi.io/cyram";


        String response = RestAssured
                .given()
                .request(Method.GET, "/cats")
                .getBody()
                .asString();


        System.out.println("Response Body is =>  " + response);

    }

}

