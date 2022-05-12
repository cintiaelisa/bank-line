package com.cee.bankline.api.service;

import com.cee.bankline.api.dto.TransactionDTO;
import com.cee.bankline.api.model.AccountHolder;
import com.cee.bankline.api.model.Transaction;
import com.cee.bankline.api.model.TransactionType;
import com.cee.bankline.api.repository.AccountHolderRepository;
import com.cee.bankline.api.repository.TransactionRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final AccountHolderRepository accountHolderRepository;

    public TransactionService(TransactionRepository transactionRepository, AccountHolderRepository accountHolderRepository) {
        this.transactionRepository = transactionRepository;
        this.accountHolderRepository = accountHolderRepository;
    }

    public List<TransactionDTO> getAllTransactions() {
        ModelMapper modelMapper = new ModelMapper();
        List<Transaction> transactions = transactionRepository.findAll();

        return modelMapper
                .map(transactions, new TypeToken<List<TransactionDTO>>(){}.getType());
    }

    public void saveNewTransaction(TransactionDTO transactionDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Transaction transaction = modelMapper.map(transactionDTO, Transaction.class);
        transaction.setLocalDateTime(LocalDateTime.now());
        Double value = (transactionDTO.getTransactionType() == TransactionType.DEPOSIT ?
                transactionDTO.getValue() : transactionDTO.getValue() * -1);
        AccountHolder accountHolder = accountHolderRepository
                .findById(transactionDTO.getAccountId())
                .orElse(null);
        if(accountHolder != null) {
            accountHolder.getAccount().setBalance(
                    accountHolder.getAccount().getBalance() + value
            );
            accountHolderRepository.save(accountHolder);
        }
        transactionRepository.save(transaction);
    }
}
