package JAVAAA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



class Payy implements ActionListener {
    JFrame f;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    JButton b1, b2,b3;
    final URI uri = new URI("https://www.hdfcbank.com/personal/pay/money-transfer");

    Payy() throws Exception
    {
    	
        f = new JFrame("Payment");
        l1 = new JLabel("EVENT MANAGMENT SYSTEM");
        l2 = new JLabel("AMOUNT TO BE PAID:-");
        l3 = new JLabel("CLICK ON BUTTON TRANFER MONEY TO GO TO PAYMENT");
        l4 = new JLabel("ACCOUNT NO:-1275786598024524");
        l5 = new JLabel("IFSC CODE:-A345GY75F4R");

        b1 = new JButton("total amount");
        b2 = new JButton("CANCEL");
        b3 = new JButton("TRANSFER MONEY");
        
        //l2.setText();

        l1.setFont(new Font("Serif", Font.PLAIN, 35));
        l2.setFont(new Font("Serif", Font.PLAIN, 20));
        l3.setFont(new Font("Serif", Font.PLAIN, 15));
        l4.setFont(new Font("Seriffff", Font.PLAIN, 25));
        l5.setFont(new Font("Seriffff", Font.PLAIN, 25));

        t1 = new JTextField();

        l1.setBounds(130,30,600,30);
        l2.setBounds(200,150,400,30);
        l3.setBounds(200,180,500,30);
        l4.setBounds(200,210,500,30);
        l5.setBounds(200,240,500,30);
        t1.setBounds(450,150,200,30);


        b1.setBounds(250,460,150,30);
        b2.setBounds(430,460,100,30);
        b3.setBounds(330,500,150,30);


        f.add(l1);
        f.add(l2);
        f.add(l1);
        f.add(l4);
        f.add(l5);
        f.add(t1);

        f.add(b1);
        f.add(b2);
        f.add(b3);


        f.getContentPane().setBackground(Color.orange);
        f.setLayout(null);
        f.setSize(800,600);
        f.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
    	Connection c = null;
		Statement stmt = null;
        if(e.getSource() == b1)
        {
            	try 
	        	{
	        		Class.forName("org.postgresql.Driver");
	   	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Rushi123");
	   	         System.out.println("Opened database successfully");
	   	         stmt =c.createStatement();;
	            String str = "select total from final_selection_price;";
	            ResultSet rs = stmt.executeQuery(str);
	            System.out.println(rs);

	            while (rs.next()) {
	            String totalpay = rs.getString("total");
	            t1.setText(totalpay);
             //   f.setVisible(false);
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
        if(e.getSource() == b3)
        {
        	if (Desktop.isDesktopSupported()) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(uri);
					JOptionPane.showMessageDialog(f,"Amount PAID Successfully ...");
				} catch (Exception ex) {
					
				}
			}
        }
    }
}

public class Pay
{
    public static void main(String[] args) {
      try {
    	Payy p = new Payy();
      }
      catch(Exception ex) 
      {
      }
      }
    }