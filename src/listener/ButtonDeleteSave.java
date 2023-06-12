package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import gui.MenuGui;
import gui.WindowFrame;
import maneger.EventLog;
import maneger.ItemMannerger;

public class ButtonDeleteSave implements ActionListener{

	ItemMannerger itemMannerger;
	WindowFrame frame;
	EventLog logger;
	JTextField field;

	public ButtonDeleteSave(ItemMannerger itemMannerger,WindowFrame frame,EventLog logger,JTextField field) {
		this.itemMannerger=itemMannerger;
		this.frame=frame;
		this.logger=logger;
		this.field=field;
		
	}	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button=(JButton) e.getSource();
		String num=field.getText();
		int intnum=Integer.parseInt(num);
		
		itemMannerger.DeleteItems(logger,intnum);
		MenuGui menu=frame.getMenu();
		frame.setupPanel(menu);
		
		
	}
	

}
