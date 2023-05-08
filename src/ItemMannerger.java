import java.util.Scanner;
import java.util.ArrayList;

public class ItemMannerger {
	ArrayList<Item> itemList=new ArrayList<Item>();
	Scanner in;
	ItemMannerger(Scanner in){
		this.in=in;
	}
	public void AddItems() {
		System.out.println("is Item is food? 1.Yes/2.No");
		int kind=0;
		Item item;
		while(kind!=1&&kind!=2) {
			kind=in.nextInt();
			if(kind==1) {
				item=new FoodItem();
				item.getInput(in,itemList);
				itemList.add(item);
				break;
			}
			else {
				item=new Item();
				item.getInput(in,itemList);
				itemList.add(item);
				break;
			}
		}
	}
	public void DeleteItems() {
		int index=itemCheck();
		if(index==-1) {
			System.out.println("there is no itemnumber");
			return;
		}
		else {
			System.out.println("Itemnumber '"+itemList.get(index).getItemNumber()+"' is delete");
			itemList.remove(index);
		}
	}
	public void EditItems() {
		int index=itemCheck();
		if(index==-1) {
			System.out.println("there is no itemnumber");
			return;
		}
		else {
			int num=-1;
			while(num!=5) {
				System.out.println("--Edit Menu--");
				System.out.println("1.Item Number:");
				System.out.println("2.Item Name:");
				System.out.println("3.Quantity of Item:");
				System.out.println("4.expirationDate of Item:");
				System.out.println("5.Exit");
				num=in.nextInt();
				switch(num) {
				case 1:
					int number=itemCheck();
					if(number!=-1) {
						System.out.println("there is already itemnumber");
					}
					else {
						itemList.get(index).setItemNumber(number);
					}
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
				case 4:
					if(itemList.get(index).kind==Kind.Food) {
						System.out.println("expirationDate of Item:");
						int date=in.nextInt();
						itemList.get(index).setExpirationDate(date);
						break;
					}
					else System.out.println("there no expirationDate of Item ");
					break;
				}
			}
		}
	}
	public void ViewItem() {
		int index=itemCheck();
		if(index==-1) {
			System.out.println("there is no itemnumber");
			return;
		}
		itemList.get(index).printInfo();
	}
	public int itemCheck() {
		System.out.println("Enter the Identification Number of Item:");
		int itemNumber=in.nextInt();
		int index=-1;
		for(int i=0;i<itemList.size();i++) {
			if(itemList.get(i).getItemNumber()==itemNumber) {
				index=i;
			}
		}
		return index;
	}
}
