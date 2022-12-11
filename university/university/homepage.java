
package com.mycompany.university;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class homepage extends JFrame implements ActionListener
{
   
    JLabel l1,l2;
    homepage()
    {
  super("Home Page");
  setVisible(true);
  setSize(1600,690);
  
  
  JMenuBar mb=new JMenuBar();
  JMenu men1=new JMenu("Master");
  JMenuItem mt1=new JMenuItem("New Faculty");
  JMenuItem mt2=new JMenuItem("New Student Addmission");
  
//NEW FACULTY
  mt1.setMnemonic('M');
  mt1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
  
//NEW STUDENT ADDMISSION
   mt2.setMnemonic('S');
  mt2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
  
  mt1.addActionListener(this);
  mt2.addActionListener(this);
  //...........................
  
  
 //DETAILS INFORMATION
  JMenu men2=new JMenu("Details");
  JMenuItem mt19=new JMenuItem("Fee Details");
  
  mt19.setMnemonic('H');
  mt19.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.CTRL_MASK));
  
  mt19.addActionListener(this);
 //.........................................


//ATTENDUNCE 
   JMenu men3=new JMenu("Attendunce");
  JMenuItem mt3=new JMenuItem("Student Attendunce");
   JMenuItem mt4=new JMenuItem("Teacher Attendunce");
  
//STUDENT ATTENDUNCE
  mt3.setMnemonic('T');
  mt3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
 
  // Teacher Attendunce
  mt4.setMnemonic('D');
  mt4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
  
   mt3.addActionListener(this);
   mt4.addActionListener(this);
  //..............................................
  
  // ALL ATTENDUNCE 
  JMenu men4=new JMenu("Attendunce Details");
  JMenuItem mt5=new JMenuItem("Student all details");
   JMenuItem mt6=new JMenuItem("Teacher all details");
 
   //Student all Attendunce
  mt5.setMnemonic('A');
  mt5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
  
 // Teacher all Attendunce
  mt6.setMnemonic('Q');
  mt6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,ActionEvent.CTRL_MASK));
  
   mt5.addActionListener(this);
   mt6.addActionListener(this);
 
   
//.......................................
   JMenu men5=new JMenu("Examination");
  JMenuItem mt7=new JMenuItem("Examination Details");
   JMenuItem mt8=new JMenuItem("Enter Marks");
   
   // Examination Fee Details
   mt7.setMnemonic('E');
  mt7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
   
   //ENTER MARKS
   mt8.setMnemonic('R');
  mt8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
   
   mt7.addActionListener(this);
   mt8.addActionListener(this);
  
   
  //.................................................
  JMenu men9=new JMenu("Update Details");
  JMenuItem mt10=new JMenuItem("Update Student");
   JMenuItem mt11=new JMenuItem("Update teacher");
   
   //Update Student fee details
    mt10.setMnemonic('T');
  mt10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
   
    //Update teacher fee details
    mt11.setMnemonic('Y');
  mt11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,ActionEvent.CTRL_MASK));
    
    mt10.addActionListener(this);
   mt11.addActionListener(this);
   
   
    //.................................................
  JMenu men10=new JMenu("Fee Details");
  JMenuItem mt12=new JMenuItem("SEE Structure");
   JMenuItem mt13=new JMenuItem("Student fee form");
    
    //Update Student fee details
    mt12.setMnemonic('U');
  mt12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,ActionEvent.CTRL_MASK));
  
  //Update teacher fee details
    mt13.setMnemonic('I');
  mt13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,ActionEvent.CTRL_MASK));
   
  mt12.addActionListener(this);
   mt13.addActionListener(this);
   
   
    //.................................................
  JMenu men11=new JMenu("Utility");
  JMenuItem mt14=new JMenuItem("Notepad");
   JMenuItem mt15=new JMenuItem("Chrome");
    JMenuItem mt16=new JMenuItem("Calculator");
    
    //Update notepade fee details
     mt14.setMnemonic('V');
  mt14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
    
  //Update CHROM fee details
     mt15.setMnemonic('O');
  mt15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
  
  //Update CALCULATOR fee details
     mt16.setMnemonic('V');
  mt16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
    
     mt14.addActionListener(this);
   mt15.addActionListener(this);
     mt16.addActionListener(this);
    
    
      //.................................................
  JMenu men12=new JMenu("About");
  JMenuItem mt17=new JMenuItem("About Page");
    
    //About fee details
     mt17.setMnemonic('L');
  mt17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
  
   mt17.addActionListener(this);
    
    
     //.................................................
  JMenu men13=new JMenu("Exit");
  JMenuItem mt18=new JMenuItem("Exit Page"); 
    men13.setForeground(Color.red);
    
    //exit fee details
     mt18.setMnemonic('K');
  mt18.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,ActionEvent.CTRL_MASK));
  
   mt18.addActionListener(this);
   
   men1.add(mt1);
    men1.add(mt2);
    men2.add(mt19);
     men3.add(mt3);
     men3.add(mt4);
     men4.add(mt5);
      men4.add(mt6);
      men5.add(mt7);
      men5.add(mt8);
      men9.add(mt10);
      men9.add(mt11);
      men10.add(mt12);
      men10.add(mt13);
      men11.add(mt14);
      men11.add(mt15);
      men11.add(mt16);
      men12.add(mt17);
      men13.add(mt18);
      
      
      
     mb.add(men1);
     mb.add(men2);
     mb.add(men3);
     mb.add(men4);
     mb.add(men5);
     mb.add(men9);
     mb.add(men10);
     mb.add(men11);
     mb.add(men12);
     mb.add(men13);
     
     setJMenuBar(mb);
     
     //add(l1);
    }

    public void actionPerformed(ActionEvent ev)
    {
        String comnd=ev.getActionCommand();
        if(comnd.equals("New Faculty"))
                {
                 new new_faculty().setVisible(true);
                }

           else if(comnd.equals("New Student Addmission"))
                {
                new new_student_addmission().setVisible(true);
                }
           else if(comnd.equals("Fee Details"))
           {
                new fee_details().setVisible(true);
           }
           else if(comnd.equals("Student Attendunce"))
           {
               new student_attendunce().setVisible(true);
           }
           else if(comnd.equals("Teacher Attendunce"))
           {
               new teacher_attendunce().setVisible(true);
           }
           else if(comnd.equals("Student all details"))
           {
               new student_all_details().setVisible(true);
           }
           else if(comnd.equals("Teacher all details"))
           {
               new teacher_all_details().setVisible(true);
           }
           else if(comnd.equals("Examination Details"))
           {
               new examination_details().setVisible(true);
           }
           else if(comnd.equals("Enter Marks"))
           {
               new enter_marks().setVisible(true);
           }
           else if(comnd.equals("Update Student"))
           {
               new update_student().setVisible(true);
           }
           else if(comnd.equals("Update teacher"))
           {
               new update_teacher().setVisible(true);
           }
           else if(comnd.equals("See Structure"))
           {
               new see_structure().setVisible(true);
           }
           else if(comnd.equals("Student fee form"))
           {
               new student_fee_structure().setVisible(true);
           }
           else if(comnd.equals("Exit Page"))
           {
               System.exit(0);
           }
           else
           {
               JOptionPane.showMessageDialog(null,"sorry you press wrong button");
               setVisible(false);
           }
        
          
        
    }
    public static void main(String args[])
     {
         new homepage().setVisible(true);
      }
}