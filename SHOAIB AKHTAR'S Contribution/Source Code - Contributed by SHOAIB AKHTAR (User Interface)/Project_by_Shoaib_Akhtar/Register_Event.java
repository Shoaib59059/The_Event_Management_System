package Project_by_Shoaib_Akhtar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*class Register_an_Event
{

}


public class Register_Event
{
    public static void main(String[] args) {

    }
}*/


class Register_an_Event implements ActionListener
{
    JFrame f ;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b1,b2;
    JTextField t1,t2;//,t3,t4,t5,t6;
    JOptionPane O1;
    JComboBox c1,c2,c3,c4,c5;

    public Register_an_Event()
    {
        f = new JFrame("Event Registration");
        l1 = new JLabel("EVENT MANAGMENT SYSTEM");


//        l7 = new JLabel("FULL NAME:-");
        l7 = new JLabel("Event Type:-");

        l2 = new JLabel("Venue:-");
        l8 = new JLabel("Food:-");
        l3 = new JLabel("Sub-Event:-");
        l5 = new JLabel("No. of People");
        l6 = new JLabel("Date");

        String [] EventType = {"• Birthday Party - ₹2,000", "• Marriage Ceremony - ₹50,000", "• Engagement Ceremony - ₹10,000", "• Family Function - ₹5,000", "• Reunion Party - ₹3,000"};
        String [] Venue = {"• Patna - ₹5,000", "• Delhi - ₹15,000", "• Hyderabad - ₹10,000", "• Chennai - ₹12,000", "• Mumbai - ₹18,000"};
        String [] Food = {"• East India Thali - ₹500", "• West Indian Thali - ₹800", "• South Indian Thali - ₹600", "• North Indian Thali - ₹400"};
        String [] SubEvent = {"• No Sub-Event - ₹0", "• Birthday–Oil_bath_event - ₹2,000", "• Sangeet - ₹5,000", "• Mehendi Ritual - ₹5,000", "• Haldi Ritual - ₹3,000"};
        c1 = new JComboBox(EventType);
        c2 = new JComboBox(Venue);
        c3 = new JComboBox(Food);
        c4 = new JComboBox(SubEvent);
        c1.setBounds(350,200,200,30);
        c2.setBounds(350,240,200,30);
        c3.setBounds(350,280,200,30);
        c4.setBounds(350,320,200,30);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);




        l4 = new JLabel();
        l4.setText("SELECT DETAILS FOR THE EVENT:-");


        l1.setFont(new Font("Serif", Font.PLAIN, 35));
        l4.setFont(new Font("Serif", Font.PLAIN, 20));
        l7.setFont(new Font("Serif", Font.PLAIN, 18));
        l2.setFont(new Font("Serif", Font.PLAIN, 18));
        l8.setFont(new Font("Serif", Font.PLAIN, 18));
        l3.setFont(new Font("Serif", Font.PLAIN, 18));
        l5.setFont(new Font("Serif", Font.PLAIN, 18));
        l6.setFont(new Font("Serif", Font.PLAIN, 18));

//        c1.setFont(new Font("Serif", Font.PLAIN, 18));


        b1 = new JButton("REGISTER");
        b2 = new JButton("CANCEL");

        t1 = new JTextField();
        t2 = new JTextField("DD-MM-YYYY");
/*        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();*/

        O1 = new JOptionPane("All fields are mandatory... Please Fill it..");

        l1.setBounds(130,30,600,30);
        l4.setBounds(180,100,370,30);
        l7.setBounds(150,200,200,30);
        l2.setBounds(150,240,200,30);
        l8.setBounds(150,280,200,30);
        l3.setBounds(150,320,200,30);
        l5.setBounds(150,360,200,30);
        l6.setBounds(150,400,200,30);
        t1.setBounds(350,360,150,30);
        t2.setBounds(350,400,150,30);
/*        t3.setBounds(350,280,150,30);
        t4.setBounds(350,320,150,30);
        t5.setBounds(350,360,150,30);
        t6.setBounds(350,400,150,30);*/
        b1.setBounds(250,460,100,30);
        b2.setBounds(430,460,100,30);


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
/*        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);*/

        f.getContentPane().setBackground(Color.orange);
        f.setLayout(null);
        f.setSize(800,600);
        f.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);

/*		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == b1)
			{

			}
		}*/

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            // after clicking on b1 -> before exiting the screen validate whether all text fields are filled or not
            if(t1.getText().equals("") ||t2.getText().equals(""))
            {
                JOptionPane.showMessageDialog(f,"All fields are mandatory... Please Fill it..");
            }
            else
            {
                JOptionPane.showMessageDialog(f,"Successfully Registered...");
                f.setVisible(false);
            }

            // USE JDBC concept and store all the data in CUSTOMER_DETAILS table ;
        }
        if(e.getSource() == b2)
        {
            f.setVisible(false);
        }
    }


}

public class Register_Event
{
    public static void main(String[] args)
    {
        Register_an_Event ab = new Register_an_Event();
    }

}