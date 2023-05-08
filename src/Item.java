import java.util.ArrayList;
import java.util.Scanner;

public class Item {
	protected Kind kind;
	protected int itemNumber;
	protected String itemName;
	protected int itemQuantity;
	protected int expirationDate;
	
	public int getItemNumber() {
		return itemNumber;
	}
	public String getItemName() {
		return itemName;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public int getExpirationDate() {
		return expirationDate;
	}
	public Kind getKind() {
		return kind;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public void setExpirationDate(int expirationDate) {
		this.expirationDate = expirationDate;
	}
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
	
	public void getInput(Scanner in,ArrayList<Item>itemList) {
		System.out.println("Enter the Identification Number of Item:");
		int itemNumber=in.nextInt();
		int index=-1;
		for(int i=0;i<itemList.size();i++) {
			if(itemList.get(i).getItemNumber()==itemNumber) {
				index=i;
			}
		}
		if(index!=-1) {
			System.out.println("there is already itemnumber");
			return;
		}
		System.out.println(itemNumber);
		System.out.println("Enter the Item Name:");
		String itemName=in.next();
		System.out.println(itemName);
		System.out.println("Enter the quantity of Item:");
		int itemQuantity=in.nextInt();
		System.out.println(itemQuantity);
		setItem(itemNumber,itemName,itemQuantity);
	}
	public void printInfo() {
		System.out.println("kind:"+getKind());
		System.out.println("item number:"+getItemNumber());
		System.out.println("item name:"+getItemName());
		System.out.println("item quantity:"+getItemQuantity());
	}
}
