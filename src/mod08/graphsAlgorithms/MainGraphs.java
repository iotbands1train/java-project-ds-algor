package mod08.graphsAlgorithms;

import java.util.Scanner;

public class MainGraphs {
 

	public static void main(Scanner in) {
		 String xLoop = "";
		int x = -1;
		do {
			System.out.println("+++++++  Graphs ++++++++\n1- BFS \n2- DFS \n3- Graph \n");
			String sel = in.nextLine();
			sel = sel.charAt(0) < '1' || sel.charAt(0) > '3' ? "1" : sel;
			int s = Integer.parseInt(sel);
			switch (s) {
			case 1:
				TestBFS.main();
				break;
			case 2:
				TestDFS.main();
				break;
			case 3:
				TestGraph.main();
				break; 

			}
			System.out.println("\n========\nEnter (1) go back to  [Graphs] Menu\nElse exit this Menu\n========\n");
			xLoop = in.nextLine();
			xLoop = xLoop.charAt(0) != '1' ? "2" : xLoop;
			  x = Integer.parseInt(xLoop);
		} while (x == 1);

	}

}
