package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Inserting_values {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load and register class is present inside java.lang package
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		
		//create a statement
		Statement st=con.createStatement();
		
		st.execute("insert into student values(1,'raghu',23)");
		st.execute("insert into student values(2,'rekha',21)");
		st.execute("insert into student values(3,'roopa',25)");
		System.out.println("value inserted");
		
		con.close();
	}

}
