package com.dbConnection;

import java.sql.SQLException;

public interface OperationFactory {
    void perform(String email) throws SQLException, ClassNotFoundException;
}
