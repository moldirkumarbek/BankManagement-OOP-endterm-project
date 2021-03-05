package com.company.repositories.interfaces;

//import the path to the class
import com.company.entities.Deposit;

import java.util.List;

/**
 * ITopRepository interface class that has createTop, getTop, getAllTops methods
 */
public interface IDepositRepository {
    boolean createDeposit(Deposit depo);
    Deposit getDeposit(int depo_id);
    List<Deposit> getAllDeposits();
}