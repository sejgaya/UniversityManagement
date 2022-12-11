package com.mycompany.university;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class student_attendunce extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    Choice c1,c2,c3;
    JButton bt1,bt2;
    Font f;
    JPanel p;
   
    student_attendunce()
    {
      super("Student Attendence");
      setSize(400,200);
      setLocation(300,200);
      setResizable(false);
      f=new Font("senserif",Font.BOLD,15);
      
     l1=new JLabel("Select Roll Number");
     l2=new JLabel("First Half");
     l3=new JLabel("Second Half");
      
     l1.setFont(f);
     l2.setFont(f);
     l3.setFont(f);
     
     c2=new Choice();
     c2.add("Present");
     c2.add("Absent");
     
     c3=new Choice();
     c3.add("Present");
     c3.add("Absent");
     
     c2.setFont(f);
     c3.setFont(f);
     
     bt1=new JButton("Submit");
     bt2=new JButton("Cancel");
     
     bt1.setBackground(Color.BLACK);
      bt1.setForeground(Color.WHITE);
      
       bt2.setBackground(Color.BLACK);
      bt2.setForeground(Color.WHITE);
      
      bt1.setFont(f);
      bt2.setFont(f);
      
      c1=new Choice();
      
      try
      {
          connectionc obj=new connectionc();
          String q="select * from new_student_add";
          ResultSet rest=obj.stm.executeQuery(q);
          while(rest.next())
          {
              c1.add(rest.getString("rollno"));        
          }
      }
      catch(Exception ex)
      {
          ex.printStackTrace();
      }
     
      p=new JPanel();
      p.setLayout(new GridLayout(4,2,10,10));
      
      p.add(l1);
      p.add(c1);
      p.add(l2);
      p.add(c2);
      p.add(l3);
      p.add(c3);
      p.add(bt1);
      p.add(bt2);
      
      //add(p,"South");
     // add(p,"South");
      add(p);
      
      
      bt1.addActionListener(this);
       bt2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ev)
    {
        if(ev.getSource()==bt1)
        {
            String roll_no=c1.getSelectedItem();
            String ch_first_half=c2.getSelectedItem();
            String ch_second_half=c3.getSelectedItem();
            //String dt=new java.util.Date().toString();
            
            try
            {
                connectionc obj1=new connectionc();
                String q1="insert into student_attendence values('"+roll_no+"','"+ch_first_half+"','"+ch_second_half+"')";
                obj1.stm.executeUpdate(q1);
                JOptionPane.showMessageDialog(null,"data inserted");
                setVisible(false);
            }
            catch(Exception ex1)
            {
                ex1.printStackTrace();
            }
        }
        if(ev.getSource()==bt2)
        {
            JOptionPane.showMessageDialog(null,"are you press cancel");
                setVisible(false);
        }
    }
    public static void main(String args[])
    {
        new student_attendunce().setVisible(true);
    }
}

   
    

