package com.tmgreyhat.bank.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmgreyhat.bank.models.Transaction;
import com.tmgreyhat.bank.services.TransactionService;

@RestController
@RequestMapping(path ="bank/api/v1/transactions")
public class TranasctionController {
 
    
    private final TransactionService service;

    public TranasctionController(TransactionService service){

        this.service = service;
    }


    @PostMapping
    public ResponseEntity saveTransaction(@RequestBody  Transaction transaction){

        return ResponseEntity.status(HttpStatus.OK).body(service.saveTransaction(transaction));
    }

}
