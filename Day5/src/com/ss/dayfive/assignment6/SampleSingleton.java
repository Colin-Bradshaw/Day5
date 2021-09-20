/**
 * 
 */
package com.ss.dayfive.assignment6;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Colin Bradshaw
 *
 */
public class SampleSingleton {
	private static Connection conn = null;
	private static SampleSingleton instance = null;
	
	// create private constructor
	private SampleSingleton() {
		// create connection here
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection("Database.URL");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static SampleSingleton getInstance() {
		// call private constructor if necessary
		if(instance == null) {
			instance = new SampleSingleton();
		}
		return instance;
	}
}
