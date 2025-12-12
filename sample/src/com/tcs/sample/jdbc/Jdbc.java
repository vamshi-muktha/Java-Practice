package com.tcs.sample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Jdbc {
	public static void main(String[] args) {
		try {
			Driver d = new com.mysql.cj.jdbc.Driver();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root", "Root123$");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");

//			int i = st.executeUpdate("insert into employees values(\"Ram\", 1 , 8990)");

			while(rs.next()) {
				System.out.println(rs.getString(1) + " "+rs.getString(2)+ " "+ rs.getString(3));
			}
//			System.out.println(i);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
