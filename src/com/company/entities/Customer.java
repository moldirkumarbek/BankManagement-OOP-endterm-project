package com.company.entities;

public class Customer {
    private int customer_id;
    private int bank_id;
    private String customer_name;
    private String surname;
    private String gender;
    private String telephone;
    private String address;

    /**
     * Parameterized constructor
     * @param bank_id
     * @param customer_name
     * @param surname
     * @param gender
     * @param telephone
     * @param address
     */
    public Customer(int bank_id, String customer_name, String surname, String gender, String telephone, String address) {
        setBank_id(bank_id);
        setName(customer_name);
        setSurname(surname);
        setGender(gender);
        setTelephone(telephone);
        setAddress(address);
    }

    /**
     * Parameterized constructor
     * @param customer_id
     * @param bank_id
     * @param customer_name
     * @param surname
     * @param gender
     * @param telephone
     * @param address
     */
    public Customer(int customer_id, int bank_id, String customer_name, String surname, String gender, String telephone, String address) {
        setCustomer_id(customer_id);
        setBank_id(bank_id);
        setName(customer_name);
        setSurname(surname);
        setGender(gender);
        setTelephone(telephone);
        setAddress(address);
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
        return customer_name;
    }

    /**
     * Method, which changes the top level employee's name
     * @param customer_name
     */
    public void setName(String customer_name) {
        this.customer_name = customer_name;
    }

    /**
     * Method, which returns the top level employee's surname
     * @return String value
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Method, which changes the top level employee's surname
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Method, which returns the top level employee's gender
     * @return boolean value
     */
    public String getGender() {
        return gender;
    }

    /**
     * Method, which changes the top level employee's gender
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Method, which returns the top level employee's id
     * @return integer value
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Method, which changes the top level employee's id
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Method, which returns the top level employee's position
     * @return String value
     */
    public String getAddress() {
        return address;
    }

    /**
     * Method, which changes the top level employee's position
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * Overridden toString method
     * @return String value
     */
    @Override
    public String toString() {
        return "Bank customers {" +
                " customer id=" + customer_id +
                " bank id=" + bank_id +
                ", name='" + customer_name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender + '\'' +
                " telephone=" + telephone +
                ", address=" + address + '}';
    }
}