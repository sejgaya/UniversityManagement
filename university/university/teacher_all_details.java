package com.mycompany.university;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class teacher_all_details extends JFrame implements ActionListener
{
  JTable t;
  JButton bt1;
  String x[]={"Employ ID","First Half","Second Half"};
  String y[][]=new String [20][3];
  int i=0,j=0;
  
  teacher_all_details()
  {
      setSize(900,400);
      setLocation(100,100);
      
      try
      {
           connectionc obj=new connectionc();
          String q="select * from teacher_attendence";
          ResultSet rest=obj.stm.executeQuery(q);
          while(rest.next())
          {
                 y[i][j++]=rest.getString("ch_employ");
                 y[i][j++]=rest.getString("ch_first_half");
                 y[i][j++]=rest.getString("ch_second_half");
                // y[i][j++]=rest.getString("date");
              i++;
              j=0;
          }
          t=new JTable(y,x);
      }
      catch(Exception ex)
      {
           ex.printStackTrace();
      }
          //JScrollPane sp=new JScrollPane(t);
          bt1=new JButton("print");
          add(bt1,"South");
          
          JScrollPane js=new JScrollPane(t);
          add(js);
          bt1.addActionListener(this);
      }
       public void actionPerformed(ActionEvent ev)
      {
          if(ev.getSource()==bt1)
          {
              try
              {
                  t.print();
              }
              catch(Exception evx)
              {
                  evx.printStackTrace();
              }
          }
      }
      public static void main(String args[])
      {
          new teacher_all_details().setVisible(true);
      }
  }

