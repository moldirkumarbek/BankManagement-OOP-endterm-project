package com.company.controllers;

//import the paths to the classes
import com.company.entities.Deposit;
import com.company.repositories.interfaces.IDepositRepository;

import java.util.List;

public class DepositController {
    private final IDepositRepository repo;

    /**
     * Overloaded constructor with default parameter value
     */
    public DepositController(IDepositRepository repo) {
        this.repo = repo;
    }

    /**
     * Overloaded method with 4 default parameter values
     * @return String value
     */
    public String createDeposit(int account_id, int depo_amount) {
        Deposit depo = new Deposit(account_id, depo_amount);
        boolean created = repo.createDeposit(depo);
        return (created ? "Deposit creation was failed!" : "Deposit was created!");
    }

    /**
     * Overloaded method with default parameter values
     * @return String value
     */
    public String getDeposit(int depo_id) {
        Deposit depo = repo.getDeposit(depo_id);
        return (depo == null ? "Deposit was not found!" : depo.toString());
    }

    /**
     * Method, which returns all top level executives
     * @return String value
     */
    public String getAllDeposits() {
        List<Deposit> depo = repo.getAllDeposits();
        return depo.toString();
    }
}