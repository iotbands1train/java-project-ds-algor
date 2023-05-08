package mod08.designAlgorithms;

import java.util.Scanner;

public class MainDesignAlgorithms {
 

	public static void main(Scanner in) {
		 String xLoop = "";
		int x = -1;
		do {
			System.out.println("+++++++  Design Algo ++++++++\n1- Euclid \n2- DynamicProgramming \n3- SieveOfEratosthenes \n");
			String sel = in.nextLine();
			sel = sel.charAt(0) < '1' || sel.charAt(0) > '3' ? "1" : sel;
			int s = Integer.parseInt(sel);
			switch (s) {
			case 1:
				GCD_Euclid.main();
				break;
			case 2:
				ImprovedFibonacci_DynamicProgramming.main();
				break;
			case 3:
				PrimeNumbers_SieveOfEratosthenes.main();
				break; 

			}
			System.out.println("\n========\nEnter (1) go back to  [Design] Menu\nElse exit this Menu\n========\n");
			xLoop = in.nextLine();
			xLoop = xLoop.charAt(0) != '1' ? "2" : xLoop;
			  x = Integer.parseInt(xLoop);
		} while (x == 1);

	}

}
