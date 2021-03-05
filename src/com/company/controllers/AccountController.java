package com.company.controllers;

//import the paths to the classes
import com.company.entities.Account;
import com.company.repositories.interfaces.IAccountRepository;

import java.util.List;

public class AccountController {
    private final IAccountRepository repo;

    /**
     * Parameterized constructor
     */
    public AccountController(IAccountRepository repo) {
        this.repo = repo;
    }

    /**
     * Overloaded method with default parameter values
     * @return String value
     */
    public String createAccount(int customer_id, String type) {
        Account account = new Account(customer_id, type);
        boolean created = repo.createAccount(account);
        return (created ? "Account creation was failed!" : "Account was created!");
    }

    /**
     * Overloaded method with default parameter values
     * @return String value
     */
    public String getAccount(int customer_id) {
        Account account = repo.getAccount(customer_id);
        return (account == null ? "Account was not found!" : account.toString());
    }

    /**
     * Method, which returns all middle level executives
     * @return String value
     */
    public String getAllAccounts() {
        List<Account> account = repo.getAllAccounts();
        return account.toString();
    }
}