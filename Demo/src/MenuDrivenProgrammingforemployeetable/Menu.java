package MenuDrivenProgrammingforemployeetable;

import java.util.Scanner;

public class Menu {

	static Scanner s;

	public static void main(String[] args) {
		System.out.println("Insert Record----> 1");
		System.out.println("Update Record----> 2");
		System.out.println("Delete Record----> 3");
		System.out.println("Display Records--> 4");
		System.out.println("Search Record----> 5");

		System.out.println("Please select from the option's above:");
		s = new Scanner(System.in);
		int key;
		key=s.nextInt();
		switch (key) {
		case 1: {
			new InsertRecord();
			
//			InsertRecord ir=new InsertRecord();			
//			ir.insertRecord();
			break;
		}
		case 2: {
			new UpdateRecord();
			break;
		}
		case 3: {
			new DeleteRecord();
			break;
		}
		case 4: {
			new DisplayRecords();
			break;
		}
		case 5: {
			new SearchRecord();
			break;
		}

		default:
			System.out.println(key +" -Selected option not available");
			break;
		}
	}

}
