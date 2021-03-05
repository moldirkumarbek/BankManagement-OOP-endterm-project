package com.company.repositories.interfaces;

//import the path to the class
import com.company.entities.Bank;

import java.util.List;

/**
 * ITopRepository interface class that has createTop, getTop, getAllTops methods
 */
public interface IBankRepository {
    boolean createBank(Bank bank);
    Bank getBank(int bank_id);
    List<Bank> getAllBanks();
}