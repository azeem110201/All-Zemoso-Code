package com.azeem.aop;

import com.azeem.aop.dao.AccountDAO;
import com.azeem.aop.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        Account account = new Account("1234 3456 4567 5678", "Abdul", "Azeem", 10282.30);

        accountDAO.addAccount(account, true);

        membershipDAO.addAccount();


        context.close();
    }
}
