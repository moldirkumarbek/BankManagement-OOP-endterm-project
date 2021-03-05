package com.company.entities;

public class Account {
    private int account_id;
    private int customer_id;
    private int bill;
    private String type;

    /**
     * Default constructor
     */
    public Account() {

    }

    /**
     * Parameterized constructor
     * @param customer_id

     * @param type
     */
    public Account(int customer_id, String type) {
        setCustomer_id(customer_id);
        setType(type);
    }

    /**
     * Overloaded constructor with 5 default parameter values
     * @param account_id
     * @param customer_id
     * @param type
     */
    public Account(int account_id, int customer_id, String type) {
        setaccount_id(account_id);
        setCustomer_id(customer_id);
        setType(type);
    }

    /**
     * Method, which returns the top level employee's id
     * @return integer value
     */
    public int getaccount_id() {
        return account_id;
    }

    /**
     * Method, which changes the top level employee's id
     * @param account_id
     */
    public void setaccount_id(int account_id) {
        this.account_id = account_id;
    }

    /**
     * Method, which returns the top level employee's id
     * @return integer value
     */
    public int getCustomer_id() {
        return customer_id;
    }

    /**
     * Method, which changes the top level employee's id
     * @param customer_id
     */
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * Method, which returns the top level employee's surname
     * @return String value
     */
    public String getType() {
        return type;
    }

    /**
     * Method, which changes the top level employee's surname
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Overridden toString method
     * @return String value
     */
    @Override
    public String toString() {
        return "Accounts {" +
                "account_id=" + account_id +
                ", customer_id='" + customer_id +
                ",type=" + type + '}';
    }
}