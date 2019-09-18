package corso;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.EventObject;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import db.Prodotto;

@SuppressWarnings("serial")
public class ProductSelector extends JPanel {

	// Testo del JButton
	final static String ADD_BTN = "Aggiungi";

	// Elemento vuoto della lista
	final String SELECT_STRING = "--- seleziona un prodotto ---";
	final String DISCOUNT_STRING = "+ + + Buono sconto + + + ";
	final DummySampleProduct SELECT = new DummySampleProduct();

	// Lista vuota: per il costruttore senza parametri
	final static ArrayList<Prodotto> emptyList = new ArrayList<>();

	JComboBox<Prodotto> cmb_products = new JComboBox<>();
	JButton btn_add = new JButton(ADD_BTN);
	JLabel lbl_prezzo = new JLabel();

	private Vector<InterListener> ascoltatori = new Vector<InterListener>();

	/**
	 * Crea il panel contentente la combo box con la lista dei prodotti e il bottone
	 * "aggiungi". Necessita della lista dei prodotti da aggiungere
	 * 
	 * @param productsList lista dei prodotti da aggiungere
	 * 
	 */

	public ProductSelector() {

		// Layout del panel (this)
		GridLayout layout = new GridLayout(2, 1);
		layout.setVgap(5);
		this.setLayout(layout);

		// #1 Row: JComboBox con la lista dei prodotti
		cmb_products.addActionListener(new ComboAction());
		((JLabel) cmb_products.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		cmb_products.addItem(SELECT);
		this.add(cmb_products);

		// #2 Row: spazione vuoto e JButton "Aggiungi"
		JPanel pnl_aux = new JPanel();
		pnl_aux.setLayout(new GridLayout(1, 2));

		lbl_prezzo.setHorizontalAlignment(JLabel.CENTER);
		pnl_aux.add(lbl_prezzo);

		btn_add.addActionListener(new ButtonAction());
		pnl_aux.add(btn_add);
		this.add(pnl_aux);

	}

	/**
	 * Aggiunge gli elementi dell'ArrayList in input al JComboBox
	 * 
	 * @param productsList lista dei prodotti da aggiungere
	 */

	public void addProducts(ArrayList<Prodotto> productsList) {

		for (Prodotto product : productsList) {
			cmb_products.addItem(product);
		}

		// DEBUG: aggiunge elementi se la lista Ë vuota
		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		if (productsList.isEmpty()) {
			for (int i = 0; i < 5; i++) {
				Prodotto prd = new Prodotto();
				prd.setCodice(i);
				prd.setNome("Prodotto #" + i);
				prd.setPrezzo(i * 10);
				cmb_products.addItem(prd);
			}
		}
		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	}

	/**
	 * ActionListener del bottone
	 * 
	 * @author Utente
	 *
	 */

	private class ButtonAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Prodotto selectedProducts = (Prodotto) cmb_products.getSelectedItem();

			// Se non viene selezionato alcun oggetto non fa niente
			if (selectedProducts.equals(SELECT))
				return;
			
			
			System.out.println("DEBUG >>> " + selectedProducts);
			// TODO: metodo per mandare la selezione al JList

			cmb_products.setSelectedIndex(0);
		}
	}

	/**
	 * Mostra il prezzo nel JLabel accanto al bottone
	 * 
	 * @author Lorenzo
	 *
	 */

	private class ComboAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Prodotto aux = (Prodotto) cmb_products.getSelectedItem();

			String prezzo;
			if (aux.getPrezzo() != 0)
				prezzo = "Ä" + aux.getPrezzo();
			else
				prezzo = "-prezzo-";

			lbl_prezzo.setText(prezzo);
		}
	}

	/**
	 * Aggiunge listener a questo elemento. Saranno aggiunti in ProgGui, saranno
	 * KeyPad e ProductList
	 * 
	 * @param listener
	 */

	public void addInternalListener(InterListener listener) {
		this.ascoltatori.add(listener);
	}

	/**
	 * Crea e lancia l'evento. Verr√† fatto al momento del click sul bottono
	 * aggiungi
	 * 
	 * @param prodottoAggiunto
	 */

	public void crealanciaEvento(Prodotto prodottoAggiunto) {
		AggiuntoProdotto event = new AggiuntoProdotto(this, prodottoAggiunto);

		for (InterListener listener : ascoltatori)
			listener.prodottoAggiunto(event);
	}

	/**
	 * Evento lanciato all'aggiunta del prodotto
	 * 
	 * @author Lorenzo Cioni
	 *
	 */

	public class AggiuntoProdotto extends EventObject {

		private Prodotto prodottoAggiunto = null;
		private boolean isDiscount = false;

		public AggiuntoProdotto(Object source) {
			super(source);
		}

		public AggiuntoProdotto(Object source, Prodotto prodotto) {
			super(source);
			if (prodotto instanceof ScontoProdotto)
				isDiscount = true;
			setProdotto(prodotto);
		}

		public void setProdotto(Prodotto prodotto) {
			this.prodottoAggiunto = prodotto;
		}

		public Prodotto getProdottoAggiunto() {
			return prodottoAggiunto;
		}
		
		public boolean isDiscountProduct() {
			return isDiscount;
		}

	}

//-----------------------------------------------------------------------------------------------	
	/**
	 * Classe ausiliare per inserire prodotti nel combo box
	 * 
	 * @author Lorenzo
	 */

	private class DummySampleProduct extends Prodotto {

		DummySampleProduct() {
			super();
			setNome(SELECT_STRING);
			setPrezzo(0f);
		}

		@Override
		public String toString() {
			return SELECT_STRING;
		}
	}

	private class ScontoProdotto extends Prodotto {

		ScontoProdotto() {
			super();
			setNome(DISCOUNT_STRING);
			setPrezzo(0f);
		}

		@Override
		public String toString() {
			return SELECT_STRING;
		}
	}

	public static interface InterListener extends EventListener {

		/**
		 * Azione effettuata quando viene recepito un evento di tipo AggiuntoProdotto
		 * 
		 * @param event
		 */

		public void prodottoAggiunto(AggiuntoProdotto event);
	}
}
