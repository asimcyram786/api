package com.practice;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Weather_Api {



    @Test
    public void randomCity_API_Test(){
        RestAssured.baseURI = "http://api.openweathermap.org/data/2.5/weather";
       given()
               .queryParam("q","islamabad")
               .queryParam("appid","e58f9892b352dee8eb078e081fee2615")
               .queryParam("lang","ru")
               .queryParam("units","metric")
               .get()
               .prettyPeek();



    }


}
