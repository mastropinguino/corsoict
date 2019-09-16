package demos;

import java.io.File;

import corso.FileReceiptPrinter;

public class DemoReceiptPrinter {
 
	
	public static void main(String[] args) {
		File scontrino = new File("C:\\Users\\Utente\\scontrino.txt");
		FileReceiptPrinter printer = new FileReceiptPrinter(scontrino);
		printer.scriviFile();
	}

}
