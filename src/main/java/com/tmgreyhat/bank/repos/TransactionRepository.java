package com.tmgreyhat.bank.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tmgreyhat.bank.models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction , Long> {
    
}
