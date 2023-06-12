package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import gui.MenuGui;
import gui.WindowFrame;
import maneger.ETCItem;
import maneger.EventLog;
import maneger.FoodItem;
import maneger.ItemMannerger;

public class ButtonAddSave implements ActionListener{
	ItemMannerger itemMannerger;
	WindowFrame frame;
	EventLog logger;
	JTextField field1;
	JTextField field2;
	JTextField field3;
	JTextField field4;
	JTextField field5;

	public ButtonAddSave(ItemMannerger itemMannerger,WindowFrame frame,EventLog logger,JTextField field1,JTextField field2,JTextField field3,JTextField field4,JTextField field5) {
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
		String kind=field1.getText();
		int intkind=Integer.parseInt(kind);
		
		String number=field2.getText();
		int intnumber=Integer.parseInt(number);
		
		String name=field3.getText();
		
		String quantity=field4.getText();
		int intquantity=Integer.parseInt(quantity);
		
		String date=field5.getText();
		int intdate=Integer.parseInt(date);
		
		itemMannerger.AddItems(logger,intkind,intnumber,name,intquantity,intdate);
		System.out.println(itemMannerger.size());
		MenuGui menu=frame.getMenu();
		frame.setupPanel(menu);
		
		
	}
	
}