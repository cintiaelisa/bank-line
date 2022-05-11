package com.cee.bankline.api.repository;

import com.cee.bankline.api.model.AccountHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountHolderRepository extends JpaRepository<AccountHolder, Integer> {
}
