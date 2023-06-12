package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ItemDeleter;
import gui.MenuGui;
import gui.WindowFrame;

public class ButtonCancel implements ActionListener{
	WindowFrame frame;
	
	public ButtonCancel(WindowFrame frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton) e.getSource();
		MenuGui menu=frame.getMenu();
		frame.setupPanel(menu);
	}

}
