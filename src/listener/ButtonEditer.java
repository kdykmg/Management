package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ItemDeleter;
import gui.ItemEditer;
import gui.WindowFrame;

public class ButtonEditer implements ActionListener{
	WindowFrame frame;
	
	public ButtonEditer(WindowFrame frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton) e.getSource();
		ItemEditer editer=frame.getEditer();
		frame.setupPanel(editer);
	}

}
