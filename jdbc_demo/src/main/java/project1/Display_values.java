package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Display_values {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery("select * from student");
//		
//		//process the result
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//		}
		
		ResultSet rs = st.executeQuery("select name,age from student");
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
		}
		con.close();
	}

}
