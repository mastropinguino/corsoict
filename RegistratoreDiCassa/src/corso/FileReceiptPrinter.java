package corso;

import java.io.*;
import java.time.Instant;







public class FileReceiptPrinter {
	File file;

	public FileReceiptPrinter(File file){
		this.file = file;
		
	}
	
	
	
	

	public void scriviFile() {

		try {
			
			FileWriter fw = new FileWriter(file);
			fw.write("1\n");
			fw.write("\n");
			Instant adesso = Instant.now();
			String outputData = adesso.toString();
			fw.write(outputData);
			fw.write("prodotto1\n");
			fw.write("2x\n");
			fw.write("20,50€\n");
			fw.write("4,51€\n ");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}