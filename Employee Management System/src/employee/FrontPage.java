package employee;
import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;
// We are going to use here swing and awt packages
public class FrontPage {
	JFrame f;
	JLabel id,l1;
	JButton b;
	FrontPage()
	{
		// create a Frame from javax.swing package 
		f=new JFrame("Employee Management System");
		f.setBackground(Color.red);
		f.setLayout(null);
		
		
		// USe image as a label here 
		// We can't directly use image, we need to convert them into ImageIcon object by passing image location in its constructor
		ImageIcon i1=new ImageIcon("F:\\Workspace\\Employee Management System\\src\\employee\\icons\\front.jpg");
		Image i2=i1.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		l1.setBounds(0,150,1460,530);
		f.add(l1);// Add the label component to the frame
		
		
		
		// Adding the button with event
		b=new JButton("CLICK HERE TO CONTINUE");
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		b.setBounds(500,600,300,70);
		//b.addActionListener(this);
		
		
		
		// We are creating this label and we are going to add button to this level
		// So that the button becomes visible
		
		id=new JLabel();
		id.setBounds(0,0,1460,750);
		id.setLayout(null);
		id.add(b);// Adding button to the label 
		f.add(id);// Adding that label to the frame
		
		JLabel lid=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		lid.setBounds(80,30,1500,100);
		lid.setFont(new Font("serif",Font.PLAIN,70));
		lid.setForeground(Color.RED);
		f.add(lid);
		
		// The whole color of the frame should be white
		f.getContentPane().setBackground(Color.WHITE);
		
		
		f.setVisible(true);
		f.setSize(1460,750);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		while(true) {
			lid.setVisible(false);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			lid.setVisible(true);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}// Constructor closing bracket
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			f.setVisible(false);
			Login l=new Login();// We are going to create this class
		}
	}
	public static void main(String args[]) {
		FrontPage fp=new FrontPage();
	}
}// class closing bracket
