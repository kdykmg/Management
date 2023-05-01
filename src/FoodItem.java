import java.util.Scanner;

public class FoodItem extends Item{
	protected int expirationDate;
	
	public int getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(int expirationDate) {
		this.expirationDate = expirationDate;
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
