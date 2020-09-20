package com.EmailRepository;

import java.sql.*;
import java.util.ArrayList;

public class EmailList implements EmailRepo {
    public ArrayList getMailList() throws ClassNotFoundException, SQLException {
        ArrayList<String> emailList = new ArrayList<>();
        Connection connection;
        String mail;
        Class.forName("org.mariadb.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mariadb://localhost:3306/emailrepository", "root", "");
        Statement stmt = connection.createStatement();
        String sql = "SELECT * FROM email";
        ResultSet resultSet = stmt.executeQuery(sql);
        while(resultSet.next()){
            mail = resultSet.getString("email");
            emailList.add(mail);
        }
        return emailList;
    }
}
