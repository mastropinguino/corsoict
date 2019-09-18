package corso;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class KeyPad extends JPanel implements ActionListener{
	
	//used for insert in the label the button values
	private String calcText = "";
	
	//used for disable the button : dot when is already insert 
	private int count_Dot = 0;
	
	//===========MY FONT==================//	
	private Font MyFont = new Font("TimesRoman",Font.BOLD,Settings.KEYPAD_FONT);
	
	//========CALCULATOR PANEL============//
	JPanel calc = new JPanel();

	//===========JLABEL==============//
	JLabel text = new JLabel("0.0",SwingConstants.RIGHT);

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
	private boolean enabled = true;
	
	
	//=========CREATING KEYPAD=============//
	
	public KeyPad() {
	//==========SETTING LAYOUT==============//
		calc.setLayout(new GridLayout(4,3));
		text.setPreferredSize(new Dimension(50,100));
		setLayout(new BorderLayout());
		
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
		
		//dot button start disabled 
		dot.setEnabled(enabled);
		
		calc.add(one);
		calc.add(two);
		calc.add(three);
		calc.add(four);
		calc.add(five);
		calc.add(six);
		calc.add(seven);
		calc.add(eight);
		calc.add(nine);		
		calc.add(dot);
		calc.add(zero);
		calc.add(sub);
		
		add(text,BorderLayout.PAGE_START);
		add(calc,BorderLayout.CENTER);
		
	 //=================SET FONT==================//
	
		one.setFont(MyFont);
		two.setFont(MyFont);
		three.setFont(MyFont);
		four.setFont(MyFont);
		five.setFont(MyFont);
		six.setFont(MyFont);
		seven.setFont(MyFont);
		eight.setFont(MyFont);
		nine.setFont(MyFont);
		zero.setFont(MyFont);
		sub.setFont(MyFont);
		dot.setFont(MyFont);
		text.setFont(MyFont);
	
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String aux_Char = e.getActionCommand();
		
		if(e.getActionCommand().equals(",")) {
			
			dot.setEnabled(!enabled);
		}
		
		if (e.getActionCommand().equals("-")) {
			
			sub.setEnabled(!enabled);
			dot.setEnabled(enabled);
		}
		
		
		calcText += aux_Char; 
		text.setText(calcText);
		
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
