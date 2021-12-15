package JAVAAA;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;




class Register_an_Event implements ActionListener
{
    JFrame f ;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JButton b1,b2;
    JTextField t1,t2;//,t3,t4,t5,t6;
    JOptionPane O1;
    JComboBox c1,c2,c3,c4,c5,c6,c7,c8;

    public Register_an_Event()
    {
        f = new JFrame("Event Registration");
        l1 = new JLabel("EVENT MANAGMENT SYSTEM");


//        l7 = new JLabel("FULL NAME:-");
        l7 = new JLabel("EventType:-");

        l2 = new JLabel("Venue:-");
        l8 = new JLabel("Food:-");
        l3 = new JLabel("Sub-Event:-");
        l5 = new JLabel("No.of People:-");
        l6 = new JLabel("Date:-");

        String [] EventType = {"Birthday Party", "Marriage Ceremony", "Engagement Ceremony", "Family Function", "Reunion Party"};
        String [] Venue = {"Patna", "Delhi", "Hyderabad", "Chennai", "Mumbai"};
        String [] Food = {"East India Thali", "West Indian Thali", "South Indian Thali", "North Indian Thali"};
        String [] SubEvent = {"No Sub-Event", "Birthday Oil_bath_event", "Sangeet", "Mehendi Ritual", "Haldi Ritual"};
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

        String [] Event_Price = {"2000", "50000", "10000","5000", "3000"};
        String [] Venue_Price = {"5000", "15000", "10000","12000", "18000"};
        String [] Food_Price = {"500", "800", "600","400"};
        String [] SubEvent_Price = {"0", "2000", "5000","5000", "3000"};

        c5 = new JComboBox(Event_Price);
        c6 = new JComboBox(Venue_Price);
        c7 = new JComboBox(Food_Price);
        c8 = new JComboBox(SubEvent_Price);


        c5.setBounds(580,200,200,30);
        c6.setBounds(580,240,200,30);
        c7.setBounds(580,280,200,30);
        c8.setBounds(580,320,200,30);

        f.add(c5);
        f.add(c6);
        f.add(c7);
        f.add(c8);




        l4 = new JLabel();
        l4.setText("SELECT DETAILS FOR THE EVENT:-");
        l9 = new JLabel();
        l9.setText("PLEASE SELECT THE SAME INDEX NUMBER IN BOTH BOXES-");
        l10 = new JLabel();
        l10.setText("BECAUSE IT DISPLAYS COST OF CORRESPONDING VALUES.");


        l1.setFont(new Font("Serif", Font.PLAIN, 35));
        l4.setFont(new Font("Serif", Font.PLAIN, 20));
        l9.setFont(new Font("Serif", Font.PLAIN, 15));
        l10.setFont(new Font("Serif", Font.PLAIN, 15));
        l7.setFont(new Font("Serif", Font.PLAIN, 18));
        l2.setFont(new Font("Serif", Font.PLAIN, 18));
        l8.setFont(new Font("Serif", Font.PLAIN, 18));
        l3.setFont(new Font("Serif", Font.PLAIN, 18));
        l5.setFont(new Font("Serif", Font.PLAIN, 18));
        l6.setFont(new Font("Serif", Font.PLAIN, 18));

//        c1.setFont(new Font("Serif", Font.PLAIN, 18));


        b1 = new JButton("REGISTER");
        b2 = new JButton("Home");

        t1 = new JTextField();
        t2 = new JTextField("DD-MM-YYYY");


        O1 = new JOptionPane("All fields are mandatory... Please Fill it..");

        l1.setBounds(130,30,600,30);
        l4.setBounds(180,100,370,30);
        l9.setBounds(180,140,470,30);
        l10.setBounds(180,160,470,30);
        l7.setBounds(150,200,200,30);
        l2.setBounds(150,240,200,30);
        l8.setBounds(150,280,200,30);
        l3.setBounds(150,320,200,30);
        l5.setBounds(150,360,200,30);
        l6.setBounds(150,400,200,30);
        t1.setBounds(350,360,150,30);
        t2.setBounds(350,400,150,30);

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
        f.add(l9);
        f.add(l10);


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
        //	YourType varName = (YourType)c1.getSelectedItem();
        //	 object username = c1.getSelectedItem();
      //  	String value = c1.getSelectedItem().toString();
      //  	System.out.print(value);
        	Connection c = null;
    		Statement stmt = null;
    	        if (e.getSource() == b1)
    	        {   
    	        	try 
    	        	{
    	        	  	if( c1.getSelectedIndex()== c5.getSelectedIndex())
    	        		{
    	        			if( c2.getSelectedIndex()== c6.getSelectedIndex())
        	        		{
        	        			if( c3.getSelectedIndex()== c7.getSelectedIndex())
            	        		{
            	        			if( c4.getSelectedIndex()== c8.getSelectedIndex())
                	        		{
            	    	        		Class.forName("org.postgresql.Driver");
            	       	   	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Rushi123");
            	       	   	         System.out.println("Opened database successfully");
            	       	   	      String Event = c1.getSelectedItem().toString();
            	       	   	      String Venue = c2.getSelectedItem().toString();
            	       	   	      String Food = c3.getSelectedItem().toString();
            	       	   	      String Subevent = c4.getSelectedItem().toString();
            	       	   	      String Event_pay = c5.getSelectedItem().toString();
            	       	   	      String Total_people = t1.getText();
            	       	   	      int Total_peoplee=Integer.parseInt(Total_people);
            	       	   	      String Date = t2.getText();
            	       	   	      int Event_payy=Integer.parseInt(Event_pay);
            	       	   	      String Venue_pay = c6.getSelectedItem().toString();
            	       	   	      int Venue_payy=Integer.parseInt(Venue_pay);
            	       	   	      String Food_pay = c7.getSelectedItem().toString();
            	       	   	      int Food_payy=Integer.parseInt(Food_pay)*Total_peoplee;
            	       	   	      String Subevent_pay = c8.getSelectedItem().toString();
            	       	   	      int Subevent_payy=Integer.parseInt(Subevent_pay);
            	       	   	      int total = Event_payy+Venue_payy+Food_payy+Subevent_payy;
            	       		         stmt = c.createStatement();
            	       		       String sql = "insert into final_selection values('"+Event+"','"+Venue+"','"+Food+"','"+Subevent+"','"+Total_people+"','"+Date+"')";
            	       		       String sqll = "insert into final_selection_price values('"+Event_payy+"','"+Venue_payy+"','"+Food_payy+"','"+Subevent_payy+"','"+total+"')";
            	       		        stmt.executeUpdate(sql);
            	       		         stmt.executeUpdate(sqll);
            	       		         stmt.close();
            	       		         c.close();
                	        			JOptionPane.showMessageDialog(f,"you have succesfully registerd...");
                	        			
                	        		}
            	        		}
        	        		}
    	        		}
    	        		else
    	        		{
    	        			JOptionPane.showMessageDialog(f,"Please enter details correctly...");
    	        		}
    	 /*       		Class.forName("org.postgresql.Driver");
    	   	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Rushi123");
    	   	         System.out.println("Opened database successfully");
    	   	      String Event = c1.getSelectedItem().toString();
    	   	      String Venue = c2.getSelectedItem().toString();
    	   	      String Food = c3.getSelectedItem().toString();
    	   	      String Subevent = c4.getSelectedItem().toString();
    	   	      String Event_pay = c5.getSelectedItem().toString();
    	   	      int Event_payy=Integer.parseInt(Event_pay);
    	   	      String Venue_pay = c6.getSelectedItem().toString();
    	   	      int Venue_payy=Integer.parseInt(Venue_pay);
    	   	      String Food_pay = c7.getSelectedItem().toString();
    	   	      int Food_payy=Integer.parseInt(Event_pay);
    	   	      String Subevent_pay = c8.getSelectedItem().toString();
    	   	      int Subevent_payy=Integer.parseInt(Event_pay);
    		         stmt = c.createStatement();
    		  //       String sql = "insert into final_selection values('"+Event+"','"+Venue+"','"+Food+"','"+Subevent+"')";
    		         String sqll = "insert into final_selection_price values('"+Event_payy+"','"+Venue_payy+"','"+Food_payy+"','"+Subevent_payy+"')";
    		   //      stmt.executeUpdate(sql);
    		         stmt.executeUpdate(sqll);
    		         stmt.close();
    		         c.close();
    		     	if( c1.getSelectedIndex()== c5.getSelectedIndex())
	        		{
	        			if( c2.getSelectedIndex()== c6.getSelectedIndex())
    	        		{
    	        			if( c3.getSelectedIndex()== c7.getSelectedIndex())
        	        		{
        	        			if( c4.getSelectedIndex()== c8.getSelectedIndex())
            	        		{
            	        			JOptionPane.showMessageDialog(f,"you have succesfully registerd...");
            	        			
            	        		}
        	        		}
    	        		}
	        		}
	        		else
	        		{
	        			JOptionPane.showMessageDialog(f,"Please enter details correctly...");
	        		}
    		         
    		         Frontpagee ab = new Frontpagee();*/
    		/*     	if(e.getSource() == b1)
    				{
    					if(t1.getText().equals("") ||t2.getText().equals("") ||t3.getText().equals("") ||t4.getText().equals("") ||t5.getText().equals("") ||t6.getText().equals(""))
    					{
    						JOptionPane.showMessageDialog(f,"All fields are mandatory... Please Fill it..");
    					}
    					else
    					{
    						JOptionPane.showMessageDialog(f,"Successfully Registered...");
    						f.setVisible(false);
    					}

    				}*/
    	        	}
    	        	catch (Exception f)
    	        	{
                        System.out.println(f.getMessage());
                    }  
    	        }
        	/*
            if(t1.getText().equals("") ||t2.getText().equals(""))
            {
                JOptionPane.showMessageDialog(f,"All fields are mandatory... Please Fill it..");
            }
            else
            {
                JOptionPane.showMessageDialog(f,"Successfully Registered...");
                f.setVisible(false);
            }
            */

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


