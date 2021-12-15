package Project_by_Shoaib_Akhtar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class already_registered_event implements ActionListener
{
    JFrame f ;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b2;
    JTextField t1,t2,t3,t4,t5,t6;
    //JOptionPane O1;
    //JComboBox c1,c2,c3,c4,c5;

    public  already_registered_event()
    {
        f = new JFrame("Registered Event");
        l1 = new JLabel("EVENT MANAGMENT SYSTEM");


//        l7 = new JLabel("FULL NAME:-");
        l7 = new JLabel("Event Type:-");

        l2 = new JLabel("Venue:-");
        l8 = new JLabel("Food:-");
        l3 = new JLabel("Sub-Event:-");
        l5 = new JLabel("No. of People");
        l6 = new JLabel("Date");
/*
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
        f.add(c4);*/




        l4 = new JLabel();
        l4.setText("ALREADY REGISTERED EVENT:-");


        l1.setFont(new Font("Serif", Font.PLAIN, 35));
        l4.setFont(new Font("Serif", Font.PLAIN, 20));
        l7.setFont(new Font("Serif", Font.PLAIN, 18));
        l2.setFont(new Font("Serif", Font.PLAIN, 18));
        l8.setFont(new Font("Serif", Font.PLAIN, 18));
        l3.setFont(new Font("Serif", Font.PLAIN, 18));
        l5.setFont(new Font("Serif", Font.PLAIN, 18));
        l6.setFont(new Font("Serif", Font.PLAIN, 18));

//        c1.setFont(new Font("Serif", Font.PLAIN, 18));


       // b1 = new JButton("REGISTER");
        b2 = new JButton("EXIT");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField("DD-MM-YYYY");

        //O1 = new JOptionPane("All fields are mandatory... Please Fill it..");

        l1.setBounds(130,30,600,30);
        l4.setBounds(200,100,400,30);
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


        //b1.setBounds(250,460,100,30);
        b2.setBounds(340,480,100,30);


        f.add(l1);
       // f.add(b1);
        f.add(b2);
        f.add(l2);
        f.add(l3);
        f.add(l4);

        f.add(t1);
        //f.add(t2);

        f.add(l6);
        f.add(l5);
        f.add(l7);
        f.add(l8);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);

        f.getContentPane().setBackground(Color.orange);
        f.setLayout(null);
        f.setSize(800,600);
        f.setVisible(true);

        //b1.addActionListener(this);
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

        if(e.getSource() == b2)
        {
            f.setVisible(false);
        }
    }


}

public class event_you_have_registered
{
    public static void main(String[] args)
    {
        already_registered_event ar = new already_registered_event();
    }
}