import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ETCItem extends Item implements ItemInfo{

	public void setItem(int itemNumber,String itemName,int itemQuantity) {
		this.kind=Kind.Etc;
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
	}
	public void setItem(int expirationDate) {
		this.kind=Kind.Food;
		this.expirationDate = expirationDate;
	}
	
	public int getInput(Scanner in,ArrayList<Item>itemList) {
		System.out.println("Enter the Identification Number of Item:");
		int itemNumber;
		try {
			itemNumber=in.nextInt();
			int index=-1;
			for(int i=0;i<itemList.size();i++) {
				if(itemList.get(i).getItemNumber()==itemNumber) {
					index=i;
				}
			}
			if(index!=-1) {
				System.out.println("there is already itemnumber");
				return 0;
			}
		}catch(InputMismatchException c) {
			System.out.println("please Enter a Number");
			if(in.hasNext()) {
				in.next();
				itemNumber=-1;
			}
			getInput(in,itemList);
			return 0;
		}
		System.out.println(itemNumber);
		String itemName= getInputItemName(in,itemList);
		int itemQuantity=getInputItemQuantity(in,itemList);
		setItem(itemNumber,itemName,itemQuantity);
		return 1;
	}
	public void printInfo() {
		System.out.println("kind:"+getKind());
		System.out.println("item number:"+getItemNumber());
		System.out.println("item name:"+getItemName());
		System.out.println("item quantity:"+getItemQuantity());
	}
	public String getInputItemName(Scanner in,ArrayList<Item>itemList) {
		System.out.println("Enter the Item Name:");
		String itemName=in.next();
		System.out.println(itemName);
		return itemName;
	}
	public int getInputItemQuantity(Scanner in,ArrayList<Item>itemList) {
		System.out.println("Enter the quantity of Item:");
		int itemQuantity = 0;
		try {
			itemQuantity=in.nextInt();
			System.out.println(itemQuantity);
			return itemQuantity;
		}catch(InputMismatchException c) {
			if(in.hasNext()) {
				in.next();
				itemQuantity=-1;
				System.out.println("please Enter a Number");
				itemQuantity=getInputItemQuantity(in,itemList);
				return itemQuantity;
			}
		}
		return itemQuantity;
	}
}
