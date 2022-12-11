package com.mycompany.university;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class fee_details extends JFrame 
{
  JLabel  l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,
          l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,
          l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,
          l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,
          l41,l42,l43,l44,l45,l46,l47,l48,l49,l50,
          l51,l52,l53,l54,l55,l56,l57,l58,l59,l60,
          l61,l62,l63,l64,l65,l66,l67,l68,l69,l70,l71,l72,l73;
  Font f,f1;
  JPanel p1;
  
  fee_details()
  {
     super("Fee Structure Details");
     setVisible(true);
     setSize(1000,500);
     setLocation(100,100);
     
     l1=new JLabel("Fee Structure");
     l2=new JLabel("COURCE");
     l3=new JLabel("BTECH");
     l4=new JLabel("BBA");
     l5=new JLabel("MBA");
     l6=new JLabel("BSC");
     l7=new JLabel("MSC");
     l8=new JLabel("MTECH");
     l9=new JLabel("MCA");
     l10=new JLabel("Semester 1");
     l11=new JLabel("Rs.43000");
     l12=new JLabel("Rs.23000");
     l13=new JLabel("Rs.45000");
     l14=new JLabel("Rs.58000");
     l15=new JLabel("Rs.48000");
     l16=new JLabel("Rs.87000");
     l17=new JLabel("Rs.60000");
     l18=new JLabel("Semester 2");
     l19=new JLabel("Rs.43000");
     l20=new JLabel("Rs.23000");
     l21=new JLabel("Rs.45000");
     l22=new JLabel("Rs.58000");
     l23=new JLabel("Rs.48000");
     l24=new JLabel("Rs.87000");
     l25=new JLabel("Rs.60000");
     l26=new JLabel("Semester 3");
     l27=new JLabel("Rs.43000");
     l28=new JLabel("Rs.23000");
     l29=new JLabel("Rs.45000");
     l30=new JLabel("Rs.58000");
     l31=new JLabel("Rs.48000");
     l32=new JLabel("Rs.87000");
     l33=new JLabel("Rs.60000");
     l34=new JLabel("Semester 4");
     l35=new JLabel("Rs.43000");
     l36=new JLabel("Rs.23000");
     l37=new JLabel("Rs.45000");
     l38=new JLabel("Rs.58000");
     l39=new JLabel("Rs.48000");
     l40=new JLabel("Rs.87000");
     l41=new JLabel("Rs.60000");
     l42=new JLabel("Semester 5");
     l43=new JLabel("Rs.43000");
     l44=new JLabel("Rs.23000");
     l45=new JLabel("Rs.45000");
     l46=new JLabel("Rs.58000");
     l47=new JLabel("--------");
     l48=new JLabel("--------");
     l49=new JLabel("--------");
     l50=new JLabel("Semester 6");
     l51=new JLabel("Rs.43000");
     l52=new JLabel("Rs.23000");
     l53=new JLabel("Rs.45000");
     l54=new JLabel("Rs.58000");
     l55=new JLabel("--------");
     l56=new JLabel("--------");
     l57=new JLabel("--------");
     l58=new JLabel("Semester 7");
     l59=new JLabel("Rs.43000");
     l60=new JLabel("--------");
     l61=new JLabel("--------");
     l62=new JLabel("--------");
     l63=new JLabel("--------");
     l64=new JLabel("--------");
     l65=new JLabel("--------");
     l66=new JLabel("Semester 8");
     l67=new JLabel("Rs.43000");
     l68=new JLabel("--------");
     l69=new JLabel("--------");
     l70=new JLabel("--------");
     l71=new JLabel("--------");
     l72=new JLabel("--------");
     l73=new JLabel("--------");
     
     f=new Font("Arial",Font.BOLD,18);
     f1=new Font("Arial",Font.ITALIC,25);
     
     l1.setFont(f1);
     l1.setHorizontalAlignment(JLabel.CENTER);
     
         l2.setFont(f);
         l3.setFont(f);
         l4.setFont(f);
         l5.setFont(f);
         l6.setFont(f);
         l7.setFont(f);
         l8.setFont(f);
         l9.setFont(f);
         l10.setFont(f);
         l18.setFont(f);
         l26.setFont(f);
         l34.setFont(f);
         l42.setFont(f); 
         l50.setFont(f);
         l58.setFont(f);
         l66.setFont(f);
         
         p1=new JPanel();
         p1.setLayout(new GridLayout(9,8,20,20));
         
         p1.add(l2);
         p1.add(l3);
         p1.add(l4);
         p1.add(l5);
         p1.add(l6);
         p1.add(l7);
         p1.add(l8);
         p1.add(l9);
         p1.add(l10);
         p1.add(l11);
         p1.add(l12);
         p1.add(l13);
         p1.add(l14);
         p1.add(l15);
               p1.add(l16);
               p1.add(l17);
               p1.add(l18);
               p1.add(l19); 
               p1.add(l20);
               p1.add(l21);
               p1.add(l22); 
               p1.add(l23);
               p1.add(l24);
               p1.add(l25);
               p1.add(l26);
               p1.add(l27);
               p1.add(l28);
               p1.add(l29);
               p1.add(l30); 
               p1.add(l31);
               p1.add(l32);
               p1.add(l33); 
               p1.add(l34);
               p1.add(l34);
               p1.add(l35);
               p1.add(l36);
               p1.add(l37);
               p1.add(l38);
               p1.add(l39);
               p1.add(l40);
               p1.add(l41);
               p1.add(l42);
               p1.add(l43);
               p1.add(l44); 
               p1.add(l45);
               p1.add(l46); 
               p1.add(l47);
               p1.add(l48);
               p1.add(l49); 
               p1.add(l50);
               p1.add(l51);
               p1.add(l52);
               p1.add(l53);
               p1.add(l54);
               p1.add(l55);
               p1.add(l56);
               p1.add(l57);
               p1.add(l58); 
               p1.add(l59);
               p1.add(l60);
               p1.add(l61);
               p1.add(l62); 
               p1.add(l63);
               p1.add(l64);
               p1.add(l65);
               p1.add(l66);
               p1.add(l67);
               p1.add(l68); 
               p1.add(l69); 
               p1.add(l70);
               p1.add(l71);
               p1.add(l72); 
               p1.add(l73);
              
               setLayout(new BorderLayout(10,10));
               
               add(p1,"Center");
               add(l1,"North");
            }
         
                public static void main(String args[])
                {
                    new  fee_details().setVisible(true);
                }
             }
         
