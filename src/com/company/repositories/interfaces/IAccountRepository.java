package com.company.repositories.interfaces;

//import the path to the class

import com.company.entities.Account;

import java.util.List;

/**
 * IMiddleRepository interface class that has createMiddle, getMiddle, getAllMiddles methods
 */
public interface IAccountRepository {
    boolean createAccount(Account account);
    Account getAccount(int customer_id);
    List<Account> getAllAccounts();
}