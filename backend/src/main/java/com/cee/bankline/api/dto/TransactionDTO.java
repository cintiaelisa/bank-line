package com.cee.bankline.api.dto;

import com.cee.bankline.api.model.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TransactionDTO {
    private String description;
    private Double value;
    private TransactionType transactionType;
    private Integer accountId;
}
