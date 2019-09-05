package corso;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProgGUI extends JFrame {

	/**
	 * pan1 sarà il pannello principale su 2 colonne
	 * pan2 sara il pannello a sinistra che conterra gli altri componenti 
	 */
	JPanel pan1, pan2, pan3, mainPanel;
	JTextField totale;
	JButton stampaScontrino;
	JLabel lorenzo, paolo;
	
	public ProgGUI(){
		
		//preparo il textfield per il totale
		totale = new JTextField();
		totale.setSize(new Dimension(400,100));
		
		//preparo le JLabel che saranno sostituite dai nuovi componenti 
		lorenzo = new JLabel("Lorenzo");
		//lorenzo.setSize(new Dimension(400,200));
		paolo = new JLabel("Paolo");
		//paolo.setSize(new Dimension(400,400));
		ProductList fatou = new ProductList();
		//fatou.setSize(new Dimension(100,700));
		
		//creo il bottone per la stampa dello scontrino
		stampaScontrino = new JButton("Scontrino");
		stampaScontrino.setSize(new Dimension(400,400));
		//preparo i pannellli per riempire il frame principale
		pan1 = new JPanel();
		pan2 = new JPanel();
		pan3 = new JPanel();
		mainPanel = new JPanel();
		
		mainPanel.setLayout(new GridLayout(1,2));
		pan1.setLayout(new GridLayout(3,1));
		pan3.add(paolo);
		pan3.add(stampaScontrino);
		pan1.add(totale);
		pan1.add(lorenzo);
		pan1.add(pan3);
		//pan2.add(fatou);
		mainPanel.add(pan1);
		mainPanel.add(fatou);
		
		//setLayout(new FlowLayout());
		//mainPanel.setSize(new Dimension(500,700));
		add(mainPanel);
		//pack();
		setSize(new Dimension(500,700));
		setVisible(true);
	}
	
}

