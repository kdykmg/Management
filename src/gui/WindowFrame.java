package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import maneger.EventLog;
import maneger.ItemMannerger;


public class WindowFrame extends JFrame{
	ItemMannerger itemMannerger;
	EventLog logger;
	MenuGui menu;
	ItemAdder edder;
	ItemViewer viwer;
	ItemEditer editer;
	ItemDeleter deleter;
	
	public WindowFrame(ItemMannerger itemMannerger,EventLog logger){
		this.itemMannerger=itemMannerger;
		this.menu=new MenuGui(this,this.itemMannerger,logger);
		this.edder=new ItemAdder(this,this.itemMannerger, logger);
		this.viwer=new ItemViewer(this,this.itemMannerger,logger);
		this.editer=new ItemEditer(this,this.itemMannerger,logger);
		this.deleter=new ItemDeleter(this,this.itemMannerger,logger);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menu);
		
		this.setVisible(true);
	}
	
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuGui getMenu() {
		return menu;
	}

	public void setMenu(MenuGui menu) {
		this.menu = menu;
	}

	public ItemAdder getEdder() {
		return edder;
	}

	public void setEdder(ItemAdder edder) {
		this.edder = edder;
	}

	public ItemViewer getViwer() {
		return viwer;
	}

	public void setViwer(ItemViewer viwer) {
		this.viwer = viwer;
	}

	public ItemEditer getEditer() {
		return editer;
	}

	public void setEditer(ItemEditer editer) {
		this.editer = editer;
	}

	public ItemDeleter getDeleter() {
		return deleter;
	}

	public void setDeleter(ItemDeleter deleter) {
		this.deleter = deleter;
	}


}
