
public class Item {
	private int itemNumber;
	private String itemName;
	private int itemQuantity;
	Item(int itemNumber,String itemName,int itemQuantity){
		this.itemNumber=itemNumber;
		this.itemName=itemName;
		this.itemQuantity=itemQuantity;
	}
	public void edit(String itemName,int itemQuantity) {
		this.itemName=itemName;
		this.itemQuantity=itemQuantity;
	}
	public void viewItemNumber() {
		System.out.println("Item number: "+itemNumber);
	}
	public void viewItemName() {
		System.out.println("Item name: "+itemName);
	}
	public void viewItemQuantity() {
		System.out.println("Item Quantity: "+itemQuantity);
	}
}
