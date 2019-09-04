package es1;

/**
 * La seguente classe implementa le operazioni di una calcolatrice
 * le cui operazioni sono determinate dal numero fornito come parametro
 * della funzione "processa".
 * 
 * La calcolatrice può essere inizializzata con un valore arbitrario
 * tramite l'apposito costruttore.
 * 
 * Tutte le operazioni si aspettano di lavorare con un numero reale e positivo (> 0).
 * Verrà effettuata la somma se il numero è maggiore di 10 e pari,
 * la sottrazione se il numero è maggiore di 10 e dispari,
 * il prodotto se il numero è compreso tra 1-10 (estremi inclusi) ed è pari, 
 * la divisione se il numero inserito è compreso tra 1-10 (estremi inclusi) ed è dispari.
 * 
 */
public class CalcEngine {
	private float totale = 0;

	public CalcEngine() {
	}
	
	public CalcEngine(float initVal) {
		totale = initVal;
	}
	
	public void processa(float num) {
		boolean isPari = (num % 2 == 0);
		if (isPari) {
			if (num > 10)
				totale -= num;
			else
				totale *= num;
		} else {
			if (num > 10)
				totale += num;
			else
				totale /= num;
		}
	}
	
	public float getTotale() {
		return totale;
	}
}
