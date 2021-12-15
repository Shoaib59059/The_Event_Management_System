package Project_by_Shoaib_Akhtar;


import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;    

class Homepagee implements ActionListener
{
	JFrame f ;
	JLabel l1,l2,l3,l4,l5;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;

	public Homepagee()
	{
		 f = new JFrame("Home page");
		l1 = new JLabel("EVENT MANAGEMENT SYSTEM");
		l2 = new JLabel();
		l3 = new JLabel("WELCOME");
		l4 = new JLabel();
		l5 = new JLabel();
		l2.setText("WELCOME");
		l4.setText("You have logged in succesfully");
		l5.setText("Please continue with Registration");
		l1.setFont(new Font("Serif", Font.PLAIN, 35));
		l2.setFont(new Font("Serif", Font.PLAIN, 20));
		l3.setFont(new Font("Serif", Font.PLAIN, 25));
		l4.setFont(new Font("Serif", Font.PLAIN, 25));
		l5.setFont(new Font("Serif", Font.PLAIN, 25));
		b1 = new JButton("CHECK EVENT LIST");
		b2 = new JButton("REGISTER AN EVENT");
		b3 = new JButton("EVENTS YOU\nHAVE REGISTERED");
		b3.setFont(new Font("Serif", Font.PLAIN, 10));
		b4 = new JButton("PAY");
		b5 = new JButton("UPDATE EVENTS");
		b6 = new JButton("HOME");
		b7 = new JButton("ABOUT");
		b8 = new JButton("CONTACT US");
		b9 = new JButton("LOG OUT");
		l1.setBounds(130,30,600,30);
		l2.setBounds(30,120,170,30);
		l3.setBounds(430,250,220,30);
		l4.setBounds(340,280,350,30);
		l5.setBounds(340,310,350,30);
		b1.setBounds(30,220,170,30);
		b2.setBounds(30,270,170,30);
		b3.setBounds(30,320,170,30);
		b4.setBounds(30,420,170,30);
		b5.setBounds(30,370,170,30);
		b6.setBounds(250,120,100,30);
		b7.setBounds(370,120,100,30);
		b8.setBounds(490,120,120,30);
		b9.setBounds(630,120,120,30);
		f.add(l1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);

		f.getContentPane().setBackground(Color.orange);
		f.setLayout(null);
		f.setSize(800,600);
		f.setVisible(true);



	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		/*		if (e.getSource() == b1)
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
		}*/

		if (e.getSource() == b1)
		{
			// Check Event List and DEtails --simple page
			Check_Event c1 = new Check_Event();

		}

		if (e.getSource() == b2)
		{
			Register_an_Event r1 = new Register_an_Event();
		}

		if (e.getSource() == b3) {
			Register_an_Event r1 = new Register_an_Event();
		}




		if (e.getSource() == b4)
		{
			pay p = new pay();
		}



		if (e.getSource() == b5)
		{
			Signinn abc = new Signinn();
		}

		if (e.getSource() == b6)
		{
					// homepage
			f.setVisible(false);
			Homepagee h1 = new Homepagee();

		}
		if (e.getSource() == b7)
		{
			Aboutt a1 = new Aboutt();
		}


		if (e.getSource() == b8)
		{
			try {
				Contactt abc = new Contactt();
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
		if (e.getSource() == b9)
		{
			/// log out button
			f.setVisible(false);

//			Signinn abc = new Signinn();
		}

	}
}

public class Homepage
{
	public static void main(String[] args) 
	{
		Homepagee ab = new Homepagee();
	}
}

