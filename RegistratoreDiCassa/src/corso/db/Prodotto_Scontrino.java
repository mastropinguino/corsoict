/**
 * Descrizione della classe Prodotto_Scontrino
 * 
 * @author FC
 * @version 1.0
 * 
 */

package db;

public class Prodotto_Scontrino {
	// variabili d'istanza
	private int id_prodotto;
	private int id_scontrino;
	private int quantita;
	private float prezzo_applicato;

	/**
	 * Costruttore degli oggetti di classe Scontrino
	 */
	public Prodotto_Scontrino() {
		// inizializza le variabili d'istanza
	}

	public int getId_prodotto() {
		return id_prodotto;
	}

	public void setId_prodotto(int id_prodotto) {
		this.id_prodotto = id_prodotto;
	}

	public int getId_scontrino() {
		return id_scontrino;
	}

	public void setId_scontrino(int id_scontrino) {
		this.id_scontrino = id_scontrino;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public float getPrezzo_applicato() {
		return prezzo_applicato;
	}

	public void setPrezzo_applicato(float prezzo_applicato) {
		this.prezzo_applicato = prezzo_applicato;
	}

}
