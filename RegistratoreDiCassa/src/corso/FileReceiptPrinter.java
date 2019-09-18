package corso;

import java.io.*;


public class FileReceiptPrinter {
	File file;
	
	public FileReceiptPrinter(File file){
		this.file = file;
	}

	public void scriviFile() {

		try {
			
			FileWriter fw = new FileWriter(file);
			fw.write("ID SCONTRINO\t");
			fw.write("   DATA/ORA\t  ");
			fw.write("TOTALE \t");
			fw.write("IVA \t");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}