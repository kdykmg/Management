import java.util.Scanner;

public class ItemMannerger {
	static Item[] item=new Item[10];
	Scanner in;
	ItemMannerger(Scanner in){
		this.in=in;
	}
	public void AddItems() {
		System.out.println("Enter the Identification Number of Item:");
		int itemNumber=in.nextInt();
		System.out.println(itemNumber);
		System.out.println("Enter the Item Name:");
		String itemName=in.next();
		System.out.println(itemName);
		System.out.println("Enter the quantity of Item:");
		int itemQuantity=in.nextInt();
		System.out.println(itemQuantity);
		item[itemNumber-1]=new Item(itemNumber,itemName,itemQuantity);
	}
	public void DeleteItems() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Identification Number of Item:");
		int itemNumber=in.nextInt();
		item[itemNumber-1]=null;
	}
	public void EditItems() {
		
		System.out.println("Enter the Identification Number of Item:");
		int itemNumber=in.nextInt();
		System.out.println("Enter the Item Name:");
		String itemName=in.next();
		System.out.println("Enter the quantity of Item:");
		int itemQuantity=in.nextInt();
		item[itemNumber-1].edit(itemName,itemQuantity);
	}
	public void ViewItem() {
		
		System.out.println("Enter the Identification Number of Item:");
		int itemNumber=in.nextInt();
		item[itemNumber-1].viewItemNumber();
		item[itemNumber-1].viewItemName();
		item[itemNumber-1].viewItemQuantity();
	}
	public void ItemList() {
		System.out.println("Item List:");
		for(int i=0;i<10;i++) {
			if(item[i]==null)continue;
			item[i].viewItemNumber();
			item[i].viewItemName();
			item[i].viewItemQuantity();
			System.out.println("");
		}
	}
}
