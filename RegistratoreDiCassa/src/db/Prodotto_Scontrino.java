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
	private Prodotto prodotto;
	private Scontrino scontrino;

	/**
	 * Costruttore degli oggetti di classe Scontrino
	 */
	
	public Prodotto_Scontrino() {
		// inizializza le variabili d'istanza
	}

	public int getId_prodotto() {
		if (prodotto == null)
			return 0;
		return prodotto.getCodice();
	}

	public int getId_scontrino() {
		if (scontrino == null)
			return 0;
		return scontrino.getId();
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
	
	public void setProdotto(Prodotto p) {
		this.prodotto = p;
	}
	
	public Prodotto getProdotto() {
		return prodotto;
	}
	
	public void setScontrino(Scontrino s) {
		this.scontrino = s;
	}
	
	public Scontrino getScontrino() {
		return scontrino;
	}

}
