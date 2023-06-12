package maneger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class FoodItem extends ETCItem implements ItemInfo{

	public void printInfo() {
		super.printInfo();
		System.out.println("item expiration date:"+getExpirationDate());
	}
	public int getInputItemExpirationDate(Scanner in,ArrayList<Item>itemList) {
		int itemExpirationDate;
		try {
			System.out.println("Enter the expiration date of Item:");
			itemExpirationDate=in.nextInt();
			System.out.println(itemExpirationDate);
			return itemExpirationDate;
		}catch(InputMismatchException e) {
			if(in.hasNext()) {
				in.next();
				itemExpirationDate=-1;
				System.out.println("please Enter a Number");
				itemExpirationDate=getInputItemExpirationDate(in,itemList);
				return itemExpirationDate;
			}
		}
		return 1;
	}
}
