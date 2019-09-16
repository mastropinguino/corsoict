package db;

/**
 * Descrizione della classe Prodotto
 * 
 * @author FC
 * @version 1.0
 * 
 */
public class Prodotto {
	 private int codice;
	 private String nome;
	 private float prezzo;

	/**
	 * Costruttore degli oggetti di classe Prodotto
	 */

	public Prodotto() {
		// inizializza le variabili d'istanza
		prezzo = 0;
	}
	
	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public int esempiodiCalcolo(int y) {
		return (int) (prezzo + y);
	}
}
