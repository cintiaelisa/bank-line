package com.cee.bankline.api.dto;

import com.cee.bankline.api.model.Account;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AccountHolderDTO {
    private Integer holderId;
    private String ssn;
    private String name;
    private Account account;
}
