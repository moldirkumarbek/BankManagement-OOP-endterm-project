package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.Customer;
import com.company.repositories.interfaces.ICustomerRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * LowRepository inherits from ILowRepository interface
 */
public class CustomerRepository implements ICustomerRepository {
    private final IDB db;
    /**
     * Overloaded constructor with default parameter values
     */
    public CustomerRepository(IDB db) {
        this.db = db;
    }

    /**
     * Overridden createLow method with default parameter values
     * @return boolean value
     */
    @Override
    public boolean createCustomer(Customer customer) {
        Connection con = null;
        try {
            con = db.getConnection();
            //here we insert some values into low table
            String sql = "INSERT INTO customer(bank_id,customer_name,surname,gender,telephone,address) VALUES (?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, customer.getBank_id());
            st.setString(2, customer.getName());
            st.setString(3, customer.getSurname());
            st.setString(4, customer.getGender());
            st.setString(5, customer.getTelephone());
            st.setString(6, customer.getAddress());
            boolean executed = st.execute();
            return executed;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    /**
     * Overridden getLow method with default parameter values
     * @return integer value
     */
    @Override
    public Customer getCustomer(int customer_id) {
        Connection con = null;
        try {
            con = db.getConnection();
            //select values from the low table by searching id
            String sql = "SELECT customer_id,bank_id,customer_name,surname,gender,telephone,address FROM customer WHERE bank_id=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, customer_id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Customer customer = new Customer(rs.getInt("customer_id"),
                        rs.getInt("bank_id"),
                        rs.getString("customer_name"),
                        rs.getString("surname"),
                        rs.getString("gender"),
                        rs.getString("telephone"),
                        rs.getString("address"));

                return customer;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
    /**
     * Overridden getAllLows method with default parameter values
     * @return integer value
     */
    @Override
    public List<Customer> getAllCustomers() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT customer_id,bank_id,customer_name,surname,gender,telephone,address FROM customer";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Customer> customers = new ArrayList<>();
            while (rs.next()) {
                Customer customer = new Customer(rs.getInt("customer_id"),
                        rs.getInt("bank_id"),
                        rs.getString("customer_name"),
                        rs.getString("surname"),
                        rs.getString("gender"),
                        rs.getString("telephone"),
                        rs.getString("address"));

                customers.add(customer);
            }

            return customers;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}