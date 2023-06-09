package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.ButtonCancel;
import listener.ButtonEditerSave;
import maneger.EventLog;
import maneger.ItemMannerger;

public class ItemEditer extends JPanel {
	
	WindowFrame frame;
	ItemMannerger itemMannerger;
	EventLog logger;
	
	public ItemEditer(WindowFrame frame,ItemMannerger itemMannerger,EventLog logger){
		this.frame=frame;
		this.itemMannerger=itemMannerger;
		this.logger=logger;
		
		JPanel panel=new JPanel();
		JPanel panel2=new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelMenu=new JLabel("Edit Item");
		labelMenu.setFont(labelMenu.getFont().deriveFont(20.0f));
		
		panel.add(new JLabel(""));
		panel.add(labelMenu);
		
		panel.add(new JLabel(" "));
		panel.add(new JLabel(" "));
		
		JLabel labelTargetNumber=new JLabel("Number:",JLabel.TRAILING);
		JTextField fieldTargetNumber=new JTextField(10);
		labelTargetNumber.setLabelFor(fieldTargetNumber);
		panel.add(labelTargetNumber);
		panel.add(fieldTargetNumber);

		panel.add(new JLabel(" "));
		panel.add(new JLabel(" "));
		
		JLabel labelNumber=new JLabel("new Number:",JLabel.TRAILING);
		JTextField fieldNumber=new JTextField(10);
		labelNumber.setLabelFor(fieldNumber);
		panel.add(labelNumber);
		panel.add(fieldNumber);
		
		JLabel labelName=new JLabel("new Name:",JLabel.TRAILING);
		JTextField fieldName=new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelQuantity=new JLabel("new Quantity:",JLabel.TRAILING);
		JTextField fieldQuantity=new JTextField(10);
		labelQuantity.setLabelFor(fieldQuantity);
		panel.add(labelQuantity);
		panel.add(fieldQuantity);
		
		JLabel labelexpirationDate=new JLabel("new expirationDate:",JLabel.TRAILING);
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
		button2.addActionListener(new ButtonEditerSave(itemMannerger, frame, logger, fieldTargetNumber, fieldNumber, fieldName, fieldQuantity, fieldexpirationDate));
		
		this.add(panel2,BorderLayout.NORTH);
		SpringUtilities.makeCompactGrid(panel,10,2,6,6,6,6);
		this.add(panel);
	}

}
