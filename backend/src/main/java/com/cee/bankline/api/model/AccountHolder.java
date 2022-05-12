package com.cee.bankline.api.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "account_holder")
public class AccountHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "holder_id")
    private Integer holderId;
    private String ssn;
    private String name;
    @Embedded
    private Account account;
}
