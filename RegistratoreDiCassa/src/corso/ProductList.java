package corso;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProductList extends JPanel {
	//static JList lista;
		
	
	public ProductList() {

		String[] prodotto = {"mele     5$", "pasta      6$", "carne     4$", "insalata     1$"};
		JList<String> lista = new JList<String>(prodotto);
		
		this.setLayout(new GridLayout(1,0));
		add(lista);
	}
}
