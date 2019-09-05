package demos;

import java.awt.Dimension;

import javax.swing.JFrame;

import corso.ProductSelecter;

public class MainProductSelecter {

	public static void main (String[] args) {
		
		JFrame frm = new JFrame();
		frm.add(new ProductSelecter());
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLocationRelativeTo(null);
		frm.setSize(new Dimension(300,150));
		frm.setPreferredSize(new Dimension(200,300));
		
	}
	
}
