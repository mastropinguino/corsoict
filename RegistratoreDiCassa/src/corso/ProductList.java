package corso;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProductList extends JPanel{
	//static JList lista;
		
	
	public ProductList() {

		String[] prodotto = {"mele     5$", "pasta      6$", "carne     4$", "insalata     1$"};
		JList<String> lista = new JList<String>(prodotto);
		
		add(lista);
		
	}
	
	public static void main(String args[]) {
		JFrame frame = new JFrame("Lista dei prodotti");
		frame.add(new ProductList());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
