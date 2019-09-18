package demos;

import java.awt.Dimension;

import javax.swing.JFrame;

import corso.ProductSelector;

public class MainProductSelecter {

	public static void main (String[] args) {
		
		JFrame frm = new JFrame();
		frm.add(new ProductSelector());
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLocationRelativeTo(null);
		frm.setSize(new Dimension(300,150));
		frm.setPreferredSize(new Dimension(200,300));
		
	}
	
}
