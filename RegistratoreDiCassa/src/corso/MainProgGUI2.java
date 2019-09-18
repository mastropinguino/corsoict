package corso;

import javax.swing.SwingUtilities;

public class MainProgGUI2 {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run(){
				Settings.loadSettings("src/test/TestConfig.properties");
				ProgGUI2 gui = new ProgGUI2();
				gui.init();
				gui.run();				
			}
		});
	}
}
