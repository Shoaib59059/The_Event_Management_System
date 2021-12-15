package Project_by_Shoaib_Akhtar;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;    

class Frontpagee implements ActionListener
{
	JFrame f ;
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3,b4,b5;
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
		b5 = new JButton("REGISTER");
		t1 = new JTextField();
		t2 = new JTextField();

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);

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

		f.getContentPane().setBackground(Color.orange);
		f.setLayout(null);
		f.setSize(800,600);
		f.setVisible(true);
	}
	 public void actionPerformed(ActionEvent e)
	 {

		 if (e.getSource() == b1)
		 {


			 if(t1.getText().equals(""))
			 {
				 JOptionPane.showMessageDialog(f,"Please Enter Your Email !");
			 }
			 else if(t2.getText().equals("") )
			 {
				 JOptionPane.showMessageDialog(f,"Please Enter Your Password !!!");
			 }
			 else
			 {
					// VALIDATE Username and Password in DATABASE and then call below line to LOG INTO the system
				 // if user name and password matched -> LOGIN
				 // else -> put a message wrong Credentials
			 }
			 // VALIDATE Username and Password in DATABASE and then call below line to LOG INTO the system
			 Homepagee abc = new Homepagee();
		 }

		 if (e.getSource() == b2)
		 {

			 t1.setText("");
			 t2.setText("");
		 }

		 if (e.getSource() == b3)
		 {
			 Aboutt abb = new Aboutt();
			 abb.setVisible(true);
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

	 }
	
	

}

public class Frontpage
{
	public static void main(String[] args) 
	{
		Frontpagee ab = new Frontpagee();
	}

}