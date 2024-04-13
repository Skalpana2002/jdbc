package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Dynamic_insertion {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		PreparedStatement ps= con.prepareStatement("insert into student values(?,?,?)");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter student id");
		int id = sc.nextInt();
		System.out.println("enter student name");
		String name = sc.next();
		System.out.println("enter student age");
		int age = sc.nextInt();
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.executeUpdate();
		con.close();
	}

}
