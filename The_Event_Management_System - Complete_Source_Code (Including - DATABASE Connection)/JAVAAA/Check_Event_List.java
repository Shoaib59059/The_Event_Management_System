package JAVAAA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Check_Event  implements ActionListener
{
    JFrame f;
    JLabel l1, l2,l3,l4,l5,l6,l7;
    JButton b1;
    Check_Event()
    {
        f = new JFrame("Check Event List");

        l1 = new JLabel("EVENT MANAGEMENT SYSTEM");
        l2 = new JLabel("Here is the list of events which we organise");
        l3 = new JLabel("Birthday Party");
        l4 = new JLabel("Marriage Ceremony");
        l5 = new JLabel("Engagement Ceremony");
        l6 = new JLabel("Family Function");
        l7 = new JLabel("Reunion Party");
        b1 = new JButton("Go back");
        l1.setFont(new Font("Serif", Font.PLAIN, 35));
        l2.setFont(new Font("Serif", Font.PLAIN, 30));

        l3.setFont(new Font("Serif", Font.PLAIN, 24));
        l4.setFont(new Font("Serif", Font.PLAIN, 24));
        l5.setFont(new Font("Serif", Font.PLAIN, 24));
        l6.setFont(new Font("Serif", Font.PLAIN, 24));
        l6.setFont(new Font("Serif", Font.PLAIN, 24));
        l7.setFont(new Font("Serif", Font.PLAIN, 24));

        l1.setBounds(130,30,600,30);
        l2.setBounds(140,100,600,35);
//        l3.setBounds(430,250,220,30);

        l3.setBounds(310,170,600,40);
        l4.setBounds(310,210,600,40);
        l5.setBounds(310,250,600,40);
        l6.setBounds(310,290,600,40);
        l7.setBounds(310,330,600,40);
        b1.setBounds(300,450,100,30);
        b1.addActionListener(this);
/*        l8.setBounds(130,180,600,10);
        l9.setBounds(130,190,600,10);*/

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(b1);
/*        f.add(l8);
        f.add(l9);*/

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
        }
    }

}


public class Check_Event_List
{
    public static void main(String[] args)
    {
        Check_Event c1 = new Check_Event();
    }

}
