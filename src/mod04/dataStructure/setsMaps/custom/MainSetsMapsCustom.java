package mod04.dataStructure.setsMaps.custom;

import java.util.Scanner;

public class MainSetsMapsCustom {
 

	public static void main(Scanner in) {
		 String xLoop = "";
		int x = -1;
		do {
			System.out.println("+++++++    Sets Maps option menu ++++++++\n"
					+ ""
					+ "1- TestMyHashMap \n2- TestMyHashSet ");
			String sel = in.nextLine();
			sel = sel.charAt(0) < '1' || sel.charAt(0) > '2' ? "1" : sel;
			int s = Integer.parseInt(sel);
			switch (s) {
			case 1:
				TestMyHashMap.main();
				break;
			case 2:
				TestMyHashSet.main();
				break; 

			}
			System.out.println("\n========\nEnter (1) go back to [ Custom Sets Maps ] Menu\nElse exit this Menu\n========\n");
			xLoop = in.nextLine();
			xLoop = xLoop.charAt(0) != '1' ? "2" : xLoop;
			  x = Integer.parseInt(xLoop);
		} while (x == 1);

	}

}
