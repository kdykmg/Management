package maneger;
import java.util.Scanner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class ItemMannerger implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ArrayList<Item> itemList=new ArrayList<Item>();
	transient Scanner in;
	public ItemMannerger(Scanner in){
		this.in=in;
	}
	public void AddItems(EventLog logger,int kind,int number,String name,int quantity,int date) {
		ETCItem item;
		int index=itemCheck(number);
		if(index!=-1) {
			System.out.println("there is already itemnumber");
			return;
		}
			try {
				if(kind==1) {
					item=new FoodItem();
					item.setItem(number, name, quantity);
					item.setItem(date);
					itemList.add(item);
					logger.log("Add Food Item");

				}
				else {
					item=new ETCItem();
					item.setItem(number, name, quantity);
					itemList.add(item);
					logger.log("Add Item");

				}
			}catch(InputMismatchException e) {
				System.out.println("please Select number '1'or'2'");
				if(in.hasNext()) {
					in.next();
					kind=0;
			}
		}
	}
	public void DeleteItems(EventLog logger,int number) {
		int index=itemCheck(number);
		if(index==-1) {
			System.out.println("there is no itemnumber");
			return;
		}
		else {
			System.out.println("Itemnumber '"+number+"' is delete");
			itemList.remove(index);
			logger.log("Delete Item");
		}
	}
	public void EditItems(EventLog logger,int num,int number,String name,int quantity,int date) {
		int index1=itemCheck(num);
		int index2=itemCheck(number);
		if(index1==-1) {
			System.out.println("there is no itemnumber");
			return;
		}
		else if(index2!=-1){
			System.out.println("there is already itemnumber");
			return;
			}
		else {
			itemList.get(index1).setItemNumber(number);
			itemList.get(index1).setItemName(name);
			itemList.get(index1).setItemQuantity(quantity);
			itemList.get(index1).setExpirationDate(date);
			logger.log("Edit Item");
		}
	}
	public void ViewItem(EventLog logger) {
		int index=itemCheck();
		if(index==-1) {
			System.out.println("there is no itemnumber");
			return;
		}
		ETCItem item= (ETCItem)itemList.get(index);
		item.printInfo();
		logger.log("View Item");
	}

	public int itemCheck(int number) {
		int index=-1;
			for(int i=0;i<itemList.size();i++) {
				if(itemList.get(i).getItemNumber()==number) {
					index=i;
				}
			}
			return index;
	}
	public void showMenu() {
		System.out.println("--Edit Menu--");
		System.out.println("1.Item Number:");
		System.out.println("2.Item Name:");
		System.out.println("3.Quantity of Item:");
		System.out.println("4.expirationDate of Item:");
		System.out.println("5.Exit");
	}
	public int size() {
		return itemList.size();
	}
}
