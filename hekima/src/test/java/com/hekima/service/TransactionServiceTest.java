package com.hekima.service;

import com.hekima.hekima.query.TransactionService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransactionServiceTest {
    TransactionService transactionService = new TransactionService();

    @Test
    public void testTransactionCount() { assertEquals(1, transactionService.findAllByAccountNumber(1234567).size());}
}
