package employee;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ForgetPassword implements ActionListener {

	JFrame f;
	JTextField t,t2,t3;
	JLabel l,l1,l2,l3,l4,l5;
	JButton b,b1,b2;
	
	ForgetPassword(){
		f=new JFrame();
		f.setBackground(Color.green);
		f.setLayout(null);
		
		
		l5=new JLabel();
		l5.setBounds(0,0,500,500);
		l5.setLayout(null);
		ImageIcon img=new ImageIcon();
		l5.setIcon(img);
		
		
		l=new JLabel("Id");
		l.setVisible(true);
		l.setBounds(50,200,50,30);
		l.setForeground(Color.white);
		l5.add(l);
		f.add(l5);
		l.setVisible(false);
		
		l1=new JLabel("Nick Name");
		l1.setBounds(50,50,150,30);
		l1.setForeground(Color.white);
		l5.add(l1);
		
		
		l2=new JLabel("New password");
		l2.setBounds(50,250,200,30);
		l2.setForeground(Color.white);
		l2.setVisible(false);
		l5.add(l2);
		
		l3=new JLabel("Confirm password");
		l3.setBounds(50,300,250,30);
		l3.setForeground(Color.white);
		l3.setVisible(false);
		l5.add(l3);
		
		
		t=new JTextField();
		t.setBounds(250,50,150,30);
		l5.add(t);
		
		l4=new JLabel("admin@123");
		l4.setBounds(300,200,150,30);
		l4.setForeground(Color.white);
		l4.setVisible(false);
		l5.add(l4);
		
		t2=new JTextField();
		t2.setBounds(300,250,150,30);
		t2.setVisible(false);
		l5.add(t2);
		
		t3=new JTextField();
		t3.setBounds(300,300,150,30);
		t3.setVisible(false);
		l5.add(t3);
		
		
		b=new JButton("Search");
		b.setBounds(250,100,100,30);
		b.addActionListener(this);
		l5.add(b);
		
		b1=new JButton("Submit");
		b1.setBounds(120,370,100,30);
		b1.addActionListener(this);
		l5.add(b2);
		b1.setVisible(false);
		
		
		b2=new JButton("Cancel");
		b2.setBounds(260,370,100,30);
		b2.addActionListener(this);
		l5.add(b2);
		b2.setVisible(false);
		
		
		f.setSize(500,500);
		f.setLocation(300,50);
		f.setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b2) {
			f.setVisible(false);
			Login l=new Login();
			
		}
		if(ae.getSource()==b) {
			l.setVisible(true);
			l2.setVisible(true);
			l3.setVisible(true);
			l4.setVisible(true);
			b1.setVisible(true);
			b2.setVisible(true);
			
		}
	}

	public static void main(String args[]) {
		ForgetPassword f=new ForgetPassword();
	}
}
