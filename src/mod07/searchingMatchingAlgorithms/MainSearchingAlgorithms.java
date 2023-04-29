package mod07.searchingMatchingAlgorithms;

import java.util.Scanner;

public class MainSearchingAlgorithms {
 

	public static void main(Scanner in) {
		 String xLoop = "";
		int x = -1;
		do {
			System.out.println("+++++++  SearchingAlgorithms ++++++++\n"
					+ ""
					+ "1- LinearSearch \n2- BinarySearch \n3- BruteForceStringMatch "
					+ "\n4- BoyerMooreStringMatch \n5- KMPStringMatch");
			String sel = in.nextLine();
			sel = sel.charAt(0) < '1' || sel.charAt(0) > '5' ? "1" : sel;
			int s = Integer.parseInt(sel);
			switch (s) {
			case 1:
				LinearSearch.main();
				break;
			case 2:
				BinarySearch.main();
				break;
			case 3:
				BruteForceStringMatch.main();
				break; 
			case 4:
				BoyerMooreStringMatch.main();
				break; 
			case 5:
				KMPStringMatch.main();
				break; 

			}
			System.out.println("\n========\nEnter (1) go back to [ Search ] Menu\nElse exit this Menu\n========\n");
			xLoop = in.nextLine();
			xLoop = xLoop.charAt(0) != '1' ? "2" : xLoop;
			  x = Integer.parseInt(xLoop);
		} while (x == 1);

	}

}
