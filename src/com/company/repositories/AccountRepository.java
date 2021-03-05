package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.Account;
import com.company.repositories.interfaces.IAccountRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * accountdleRepository inherits from IaccountdleRepository interface
 */
public class AccountRepository implements IAccountRepository {
    private final IDB db;
    public AccountRepository(IDB db) {
        this.db = db;
    }

    /**
     * Overloaded method with default parameter values
     * @param account
     * @return boolean value
     */
    @Override
    public boolean createAccount(Account account) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO account(customer_id,type) VALUES (?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, account.getCustomer_id());
            st.setString(2, account.getType());

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
     * Overridden getaccountdle method with default parameter values
     * @return integer value
     */
    @Override
    public Account getAccount(int customer_id) {
        Connection con = null;
        try {
            con = db.getConnection();
            //select values from the low table by searching id
            String sql = "SELECT account_id,customer_id,type FROM account WHERE customer_id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, customer_id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Account account = new Account(rs.getInt("account_id"),
                        rs.getInt("customer_id"),
                        rs.getString("type"));

                return account;
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
     * Overridden getAllaccountdles method with default parameter values
     * @return integer value
     */
    @Override
    public List<Account> getAllAccounts() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT account_id,customer_id,type FROM account";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Account> accounts = new ArrayList<>();
            while (rs.next()) {
                Account account = new Account(rs.getInt("account_id"),
                        rs.getInt("customer_id"),
                        rs.getString("type"));

                accounts.add(account);
            }

            return accounts;
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