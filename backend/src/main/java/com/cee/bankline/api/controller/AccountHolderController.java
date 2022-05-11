package com.cee.bankline.api.controller;

import com.cee.bankline.api.dto.AccountHolderDTO;
import com.cee.bankline.api.model.AccountHolder;
import com.cee.bankline.api.service.AccountHolderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/account-holder")
public class AccountHolderController {

    private final AccountHolderService accountHolderService;

    public AccountHolderController(AccountHolderService accountHolderService) {
        this.accountHolderService = accountHolderService;
    }

    @GetMapping
    public List<AccountHolder> getAllAccountHolders() {
        return accountHolderService.getAllAccountHolder();
    }

    @PostMapping
    public void createAccountHolder(AccountHolderDTO accountHolderDTO) {
        accountHolderService.createAccountHolder(accountHolderDTO);
    }

}
