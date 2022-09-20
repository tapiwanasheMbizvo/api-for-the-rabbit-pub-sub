package com.tmgreyhat.bank.services;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.tmgreyhat.bank.models.Transaction;
import com.tmgreyhat.bank.repos.TransactionRepository;

@Service
public class TransactionService {
    
    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository){

        this.repository = repository;
    }


    public Transaction saveTransaction(Transaction transaction){

        transaction.setTranscation_date(LocalDateTime.now());
        return repository.save(transaction);
    }



}
