package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ItemViewer extends JFrame{
	public ItemViewer(int n) {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Quantity");
		model.addColumn("expirationDate");
		
		JTable table =new JTable(model);
		JScrollPane sp=new JScrollPane(table);
		
		this.add(sp);
		this.setSize(700,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	

}
