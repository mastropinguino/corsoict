package corso;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Settings {

	// DB settings
	public static String DB_HOST = "localhost";
	public static int DB_PORT = 3306;
	public static String DB_USER = "root";
	public static String DB_PASS = "";
	public static String DB_NAME = "corso";

	// App Version
	static final String APP_VERSION = "0.1-dev";

	// Fonts
	static final int KEYPAD_FONT = 24;

	private Settings() {
	}

	public static void loadSettings(String path) {

		try (InputStream input = new FileInputStream(path)) {

			Properties prop = new Properties();
			prop.load(input);

			DB_HOST = prop.getProperty("db.host");
			DB_PORT = Integer.parseInt(prop.getProperty("db.port"));
			DB_USER = prop.getProperty("db.user");
			DB_PASS = prop.getProperty("db.password");
			DB_NAME = prop.getProperty("db.name");

			System.out.println("DEBUGG:");
			prop.forEach((k, v) -> System.out.println("Key : " + k + " - Value : " + v));

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void loadSettingsTEST() {
		loadSettings("src/test/TestConfig.properties");
	}
}
