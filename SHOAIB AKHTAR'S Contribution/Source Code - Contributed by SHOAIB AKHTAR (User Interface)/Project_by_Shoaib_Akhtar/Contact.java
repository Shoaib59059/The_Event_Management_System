package Project_by_Shoaib_Akhtar;
import java.awt.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;


class Contactt
{
	final URI uri = new URI("https://mail.google.com/mail/u/0/#inbox");
	final URI urii = new URI("https://www.facebook.com/profile.php?id=100009536612935");
	final URI uriii = new URI("https://www.instagram.com/rushi_dhawan/");
	JFrame f = new JFrame("Contact");
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JLabel l1 = new JLabel("MAIL ID:-");
	JLabel l2 = new JLabel("FACEBOOK:-");
	JLabel l3 = new JLabel("INSTAGRAM:-");
	JLabel l4 = new JLabel("PHONE NO:-");
	JLabel l5 = new JLabel("8639528981");
	JLabel l6 = new JLabel("CONTACT US:-");
	JLabel l7 = new JLabel("FOR MORE INFORMATION CONTACT US ON:-");
	Contactt() throws Exception
	{
		//		Contact ab = new Contact();

		l1.setFont(new Font("Serifff", Font.PLAIN, 20));
		l2.setFont(new Font("Serifff", Font.PLAIN, 20));
		l3.setFont(new Font("Serifff", Font.PLAIN, 20));
		l4.setFont(new Font("Serifff", Font.PLAIN, 20));
		l5.setFont(new Font("Serifff", Font.PLAIN, 20));
		l6.setFont(new Font("Serif", Font.PLAIN, 35));
		l7.setFont(new Font("Serif", Font.PLAIN, 25));
		b1.setText("www.gmail.com");
		b2.setText("www.facebook.com");
		b3.setText("www.instagram.com");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Desktop.isDesktopSupported()) {
					Desktop desktop = Desktop.getDesktop();
					try {
						desktop.browse(uri);
					} catch (Exception ex) {
					}
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Desktop.isDesktopSupported()) {
					Desktop desktop = Desktop.getDesktop();
					try {
						desktop.browse(urii);
					} catch (Exception ex) {
					}
				}
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Desktop.isDesktopSupported()) {
					Desktop desktop = Desktop.getDesktop();
					try {
						desktop.browse(uriii);
					} catch (Exception ex) {
					}
				}
			}
		});
		l6.setBounds(270,30,300,30);
		l7.setBounds(130,100,600,30);
		b1.setBounds(350,190,210,30);
		b2.setBounds(350,230,210,30);
		b3.setBounds(350,270,210,30);
		l1.setBounds(210,190,100,30);
		l2.setBounds(210,230,200,30);
		l3.setBounds(210,270,200,30);
		l4.setBounds(210,310,200,30);
		l5.setBounds(400,310,200,30);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.getContentPane().setBackground(Color.orange);
		f.setSize(800, 600);
		f.setLayout(null);
		f.setVisible(true);

	}
}


public class Contact
{
/*
	public Contact() throws Exception
	{
		Contactt c = new Contactt();
	}
*/

	public static void main(String[] args) throws Exception// throws Exception
	{
		Contactt c = new Contactt();
	}
}

