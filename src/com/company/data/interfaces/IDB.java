package com.company.data.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Interface class IDB that has getConnection method
 */
public interface IDB {
    Connection getConnection() throws SQLException, ClassNotFoundException;
}