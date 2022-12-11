package com.mycompany.university;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class updateStudent_record extends JFrame implements ActionListener 
    {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JButton bt1,bt2;
    JComboBox cm1,cm2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JPanel p1,p2,p3;
    String a[]={"Computer Science","Math","CHemistry","Physics","Electrical","Comors"};
    String b[]={"B.Tech","B.Sc","B.A"};
    Font f,f1;
    updateStudent_record()
    {
        
    }
    updateStudent_record(String sm)
    {
        super("Add Student");
        setSize(650,550);
        setResizable(false);
        setLocation(250,80);
        
       
        f=new Font("senserif",Font.BOLD,25);
        f1=new Font("Arial",Font.BOLD,16);
        
        l1=new JLabel("Name");
        l2=new JLabel("Father's name");
        l3=new JLabel("Age");
        l4=new JLabel("DOB(yyyy-mm-dd)");
        l5=new JLabel("Address");
        l6=new JLabel("Phone");
        l7=new JLabel("Email");
        l8=new JLabel("Class X");
        l9=new JLabel("Class XII");
        //l10=new JLabel("Aadhar NO");
        l11=new JLabel("Roll No");
        l12=new JLabel("Branch");
        l13=new JLabel("Cource");
        l14=new JLabel("Update Student Details");
        l14.setFont(f);
        l14.setHorizontalAlignment(JLabel.CENTER);
        
        l1.setFont(f1);
        l2.setFont(f1); 
        l3.setFont(f1);
        l4.setFont(f1); 
        l5.setFont(f1); 
        l6.setFont(f1); 
        l7.setFont(f1); 
        l8.setFont(f1); 
        l9.setFont(f1);
         //l10.setFont(f1);
        l11.setFont(f1); 
        l12.setFont(f1);
        l13.setFont(f1);
        
         t1=new JTextField(10);
         t2=new JTextField(15);
         t3=new JTextField(15);
         t4=new JTextField(15);
         t5=new JTextField(15);
         t6=new JTextField(15);
         t7=new JTextField(15);
         t8=new JTextField(15);
         t9=new JTextField(15);
         //t10=new JTextField(15);
         t11=new JTextField(15);
         
        
        t1.setFont(f1);
        t2.setFont(f1);
        t3.setFont(f1);
        t4.setFont(f1);
        t5.setFont(f1);
        t6.setFont(f1);
        t7.setFont(f1);
        t8.setFont(f1);
        t9.setFont(f1);
       // t10.setFont(f);
        t11.setFont(f1);
        
        
        cm1=new JComboBox(a);
        cm2=new JComboBox(b);
        
        cm1.setFont(f1);
        cm2.setFont(f1);
        
        bt1=new JButton("Submit");
         bt2=new JButton("Cancle");
        
        bt1.setFont(f1);
        bt2.setFont(f1);
         bt1.setBackground(Color.BLACK);
         bt1.setForeground(Color.WHITE);
         bt2.setBackground(Color.BLACK);
         bt2.setForeground(Color.WHITE);
         
        
        
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p1.setLayout(new GridLayout(13,2,10,10));
        p2.setLayout(new GridLayout(1,1));
        //p3.setLayout(new GridLayout(1,2,10,10));
        //p2.setSize(60,60);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        p1.add(l5);
        p1.add(t5);
        p1.add(l6);
        p1.add(t6);
        p1.add(l7);
        p1.add(t7);
        p1.add(l8);
        p1.add(t8);
        p1.add(l9);
        p1.add(t9);
        //p1.add(l10);
       // p1.add(t10);
        p1.add(l11);
        p1.add(t11);
        p1.add(l12);
        p1.add(cm1);
        p1.add(l13);
        p1.add(cm2);
        
        p1.add(bt1);
        p1.add(bt2);
        
       // p2.add(l15);
        
        setLayout(new BorderLayout(30,30));
         add(p1,"Center");
         add(l14,"North");
       // add(p2,"West");
        // add(p3,"South");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        trial(sm);
    }    
  void trial(String sm)
  {
      try
      {
          connectionc obj=new connectionc();
        String qq="select * from new_student_add where rollno='"+sm+"'";
        ResultSet rest=obj.stm.executeQuery(qq);
        while(rest.next())
        {
           
            t1.setText(rest.getString(1));
            t2.setText(rest.getString(2));
            t3.setText(rest.getString(3));
            t4.setText(rest.getString(4));
            t5.setText(rest.getString(5));
            t6.setText(rest.getString(6));
            t7.setText(rest.getString(7));
            t8.setText(rest.getString(8));
            t9.setText(rest.getString(9));
            t11.setText(rest.getString(10));
         }
      }
      catch(Exception exx)
      {
          exx.printStackTrace();
      }
  }
      public void actionPerformed(ActionEvent ev)  
     
            {
              String name=t1.getText();
              String father_name=t2.getText();
              int age=Integer.parseInt(t3.getText());
              String dob=t4.getText();
              String address=t5.getText();
              String phone=t6.getText();
              String email=t7.getText();
              String classX=t8.getText();
              String classXII=t9.getText();
              String rollno=t11.getText();
              String branch=(String)cm1.getSelectedItem();
              String cource=(String)cm2.getSelectedItem();
            {
          if(ev.getSource()==bt1)  
      
      
         try
        {
            connectionc obj=new connectionc();
              String q="update new_student_add set name='"+name+"',father_name='"+father_name+"',age='"+age+"',dob='"+dob+"',address='"+address+"',phone='"+phone+"',email='"+email+"',classX='"+classX+"',classXII='"+classXII+"',rollno='"+rollno+"',branch='"+branch+"',cource='"+cource+"')";
               obj.stm.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "Data insert succesfully.....");
            setVisible(false);
            new update_student().setVisible(true);
        }
          catch(Exception ex)
          {
              ex.printStackTrace();
          }
       }
        if(ev.getSource()==bt2)
        {
            JOptionPane.showMessageDialog(null,"Are you sure to cancle");
            setVisible(false);
        }
      }
        public static void main(String args[])
        {
        new updateStudent_record().setVisible(true);     
      }
    }

    