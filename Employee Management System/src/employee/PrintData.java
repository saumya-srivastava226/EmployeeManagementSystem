package employee;
import java.awt.*;
import javax.swing.*;

import java.sql.*;
import java.awt.event.*;
public class PrintData implements ActionListener {
		
		JFrame f;
		JLabel id8,id,aid,id1,aid1,id2,aid2,id3,aid3,id4,aid4,id5,aid5,id6,aid6,id7,aid7,id9,id10,id11,id12,id13,id14,id15,id16,id17,lab;
		String empId, name,father,address,phone,email,education,post,age,dob,aadhar;
		JButton b1,b2;
		ImageIcon icon;
		
		
		PrintData(String e_id)
		{
			try {
				Conn con=new Conn();
				String str="select * from employee where empID='"+e_id+"'";
				ResultSet rs=con.stmt.executeQuery(str);
				
				while(rs.next()) {
					name=rs.getString("name");
					father=rs.getString("fname");
					age=rs.getString("age");
					dob=rs.getString("dob");
					address=rs.getString("address");
					phone=rs.getString("phone");
					email=rs.getString("email");
					education=rs.getString("education");
					post=rs.getString("post");
					aadhar=rs.getString("aadhar");
					empId=rs.getString("empID");
					
					
					
					
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			
			f=new JFrame();
			f.setVisible(true);
			
			f.setBackground(Color.white);
			f.setLayout(null);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			id9=new JLabel();
			id9.setBounds(0,0,600,700);
			id9.setLayout(null);
			ImageIcon img=new ImageIcon("F:\\Workspace\\Employee Management System\\src\\employee\\icons\\print.jpg");
			Image i1=img.getImage().getScaledInstance(600, 700, Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i1);
			id9.setIcon(i3);
			
			
			id8=new JLabel("Employee Details");
			id8.setBounds(50,10,250,30);
			f.add(id8);
			id9.add(id8);
			f.add(id9);
			
			id=new JLabel("Employee id");
			id.setBounds(50,70,120,30);
			id9.add(id);
			
			aid=new JLabel(empId);
			aid.setBounds(200,70,200,30);
			id9.add(aid);
			
			id1=new JLabel("Name :");
			id1.setBounds(50,120,100,30);
			id9.add(id1);
			
			aid1=new JLabel(name);
			aid1.setBounds(200,120,300,30);
			id9.add(aid1);
			
			id2=new JLabel("Father's Name");
			id2.setBounds(50,170,200,30);
			id9.add(id2);
			
			aid2=new JLabel(father);
			aid2.setBounds(200,170,300,30);
			id9.add(aid2);
			
			id3=new JLabel("Address:");
			id3.setBounds(50,220,100,30);
			id9.add(id3);
			
			aid3=new JLabel(address);
			aid3.setBounds(200,220,300,30);
			id9.add(aid3);
			
			
			id4=new JLabel("Phone Number:");
			id4.setBounds(50,270,100,30);
			id9.add(id4);
			
			aid4=new JLabel(phone);
			aid5.setBounds(200,270,300,30);
			id9.add(aid5);
			
			id5=new JLabel("Email:");
			id5.setBounds(50,320,100,30);
			id9.add(id5);
			
			aid5=new JLabel(email);
			aid5.setBounds(200,320,300,30);
			id9.add(aid5);
			
			id6=new JLabel("Eduaction");
			id6.setBounds(50,370,100,30);
			id9.add(id6);
			
			aid6=new JLabel(education);
			aid6.setBounds(200,370,200,30);
			id9.add(aid6);
			
			
			id7=new JLabel("JOB POST");
			id7.setBounds(50,420,100,30);
			id9.add(id7);
			
			aid7=new JLabel(post);
			aid7.setBounds(200,420,300,30);
			id9.add(aid7);
			
			
			b1=new JButton("Print");
			b1.setBackground(Color.black);
			b1.setForeground(Color.white);
			b1.setBounds(100,520,100,30);
			b1.addActionListener(this);
			id9.add(b1);
			
			b2=new JButton("Cancel");
			b2.setBackground(Color.black);
			b2.setForeground(Color.white);
			b2.setBounds(250,520,100,30);
			b2.addActionListener(this);
			id9.add(b2);
			
			
			
			
			 
			
		}
		
		
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()==b1) {
				JOptionPane.showMessageDialog(null, "Printed Successfully");
				f.setVisible(false);
				Details d=new Details();
			}
			if(ae.getSource()==b2) {
				f.setVisible(false);
				new View_Employee();
			}
		}
		public static void main(String args[]) {
			new PrintData("Print Data");
		}
		
		
		
}
