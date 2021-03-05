package com.company.controllers;

//import the paths to the classes
import com.company.entities.Bank;
import com.company.repositories.interfaces.IBankRepository;

import java.util.List;

public class BankController {
    private final IBankRepository repo;

    /**
     * Overloaded constructor with default parameter value
     */
    public BankController(IBankRepository repo) {
        this.repo = repo;
    }

    /**
     * Overloaded method with 4 default parameter values
     * @return String value
     */
    public String createBank(String bank_name, String address,  String city) {
        Bank bank = new Bank(bank_name, address, city);
        boolean created = repo.createBank(bank);
        return (created ? "Bank creation was failed!" : "Bank was created!");
    }

    /**
     * Overloaded method with default parameter values
     * @return String value
     */
    public String getBank(int bank_id) {
        Bank bank = repo.getBank(bank_id);
        return (bank == null ? "Bank was not found!" : bank.toString());
    }

    /**
     * Method, which returns all top level executives
     * @return String value
     */
    public String getAllBanks() {
        List<Bank> bank = repo.getAllBanks();
        return bank.toString();
    }
}