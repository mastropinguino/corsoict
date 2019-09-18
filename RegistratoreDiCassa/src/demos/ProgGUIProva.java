package demos;

import corso.ProgGUI2;
import corso.Settings;

public class ProgGUIProva {
	
	public static void main(String args[]) {
		Settings.loadSettingsTEST();
		ProgGUI2 gui = new ProgGUI2();
		gui.init();
		gui.run();
	}

}
