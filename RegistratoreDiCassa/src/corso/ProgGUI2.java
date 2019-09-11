package corso;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProgGUI2 extends JFrame{
	
	
	
	JTextField totale;
	
	public ProgGUI2() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridBagLayout gbLayout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		this.setLayout(gbLayout);
		
		//TextField totale
		
		totale = new JTextField();
		
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		
		totale.setHorizontalAlignment(JLabel.CENTER);
		//totale.setVerticalAlignment(JLabel.CENTER);
		totale.setPreferredSize(new Dimension(250, 50));
		add(totale, c);
		
		//Product selector
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.weightx = 0.5;
		
		ProductSelecter lorenzo = new ProductSelecter();
		lorenzo.setPreferredSize(new Dimension(250, 90));
		add(lorenzo, c);
		
		//Keypad
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		c.weightx = 1;
		
		KeyPad paolo=new KeyPad(); 
		
		paolo.setPreferredSize(new Dimension(250, 400));
		add(paolo, c);
		
		//Lista prodotti
		c = new GridBagConstraints();
		c.gridx = 2;
		c.gridy = 0;
		c.gridheight = 3;
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 2;
		c.weighty = 1;
		
		ProductList fatou = new ProductList();
		fatou.setSize(new Dimension(150,700));
		add(fatou, c);

		//Bottone add product
		c = new GridBagConstraints();
		JButton scontrino = new JButton("Scontrino");
		c.fill = GridBagConstraints.NONE;
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(20, 20, 20, 20);
		
		scontrino.setPreferredSize(new Dimension(80, 60));
		add(scontrino, c);
		
		pack();
		setVisible(true);
		
	}
	

}
