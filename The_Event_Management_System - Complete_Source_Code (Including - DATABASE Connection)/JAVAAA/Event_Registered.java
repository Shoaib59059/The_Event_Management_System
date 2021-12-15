package JAVAAA;

import java.awt.*;
import javax.swing.*;
 //import JAVAAA.Frontpagee;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Event_Registeredd implements ActionListener
{
	JFrame f ;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b1,b2;
	JTextField t1,t2,t3,t4,t5,t6;

	public Event_Registeredd()
	{
		 f = new JFrame("Front page");
		l1 = new JLabel("EVENT MANAGMENT SYSTEM");
		l7 = new JLabel("EVENT_TYPE:-");
		l2 = new JLabel("VENUE:-");
		l8 = new JLabel("FOOD:-");
		l3 = new JLabel("SUBEVENT:-");
		l5 = new JLabel("Total PEOPLE:-");
		l6 = new JLabel("DATE:-");
		l4 = new JLabel();
		l4.setText("EVENTS YOU HAVE REGISTERD ARE:-");
		l1.setFont(new Font("Serif", Font.PLAIN, 35));
		l4.setFont(new Font("Serif", Font.PLAIN, 20));
		l7.setFont(new Font("Serif", Font.PLAIN, 18));
		l2.setFont(new Font("Serif", Font.PLAIN, 18));
		l8.setFont(new Font("Serif", Font.PLAIN, 18));
		l3.setFont(new Font("Serif", Font.PLAIN, 18));
		l5.setFont(new Font("Serif", Font.PLAIN, 18));
		l6.setFont(new Font("Serif", Font.PLAIN, 18));
	//	b1.setFont(new Font("Serif", Font.PLAIN, 18));
		b1 = new JButton("REGISTERED EVENTS");
		b2 = new JButton("Go back");
		b1.addActionListener(this);
		b2.addActionListener(this);
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();

		l1.setBounds(130,30,600,30);
		l4.setBounds(180,80,370,30);
		l7.setBounds(150,200,200,30);
		l2.setBounds(150,240,200,30);
		l8.setBounds(150,280,200,30);
		l3.setBounds(150,320,200,30);
		l5.setBounds(150,360,200,30);
		l6.setBounds(150,400,200,30);
		t1.setBounds(350,200,150,30);
		t2.setBounds(350,240,150,30);
		t3.setBounds(350,280,150,30);
		t4.setBounds(350,320,150,30);
		t5.setBounds(350,360,150,30);
		t6.setBounds(350,400,150,30);
		b1.setBounds(180,450,200,30);
		b2.setBounds(410,450,100,30);
		
		
		f.add(l1);
		f.add(b1);
		f.add(b2);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(t1);
		f.add(t2);
		f.add(l6);
		f.add(l5);
		f.add(l7);
		f.add(l8);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);

		
		
		


		f.getContentPane().setBackground(Color.orange);
		f.setLayout(null);
		f.setSize(800,600);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
	/*	if(e.getSource() == b2)
		{
			Homepagee abb = new Homepagee();
			abb.setVisible(true);
		}*/
		Connection c = null;
		Statement stmt = null;
	        if (e.getSource() == b1)
	        {   
	        	try 
	        	{
	        		Class.forName("org.postgresql.Driver");
	   	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Rushi123");
	   	         System.out.println("Opened database successfully");
	   	         stmt =c.createStatement();
	            String str = "select event_type,venue,food,subevent,total_people,date from final_selection";
	            ResultSet rs = stmt.executeQuery(str);
	            System.out.println(rs);

	            while (rs.next()) {
	            String event = rs.getString("event_type");
	            t1.setText(event);
	            String venue = rs.getString("venue");
	            t2.setText(venue);
	            String food = rs.getString("food");
	            t3.setText(food);
	            String subevent = rs.getString("subevent");
	            t4.setText(subevent);
	            String total_people = rs.getString("total_people");
	            t5.setText(total_people);
	            String date = rs.getString("date");
	            t6.setText(date);
	        	}
	        	}
	        	catch (Exception f)
	        	{
                    System.out.println(f.getMessage());
                }  
	        }
	if(e.getSource() == b2)
		{
			f.setVisible(false);
		}
	}


}

public class Event_Registered
{
	public static void main(String[] args) 
	{
		Event_Registeredd ab = new Event_Registeredd();
	}

}