package com.hekima.hekima.repository;

import com.hekima.hekima.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findAllByAccountNumber(final Integer accountNumber);
}
