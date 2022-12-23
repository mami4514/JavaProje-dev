/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojeodevi;


import java.sql.*;
/**
 *
 * @author abdul
 */
public class Database {
    	static final String DB_URL = "jdbc:mysql://localhost:3306/";
	static final String DB_URL_USER = "jdbc:mysql://localhost:3306/user";
	static final String USER = "root";
	static final String PASSWORD = "root";

	public static void dbCreate() throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		Statement st = conn.createStatement();
		String sql = "CREATE DATABASE DENEME";
		st.execute(sql);
		st.close();

	}
        
        }
               

   
    

