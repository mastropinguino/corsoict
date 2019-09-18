package corso;

public class MainProgGUI2 {

	public static void main(String[] args) {

		Settings.loadSettings("src/test/TestConfig.properties");
		ProgGUI2 gui = new ProgGUI2();
		gui.init();
		gui.run();

	}

}
