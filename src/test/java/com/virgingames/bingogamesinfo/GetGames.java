package com.virgingames.bingogamesinfo;

import com.virgingames.constants.EndPoints;
import com.virgingames.constants.Path;
import com.virgingames.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetGames extends TestBase{

    @Test
    public void getGames(){
        RestAssured.registerParser("text/plain", Parser.JSON);
        Response response = given()
                .when()
                .basePath(Path.BINGO)
                .get(EndPoints.GET_BINGO);
        response.then().statusCode(200);

        response.prettyPrint();
    }

}
