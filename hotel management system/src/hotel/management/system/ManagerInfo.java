
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;  
import net.proteanit.sql.*;

public class ManagerInfo extends JFrame implements ActionListener{
    JTable table;
    JButton back;
    
    ManagerInfo(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        
        
        JLabel i5 = new JLabel("Name");
        i5.setBounds(40,10,100,20);
        add(i5);
        
        JLabel i4 = new JLabel("Age");
        i4.setBounds(170,10,100,20);
        add(i4);
        
        JLabel i6 = new JLabel("Gender");
        i6.setBounds(290,10,100,20);
        add(i6);
        
        JLabel i7 = new JLabel("Job");
        i7.setBounds(400,10,100,20);
        add(i7);
        
        JLabel i8 = new JLabel("Salary");
        i8.setBounds(540,10,100,20);
        add(i8);
        
        JLabel i9 = new JLabel("Phone");
        i9.setBounds(670,10,100,20);
        add(i9);
        
        JLabel i10 = new JLabel("Email");
        i10.setBounds(790,10,100,20);
        add(i10);
        
        JLabel i11 = new JLabel("Aadhar");
        i11.setBounds(910,10,100,20);
        add(i11);
        
        
        
        
        
        table = new JTable();
        table.setBounds(0,40,1000,400);
        add(table);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee where job ='Manager'");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            e.printStackTrace();
        }
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(420,500,120,40);
        add(back);
        
        setBounds(300,200,1000,600);
        setVisible(true);
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
            setVisible(false);
            new Reception();
        }
    
    public static void main(String[] args){
        new ManagerInfo();
    }
}
