package JAVAAA;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;   
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Aboutt /*extends JFrame*/ implements ActionListener
{

	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JButton b1;
	JFrame f;

	public Aboutt()
	{
		f = new JFrame("About");
		l1 = new JLabel("ABOUT US");
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel();
		l6 = new JLabel();
		l7 = new JLabel();
		l8 = new JLabel();
		l9 = new JLabel();
		b1 = new JButton("GO BACK");
		l2.setText("1) 	We are having an experince of 10 years and are trust worthy");
		l3.setText("2) 	We have a vast vendor network of Hotels and partners who ");
		l4.setText("help us provide the best and most cost effective event");
		l5.setText("services to our clients");
		l6.setText("3) We follow safety guidlines from governament in preventing ");
		l7.setText("covid transmission");
		l8.setText("4) At last trust us and book an event in our website which shows");
		l9.setText("you the difference from others which you won't be regretted");
		l1.setFont(new Font("Serif", Font.PLAIN, 35));
		l2.setFont(new Font("Seriffff", Font.PLAIN, 20));
		l3.setFont(new Font("Seriffff", Font.PLAIN, 20));
		l4.setFont(new Font("Seriffff", Font.PLAIN, 20));
		l5.setFont(new Font("Seriffff", Font.PLAIN, 20));
		l6.setFont(new Font("Seriffff", Font.PLAIN, 20));
		l7.setFont(new Font("Seriffff", Font.PLAIN, 20));
		l8.setFont(new Font("Seriffff", Font.PLAIN, 20));
		l9.setFont(new Font("Seriffff", Font.PLAIN, 20));
		b1.addActionListener(this);

		l1.setBounds(290,30,200,30);
		l2.setBounds(120,100,600,30);
		l3.setBounds(120,150,600,25);
		l4.setBounds(145,170,600,25);
		l5.setBounds(145,190,600,25);
		l6.setBounds(120,240,600,25);
		l7.setBounds(145,260,600,25);
		l8.setBounds(120,310,600,25);
		l9.setBounds(145,330,600,25);
		b1.setBounds(330,450,100,30);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(b1);
		

		f.getContentPane().setBackground(Color.orange);
		f.setLayout(null);
		f.setSize(800,600);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			f.setVisible(false);
		//	Frontpagee ab = new Frontpagee();
			// ab.setVisible(true);
		}
	}
}

public class About 
{
	public static void main(String[] args) 
	{
		Aboutt ab = new Aboutt();
		
	}

}