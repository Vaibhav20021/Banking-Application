package com.VaibhavBanking.bankingapp.repository;

import com.VaibhavBanking.bankingapp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
