package JAVAAA;

import java.awt.*;
import javax.swing.*;

import JAVAAA.Frontpagee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Signinn implements ActionListener
{
	JFrame f ;
	JLabel l1,l2,l3,l4,l5,l7,l8;
	JButton b1,b2,b3;
	JTextField t1,t2,t3,t4,t5;

	public Signinn()
	{
		 f = new JFrame("Front page");
		l1 = new JLabel("EVENT MANAGMENT SYSTEM");
		l7 = new JLabel("ENTER NAME:-");
		l2 = new JLabel("ENTER YOUR AGE:-");
		l8 = new JLabel("ENTER MAIL-ID:-");
		l3 = new JLabel("ENTER USERNAME:-");
		l5 = new JLabel("ENTER PASSWORD:-");
		l4 = new JLabel();
		l4.setText("PLEASE ENTER YOUR DETAILS HERE:-");
		l1.setFont(new Font("Serif", Font.PLAIN, 35));
		l4.setFont(new Font("Serif", Font.PLAIN, 20));
		l7.setFont(new Font("Serif", Font.PLAIN, 18));
		l2.setFont(new Font("Serif", Font.PLAIN, 18));
		l8.setFont(new Font("Serif", Font.PLAIN, 18));
		l3.setFont(new Font("Serif", Font.PLAIN, 18));
		l5.setFont(new Font("Serif", Font.PLAIN, 18));
		b1 = new JButton("REGISTER");
		b2 = new JButton("DELETE");
		b3 = new JButton("GO BACK");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		
		l1.setBounds(130,30,600,30);
		l4.setBounds(180,80,370,30);
		l7.setBounds(150,200,200,30);
		l2.setBounds(150,240,200,30);
		l8.setBounds(150,280,200,30);
		l3.setBounds(150,320,200,30);
		l5.setBounds(150,360,200,30);
		t1.setBounds(350,200,150,30);
		t2.setBounds(350,240,150,30);
		t3.setBounds(350,280,150,30);
		t4.setBounds(350,320,150,30);
		t5.setBounds(350,360,150,30);
		b1.setBounds(230,450,100,30);
		b2.setBounds(410,450,100,30);
		b3.setBounds(320,500,100,30);
		
		
		
		f.add(l1);
		f.add(b1);
		f.add(b2);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(t1);
		f.add(t2);
		f.add(l5);
		f.add(l7);
		f.add(l8);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(b3);

		


		f.getContentPane().setBackground(Color.orange);
		f.setLayout(null);
		f.setSize(800,600);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
    	if(e.getSource() == b1)
				{
					if(t1.getText().equals("") ||t2.getText().equals("") ||t3.getText().equals("") ||t4.getText().equals("") ||t5.getText().equals(""))
					{
						JOptionPane.showMessageDialog(f,"All fields are mandatory... Please Fill it..");
					}

				}
		Connection c = null;
		Statement stmt = null;
	        if (e.getSource() == b1)
	        {   
	        	try 
	        	{
	        		Class.forName("org.postgresql.Driver");
	   	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Rushi123");
	   	         System.out.println("Opened database successfully");
	   	         String username = t4.getText();
	   	         String password = t5.getText();
	   	         String name = t1.getText();
	   	         String gmail = t3.getText();
	   	         String age = t2.getText();
		         stmt = c.createStatement();
		         String sql = "insert into login values('"+username+"','"+password+"')";
		         String sqll = "insert into login_details values('"+name+"','"+age+"','"+gmail+"')";
		         stmt.executeUpdate(sql);
		         stmt.executeUpdate(sqll);
		         stmt.close();
		         c.close();
		         JOptionPane.showMessageDialog(f,"Successfully Registered...");
		         Frontpagee ab = new Frontpagee();
	        	}
	        	catch (Exception f)
	        	{
                    System.out.println(f.getMessage());
                }  
	        }
		if(e.getSource() == b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
		}
		if(e.getSource() == b3)
		{
			Frontpagee ab = new Frontpagee();
			ab.setVisible(true);
		}
	}


}

public class Signin
{
	public static void main(String[] args) 
	{
		Signinn ab = new Signinn();
	}

}