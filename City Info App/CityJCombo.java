/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
1.Add City name in the JComboBox and after selection of City name 
In the text box its state , Population ,
City map need to be appear */
/* This Program is created by-
 Name: Shivam Ravikumar Sharma
 Date: 15/08/2018
 Place: At Axiom Internship */

package javaswing3;

/**
 *
 * @author SHIVAM
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CityJCombo extends JFrame implements ActionListener
{
    JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6;
    JTextField jtf1,jtf2,jtf3;
    JComboBox jcb;
    Container cp;
    
    public CityJCombo(String title)
    {
        super(title);
        
        cp=getContentPane();
        cp.setLayout(null);
        this.setSize(1200, 1200);
        cp.setBackground(Color.green);
     
        Font f=new Font("arial",Font.BOLD,20);
        
        jcb=new JComboBox();
        jcb.setFont(f);
        jcb.setForeground(Color.red);
        jcb.addItem("Select Any City");
        jcb.addItem("Nagpur");
        jcb.addItem("Chennai");
        jcb.addItem("Mumbai");
        jcb.addItem("Bangalore");
        jcb.addActionListener(this);
        jcb.setBounds(100,200,400,30);
        cp.add(jcb);
        
              jlb1=new JLabel("State:");
              jlb1.setFont(f);
              jlb1.setBounds(500,400,300,30);
              jlb1.setForeground(Color.red);
              cp.add(jlb1);
              
              jlb2=new JLabel("Population:");
              jlb2.setFont(f);
              jlb2.setBounds(500,500,300,30);
              jlb2.setForeground(Color.red);
              cp.add(jlb2);
              
              jtf1=new JTextField();
              jtf1.setBounds(600,400,300,30);
              jtf1.setText("");
              jtf1.setFont(f);
              cp.add(jtf1);
              
              jtf2=new JTextField();
              jtf2.setBounds(620,500,300,30);
              jtf2.setText("");
              jtf2.setFont(f);
              cp.add(jtf2);
              
        
          this.setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jcb)
        {
            String str=jcb.getSelectedItem().toString();
           if(str.equals("Nagpur"))
           {
              
              jtf1.setText("Maharashtra");
             
              jtf2.setText("25 Lakhs");
              
              jlb3=new JLabel(new ImageIcon("images//Nagpur_City_Map.jpg"));
              jlb3.setBounds(950,100,800,1000);
              cp.setBackground(Color.cyan);
              cp.add(jlb3);
              
              
               
           }
           
           else if(str.equals("Mumbai"))
           {
              jtf1.setText("Maharashtra");
              
              jtf2.setText("1.84 Crore");
              
              jlb4=new JLabel(new ImageIcon("images//Mumbai_City_Map.jpg"));
              jlb4.setBounds(950,100,800,1000);
              cp.setBackground(Color.blue);
              cp.add(jlb4);
           }
           
           else if(str.equals("Chennai"))
           {
             
              jtf1.setText("Tamil Nadu");
              
              jtf2.setText("1.03 Core");
             
              
              jlb5=new JLabel(new ImageIcon("images//Chennai_Map.jpg"));
              jlb5.setBounds(950,100,800,1000);
              cp.setBackground(Color.yellow);
              cp.add(jlb5);
           }
           else if(str.equals("Bangalore"))
           {
              
              jtf1.setText("Karnataka");
              
              jtf2.setText("1.23 Crore");
              
              jlb6=new JLabel(new ImageIcon("images//Bangalore_Map.jpg"));
              jlb6.setBounds(950,100,800,1000);
              cp.setBackground(Color.ORANGE);
              cp.add(jlb6);
           }
    }
    }
    public static void main(String [] args)
    {
        new CityJCombo("City JComboBox");
    }
}
