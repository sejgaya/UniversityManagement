package com.mycompany.university;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class update_student extends JFrame implements ActionListener
{
JLabel l1,l2,l3;
JTable t;
JButton bt1,bt2,bt3;
JTextField tf;
Font f;
JPanel p1,p2,p3;
String x[]={"Name","Father's name","Age","DOB","Address","Phone","Email","Class X","Class XII","Roll no","Branch","Cource"};
String y[][]=new String[25][12];
int i=0,j=0;

update_student()
{
    super("Student Details and update Student");
    setSize(900,620);
    setLocation(50,50);
    setResizable(false);
    l1=new JLabel("Enter roll number to delete student");
    l2=new JLabel("Add new Student");
    l3=new JLabel("Update Student Details");
    
    f=new Font("arial",Font.BOLD,16);
    
    tf=new JTextField(15);
    
    bt1=new JButton("Delete Student");
     bt2=new JButton("Add Student");
      bt3=new JButton("Update Student");
      
      bt1.setBackground(Color.BLACK);
    bt1.setForeground(Color.red);
    
    bt2.setBackground(Color.BLACK);
    bt2.setForeground(Color.WHITE);
    
    bt3.setBackground(Color.BLACK);
    bt3.setForeground(Color.YELLOW);
    
    tf.setFont(f);    
    l1.setFont(f);  
    l2.setFont(f);  
    l3.setFont(f);  
    bt1.setFont(f);  
    bt2.setFont(f);  
    bt3.setFont(f);  
    
    try
    {
       connectionc obj=new connectionc();
        String q="select * from new_student_add";
        ResultSet rest=obj.stm.executeQuery(q);
        while(rest.next())
        {
             
             y[i][j++]=rest.getString(1);
             y[i][j++]=rest.getString(2);
             y[i][j++]=rest.getString(3);
             y[i][j++]=rest.getString(4);
             y[i][j++]=rest.getString(5);
             y[i][j++]=rest.getString(6);
             y[i][j++]=rest.getString(7);
             y[i][j++]=rest.getString(8);
             y[i][j++]=rest.getString(9);
             y[i][j++]=rest.getString(10);
             y[i][j++]=rest.getString(11);
             y[i][j++]=rest.getString(12);
         
          i++;
           j=0;
        }
    t=new JTable(y,x);    
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
    
    JScrollPane sp=new JScrollPane(t);
    
    p1=new JPanel();
    p2=new JPanel();
    p3=new JPanel();
    
    p1.setLayout(new GridLayout(1,3,10,10));
    p1.add(l1);
    p1.add(tf);
    p1.add(bt1);
    
     p2.setLayout(new GridLayout(2,2,10,10));
     p2.add(l2);
     p2.add(bt2);
     p2.add(l3);
     p2.add(bt3);
     
    setLayout(new BorderLayout(30,30));
    add(sp,"North");
    add(p1,"Center");
    add(p2,"South");
    
    bt1.addActionListener(this);
    bt2.addActionListener(this);
    bt3.addActionListener(this);
} 
 public void actionPerformed(ActionEvent ev)
 {
     String rollno=tf.getText();
     
     if(ev.getSource()==bt1)
     {
         try
         {
             connectionc obj=new connectionc();
             String qq="delete from new_student_add where rollno='"+rollno+"'";
             obj.stm.executeUpdate(qq);
             JOptionPane.showMessageDialog(null,"Record Delete Succesfully");
             setVisible(false);
             new update_student().setVisible(true);
         }
         catch(Exception exx)
         {
             exx.printStackTrace();
         }
     }
        if(ev.getSource()==bt2)
     {
         new new_student_addmission().setVisible(true);
         setVisible(false);
         new update_student().setVisible(true);
      }
     if(ev.getSource()==bt3)
     {
         new updateStudent_record(rollno).setVisible(true);
         setVisible(false);
      }
 }
     public static void main(String args[])
     {
         new update_student().setVisible(true);
     }

}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
