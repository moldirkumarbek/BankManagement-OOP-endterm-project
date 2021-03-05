package com.company.controllers;

//import the paths to the classes
import com.company.entities.Customer;
import com.company.repositories.interfaces.ICustomerRepository;

import java.util.List;

public class CustomerController {
    private final ICustomerRepository repo;
    /**
     * Constructor with default parameter value
     */
    public CustomerController(ICustomerRepository repo) {
        this.repo = repo;
    }

    /**
     * Method with default parameter values
     * @return String value
     */
    public String createCustomer(int bank_id, String customer_name, String surname, String gender, String telephone, String address) {
        Customer customer = new Customer(bank_id, customer_name, surname, gender, telephone, address);
        boolean created = repo.createCustomer(customer);
        return (created ? "Low level employee creation was failed!" : "Low level employee was created!");
    }

    /**
     * Method, which returns low level value
     * @return String value
     */
    public String getCustomer(int customer_id) {
        Customer customer = repo.getCustomer(customer_id);
        return (customer == null ? "Low level employee was not found!" : customer.toString());
    }

    /**
     * Method, which returns all low level executives
     * @return String value
     */
    public String getAllCustomers() {
        List<Customer> customers = repo.getAllCustomers();
        return customers.toString();
    }
}