package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ItemDeleter;
import gui.ItemViewer;
import gui.WindowFrame;

public class ButtonDeleter implements ActionListener{
	WindowFrame frame;
	
	public ButtonDeleter(WindowFrame frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton) e.getSource();
		ItemDeleter deleter=frame.getDeleter();
		frame.setupPanel(deleter);
	}

}

