package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish connection
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		
		//create a statement
		Statement st= con.createStatement();
		
		//execute query
		st.execute
		("create table student(id integer,name varchar(20), age integer)");
		
		System.out.println("table created");
		
		//close connection
		con.close();
	}

}
