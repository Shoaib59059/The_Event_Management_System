package JAVAAA;

import java.util.*;
import java.awt.*;
import javax.swing.*;

import JAVAAA.Homepagee;

import java.awt.event.*;    
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Frontpagee extends JFrame implements ActionListener
{
	JFrame f ;
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3,b4,b5,b6;
	JTextField t1,t2;

	public Frontpagee()
	{
		 f = new JFrame("Front page");
		l1 = new JLabel("EVENT MANAGEMENT SYSTEM");
		l2 = new JLabel("USERNAME:-");
		l3 = new JLabel("PASSWORD:-");
		l4 = new JLabel();
		l4.setText("IF YOU ARE A NEW USER PLEASE REGISTER HERE:-");
		l1.setFont(new Font("Serif", Font.PLAIN, 35));
		b1 = new JButton("LOG IN");
		b2 = new JButton("RESET");
		b3 = new JButton("ABOUT");
		b4 = new JButton("CONTACT US");
		b5 = new JButton("SIGN IN");
		b6 = new JButton("EXIT");
		t1 = new JTextField();
		t2 = new JTextField();

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);

		t1.setBounds(320,250,150,30);
		t2.setBounds(320,300,150,30);
		l1.setBounds(130,30,600,30);
		l2.setBounds(230,250,100,30);
		l3.setBounds(230,300,120,30);
		l4.setBounds(180,170,320,30);
		b1.setBounds(260,400,100,30);
		b2.setBounds(410,400,100,30);
		b3.setBounds(180,100,100,30);
		b4.setBounds(480,100,120,30);
		b5.setBounds(500,170,100,30);
		b6.setBounds(335,450,100,30);
		
		f.add(l1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(t1);
		f.add(t2);
		f.add(b5);
		f.add(b6);

		f.getContentPane().setBackground(Color.orange);
		f.setLayout(null);
		f.setSize(800,600);
		f.setVisible(true);
	}
	 public void actionPerformed(ActionEvent e)
	 {
		 Connection c = null;
			Statement stmt = null;
		        if (e.getSource() == b1)
		        {   
		        	try 
		        	{
		        		Class.forName("org.postgresql.Driver");
		   	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Rushi123");
		   	         System.out.println("Opened database successfully");
		   	         String username = t1.getText();
		   	         String password = t2.getText();
		   	         stmt = c.createStatement();
		   	         String sql = "select * from login where username ='"+username+"'and password ='"+password+"'"; 
		   	         ResultSet rs = stmt.executeQuery(sql);
		   	         if (rs.next())
		   	         {
		   	        	 dispose();
		   	        	 Homepagee ab = new Homepagee();
		   	        	 JOptionPane.showMessageDialog(b1, "You have successfully logged in");
		   	         } 
		   	         else
		   	         {
	                  JOptionPane.showMessageDialog(b1, "Wrong Username & Password");
		   	         }
		   	      	
		        	}
		        	catch (Exception f)
		        	{
	                    System.out.println(f.getMessage());
	                }   
		        }

		 if (e.getSource() == b3)
		 {
			 Aboutt abb = new Aboutt();
			// abb.setVisible(true);
		 }


		 if (e.getSource() == b4)
		 {
			 try {
				 Contactt abc = new Contactt();
			 } catch (Exception ex) {
				 ex.printStackTrace();
			 }

		 }

		 if (e.getSource() == b5)
		 {
			 Signinn abc = new Signinn();

		 }
		 if (e.getSource() == b6)
		 {
			 f.setVisible(false);

		 }
		 if (e.getSource() == b2)
		 {
			 	t1.setText("");
				t2.setText("");
		 }

	 }
	
	

}

public class Frontpage
{
	public static void main(String[] args) 
	{
		Frontpagee ab = new Frontpagee();
	}

}