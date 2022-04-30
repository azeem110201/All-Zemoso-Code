package com.azeem.aop.dao;

import com.azeem.aop.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    public void addAccount(Account account, boolean VIP){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }
}
