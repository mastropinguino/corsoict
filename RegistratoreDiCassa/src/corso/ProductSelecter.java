package corso;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ProductSelecter extends JPanel {

	// Testo del JButton
	final static String ADD_BTN = "Aggiungi";
	
	// Elemento vuoto della lista
	final String SELECT_STRING = "--- seleziona un prodotto ---";
	final DummySampleProduct SELECT = new DummySampleProduct ();
	
	// Lista vuota: per il costruttore senza parametri
	final static ArrayList<SampleProduct> emptyList = new ArrayList<>();

	static JComboBox<SampleProduct> cmb_products = new JComboBox<>();
	static JButton btn_add = new JButton(ADD_BTN);
	static JLabel lbl_prezzo = new JLabel();

	/**
	 * Crea il panel contentente la combo box con la lista dei prodotti e il bottone
	 * "aggiungi". Necessita della lista dei prodotti da aggiungere
	 * 
	 * @param productsList lista dei prodotti da aggiungere
	 * 
	 */

	public ProductSelecter(ArrayList<SampleProduct> productsList) {

		// Layout del panel (this)
		GridLayout layout = new GridLayout(2, 1);
		layout.setVgap(5);
		this.setLayout(layout);

		// #1 Row: JComboBox con la lista dei prodotti
		cmb_products.addActionListener(new ComboAction());
		((JLabel)cmb_products.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		this.addProducts(productsList);
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
	 * Crea il pannello con una combo box con prodotti di prova
	 */

	public ProductSelecter() {
		this(emptyList);
	}

	/**
	 * Aggiunge gli elementi dell'ArrayList in input al JComboBox
	 * 
	 * @param productsList lista dei prodotti da aggiungere
	 */

	public void addProducts(ArrayList<SampleProduct> productsList) {

		cmb_products.addItem(SELECT);
		for (SampleProduct product : productsList) {
			cmb_products.addItem(product);
		}

		// DEBUG: aggiunge elementi se la lista è vuota
		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		if (productsList.isEmpty()) {
			for (int i = 0; i < 5; i++) {
				cmb_products.addItem(new SampleProduct("Prodotto #" + i, i*10));
			}
		}
		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	}

	/**
	 * ActionListener del bottone
	 * @author Utente
	 *
	 */
	
	private class ButtonAction implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		SampleProduct selectedProducts = (SampleProduct) cmb_products.getSelectedItem();

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
			
			SampleProduct aux = (SampleProduct) cmb_products.getSelectedItem();
			
			String prezzo;
			if (aux.price != 0)
				prezzo = "€" + aux.price;
			else
				prezzo = "-prezzo-";
			
			lbl_prezzo.setText(prezzo);
		}
	}
	
	/**
	 * Classe ausiliare per inserire prodotti nel combo box
	 * 
	 * @author Lorenzo
	 *
	 */
	
	private class SampleProduct {
		
		private String productName;
		private float price;
		
		SampleProduct (String nome, float prezzo){
			this.productName = nome;
			this.price = prezzo;
		}
		
		@Override
		public String toString() {
			return "Nome: " + this.productName + " - Prezzo: " + this.price + " €";
		}
	}
	
	private class DummySampleProduct extends SampleProduct {
		
		DummySampleProduct () {
			super(SELECT_STRING, 0f);
		}
		
		@Override
		public String toString() {
			return SELECT_STRING;
		}
	}
}
