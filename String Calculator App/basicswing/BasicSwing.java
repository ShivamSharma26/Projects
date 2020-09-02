/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicswing;

/**
 *
 * @author SHIVAM
 */
//
/*2. Create a GUI (presentation layer) and separate application layer and perform the following 
  * Read a String to print reverse , Change case of it , check no of vowels and consonents */ 

/* This Program is created by-
 Name: Shivam Ravikumar Sharma
 Date: 03/08/2018
 Place: At Axiom Internship */

import java.awt.*; // AWT Components
import java.awt.event.*; // Event Handeling 
import javax.swing.*; // SWING library
import mypkg.StrOp;

class BasicSwing extends JFrame implements ActionListener 
{

    // Declare GUI components 
    JLabel jlb1,jlb2,jlb3;
    JTextField jtf1,jtf2;
    JButton jbt1,jbt2,jbt3,jbt4,jbt5,jbt6;
    Container cp;
    // Define Constructor 
    
	public BasicSwing(String title)
    {
        // initialise Frame properties 
        super(title); // Sets a Title of frame
        this.setSize(1200, 1200); // Sets a Size of a JFrame 
        cp=getContentPane();
        cp.setLayout(null); // nullify the default layout - flow
        cp.setBackground(Color.green); // sets a Background color to cyan
        Font g=new Font("arial",Font.BOLD,30);

        // Initialise GUI Components 
        // initialise labels
         jlb1=new JLabel("String Operations");
		
		 Font f=new Font("arial",Font.BOLD,20);

         jlb2=new JLabel("Enter String");
         jlb3=new JLabel("Result");
         
       
         // initialise TextField
         jtf1=new JTextField();
         jtf2=new JTextField();
         
         
         // Initialise Buttons 
         jbt1=new JButton("Reverse");
         jbt2=new JButton("ChangeCase");
         jbt3=new JButton("Refresh");
		 jbt4=new JButton("Exit");
		 jbt5=new JButton("VowelCount");
		 jbt6=new JButton("ConsonantCount");
         
         // Set font of all components 
         jlb1.setFont(g);
		 jlb2.setFont(f);
		 jlb3.setFont(f);

         jtf1.setFont(f);
		 jtf2.setFont(f);

         jbt1.setFont(f);
		 jbt2.setFont(f);
		 jbt3.setFont(f);
		 jbt4.setFont(f);
		 jbt5.setFont(f);
		 jbt6.setFont(f);

         // Set a foreground Color
         jlb1.setForeground(Color.magenta);
		 jlb2.setForeground(Color.red);
         jlb3.setForeground(Color.red);

         jtf1.setForeground(Color.red);
		 jtf2.setForeground(Color.red);

         jbt1.setForeground(Color.red);
		 jbt2.setForeground(Color.red);
		 jbt3.setForeground(Color.red);
		 jbt4.setForeground(Color.red);
		 jbt5.setForeground(Color.red);
		 jbt6.setForeground(Color.red);
 
         // Sets Bounds of componets 
         jlb1.setBounds(400, 100, 300, 30);
         jlb2.setBounds(200, 150, 250, 30);
         jlb3.setBounds(200, 200, 250, 30);

		 jtf1.setBounds(500,150, 150,30);
         jtf2.setBounds(500,200, 150,30);
         
         jbt1.setBounds(200, 300, 150, 30);
		 jbt2.setBounds(400, 300, 200, 30);
         jbt3.setBounds(640, 300, 150, 30);
		 jbt4.setBounds(800,300,150,30);
		 jbt5.setBounds(200, 400, 200, 30);
		 jbt6.setBounds(450, 400, 200, 30);
         
        cp.add(jlb1);
		cp.add(jlb2);
		cp.add(jlb3);

        cp.add(jtf1);
		cp.add(jtf2);

        jbt1.addActionListener(this);
		jbt2.addActionListener(this);
        jbt3.addActionListener(this);
		jbt4.addActionListener(this);
		jbt5.addActionListener(this);
        jbt6.addActionListener(this);
        
        
        cp.add(jbt1);
		cp.add(jbt2);
		cp.add(jbt3);
		cp.add(jbt4);
		cp.add(jbt5);
		cp.add(jbt6);
        
      this.setVisible(true); // makes a frame visible 
    }
    
    // Process Button Events 
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jbt1)
        {
            String str=jtf1.getText();
            String rstr=StrOp.Reverse(str);
            jtf2.setText(rstr+"");
            
        }
        else if(ae.getSource()==jbt2)
        {
            String str=jtf1.getText();
            String cstr=StrOp.ChangeCase(str);
	    jtf2.setText(cstr+"");
        }
        else if(ae.getSource()==jbt3)
        {
            jtf1.setText("");
			jtf2.setText("");
        }
		else if(ae.getSource()==jbt4)
		{
			System.exit(1);
		}
		else if(ae.getSource()==jbt5)
		{
		 String str=jtf1.getText();
                 int vc=StrOp.VowelCount(str);
		 jtf2.setText(vc+"");
	  	}
		else if(ae.getSource()==jbt6)
		{
                 String str=jtf1.getText();
                 int c=StrOp.ConsonantCount(str);
		 
		jtf2.setText(c+"");
		}
        
    }
    
    
    
    
    public static void main(String[] args) 
	{
        // TODO code application logic here
        
        new BasicSwing("Basic Swing");
    }
    
}

