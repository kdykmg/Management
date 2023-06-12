package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ItemViewer;
import gui.WindowFrame;
import maneger.EventLog;
import maneger.ItemMannerger;

public class ButtonView implements ActionListener{
	WindowFrame frame;
	ItemViewer viwer;
	ItemMannerger itemMannerger;
	EventLog logger;
	public ButtonView(WindowFrame frame,ItemMannerger itemMannerger,EventLog logger) {
		this.frame=frame;
		this.itemMannerger=itemMannerger;
		this.logger=logger;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton) e.getSource();
		this.viwer=new ItemViewer(frame,itemMannerger,logger);
		ItemViewer viwer=frame.getViwer();
		frame.setupPanel(viwer);
	}

}
