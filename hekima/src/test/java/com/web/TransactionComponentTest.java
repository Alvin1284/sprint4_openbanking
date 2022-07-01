package com.web;

import com.hekima.hekima.query.TransactionService;
import  com.hekima.hekima.web.TransactionController;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.server.LocalServerPort;


import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

public class TransactionComponentTest {
    @LocalServerPort
    private int port;

    @Test
    public void testApplicationEndToEnd() {
        given().standaloneSetup(new TransactionController(new TransactionService()))
                .when()
                .get(String.format("http://localhost:%s/api/v1/transactions/1234567", port))
                .then()
                .statusCode(Matchers.is(200));
    }
}
