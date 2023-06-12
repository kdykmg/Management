package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import listener.ButtonCancel;
import maneger.ETCItem;
import maneger.EventLog;
import maneger.Item;
import maneger.ItemMannerger;

public class ItemViewer extends JPanel{
	
	WindowFrame frame;
	ItemMannerger itemMannerger;
	EventLog logger;
	
	@SuppressWarnings("rawtypes")
	public ItemViewer(WindowFrame frame,ItemMannerger itemMannerger,EventLog logger) {
		this.frame=frame;
		this.itemMannerger=itemMannerger;
		this.logger=logger;
		
		DefaultTableModel model=new DefaultTableModel();
		
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Quantity");
		model.addColumn("expirationDate");
		
		for(int i=0;i<itemMannerger.size();i++) {
			System.out.println("abx");
		    Vector<Comparable> row=new Vector<Comparable>();
		    ETCItem item= (ETCItem)itemMannerger.itemList.get(i);
		    System.out.println(item.getItemNumber());
		    row.add(item.getItemNumber());
		    row.add(item.getItemName());
		    row.add(item.getItemQuantity());
		    row.add(item.getExpirationDate());
		    model.addRow(row);
		}
		JTable table =new JTable(model);
		JScrollPane sp=new JScrollPane(table);
		
		JButton button1 =new JButton("Cancel");
		this.add(button1);
		button1.addActionListener(new ButtonCancel(frame));

		
		this.add(sp);
	}
	
}

