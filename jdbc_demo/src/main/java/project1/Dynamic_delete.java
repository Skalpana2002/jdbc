package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Dynamic_delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		PreparedStatement ps = con.prepareStatement("delete from student where age=?");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		ps.setInt(1, age);
		ps.executeUpdate();
		con.close();
		
		
	}

}
