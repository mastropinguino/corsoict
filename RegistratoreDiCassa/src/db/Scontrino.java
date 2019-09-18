/**
 * Descrizione della classe Scontrino
 * 
 * @author FC
 * @version 1.0
 * 
 */

package db;

import java.util.Date;

public class Scontrino {
	// variabili d'istanza
	private int id;
	private int totale;
	private Date data_ora;
	private int iva;
	private int negozio;

	/**
	 * Costruttore degli oggetti di classe Scontrino
	 */
	public Scontrino() {
		// inizializza le variabili d'istanza
		setTotale(0);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotale() {
		return totale;
	}

	public void setTotale(int totale) {
		this.totale = totale;
	}

	public Date getData_ora() {
		return data_ora;
	}

	public void setData_ora(Date data_ora) {
		this.data_ora = data_ora;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getNegozio() {
		return negozio;
	}

	public void setNegozio(int negozio) {
		this.negozio = negozio;
	}

}
