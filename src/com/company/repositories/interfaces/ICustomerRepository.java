package com.company.repositories.interfaces;

//import the path to the class
import com.company.entities.Customer;

import java.util.List;

/**
 * ILowRepository interface class that has createLow, getLow, getAllLows methods
 */
public interface ICustomerRepository {
    boolean createCustomer(Customer customer);
    Customer getCustomer(int customer_id);
    List<Customer> getAllCustomers();
}