package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BRDdb {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@kkm00brd.in.oracle.com:1521:unifierperf","perfuser","perfuser");
			

			PreparedStatement ps = con.prepareStatement("update u90all_dm_file_content set content_status=? where file_name=?");
			System.out.println("Updating.....");
			ps.setInt(1, 1);
			ps.setString(2, "Normal.PNG");
			
			int i = ps.executeUpdate();
			System.out.println(i + " Row updated");
			
			ps.setInt(1, 0);
			ps.setString(2, "Pendingscan.PNG");
		
			int i1 = ps.executeUpdate();
			System.out.println(i1 + " Row updated");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
