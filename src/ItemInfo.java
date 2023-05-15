import java.util.ArrayList;
import java.util.Scanner;

public interface ItemInfo {
	public abstract void getInput(Scanner in,ArrayList<Item>itemList);
	public abstract void printInfo();
}
