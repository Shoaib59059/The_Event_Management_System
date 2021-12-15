package Project_by_Shoaib_Akhtar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class pay implements ActionListener {
    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1;
    JButton b1, b2;

    pay()
    {
        f = new JFrame("Payment");
        l1 = new JLabel("EVENT MANAGMENT SYSTEM");
        l2 = new JLabel("AMOUNT TO BE PAID:-");

        b1 = new JButton("PAY NOW");
        b2 = new JButton("CANCEL");
        //l2.setText();

        l1.setFont(new Font("Serif", Font.PLAIN, 35));
        l2.setFont(new Font("Serif", Font.PLAIN, 20));

        t1 = new JTextField();

        l1.setBounds(130,30,600,30);
        l2.setBounds(200,150,400,30);
        t1.setBounds(450,150,200,30);


        b1.setBounds(250,460,100,30);
        b2.setBounds(430,460,100,30);


        f.add(l1);
        f.add(l2);
        f.add(t1);

        f.add(b1);
        f.add(b2);


        f.getContentPane().setBackground(Color.orange);
        f.setLayout(null);
        f.setSize(800,600);
        f.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            if(t1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(f,"Provide Amount from Database");
            }
            else
            {
                JOptionPane.showMessageDialog(f,"Amount PAID Successfully ...");
                f.setVisible(false);
            }
        }

        if(e.getSource() == b2)
        {
            f.setVisible(false);
        }
    }
}

public class Payment
{
    public static void main(String[] args) {
        pay p = new pay();
    }
}
