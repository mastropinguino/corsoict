package demos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import corso.KeyPad;

public class MainKeyPad {
	
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		KeyPad kp = new KeyPad();
		//JButton on = new JButton("on");
		//JButton off = new JButton("off");
		//JPanel pan = new JPanel();
		//JPanel pan2 = new JPanel();
		
		//pan.setLayout(new GridLayout(1,1));
		//pan2.setLayout(new GridLayout(2,1));
		
		/*on.addActionListener(new ActionListener( ) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				kp.setEnabled();	
			}
		});
		
		off.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				kp.setDisabled();
				
			}
			
		});*/
		
		//pan.add(on);
		//pan.add(off);
		//pan2.add(kp);
		//pan2.add(pan);
		//pan.add(kp);
		frame.add(kp);
		
		frame.setVisible(true);
		frame.setSize(400, 500);
		
	}

	
	
		
}

