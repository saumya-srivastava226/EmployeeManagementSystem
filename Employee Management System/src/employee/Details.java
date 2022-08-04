package employee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Details implements ActionListener {
	JFrame f;
	JLabel l1,l2;
	JButton b1,b2,b3,b4;
	
	Details(){
		f=new JFrame("Employee Detail");
		f.setBackground(Color.WHITE);
		f.setLayout(null);
		
		
		l1=new JLabel();
		l1.setBounds(0,0,700,500);
		l1.setLayout(null);
		ImageIcon i1=new ImageIcon("F:\\Workspace\\Employee Management System\\src\\employee\\icons\\details.jpg");
		l1.setIcon(i1);
		f.add(l1);
		
		
		 l2=new JLabel("Employee details");
		 l2.setBounds(430,20,200,40);
		 l2.setFont(new Font("serif",Font.BOLD,25));
		 l2.setForeground(Color.BLACK);
		 l1.add(l2);
		 
		 b1=new JButton("ADD");
		 b1.setBounds(420,80,100,40);
		 b1.setFont(new Font("serif",Font.BOLD,25));
		 b1.addActionListener(this);
		 l1.add(b1);
		 
		 b2=new JButton("View");
		 b2.setBounds(530,80,100,40);
		 b2.setFont(new Font("serif",Font.BOLD,25));
		 b2.addActionListener(this);
		 l1.add(b2);
		 

		 b3=new JButton("Remove");
		 b3.setBounds(420,1400,100,40);
		 b3.setFont(new Font("serif",Font.BOLD,25));
		 b3.addActionListener(this);
		 l1.add(b3);
		 

		 b4=new JButton("Update");
		 b4.setBounds(530,80,100,40);
		 b4.setFont(new Font("serif",Font.BOLD,25));
		 b4.addActionListener(this);
		 l1.add(b4);
		 
		 f.setVisible(true);
		 f.setSize(700,500);
		 f.setLocation(450,200);
		 
		 
	    
		 
		
		 
		 
		 
		 
	}//constructor
	
	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource()==b1) {
			f.setVisible(false);
			new Add_Employee();
		}
		if(ae.getSource()==b2) {
			f.setVisible(false);
			new View_Employee();
		}
		if(ae.getSource()==b3) {
			f.setVisible(false);
			new RemoveEmployee();
			
		}
		if(ae.getSource()==b4) {
			f.setVisible(false);
			new UpdateEmployee("");
		}
	}
	public static void main(String args[]) {
		new Details();
	}
	
}//class details
