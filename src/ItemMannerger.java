import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class ItemMannerger {
	ArrayList<Item> itemList=new ArrayList<Item>();
	Scanner in;
	ItemMannerger(Scanner in){
		this.in=in;
	}
	public void AddItems() {
		System.out.println("is Item is food? 1.Yes/2.No");
		int kind=0;
		ETCItem item;
		while(kind!=1&&kind!=2) {
			try {
				kind=in.nextInt();
				if(kind==1) {
					item=new FoodItem();
					item.getInput(in,itemList);
					itemList.add(item);
					break;
				}
				else {
					item=new ETCItem();
					item.getInput(in,itemList);
					itemList.add(item);
					break;
				}
			}catch(InputMismatchException e) {
				System.out.println("please Select number '1'or'2'");
				if(in.hasNext()) {
					in.next();
					kind=0;
				}
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
					try {
					showMenu();
					num=in.nextInt();
					switch(num) {
					case 1:
						setItemNumber(index);
						break;
					case 2:
						setItemName(index);
						break;
					case 3:
						setItemQuantity(index);
						break;
					case 4:
						setItemExpirationDate(index);
						break;
					}
				}catch(InputMismatchException e) {
					System.out.println("please enter a number");
					if(in.hasNext()) {
						in.next();
						num=-1;
					}
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
		ETCItem item= (ETCItem)itemList.get(index);
		item.printInfo();
	}
	public void setItemNumber(int index) {
		int itemNumber;
		try {
			System.out.println("Enter the Identification Number of Item:");
			itemNumber=in.nextInt();
			for(int i=0;i<itemList.size();i++) {
				if(itemList.get(i).getItemNumber()==itemNumber) {
					System.out.println("there is already itemnumber");
					return;
				}
			}
			itemList.get(index).setItemNumber(itemNumber);
		}catch(InputMismatchException e) {
			System.out.println("please enter a number");
			if(in.hasNext()) {
				in.next();
				itemNumber=0;
				setItemNumber(index);
			}
		}
	}
	public void setItemName(int index) {
		System.out.println("Item Name:");
		String name=in.next();
		itemList.get(index).setItemName(name);
	}
	public void setItemQuantity(int index) {
		int quantity;
		try {
			System.out.println("Quantity of Item:");
			quantity=in.nextInt();
			itemList.get(index).setItemQuantity(quantity);
		}catch(InputMismatchException e) {
			System.out.println("please enter a number");
			if(in.hasNext()) {
				in.next();
				quantity=0;
				setItemQuantity(index);
			}
		}
	}
	public void setItemExpirationDate(int index) {
		int date;
		try {
			if(itemList.get(index).kind==Kind.Food) {
				System.out.println("expirationDate of Item:");
				date=in.nextInt();
				itemList.get(index).setExpirationDate(date);
			}
		
			else System.out.println("there no expirationDate of Item ");
		}catch(InputMismatchException e) {
			System.out.println("please enter a number");
			if(in.hasNext()) {
				in.next();
				date=0;
				setItemExpirationDate(index);
			}
		}
	}
	public int itemCheck() {
		int itemNumber;
		int index=-1;
		try {
			System.out.println("Enter the Identification Number of Item:");
			itemNumber=in.nextInt();
			for(int i=0;i<itemList.size();i++) {
				if(itemList.get(i).getItemNumber()==itemNumber) {
					index=i;
				}
			}
			return index;
		}catch(InputMismatchException e) {
			System.out.println("please enter a number");
			if(in.hasNext()) {
				in.next();
				itemNumber=0;
				index=itemCheck();
				return index;
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
}
