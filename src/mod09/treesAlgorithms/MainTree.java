package mod09.treesAlgorithms;
 

public class MainTree {
 

	public static void main(java.util.Scanner in) {
		 String xLoop = "";
		int x = -1;
		do {
			System.out.println("+++++++  Trees ++++++++\n1- TestAVLTree \n2- TestBST \n3- TestBSTDelete \n");
			String sel = in.nextLine();
			sel = sel.charAt(0) < '1' || sel.charAt(0) > '3' ? "1" : sel;
			int s = Integer.parseInt(sel);
			switch (s) {
			case 1:
				TestAVLTree.main();
				break;
			case 2:
				TestBST.main();
				break;
			case 3:
				TestBSTDelete.main();
				break; 

			}
			System.out.println("\n========\nEnter (1) go back to [Trees] Menu\nElse exit this Menu\n========\n");
			xLoop = in.nextLine();
			xLoop = xLoop.charAt(0) != '1' ? "2" : xLoop;
			  x = Integer.parseInt(xLoop);
		} while (x == 1);

	}

}
