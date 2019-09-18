package test;

import java.sql.SQLException;

import corso.Settings;

public class DemoTestHelper {
	
	public static void main (String[] args) {
		
		Settings.DB_NAME = "test";
		
		try {
			TestHelpers.resetDB();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
