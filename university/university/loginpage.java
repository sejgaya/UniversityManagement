
package com.mycompany.university;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class loginpage extends JFrame implements ActionListener
{ 
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField p;
    JButton b1,b2;
    JPanel p1,p2,p3,p4;    
    Font f;
    loginpage()
    {
        super("Login Page");
        setSize(230,200);
        setLocation(500,250);
        setResizable(false);
        f=new Font("Arial",Font.BOLD,13);
        l1=new JLabel("admin");
        l2=new JLabel("Password");
   
         l1.setFont(f);
         l2.setFont(f); 
                             
         b1=new JButton("Login");
         b2=new JButton("Cancle");
         
         b1.setBackground(Color.BLACK);
          b1.setForeground(Color.WHITE);
          
          b2.setBackground(Color.BLACK);
          b2.setForeground(Color.WHITE);
          
          b1.setFont(f);
          b2.setFont(f);
          
          t1=new JTextField(15);
          p=new JPasswordField(15);
          
           t1.setFont(f);
          p.setFont(f);
          
          
          p1=new JPanel();
          p2=new JPanel();
          p3=new JPanel();
          p4=new JPanel();
          
          
          setLayout(new BorderLayout());
          
          p1.add(l1);
          p1.add(t1);
          p1.add(l2);
          p1.add(p);
          add(p1,"Center");
          
          p2.add(b1);
          p2.add(b2);
          add(p2,"South");
          
          b1.addActionListener(this);
           b2.addActionListener(this);
    }
     public void actionPerformed(ActionEvent ev)
     {
         if(ev.getSource()==b1)
         {
             String name=t1.getText();
             String password=p.getText();
             try
             {
                 connectionc obj=new connectionc();
                 String q="select * from login where admin='"+name+"' and password='"+password+"'";
                 ResultSet res=obj.stm.executeQuery(q);
                 if(res.next())
                 {
                   new homepage().setVisible(true);
                  // System.out.println("data");
                   this.setVisible(false);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null,"invalid username or password");
                     this.setVisible(false);
                 }
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
         if(ev.getSource()==b2)
         {
             JOptionPane.showMessageDialog(null,"are you sure to press cancle button ?");
             this.setVisible(false);
         }
     }
     public static void main(String args[])
     {
         new loginpage().setVisible(true);
      }
}
