package com.dbConnection;//package com.log_Analyzer;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class dbConnection
//{
//
//    public static void main(String args[])
//    {
//        try {
//            Class.forName("com.mysql.jbds.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emailrepository","root"," ");
//            Statement stmt = con.createStatement();
//            ResultSet rsltset = stmt.executeQuery("select * from email");
//
//            while(rsltset.next())
//                System.out.println(rsltset.getInt(1)+" "+rsltset.getString(2)+" "+rsltset.getString(3));
//            con.close();
//
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
//    }
//
//}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DataBaseConnection {

    private Connection connection;
    private static DataBaseConnection dBConnection;
    DataBaseConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/emailrepository", "root", " ");
    }
    static DataBaseConnection getInstance() throws ClassNotFoundException, SQLException{
        if(dBConnection==null){
            dBConnection=new DataBaseConnection();
        }
        return dBConnection;
    }
    Connection getConnection(){
        return connection;
    }
}
