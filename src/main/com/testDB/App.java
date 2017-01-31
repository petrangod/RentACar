package main.com.testDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class App {

		public static void main(String[] args)  {

			String url = "jdbc:mysql://localhost:3306/rent_a_car?useSSL=false";
			String user =  "rootForRentACar";
			String pass =  "12345";

			// 1. Get a Connection to a database
			try {
				Connection myConn = DriverManager.getConnection(url, user, pass);
				System.out.println("Connected wohoooo !!!!");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
