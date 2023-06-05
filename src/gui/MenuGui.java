package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuGui extends JFrame{
	MenuGui(){
	this.setSize(400,300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	JLabel label=new JLabel("Menu Select");
	label.setFont(label.getFont().deriveFont(20.0f));
	
	JButton button1 =new JButton("Add Item");
	JButton button2 =new JButton("Delete Item");
	JButton button3 =new JButton("Edit Item");
	JButton button4 =new JButton("View Item");
	JButton button5 =new JButton("EXIT");
	panel1.add(label);
	panel2.add(button1);
	panel2.add(button2);
	panel2.add(button3);
	panel2.add(button4);
	panel2.add(button5);
	this.add(panel1,BorderLayout.NORTH);
	this.add(panel2,BorderLayout.CENTER);
	this.setVisible(true);
	}
}
