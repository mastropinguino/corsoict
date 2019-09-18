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
			fw.write("CAFFETTERIA JAVA\n");
			fw.write("Via Garibaldi 11\n");
			fw.write("00187 ROMA\n");
			fw.write("P.IVA 12345678901");
			fw.write("\n");
			fw.write("\n");
			fw.write("\n");
			fw.write("\n");
			fw.write("Q.TA    PRODOTTO        IMPORTO\n");
			fw.write("\n");
			fw.write("2X\t" + "coperto\t" + "\t 2,00€\n");
			fw.write("5X\t" + "caffe espresso\t" +" 5,50€\n");
			fw.write("\n");
			fw.write("\n");
			Instant adesso = Instant.now();
			String outputData = adesso.toString();
			fw.write("TOT : \t" + "\t \t 7,50€\n");
			fw.write("\n");
			fw.write("DATA : " + outputData+"\n");
			fw.write("SCONTRINO NUMERO 1\n");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}