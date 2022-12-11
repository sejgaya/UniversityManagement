package com.mycompany.university;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class examination_details extends JFrame implements ActionListener
{
int i=0,j=0;
JLabel l1,l2,l3;
JButton bt1;
JTextField t1;
JTable tb;
JPanel p1,p2;
String x[]={"Name","Father's name","Age","DOB","Address","Phone","Email","Class X","Class XII","Roll no","Branch","Cource"};
String y[][]=new String[20][12];


examination_details()
{
    super("Examination Details");
    setSize(900,400);
    setLocation(100,100);
    
    l1=new JLabel("Check Results");
     l2=new JLabel("Back");
     l3=new JLabel("Roll No");
    
    bt1=new JButton("Result");
    
    t1=new JTextField(15);
    
    try
    {
        connectionc obj=new connectionc();
        String q="select * from new_student_add";
        ResultSet rest=obj.stm.executeQuery(q);
        while(rest.next())
        {
             
             y[i][j++]=rest.getString("name");
             y[i][j++]=rest.getString("father_name");
             y[i][j++]=rest.getString("age");
             y[i][j++]=rest.getString("dob");
             y[i][j++]=rest.getString("address");
             y[i][j++]=rest.getString("phone");
             y[i][j++]=rest.getString("email");
             y[i][j++]=rest.getString("classX");
             y[i][j++]=rest.getString("classXII");
             y[i][j++]=rest.getString("rollno");
             y[i][j++]=rest.getString("branch");
             y[i][j++]=rest.getString("cource");
          j=0;
          i++;
        }
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
    tb=new JTable(y,x);
    JScrollPane sp=new JScrollPane(tb);
    
    p1=new JPanel();
    p2=new JPanel();
    p1.setLayout(new GridLayout(1,4,10,10));
    p2.setLayout(new GridLayout(1,1));
    p1.add(l2);
    p1.add(l3);
    p1.add(t1);
    p1.add(bt1);
    p2.add(sp);
    setLayout(new BorderLayout(30,30));
    add(p1,"North");
    add(p2,"Center");
    
    bt1.addActionListener(this);
    
    tb.addMouseListener(new MouseAdapter() 
    {
        @Override
        public void mouseClicked(MouseEvent arg0)
        {
            int row=tb.getSelectedRow();
            t1.setText(tb.getModel().getValueAt(row,9).toString());
            
        }
    });
    
    l2.addMouseListener(new MouseAdapter() 
    {
        @Override
        public void mouseClicked(MouseEvent evc)
        {
            setVisible(false);
        }    
    });
}
public void actionPerformed(ActionEvent ev)
{
    if(ev.getSource()==bt1)
    {
        new marks(t1.getText()).setVisible(true);
        setVisible(false);
    }
}

    public static void main(String args[])

    {
        new examination_details().setVisible(true);
    }
 }

    
 

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


   
    

