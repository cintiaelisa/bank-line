package com.cee.bankline.api.controller;

import com.cee.bankline.api.dto.TransactionDTO;
import com.cee.bankline.api.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<TransactionDTO> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @PostMapping
    public void saveNewTransaction(@RequestBody TransactionDTO transactionDTO) {
        transactionService.saveNewTransaction(transactionDTO);
    }
}
