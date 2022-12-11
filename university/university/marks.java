package com.mycompany.university;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class marks extends JFrame
        {
             JPanel p1;
             JTextArea t1;
             marks()
             {
                 
             }
             marks(String sm)
             {
                 setSize(300,400);
                 setLocation(100,100);
                 setLayout(new BorderLayout());
                 
                 p1=new JPanel();
                 t1=new JTextArea();
                 JScrollPane jsp=new JScrollPane(t1);
                 t1.setFont(new Font("senserif",Font.ITALIC,15));
                 add(p1,"North");
                 add(jsp,"Center");
                 
                 mark(sm);
             }
   public void mark(String sa)
   {
       try
       {
           connectionc obj=new connectionc();
           t1.setText("\tResult of Examination\n ");
           
           ResultSet rest=obj.stm.executeQuery("select * from student_subject where roll_no="+sa);
           
           if(rest.next())
           {
                  t1.append("\n\t"+rest.getString("subject_1"));
                  t1.append("\n\t"+rest.getString("subject_2"));
                  t1.append("\n\t"+rest.getString("subject_3"));
                  t1.append("\n\t"+rest.getString("subject_4"));
                  t1.append("\n\t"+rest.getString("subject_5"));
                    t1.append("\n--------------------------------"); 
                    t1.append("\n");
           }
           
           ResultSet rest2=obj.stm.executeQuery("select * from student_marks where roll_no="+sa);
           
           if(rest2.next())
           {
               int marks1=Integer.parseInt(rest2.getString("marks_1"));
               int marks2=Integer.parseInt(rest2.getString("marks_2"));
               int marks3=Integer.parseInt(rest2.getString("marks_3"));
               int marks4=Integer.parseInt(rest2.getString("marks_4"));
               int marks5=Integer.parseInt(rest2.getString("marks_5"));
               int total=marks1+marks2+marks3+marks4+marks5;
               
               t1.append("\n\t"+rest2.getString("marks_1"));
               t1.append("\n\t"+rest2.getString("marks_2"));
               t1.append("\n\t"+rest2.getString("marks_3"));
               t1.append("\n\t"+rest2.getString("marks_4"));
               t1.append("\n\t"+rest2.getString("marks_5"));
                t1.append("\n--------------------------------"); 
                    t1.append("\n");
                    
                    t1.append("\nTotal Marks:");
                    t1.append(total+"/500");          
           }
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
        }
   }
   public static void main(String args[])
   {
       new marks().setVisible(true);
   }
}
