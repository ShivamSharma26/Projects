/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicawt;

/**
 *
 * @author SHIVAM
 */
import java.awt.*;
import java.awt.event.*;

public class CalcAWT extends Frame implements ActionListener
{
    Label lb1,lb2,lb3,lb4;
    TextField tf1,tf2,tf3;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7;
    
    public CalcAWT(String title)
    {
        super(title);
        this.setLayout(null);
        this.setSize(900,800);
        this.setBackground(Color.cyan);
        this.setVisible(true);
        Font f=new Font("arial",Font.BOLD,20); 
        
        lb4=new Label("Welcome! This is a Basic AWT Calculator");
        lb4.setFont(f);
        lb4.setForeground(Color.orange);
        lb4.setBounds(100,100,600,30);
        this.add(lb4);
        
        lb1=new Label("Enter First No :");
        lb1.setFont(f);
        lb1.setForeground(Color.red);
        lb1.setBounds(100,200,300,30);
        this.add(lb1);
        tf1=new TextField();
        tf1.setFont(f);
        tf1.setForeground(Color.red);
        tf1.setBounds(450,200,150,30);
        this.add(tf1);
        lb2=new Label("Enter Second No :");
        lb2.setFont(f);
        lb2.setForeground(Color.red);
        lb2.setBounds(100,300,300,30);
        this.add(lb2);
        tf2=new TextField();
        tf2.setFont(f);
        tf2.setForeground(Color.red);
        tf2.setBounds(450,300,150,30);
        this.add(tf2);
        lb3=new Label("Result:");
        lb3.setFont(f);
        lb3.setForeground(Color.red);
        lb3.setBounds(100,400,300,30);
        this.add(lb3);
        tf3=new TextField();
        tf3.setFont(f);
        tf3.setForeground(Color.red);
        tf3.setBounds(450,400,150,30);
        this.add(tf3);
        bt1=new Button("Addition");
        bt2=new Button("Refresh");
        bt3=new Button("Exit");
        bt4=new Button("Subtraction");
        bt5=new Button("Multiplication");
        bt6=new Button("Division");
        bt7=new Button("Modulus");
        
        bt1.setFont(f);
        bt2.setFont(f);
        bt3.setFont(f);
        bt4.setFont(f);
        bt5.setFont(f);
        bt6.setFont(f);
        bt7.setFont(f);
        
        bt1.setBounds(50,600,200,30);
        bt4.setBounds(230,600,200,30);
        bt5.setBounds(400,600,200,30);
        bt6.setBounds(570,600,200,30);
        bt7.setBounds(750,600,200,30);
        bt2.setBounds(950,600,200,30);
        bt3.setBounds(1100,600, 200,30);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        
        this.add(bt1);
        this.add(bt2);
        this.add(bt3);
        this.add(bt4);
        this.add(bt5);
        this.add(bt6);
        this.add(bt7);
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bt1)
        {
            double n1=Double.parseDouble(tf1.getText().toString());
            double n2=Double.parseDouble(tf2.getText().toString());
            double sum;
            sum= n1+n2;
            tf3.setText(sum+"");
            
        }
         if(ae.getSource()==bt4)
        {
            double n1=Double.parseDouble(tf1.getText().toString());
            double n2=Double.parseDouble(tf2.getText().toString());
            double sub;
            sub= n1-n2;
            tf3.setText(sub+"");
            
        }
          if(ae.getSource()==bt5)
        {
            double n1=Double.parseDouble(tf1.getText().toString());
            double n2=Double.parseDouble(tf2.getText().toString());
            double mul;
            mul= n1*n2;
            tf3.setText(mul+"");
            
        }
           if(ae.getSource()==bt6)
        {
            double n1=Double.parseDouble(tf1.getText().toString());
            double n2=Double.parseDouble(tf2.getText().toString());
            double div;
            div= n1/n2;
            tf3.setText(div+"");
            
        }
            if(ae.getSource()==bt7)
        {
            double n1=Double.parseDouble(tf1.getText().toString());
            double n2=Double.parseDouble(tf2.getText().toString());
            double mod;
            mod= n1%n2;
            tf3.setText(mod+"");
            
        }
        
        else if(ae.getSource()==bt2)
        {
            tf1.setText("");
            tf2.setText(null);
            tf3.setText(null);
        }
        else if(ae.getSource()==bt3)
        {
            System.exit(1);
        }
        
        
        
        
    }
    
    
    public static void main(String [] args)
    {
        new CalcAWT("Calculator AWT");
    }
    
}   
