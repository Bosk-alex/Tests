package main.java.tests.Threads;

import java.sql.*;
import java.util.Scanner;

class Program {

	private Connection con;

	public static void main(String[] args) {


		Program program = new Program();
		program.open();
		program.insert();
		program.close();

	}

	private void open() {
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:src\\user.db");
			System.out.println("Connected");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	private void insert() {
		try (Statement statement = con.createStatement(); Scanner scanner = new Scanner(System.in)) {
			System.out.println("Name: ");
			String name = scanner.nextLine();
			System.out.println("Phone: ");
			String phone = scanner.nextLine();

			String query =
				"INSERT INTO user (name, phone) " +
				"VALUES ('" + name + "', '" + phone + "')";

			System.out.println(query);
			statement.executeUpdate(query);
			System.out.println("Added");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private void close() {
		try {
			con.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
