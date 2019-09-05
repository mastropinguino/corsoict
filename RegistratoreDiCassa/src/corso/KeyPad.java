package corso;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class KeyPad extends JPanel implements ActionListener{

	
	//===========KEYPAD STRING================//
	private static final String CMD_SUB = "-";
	private static final String CMD_0 = "0";
	private static final String CMD_1 = "1";
	private static final String CMD_2 = "2";
	private static final String CMD_3 = "3";
	private static final String CMD_4 = "4";
	private static final String CMD_5 = "5";
	private static final String CMD_6 = "6";
	private static final String CMD_7 = "7";
	private static final String CMD_8 = "8";
	private static final String CMD_9 = "9";
	private static final String CMD_DOT = ",";
	
	//=========KEYPAD BUTTON==============//
	private JButton one = new JButton(CMD_1);
	private JButton two = new JButton(CMD_2);
	private JButton three = new JButton(CMD_3);
	private JButton four = new JButton(CMD_4);
	private JButton five = new JButton(CMD_5);
	private JButton six = new JButton(CMD_6);
	private JButton seven = new JButton(CMD_7);
	private JButton eight = new JButton(CMD_8);
	private JButton nine = new JButton(CMD_9);
	private JButton zero = new JButton(CMD_0);
	private JButton sub = new JButton(CMD_SUB);
	private JButton dot = new JButton(CMD_DOT);
	
	//=====ENABLE/DISABLE BUTTON========//
	private boolean enabled;
	
	

	
	public KeyPad() {
		
		setLayout(new GridLayout(4,3));
	
	//==========BUTTON ACTION==========//
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		dot.addActionListener(this);
		sub.addActionListener(this);
		
	//========ADD BUTTON==============//
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);		
		add(dot);
		add(zero);
		add(sub);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
		
	
	//Enable all button and set variable enabled = true
	public void setEnabled() {
		one.setEnabled(true);
		two.setEnabled(true);
		three.setEnabled(true);
		four.setEnabled(true);
		five.setEnabled(true);
		six.setEnabled(true);
		seven.setEnabled(true);
		eight.setEnabled(true);
		nine.setEnabled(true);
		zero.setEnabled(true);
		dot.setEnabled(true);
		sub.setEnabled(true);
		enabled = true;
		

	}
	//Disable all button and set variable enabled = false
	public void setDisabled() {
		one.setEnabled(false);
		two.setEnabled(false);
		three.setEnabled(false);
		four.setEnabled(false);
		five.setEnabled(false);
		six.setEnabled(false);
		seven.setEnabled(false);
		eight.setEnabled(false);
		nine.setEnabled(false);
		zero.setEnabled(false);
		dot.setEnabled(false);
		sub.setEnabled(false);
		enabled = false;
	}

}
