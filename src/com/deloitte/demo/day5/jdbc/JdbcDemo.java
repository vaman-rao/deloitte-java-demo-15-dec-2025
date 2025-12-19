package com.deloitte.demo.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// download jar from here - 
// https://mvnrepository.com/artifact/com.mysql/mysql-connector-j/8.2.0

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {

		System.out.println("Start");
		JdbcDemo.getData();
		System.out.println("End");

	}

	static void getData() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/deloitte", user = "root", password = "root",
				sql = "SELECT id, name, salary FROM employees";

		Connection con = DriverManager.getConnection(url, user, password);

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		while (rs.next())
			System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getDouble("salary"));

	}
}

////public class JdbcDemo {
////
////	public static void main(String[] args) {
////
////		Scanner sc = new Scanner(System.in);
////
////		System.out.println("Enter");
////
////		String name = sc.next();
////		System.out.println(name);
////
////	}
////}
//
///*
// * stack layers - Full stack -
// * 
// * Java FSD
// * 
// * Persistence layer - database - SQL / NoSQL -
// * 
// * Business logic layer - app -Java - spring, hibernate, jpa
// * 
// * Presentation layer - UI - HTML JS CSS - react, angular, vue,
// * 
// * maven, junit, git, github, cicd, docker, ...
// * 
// */