package gui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.ButtonAddSave;
import listener.ButtonAdder;
import listener.ButtonCancel;
import maneger.EventLog;
import maneger.ItemMannerger;

public class ItemAdder extends JPanel{
	
	WindowFrame frame;
	ItemMannerger itemMannerger;
	EventLog logger;
	public ItemAdder(WindowFrame frame,ItemMannerger itemMannerger,EventLog logger){
		this.frame=frame;
		this.itemMannerger=itemMannerger;
		this.logger=logger;
		
		JPanel panel=new JPanel();
		JPanel panel2=new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelMenu=new JLabel("Add Item");
		labelMenu.setFont(labelMenu.getFont().deriveFont(20.0f));
		
		panel.add(new JLabel(""));
		panel.add(labelMenu);
		
		panel.add(new JLabel(" "));
		panel.add(new JLabel(" "));
		
		JLabel labelKind=new JLabel("Is Item is food? 1.Yes/2.No:",JLabel.TRAILING);
		JTextField fieldKind=new JTextField(10);
		labelKind.setLabelFor(fieldKind);
		panel.add(labelKind);
		panel.add(fieldKind);
		
		JLabel labelNumber=new JLabel("Number:",JLabel.TRAILING);
		JTextField fieldNumber=new JTextField(10);
		labelNumber.setLabelFor(fieldNumber);
		panel.add(labelNumber);
		panel.add(fieldNumber);
		
		JLabel labelName=new JLabel("Name:",JLabel.TRAILING);
		JTextField fieldName=new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelQuantity=new JLabel("Quantity:",JLabel.TRAILING);
		JTextField fieldQuantity=new JTextField(10);
		labelQuantity.setLabelFor(fieldQuantity);
		panel.add(labelQuantity);
		panel.add(fieldQuantity);
		
		JLabel labelexpirationDate=new JLabel("expirationDate:",JLabel.TRAILING);
		JTextField fieldexpirationDate=new JTextField(10);
		labelQuantity.setLabelFor(fieldexpirationDate);
		panel.add(labelexpirationDate);
		panel.add(fieldexpirationDate);
		
		panel.add(new JLabel(" "));
		panel.add(new JLabel(" "));
		
		JButton button1 =new JButton("Cancel");
		JButton button2 =new JButton("Save");
		panel.add(button1);
		panel.add(button2);
		
		button1.addActionListener(new ButtonCancel(frame));
		button2.addActionListener(new ButtonAddSave(itemMannerger, frame, logger, fieldKind, fieldNumber, fieldName, fieldQuantity, fieldexpirationDate));
		
		this.add(panel2,BorderLayout.NORTH);
		SpringUtilities.makeCompactGrid(panel,9,2,6,6,6,6);
	
		this.add(panel);


	}

}
