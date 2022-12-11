
package com.mycompany.university;
         
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class enter_marks extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5;
    JButton bt1;
    JTextField t1,t2,t3,t4,t5,t6;
    JPanel p1,p2;
    JComboBox cm1,cm2,cm3,cm4,cm5;
    Font f,f1;
    String a[]={"Software Eng","Math","Physics","Chemistry","Data Structure","TCS","C","Java","C++","Data Mining","Crypto"};
    enter_marks()
    {
        super("Enter Marks");
        setSize(600,420);
        setResizable(false);
        setLocation(250,100);
        
        f=new Font("senserif",Font.BOLD,25);
        f=new Font("arial",Font.BOLD,16);
        
        l1=new JLabel("Enter Marks of Student");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l2=new JLabel("Enter roll number");
        l3=new JLabel("Enter Subject");
        l4=new JLabel("Enter Marks");
        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);
        l4.setFont(f1);
        
        cm1=new JComboBox(a);
        cm2=new JComboBox(a);
        cm3=new JComboBox(a);
        cm4=new JComboBox(a);
        cm5=new JComboBox(a);
        
        cm1.setFont(f1);
        cm2.setFont(f1);
        cm3.setFont(f1);
        cm4.setFont(f1);
        cm5.setFont(f1);
        
         t1=new JTextField(15);
         t2=new JTextField(15);
         t3=new JTextField(15);
         t4=new JTextField(15);
         t5=new JTextField(15);
         t6=new JTextField(15);
        
        t1.setFont(f1);
        t2.setFont(f1);
        t3.setFont(f1);
        t4.setFont(f1);
        t5.setFont(f1);
        t6.setFont(f1);
        
        bt1=new JButton("Submit");
        bt1.setBackground(Color.BLACK);
        bt1.setForeground(Color.WHITE);
        bt1.setFont(f1);
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(7,2,10,10));
        
        p1.add(l2);
        p1.add(t6);
        p1.add(l3);
        p1.add(l4);
        
        p1.add(cm1);
        p1.add(t1);
        p1.add(cm2);
        p1.add(t2);
        p1.add(cm3);
        p1.add(t3);
        p1.add(cm4);
        p1.add(t4);
        p1.add(cm5);
        p1.add(t5);
        
        setLayout(new BorderLayout(30,30));
        add(bt1,"South");
        add(p1,"Center");
        add(l1,"North");
        
        bt1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ev)
    {
        String roll_no=t6.getText();
        String subject1=(String)cm1.getSelectedItem();
        String subject2=(String)cm2.getSelectedItem();
        String subject3=(String)cm3.getSelectedItem();
        String subject4=(String)cm4.getSelectedItem();
        String subject5=(String)cm5.getSelectedItem();
        
         int marks1=Integer.parseInt(t1.getText());
         int marks2=Integer.parseInt(t2.getText());
         int marks3=Integer.parseInt(t3.getText());
         int marks4=Integer.parseInt(t4.getText());
         int marks5=Integer.parseInt(t5.getText());
         
         if(ev.getSource()==bt1)
         {
             try
             {
                 connectionc obj=new connectionc();
                 String q1="insert into student_subject values('"+roll_no+"','"+subject1+"','"+subject2+"','"+subject3+"','"+subject4+"','"+subject5+"')";
                 String q2="insert into student_marks values('"+roll_no+"','"+marks1+"','"+marks2+"','"+marks3+"','"+marks4+"','"+marks5+"')";
                 
                 obj.stm.executeUpdate(q1);
                 obj.stm.executeUpdate(q2);
                  JOptionPane.showMessageDialog(null, "Data insert succesfully.....");
                    setVisible(false);
             }
          catch(Exception ex)
          {
              ex.printStackTrace();
          }
        } 
    }              
     public static void main(String args[])
     {
         new enter_marks().setVisible(true);
     }
  }
 
  

    
 


         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
          
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
