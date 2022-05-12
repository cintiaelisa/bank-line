package com.cee.bankline.api.controller;

import com.cee.bankline.api.dto.AccountHolderDTO;
import com.cee.bankline.api.model.AccountHolder;
import com.cee.bankline.api.service.AccountHolderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account-holder")
public class AccountHolderController {

    private final AccountHolderService accountHolderService;

    public AccountHolderController(AccountHolderService accountHolderService) {
        this.accountHolderService = accountHolderService;
    }

    @GetMapping
    public List<AccountHolderDTO> getAllAccountHolders() {
        return accountHolderService.getAllAccountHolder();
    }

    @PostMapping
    public void createAccountHolder(@RequestBody AccountHolderDTO accountHolderDTO) {
        System.out.println(accountHolderDTO);
        accountHolderService.createAccountHolder(accountHolderDTO);
    }

}
