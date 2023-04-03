import java.util.Scanner;
public class Menu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0;
		
		while(i!=6) {
			System.out.println("1.Menu:");
			System.out.println("2.Add Item");
			System.out.println("3.Delete Item");
			System.out.println("4.Edit Item");
			System.out.println("5.View Item");
			System.out.println("6.Exit");
			System.out.println("Select number between 1-6:");
			i=in.nextInt();
			switch(i) {
			case 1:
				continue;
			case 2:
				AddItems();
				break;
			case 3:
				DeleteItems();
				break;
			case 4:
				EditItems();
				break;
			case 5:
				ItemList();
				break;
			}
		}
	}
	public static void AddItems() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Item Name:");
		String itemName=in.next();
		System.out.println(itemName);
		System.out.println("Enter the Identification Number of Item:");
		int itemNumber=in.nextInt();
		System.out.println(itemNumber);
		System.out.println("Enter the quantity of Item:");
		int itemQuantity=in.nextInt();
		System.out.println(itemQuantity);
	}
	public static void DeleteItems() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Item Name:");
		String itemName=in.next();
		System.out.println(itemName);
	}
	public static void EditItems() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Item Name:");
		String itemName=in.next();
		System.out.println(itemName);
		System.out.println("Enter the quantity of Item:");
		int itemQuantity=in.nextInt();
		System.out.println(itemQuantity);
	}
	public static void ItemList() {
		System.out.println("Item List:");
	}
}