package jdbc_project;

import java.sql.SQLException;
import java.util.Scanner;

public class Pro2 extends Pro1{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		boolean flag = false;
		for( ; !flag; )
		{
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			System.out.println("========================");
			int choose = sc.nextInt();
			switch(choose)
			{
				case 1:
				{
					Pro1.register();
					System.out.println("registration succesfull");
					System.out.println("========================");
					break;
				}
				case 2:
				{
						Pro1.login();
						System.out.println("========================");
						System.out.println("login succesfull");
						System.out.println("1.view the data");
						System.out.println("2.logout");
						System.out.println("========================");
						int ch =sc.nextInt();
						switch(ch)
						{
						case 1:
						{
							Pro1.view();
							break;
						}
						case 2:
						{
							flag =true;
							break;
						}
						}
						break;
					}
				case 3:
				{
					flag =true;
					break;
				}
				default:
				{
					System.out.println("choose correct option");
				}
			}
		}
		System.out.println("thank you");
		
	}

}
