import java.util.Scanner;
public class Menu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ItemMannerger itemMannerger=new ItemMannerger(in);
		int i=0;
		
		while(i!=7) {
			System.out.println("1.Menu:");
			System.out.println("2.Add Item");
			System.out.println("3.Delete Item");
			System.out.println("4.Edit Item");
			System.out.println("5.View Item");
			System.out.println("6.View Item List");
			System.out.println("7.Exit");
			System.out.println("Select number between 1-7:");
			i=in.nextInt();
			switch(i) {
			case 1:
				continue;
			case 2:
				itemMannerger.AddItems();
				break;
			case 3:
				itemMannerger.DeleteItems();
				break;
			case 4:
				itemMannerger.EditItems();
				break;
			case 5:
				itemMannerger.ViewItem();
				break;
			case 6:
				itemMannerger.ItemList();
				break;
			}
		}
	}
	
	
}