package com.cee.bankline.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class Transaction {
    private Integer id;
    private LocalDateTime localDateTime;
    private String description;
    private Double value;
    private TransactionType transactionType;
}
