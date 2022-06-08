package hekima.service;

import org.junit.jupiter.api.Test;
import query.TransactionService;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TransactionServiceTest {
    TransactionService transactionService = new TransactionService();

    @Test
    public void testTransactionCount() { assertEquals(1, transactionService.findAllByAccountNumber(0234567).size());}
}
