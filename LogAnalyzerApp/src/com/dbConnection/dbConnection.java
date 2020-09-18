package com.log_Analyzer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbConnection
{

    public static void main(String args[])
    {
        try {
            Class.forName("com.mysql.jbds.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emails","root","root");
            Statement stmt = con.createStatement();
            ResultSet rsltset = stmt.executeQuery("select * from email");

            while(rsltset.next())
                System.out.println(rsltset.getInt(1)+" "+rsltset.getString(2)+" "+rsltset.getString(3));
            con.close();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
