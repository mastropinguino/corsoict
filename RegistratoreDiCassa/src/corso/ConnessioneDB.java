package corso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// ConnesioneDB.getConnection()
public class ConnessioneDB {
	static private Connection conn = null;

	
	public static Connection getConnection() throws SQLException {
		if (conn != null) {
			return conn;
		}
		
		// jdbc:mysql://db_host/db_name
		
		String url= String.format("jdbc:mysql://%s/%s", Settings.DB_HOST, Settings.DB_NAME);
		conn = DriverManager.getConnection(url, Settings.DB_USER, Settings.DB_PASS);  //apertura connessione
		return conn;
	}
	
	static void close() throws SQLException{
		if(conn != null) {
			conn.close();
			conn = null;
		}
	}
}
