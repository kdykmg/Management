import java.util.Scanner;
import java.util.InputMismatchException;
public class Menu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ItemMannerger itemMannerger=new ItemMannerger(in);
		selectMenu(in,itemMannerger);
	}
	public static void selectMenu(Scanner in,ItemMannerger itemMannerger) {
		int i=0;
		while(i!=6) {
			try {
				viewMenu();
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
				}
			}catch(InputMismatchException e) {
				System.out.println("please Select number between 1-6");
				if(in.hasNext()) {
					in.next();
				}
				i=-1;
			}
		}
	}
	public static void viewMenu() {
		System.out.println("1.Menu:");
		System.out.println("2.Add Item");
		System.out.println("3.Delete Item");
		System.out.println("4.Edit Item");
		System.out.println("5.View Item");
		System.out.println("6.Exit");
		System.out.println("Select number between 1-6:");
	}
	
	
}