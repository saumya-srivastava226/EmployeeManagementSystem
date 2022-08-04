package employee;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.*;

public class Add_Employee implements ActionListener {
	
	
	
	
	
	JFrame f;
	JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1;
	JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
	JButton b,b1,b2,b3;
	public int count=0;
	public static InputStream is,is1;
	
	
	public static File file,compressedImageFile;
	public static Image scaled;
	private File chooseFile;
	private String imageString;
	public static ByteArrayOutputStream boas;
	
	
	Add_Employee(int i){
		
	}
    Add_Employee(){
    	
    	f=new JFrame("Add Employee");
    	f.setBackground(Color.WHITE);
    	f.setLayout(null);
    	
    	
    	id15=new JLabel();
    	id15.setBounds(0,0,900,700);
    	id15.setLayout(null);
    	ImageIcon img=new ImageIcon("F:\\Workspace\\Employee Management System\\src\\employee\\icons\\addEmploye.jpg");
	    id15.setIcon(img);
	    
	    
	    id8=new JLabel("New Employee Detail");
	    id8.setBounds(320,30,500,50);
	    id8.setFont(new Font("serif",Font.ITALIC,25));
	    id8.setForeground(Color.black);
	    id15.add(id8);
	    f.add(id15);
	    
	    id1=new JLabel("Name");
	    id1.setBounds(50,150,100,30);
	    id15.add(id1);
	    
	    t1=new JTextField();
	    t1.setBounds(200,150,150,30);
	    id15.add(t1);
	    
	    
	    id2=new JLabel("Father's Name");
	    id2.setBounds(400,150,200,30);
	    id15.add(id2);
	    
	    t2=new JTextField();
	    t2.setBounds(600,150,150,30);
	    id15.add(t2);
	    
	    
	    id3=new JLabel("Age");
	    id3.setBounds(50,200,100,30);
	    id15.add(id3);
	    
	    t3=new JTextField();
	    t3.setBounds(200,200,150,30);
	    id15.add(t3);
	    
	    
	    id4=new JLabel("Date Of Birth");
	    id3.setBounds(400,200,200,30);
	    id15.add(id4);
	    
	    t4=new JTextField();
	    t4.setBounds(600,200,150,30);
	    id15.add(t4);
	    
	    
	    id5=new JLabel("Address");
	    id5.setBounds(50,250,100,30);
	    id15.add(id5);
	    
	    t5=new JTextField();
	    t5.setBounds(200,250,150,30);
	    id15.add(t5);
	    
	    id6=new JLabel("Phone");
	    id6.setBounds(400,250,100,30);
	    id15.add(id6);
	    
	    t6=new JTextField();
	    t6.setBounds(600,250,150,30);
	    id15.add(t6);
	    
	    id7=new JLabel("EmailID");
	    id7.setBounds(50,300,100,30);
	    id15.add(id7);
	      
	    t7=new JTextField();
	    t7.setBounds(200,300,150,30);
	    id15.add(t7);
	    
	    id9=new JLabel("Education");
	    id9.setBounds(400,300,100,30);
	    id15.add(id9);
	    
	    t8=new JTextField();
	    t8.setBounds(600,300,150,30);
	    id15.add(t8);
	    
	    
	    id10=new JLabel("Job Post");
	    id3.setBounds(50,350,100,30);
	    id15.add(id10);
	    
	    t9=new JTextField();
	    t9.setBounds(200,350,150,30);
	    id15.add(t9);
	    
	    
	    id11=new JLabel("Aadhar Num");
	    id11.setBounds(400,350,100,30);
	    id15.add(id11);
	    
	    t10=new JTextField();
	    t10.setBounds(600,350,150,30);
	    id15.add(t10);
	    
	    id12=new JLabel("Employee ID");
	    id12.setBounds(50,400,100,30);
	    id15.add(id12);
	    
	    t11=new JTextField();
	    t11.setBounds(200,400,150,30);
	    id15.add(t11);
	    
	    
    	lab=new JLabel();
    	lab.setBounds(200,450,250,200);
    	id15.add(lab);
    	
    	lab1=new JLabel("");
    	lab1.setBounds(600,450,250,200);
    	id15.add(lab1);
    	
    	b=new JButton("Submit");
    	b.setBounds(250,550,150,40);
    	b.setBackground(Color.black);
    	b.setForeground(Color.white);
    	
    	id15.add(b);
    	
    	b1=new JButton("Cancel");
    	b1.setForeground(Color.white);
    	b1.setBackground(Color.black);
    	b1.setBounds(450,550,150,40);
    	id15.add(b1);
    	
    	b.addActionListener(this);
    	b1.addActionListener(this);
    	
    	f.setVisible(true);
    	f.setSize(900, 700);
    	f.setLocation(400, 150);
    	
    	
    	
    	
    }//constructor
    
    public void actionPerformed( ActionEvent ae) {
    	String a=t1.getText();
    	String bb=t2.getText();
    	String  c=t3.getText();
    	String d=t4.getText();
    	String e=t5.getText();
    	String ff=t6.getText();
    	String g=t7.getText();
    	String h=t8.getText();
    	String i=t9.getText();
    	String j=t10.getText();
    	String k=t11.getText();
    	
    	
    	if(ae.getSource()==b) {
    		try {
    			Conn cc=new Conn();
    			String q="insert into employes values('\"+a+\"','\"+bb+\"','\"+c+\"','\"+d+\"','\"+e+\"','\"+ff+\"','\"+g+\"','\"+h+\"','\"+i+\"','\"+j+\"','\"+k+\"')";
    		    cc.stmt.executeQuery(q);
    		    JOptionPane.showMessageDialog(null, "Details Succesfully Added");
    		    f.setVisible(false);
    		    new Details();
    		
    		}
    		catch(Exception ee) {
    			System.out.println("The error is:"+ee);
    		}
    	}
    	else if(ae.getSource()==b1) {
    		f.setVisible(false);
    		new Details();
    	}
    	
    	
    	
    }
    public static void main(String args[]) {
    	new Add_Employee();
    }
    
    
}// class
