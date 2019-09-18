package corso;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ProgGUI2 extends JFrame {

	JTextField totale;

	public ProgGUI2() {
		
		super("Registratore di cassa");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridBagLayout gbLayout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		this.setLayout(gbLayout);

		// TextField totale

		totale = new JTextField();

		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(10, 10, 10, 10);

		
		totale.setHorizontalAlignment(JLabel.CENTER);
		totale.setEnabled(false);
		totale.setPreferredSize(new Dimension(250, 50));
		totale.setEnabled(false);
		add(totale, c);

		// Product selector
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 2;
		c.weightx = 0.5;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(10, 10, 10, 10);

		
		ProductSelecter lorenzo = new ProductSelecter();
		lorenzo.setPreferredSize(new Dimension(250, 90));
		add(lorenzo, c);

		// Keypad
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);

		KeyPad paolo = new KeyPad();

		paolo.setPreferredSize(new Dimension(200, 250));
		add(paolo, c);

		// Lista prodotti
		c = new GridBagConstraints();
		c.gridx = 3;
		c.gridy = 0;
		c.gridheight = 3;
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 2;
		c.weighty = 1;
		c.insets = new Insets(10, 10, 10, 10);

		ProductList fatou = new ProductList();
		fatou.setPreferredSize(new Dimension(150, 400));
		add(fatou, c);

		// Bottone scontrino
		c = new GridBagConstraints();
		JButton scontrino = new JButton("Scontrino");
		c.fill = GridBagConstraints.NONE;
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(10, 10, 10, 10);

		scontrino.setPreferredSize(new Dimension(100, 250));
		add(scontrino, c);

		this.setLocationRelativeTo(null);
		pack();
		setVisible(true);

	}

}
