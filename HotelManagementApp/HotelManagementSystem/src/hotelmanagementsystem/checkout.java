package hotelmanagementsystem;

import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class checkout extends JFrame {
    checkout(){

        Choice ccustomer;
        JLabel ilblroomnumber,iblcheckintime,iblcheckouttime;
        JButton checkout,back;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("Checkout");
        text.setBounds(100,20,100,30);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(text);

        JLabel lblid = new JLabel("Customer Id");
        lblid.setBounds(30,80,100,30);
        lblid.setForeground(Color.BLACK);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(lblid);

        ccustomer = new Choice();
        ccustomer.setBounds(150,80,150,25);
        add(ccustomer);
        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("SELECT * From customer");
            while (rs.next()) {
                ccustomer.add(rs.getString("Number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        JLabel iblroom = new JLabel("Ibloom");
        iblroom.setBounds(30,130,100,30);
        add(iblroom);

        ilblroomnumber = new JLabel();
        ilblroomnumber.setBounds(150,130,100,30);
        add(ilblroomnumber);

        JLabel iblcheckin = new JLabel("Checkin Time");
        iblroom.setBounds(30,180,100,30);
        add(iblcheckin);

        iblcheckintime = new JLabel();
        iblcheckintime.setBounds(150,130,100,30);
        add(ilblroomnumber);

        JLabel iblcheckout = new JLabel("Checkout Time");
        iblroom.setBounds(30,230,100,30);
        add(iblcheckout);

        Date date = new Date();
        iblcheckouttime = new JLabel(""+date);
        iblcheckintime.setBounds(150,230,170,30);
        add(iblcheckouttime);

        checkout = new JButton("Checkout");
        checkout.setBackground(Color.GRAY);
        checkout.setForeground(Color.BLACK);
        checkout.setBounds(30,280,120,30);
        add(checkout);

        back = new JButton("BACK");
        back.setBackground(Color.GRAY);
        back.setForeground(Color.BLACK);
        back.setBounds(170,280,120,30);
        add(back);

        setBounds(300,200,800,400);
        setVisible(true);


    }


    public static void main(String[] args) {
        new checkout();
    }
}
