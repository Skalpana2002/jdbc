package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Dynamic_updation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		PreparedStatement ps = con.prepareStatement("update student set name=? where age=?");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter new name");
		String name=sc.next();
		System.out.println("enter age");
		int age=sc.nextInt();
		ps.setString(1,name);
		ps.setInt(2, age);
		ps.executeUpdate();
		con.close();
		
	}

}
