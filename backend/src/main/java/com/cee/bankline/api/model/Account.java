package com.cee.bankline.api.model;

import javax.persistence.Embeddable;

@Embeddable
public class Account {

    private Long accountId;
    private Double balance;
}
