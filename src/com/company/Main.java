package com.company;//import the paths to the classes

import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.AccountRepository;
import com.company.repositories.BankRepository;
import com.company.repositories.CustomerRepository;
import com.company.repositories.DepositRepository;
import com.company.repositories.interfaces.IAccountRepository;
import com.company.repositories.interfaces.IBankRepository;
import com.company.repositories.interfaces.ICustomerRepository;
import com.company.repositories.interfaces.IDepositRepository;

public class Main {
    public static void main(String[] args) {
        // specify which DB and Repository to use
        // changing DB should not affect to whole code
        IDB db = new PostgresDB();
        IBankRepository repo = new BankRepository(db);
        IAccountRepository repo2 = new AccountRepository(db);
        ICustomerRepository repo1 = new CustomerRepository(db);
        IDepositRepository repo3 = new DepositRepository(db);

        MyApplication app = new MyApplication(repo, repo1, repo2, repo3);
        app.start();
    }
}