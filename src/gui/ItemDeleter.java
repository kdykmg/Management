package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listener.ButtonCancel;
import listener.ButtonDeleteSave;
import maneger.EventLog;
import maneger.ItemMannerger;

public class ItemDeleter extends JPanel{
	
	WindowFrame frame;
	ItemMannerger itemMannerger;
	EventLog logger;
	
	public ItemDeleter(WindowFrame frame,ItemMannerger itemMannerger,EventLog logger) {
		
		this.frame=frame;
		this.itemMannerger=itemMannerger;
		this.logger=logger;
		
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JLabel label=new JLabel("          Delete Item          ");
		label.setFont(label.getFont().deriveFont(20.0f));
		JTextField field=new JTextField(30);
		
		JButton button1 =new JButton("Cancle");
		JButton button2 =new JButton("Save");

		button1.addActionListener(new ButtonCancel(frame));
		button2.addActionListener(new ButtonDeleteSave(itemMannerger, frame, logger, field));
		
		JLabel label2=new JLabel("Item Number:");
		panel1.add(label);
		
		panel2.add(label2);
		panel2.add(field);
		
		panel3.add(button1);
		panel3.add(button2);
		
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
		this.add(panel3,BorderLayout.SOUTH);
	}
}
