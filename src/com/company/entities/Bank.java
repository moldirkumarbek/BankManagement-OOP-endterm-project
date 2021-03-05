package com.company.entities;

public class Bank {
    private int bank_id;
    private String bank_name;
    private String address;
    private String city;

    /**
     * Default constructor
     */
    public Bank() {

    }

    /**
     * Parameterized constructor
     * @param bank_name
     * @param address
     * @param city
     */
    public Bank(String bank_name, String address,  String city) {
        setName(bank_name);
        setAddress(address);
        setCity(city);
    }

    /**
     * Overloaded constructor with 5 default parameter values
     * @param bank_id
     * @param bank_name
     * @param address
     * @param bank_id
     * @param city
     */
    public Bank(int bank_id, String bank_name, String address,  String city) {
        setBank_id(bank_id);
        setName(bank_name);
        setAddress(address);
        setCity(city);
    }

    /**
     * Method, which returns the top level employee's id
     * @return integer value
     */
    public int getBank_id() {
        return bank_id;
    }

    /**
     * Method, which changes the top level employee's id
     * @param bank_id
     */
    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    /**
     * Method, which returns the top level employee's name
     * @return String value
     */
    public String getName() {
        return bank_name;
    }

    /**
     * Method, which changes the top level employee's name
     * @param bank_name
     */
    public void setName(String bank_name) {
        this.bank_name = bank_name;
    }

    /**
     * Method, which returns the top level employee's surname
     * @return String value
     */
    public String getAddress() {
        return address;
    }

    /**
     * Method, which changes the top level employee's surname
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Method, which returns the top level employee's surname
     * @return String value
     */
    public String getCity() {
        return city;
    }

    /**
     * Method, which changes the top level employee's surname
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Overridden toString method
     * @return String value
     */
    @Override
    public String toString() {
        return "Banks {" +
                " bank_id=" + bank_id +
                ", name='" + bank_name +
                ", address='" + address +
                ", city=" + city + '}';
    }
}