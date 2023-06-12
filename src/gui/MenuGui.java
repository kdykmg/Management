package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAdder;
import listener.ButtonDeleter;
import listener.ButtonEditer;
import listener.ButtonView;
import maneger.EventLog;
import maneger.ItemMannerger;

public class MenuGui extends JPanel{
	
	WindowFrame frame;
	ItemMannerger itemMannerger;
	EventLog logger;
	
	MenuGui(WindowFrame frame,ItemMannerger itemMannerger,EventLog logger){
		this.frame=frame;
		this.itemMannerger=itemMannerger;
		this.logger=logger;
		
		this.setLayout(new BorderLayout());
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JLabel label=new JLabel("Menu Select");
		label.setFont(label.getFont().deriveFont(20.0f));
		
		JButton button1 =new JButton("Add Item");
		JButton button2 =new JButton("Delete Item");
		JButton button3 =new JButton("Edit Item");
		JButton button4 =new JButton("View Item List");
		JButton button5 =new JButton("EXIT");
		
		button1.addActionListener(new ButtonAdder(frame));
		button2.addActionListener(new ButtonDeleter(frame));
		button3.addActionListener(new ButtonEditer(frame));
		button4.addActionListener(new ButtonView(frame, itemMannerger, logger));
		
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);

	}
}
