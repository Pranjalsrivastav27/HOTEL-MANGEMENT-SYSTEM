
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;  
import net.proteanit.sql.*;

public class Department extends JFrame implements ActionListener{
    JTable table;
    JButton back;
    
    Department(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        
        
        JLabel i5 = new JLabel("Department");
        i5.setBounds(180,10,100,20);
        add(i5);
        
        JLabel i4 = new JLabel("Budget");
        i4.setBounds(420,10,100,20);
        add(i4);
        
       
        
        
        table = new JTable();
        table.setBounds(0,50,500,350);
        add(table);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from department");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            e.printStackTrace();
        }
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(280,400,120,40);
        add(back);
        
        setBounds(400,200,700,480);
        setVisible(true);
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
            setVisible(false);
            new Reception();
        }
    
    public static void main(String[] args){
        new Department();
    }
}
