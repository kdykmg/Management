import java.util.Scanner;

public class Item {
	protected int itemNumber;
	protected String itemName;
	protected int itemQuantity;
	
		
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public void getInput(Scanner in) {
		System.out.println("Enter the Identification Number of Item:");
		int itemNumber=in.nextInt();
		this.setItemNumber(itemNumber);
		System.out.println(itemNumber);
		System.out.println("Enter the Item Name:");
		String itemName=in.next();
		this.setItemName(itemName);
		System.out.println(itemName);
		System.out.println("Enter the quantity of Item:");
		int itemQuantity=in.nextInt();
		this.setItemQuantity(itemQuantity);
		System.out.println(itemQuantity);
	}
}
