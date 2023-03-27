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
				System.out.println("Enter the Item Name:");
				String itemName=in.next();
				System.out.println("Enter the quantity of Item:");
				int itemQuantity=in.nextInt();
				break;
			case 3:
				System.out.println("Enter the Item Name:");
				String itemName2=in.next();
				itemName=null;
				break;
			case 4:
				System.out.println("Enter the Item Name:");
				String itemName3=in.next();
				System.out.println("Enter the quantity of Item:");
				int itemQuantity3=in.nextInt();
				itemQuantity=itemQuantity3;
				break;
			case 5:
				System.out.println("Item List:");
				break;
			}
		}
	}

}