package com.mycompany.university;

import java.sql.*;
public class connectionc 
{
   
    Connection con;
    Statement stm;
    public connectionc()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost: 3306/university","root","Root@123");
            stm=con.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    public static void main(String args[])
    {
        new connectionc();
    }
}
