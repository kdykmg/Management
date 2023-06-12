package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ItemAdder;
import gui.ItemViewer;
import gui.WindowFrame;

public class ButtonAdder implements ActionListener{
	WindowFrame frame;
	
	public ButtonAdder(WindowFrame frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton) e.getSource();
		ItemAdder adder=frame.getEdder();
		frame.setupPanel(adder);
	}

}
