package corso;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProgGUI2 extends JFrame{
	
	JPanel mainPanel, paoloPanel, fatouPanel, lorenzoPanel, leftPanel;
	JButton scontrino;
	JTextField totale;
	
	public ProgGUI2() {
		
		mainPanel = new JPanel();
		
		leftPanel = new JPanel();
		
		fatouPanel = new JPanel();
		scontrino = new JButton("Scontrino");
		
		paoloPanel = new JPanel();
		paoloPanel.add(new JLabel("Paolo"));
		paoloPanel.add(scontrino);
		lorenzoPanel = new JPanel();
		
		
		totale = new JTextField();
		GridBagLayout gbLayout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		leftPanel.setLayout(new GridLayout(3,1));
		leftPanel.add(totale);
		leftPanel.add(new JLabel("Lorezo"));
		leftPanel.add(paoloPanel);
		
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 3;
		c.gridwidth= GridBagConstraints.RELATIVE;
		gbLayout.setConstraints(leftPanel, c);
		mainPanel.add(leftPanel);
		
		c.weightx = 1;
		c.gridwidth = GridBagConstraints.REMAINDER;
		gbLayout.setConstraints(fatouPanel, c);
		mainPanel.add(new ProductList());
		
		add(mainPanel);
		setSize(new Dimension(500,700));
		//pack();
		setVisible(true);
	}
	

}
