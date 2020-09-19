package com.dbConnection;

import java.sql.*;
import java.util.ArrayList;

public class ReadEmail {
    public ArrayList getMailList() throws ClassNotFoundException, SQLException {
        ArrayList <String> emailList = new ArrayList<>();
        Connection connection;
        String mail;
        Class.forName("org.mariadb.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mariadb://localhost:3306/emails", "root", "");
        Statement stmt = connection.createStatement();
        String sql = "SELECT * FROM email";
        ResultSet resultSet = stmt.executeQuery(sql);
        while(resultSet.next()){
            mail = resultSet.getString("Email");
            emailList.add(mail);
        }
        return emailList;
    }
}
