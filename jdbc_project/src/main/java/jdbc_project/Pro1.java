package jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Pro1 {
	public static void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	public static void register() throws ClassNotFoundException, SQLException {
		Pro1.getConnection();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project","root","root");
		PreparedStatement ps= con.prepareStatement("insert into user values(?,?,?,?,?)");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter user id");
		int id = sc.nextInt();
		System.out.println("enter user name");
		String name = sc.next();
		System.out.println("enter user phone");
		String phone = sc.next();
		System.out.println("enter user email");
		String email = sc.next();
		System.out.println("enter user password");
		String password = sc.next();
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, phone);
		ps.setString(4, email);
		ps.setString(5, password);
		ps.executeUpdate();
		con.close();
	}
	public static void view() throws SQLException, ClassNotFoundException {
		Pro1.getConnection();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from user");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
		con.close();
	}
	
	public static void login() throws ClassNotFoundException, SQLException {
		Pro1.getConnection();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project","root","root");
		PreparedStatement ps = con.prepareStatement("select * from user where email=? and  password=?");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter user email");
		String email = sc.next();
		System.out.println("enter user password");
		String password = sc.next();
		ps.setString(1, email);
		ps.setString(2, password);
		ps.executeQuery();
		con.close();
	}
	

}
