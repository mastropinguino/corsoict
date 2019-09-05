package demos;

import javax.swing.JFrame;

import corso.ProductList;

public class ProductListDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Lista dei prodotti");
		frame.add(new ProductList());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
