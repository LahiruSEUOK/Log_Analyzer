package com.dbConnection;

import java.sql.*;

public class AddOperation implements OperationFactory{

    @Override
    public void perform(String email) throws SQLException, ClassNotFoundException {
        Connection connection;
        DataBaseConnection dBConnection;
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/emailrepository", "root", "");
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO `email`(`email`) VALUES ('"+email+"');");
        connection.close();

    }
}
