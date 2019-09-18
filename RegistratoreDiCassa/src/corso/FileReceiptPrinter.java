package corso;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class FileReceiptPrinter {
	File file;

	public FileReceiptPrinter(File file){
		this.file = file;
		
	}
	
	public void scriviFile() {

		try {
			String aux;
			
			FileWriter fw = new FileWriter(file);
			
			fw.write("CAFFETTERIA JAVA\n");
			fw.write("Via Garibaldi 11\n");
			fw.write("00187 ROMA\n");
			fw.write("P.IVA 12345678901");
			fw.write("\n");
			fw.write("\n");
			fw.write("\n");
			fw.write("\n");
			//Intestazione articoli
			aux = String.format("%-6s %-20s %10s\n", "Q.TA", "PRODOTTO", "IMPORTO");
			fw.write(aux);
			fw.write("\n");
			// Elenco articoli
			aux = String.format("%-4d X %-20s %10.2f\n", 12, "coperto", 3.5);
			fw.write(aux);
			fw.write("\n");
			fw.write("\n");
			fw.write("TOT : \t" + "\t \t 3.50€\n");
			fw.write("\n");
			LocalDateTime dt = LocalDateTime.now();
			fw.write(String.format("DATA: %td/%tm/%tY %tH:%tM\n", dt, dt, dt, dt, dt));
			fw.write("SCONTRINO NUMERO 1\n");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}