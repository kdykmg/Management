package gui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ItemEdder extends JFrame{
	public ItemEdder(){
	JPanel panel=new JPanel();
	JPanel panel2=new JPanel();
	panel.setLayout(new SpringLayout());
	
	JLabel labelMenu=new JLabel("Add Item");
	labelMenu.setFont(labelMenu.getFont().deriveFont(20.0f));
	
	panel.add(new JLabel(""));
	panel.add(labelMenu);
	
	panel.add(new JLabel(" "));
	panel.add(new JLabel(" "));
	
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
	
	panel.add(new JButton("cancle"));
	panel.add(new JButton("save"));
	
	
	this.add(panel2,BorderLayout.NORTH);
	SpringUtilities.makeCompactGrid(panel,8,2,6,6,6,6);
	this.setSize(300,300);
	this.setContentPane(panel);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	}

}
