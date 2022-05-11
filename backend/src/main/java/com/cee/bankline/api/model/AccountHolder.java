package com.cee.bankline.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class AccountHolder {
    private Integer id;
    private String ssn;
    private String nome;
    private Account account;
}
