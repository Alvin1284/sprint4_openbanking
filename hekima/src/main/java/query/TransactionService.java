package query;

import entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TransactionService {
    public List<Transaction> findAllByAccountNumber(final Integer accountNumber) {
        return List.of(
                Transaction
                        .builder()
                        .type("credit")
                        .date(new Date())
                        .accountNumber(accountNumber)
                        .currency("KSHS")
                        .amount(100.00)
                        .merchantName("Equity")
                        .merchantLogo("")
                        .build()
        );
    }
}
