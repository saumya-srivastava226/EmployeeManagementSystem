package employee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class Login implements ActionListener  {
		JFrame f;
		JLabel l1,l2;
		JTextField t1;
		JPasswordField t2;
		JButton b1,b2;
		
		Login(){
			f=new JFrame("Login");
			f.setBackground(Color.WHITE);
			f.setLayout(null);
			
			
			l1=new JLabel("Username:");
			l1.setBounds(40,20,100,30);
			f.add(l1);
			
			
			l2=new JLabel("Password:");
			l2.setBounds(40,70,100,30);
			f.add(l2);
			//We have added labels now we need to add textfield and password field
			
			t1=new JTextField();
			t1.setBounds(150,20,150,30);
			f.add(t1);// We have added the textfield next to first label
			
			t2=new JPasswordField();
			t2.setBounds(150,70,150,30);
			f.add(t2);// we have added the password field next to password label
			
			
			
			
			
			// We are going to add one image in a label to make it look more realistic
			ImageIcon i1=new ImageIcon("F:\\Workspace\\Employee Management System\\src\\employee\\icons\\login.png");
			Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			JLabel l3=new JLabel(i3);
			l3.setBounds(350,5,150,150);
			f.add(l3);// Add the label to the frame
			
			
			// We are now going to write functionalities for the button
			b1=new JButton("Login");
			b1.setBounds(40,140,120,30);
			b1.setFont(new Font("serif",Font.BOLD,15));
			b1.addActionListener(this);
			b1.setBackground(Color.BLACK);
			b1.setForeground(Color.WHITE);
			f.add(b1);
			
			b2=new JButton();
			b2.setText("Cancel");
			b2.setBounds(180,140,120,30);
			b2.setFont(new Font("serif",Font.BOLD,15));
			b2.addActionListener(this);
			b2.setBackground(Color.BLACK);
			b2.setForeground(Color.WHITE);
			f.add(b2);
			
			
			
			
			f.getContentPane().setBackground(Color.WHITE);
			
			
			
			
			
			f.setSize(500,250);
			f.setLayout(null);
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}// constructor closing bracket
		
		public void actionPerformed(ActionEvent ae) {
			try {
				Conn c1=new Conn();
				String u=t1.getText();
				String v=t2.getText();
				
				String sql="select * from login where username='"+u+"' and password='"+v+"' ";
				
				ResultSet rs=c1.stmt.executeQuery(sql);
				if(rs.next()) {
					new Details().f.setVisible(true);
					f.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid Login");
					f.setVisible(false);
				}
				
			}
			catch(Exception e ) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		public static void main(String args[]) {
			new Login();
		}
		
		
		
}// class closing bracket
