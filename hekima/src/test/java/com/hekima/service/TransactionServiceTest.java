package com.hekima.service;

import com.hekima.hekima.HekimaApplication;
import com.hekima.hekima.query.TransactionService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(classes = {HekimaApplication.class})
public class TransactionServiceTest {

    @Autowired
    private TransactionService transactionService;

    @Test
    public void testTransactionCount() {
        assertEquals(2, transactionService.findAllByAccountNumber(1234567).size());
    }
}



