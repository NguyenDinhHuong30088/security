package com.example.securityjst.service;

import com.example.securityjst.entity.Account;
import com.example.securityjst.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    public boolean register(Account account){
        account.setPasswordHash(passwordEncoder.encode(account.getPasswordHash()));
        account.setRoleId(1);
        account.setStatus(1);
        accountRepository.save(account);
        return true;
    }
}
