package com.cee.bankline.api.service;

import com.cee.bankline.api.dto.AccountHolderDTO;
import com.cee.bankline.api.model.Account;
import com.cee.bankline.api.model.AccountHolder;
import com.cee.bankline.api.repository.AccountHolderRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AccountHolderService {

    private final AccountHolderRepository accountHolderRepository;

    public AccountHolderService(AccountHolderRepository accountHolderRepository) {
        this.accountHolderRepository = accountHolderRepository;
    }

    public List<AccountHolder> getAllAccountHolder() {
        return accountHolderRepository.findAll();
    }

    public void createAccountHolder(AccountHolderDTO accountHolderDTO) {
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.setName(accountHolderDTO.getName());
        accountHolder.setSsn(accountHolderDTO.getSsn());

        Account account = new Account();
        account.setAccountId(new Date().getTime()); // Simulation of a random account id.

        accountHolder.setAccount(account);

        accountHolderRepository.save(accountHolder);
    }

}
