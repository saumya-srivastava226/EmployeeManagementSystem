package employee;


// Establishing the database connection
import java.sql.*;
public class Conn {
	public Connection con;// Instance of interface Connection
	public Statement stmt;// Instance of interface Statement
	
	
	// We will create a constuctor of class
	public Conn() {
		try {// Register the drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB","root","SRIVASTAVa22#");
			stmt=con.createStatement();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	  
}
