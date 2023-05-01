import java.util.Scanner;
import java.util.ArrayList;

public class ItemMannerger {
	ArrayList<Item> itemList=new ArrayList<Item>();
	Scanner in;
	ItemMannerger(Scanner in){
		this.in=in;
	}
	public void AddItems() {
		System.out.println("is Item is food? 1.Y/2.N");
		int kind=0;
		Item item;
		while(kind!=1&&kind!=2) {
			kind=in.nextInt();
			if(kind==1) {
				item=new FoodItem();
				item.getInput(in);
				itemList.add(item);
				break;
				
			}
			else {
				item=new Item();
				item.getInput(in);
				itemList.add(item);
				break;
			}
		}
		
		
	}
	public void DeleteItems() {
		
		System.out.println("Enter the Identification Number of Item:");
		int itemNumber=in.nextInt();
		int index=-1;
		for(int i=0;i<itemList.size();i++) {
			if(itemList.get(i).getItemNumber()==itemNumber) {
				index=i;
				break;
			}
		}
		if(index>=0) {
			itemList.remove(index);
			System.out.println("Itemnumber"+itemNumber+"is delete");
		}
		else {
			System.out.println("there no itemnumber");
			return;
		}
	}
	public void EditItems() {
		System.out.println("Enter the Identification Number of Item:");
		int itemNumber=in.nextInt();
		int index=-1;
		for(int i=0;i<itemList.size();i++) {
			if(itemList.get(i).getItemNumber()==itemNumber) {
				index=i;
				break;
			}
		}
		int num=-1;
		while(num!=4) {
			num=in.nextInt();
			System.out.println("--Edit Menu--");
			System.out.println("1.Item Number:");
			System.out.println("2.Item Name:");
			System.out.println("3.Quantity of Item:");
			System.out.println("4.Exit");
			switch(num) {
			case 1:
				System.out.println("Item Number:");
				int number=in.nextInt();
				itemList.get(index).setItemNumber(number);
				break;
			case 2:
				System.out.println("Item Name:");
				String name=in.next();
				itemList.get(index).setItemName(name);
				break;
			case 3:
				System.out.println("Quantity of Item:");
				int quantity=in.nextInt();
				itemList.get(index).setItemQuantity(quantity);
				break;
			}
		}
	}
	public void ViewItem() {
		System.out.println("Enter the Identification Number of Item:");
		int itemNumber=in.nextInt();
		int index=-1;
		for(int i=0;i<itemList.size();i++) {
			if(itemList.get(i).getItemNumber()==itemNumber) {
				index=i;
				break;
			}
		}
		System.out.println("item number:"+itemList.get(index).getItemNumber());
		System.out.println("item name:"+itemList.get(index).getItemName());
		System.out.println("item quantity:"+itemList.get(index).getItemQuantity());
	}
	
}
