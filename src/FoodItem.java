import java.util.ArrayList;
import java.util.Scanner;

public class FoodItem extends ETCItem implements ItemInfo{

	public void getInput(Scanner in,ArrayList<Item>itemList) {
		super.getInput(in,itemList);
		System.out.println("Enter the expiration date of Item:");
		int itemExpirationDate=in.nextInt();
		System.out.println(itemExpirationDate);
		setItem(itemExpirationDate);
	}	
	public void printInfo() {
		super.printInfo();
		System.out.println("item expiration date:"+getExpirationDate());
	}
}
