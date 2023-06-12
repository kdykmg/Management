package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import gui.MenuGui;
import gui.WindowFrame;
import maneger.EventLog;
import maneger.ItemMannerger;

public class ButtonEditerSave implements ActionListener{
	ItemMannerger itemMannerger;
	WindowFrame frame;
	EventLog logger;
	JTextField field1;
	JTextField field2;
	JTextField field3;
	JTextField field4;
	JTextField field5;

	public ButtonEditerSave(ItemMannerger itemMannerger,WindowFrame frame,EventLog logger,JTextField field1,JTextField field2,JTextField field3,JTextField field4,JTextField field5) {
		this.itemMannerger=itemMannerger;
		this.frame=frame;
		this.logger=logger;
		this.field1=field1;
		this.field2=field2;
		this.field3=field3;
		this.field4=field4;
		this.field5=field5;
	}	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button=(JButton) e.getSource();
		
		String num=field1.getText();
		int intnum=Integer.parseInt(num);
		
		String number=field2.getText();
		int intnumber=Integer.parseInt(number);
		
		String name=field3.getText();
		
		String quantity=field4.getText();
		int intquantity=Integer.parseInt(quantity);
		
		String date=field5.getText();
		int intdate=Integer.parseInt(date);
		
		itemMannerger.EditItems(logger,intnum,intnumber, name,intquantity,intdate);
		MenuGui menu=frame.getMenu();
		frame.setupPanel(menu);
		
		
	}
	
}