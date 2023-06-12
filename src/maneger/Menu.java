package maneger;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
public class Menu {
	static EventLog logger =new EventLog("log.txt");
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ItemMannerger itemMannerger=getObject("mannager.ser");
		if(itemMannerger==null) {
			itemMannerger=new ItemMannerger(in);
		}
		
		WindowFrame window =new WindowFrame(itemMannerger,logger);

		putObject(itemMannerger,"mannager.ser");
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
	public static ItemMannerger getObject(String fileName) {
		ItemMannerger itemMannerger=null;
		try {
			FileInputStream file =new FileInputStream(fileName);
			ObjectInputStream in =new ObjectInputStream(file);
			itemMannerger=(ItemMannerger)in.readObject();
			in.close();
			file.close();
		}catch(FileNotFoundException e) {
			return itemMannerger;
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return itemMannerger;
	}
	public static void putObject(ItemMannerger itemMannerger,String fileName) {
		try {
			FileOutputStream file =new FileOutputStream(fileName);
			ObjectOutputStream out =new ObjectOutputStream(file);
			out.writeObject(itemMannerger);
			out.close();
			file.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}