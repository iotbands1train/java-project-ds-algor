package mod05.technique.recursion;

import java.util.Scanner;

public class RecMainProgram123 {

	
	public static void main() {
	 
		String xLoop = "";
		int x = -1;
		do {

			System.out.println("[Rec-1]-(Occurrences of a specified character in a string)");
			System.out.println("[Rec-2]-(Find the largest number in an array)");
			System.out.println("[Rec-3]-(Occurrences of a specified character in an array) ");
			
			String sel = new Scanner(System.in).nextLine();
			sel = sel.charAt(0) < '1' || sel.charAt(0) > '3' ? "1" : sel;
			int s = Integer.parseInt(sel);
			switch (s) {
			case 1:
				Rec1.main();
				break;
			case 2:
				Rec2.main();
				break;
			case 3:
				Rec3.main();
				break; 

			}
			System.out.println("\n========\nEnter (1) go back to Menu\nElse exit this Menu\n========\n");
			xLoop = new Scanner(System.in).nextLine();
			xLoop = xLoop.charAt(0) != '1' ? "1" : xLoop;
			  x = Integer.parseInt(xLoop);
		} while (x == 1);

	}
	
	 
	
}
