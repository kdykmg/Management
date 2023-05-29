import java.io.Serializable;

public abstract class Item implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	public abstract void setItem(int itemNumber,String itemName,int itemQuantity); 
	public abstract void setItem(int expirationDate);
}
