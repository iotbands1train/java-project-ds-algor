package models.mod01mod09;

import java.util.Scanner;

import mod01.dataStructure.arraysCollections.TestDStime;
import mod02.dataStructure.arrayListLinkedList.TestPersonLinkedList;
import mod02.dataStructure.arrayListLinkedList.TestPersonMyArrayList;
import mod03.dataStructure.vectorsSacksQues.SpeedTestVectorStacksQueues;
import mod03.dataStructure.vectorsSacksQues.TestVectorStacksQueuesMethods;
import mod04.dataStructure.setsMaps.SetsMapsMainTest;
import mod04.dataStructure.setsMaps.custom.MainSetsMapsCustom;
import mod05.technique.recursion.RecMainProgram123;
import mod06.sortingAlgorithms.UserSortTest;
import mod07.searchingMatchingAlgorithms.MainSearchingAlgorithms;
import mod08.designAlgorithms.MainDesignAlgorithms;
import mod08.graphsAlgorithms.MainGraphs;
import mod09.treesAlgorithms.MainTree;
import mod09.treesAlgorithms.UserTreeManager;
import x.start.main.Cosc2436StudentProject;

public class DSAprogramMain {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		start();

		 
		System.out.println("I/O closing .... Program Ending! ... Start Program Again");
		in.close();
	}

	private static void start() {
		
		startMenu();
		
	}

	private static void startMenu() {
		 
		String xLoop = "";
		int x = -1;
		do {
			System.out.println(" 1- [MOD-01 thur MOD-06]  - Projects");
			System.out.println(" 2- [MOD-07 thur MOD-09]  - Projects"); 
			System.out.println(" 3- [MOD-09] - UserTreeManager.java"); 
			System.out.println(" 4- [ *Cosc 2436 Student Project* ]");
			
			String sel = in.nextLine();
			sel = sel.charAt(0) < '1' || sel.charAt(0) > '4' ? "1" : sel;
			int s = Integer.parseInt(sel);
			switch (s) {
			case 1:
				startByProjects();
				break;
			case 2: 
				menu();
				break;
			case 3:
				UserTreeManager.main();
				break; 
			case 4:
				Cosc2436StudentProject.main();
				break; 

			}
			System.out.println("\n========\nEnter (1) go back to  [Main] Menu\nElse exit this Menu\n========\n");
			xLoop = in.nextLine();
			xLoop = xLoop.charAt(0) != '1' ? "2" : xLoop;
			  x = Integer.parseInt(xLoop);
		} while (x == 1);

		
	}

	private static void menu() {
		String xLoop = "";
		int x = -1;
		do {
			System.out.println(" 1- Main_Searching_Algorithms  ");
			System.out.println(" 2- Main_Design_Algorithms   ");
			System.out.println(" 3- Main_Graphs  ");
			System.out.println(" 4- Main_Trees  ");
			String sel = in.nextLine();
			sel = sel.charAt(0) < '1' || sel.charAt(0) > '4' ? "1" : sel;
			int s = Integer.parseInt(sel);
			switch (s) {
			case 1:
				MainSearchingAlgorithms.main(in);
				break;
			case 2:
				MainDesignAlgorithms.main(in);
				break;
			case 3:
				MainGraphs.main(in);
				break;
			case 4:
				MainTree.main(in);
				break;
			 

			}
			System.out.println("\n========\nEnter (1) go back to [Menu Main 07-09 ] Menu\nElse exit this Menu\n========\n");
			xLoop = in.nextLine();
			xLoop = xLoop.charAt(0) != '1' ? "2" : xLoop;
			  x = Integer.parseInt(xLoop);
		} while (x == 1);

	}

	private static void startByProjects() {
		
		selectMod00projectMod06();
	}

	private static void selectMod00projectMod06() {
		String xLoop = "";
		int x = -1;
		String sel = "";
		do { 
			
			System.out.println(" 1-[PROJECTS] [MOD-01] [ Arrays & Collections Hiearchry ] [JP-2]	  ");
			System.out.println(" 2-[PROJECTS] [MOD-02] [ List - ArrayList vs LinkedList ] [JP-3]	  ");
			System.out.println(" 3-[PROJECTS] [MOD-03] [ Vectors vs Queues vs Stacks] [JP-4]	  ");
			System.out.println(" 4-[PROJECTS] [MOD-04] [ Sets and Maps] [JP-5]	*bonus*  ");
			System.out.println(" 5-[PROJECTS] [MOD-05] [ RECURSION] [JP-6]	  ");
			System.out.println(" 6-[PROJECTS] [MOD-06] [ SORTING ALGO.] [JP-7]	  ");

			  sel = in.nextLine();
			sel = sel.charAt(0) < '1' || sel.charAt(0) > '6' ? "1" : sel;
			int s = Integer.parseInt(sel);
			switch (s) {
			case 1:
				System.out.println("\n====[ Arrays vs Collections ]=====\n");
				TestDStime.main();
				break;
			case 2:
				System.out.println("\n====[ ArrayList vs LinkedList ]=====\n");
				mod02(); 
				break;
			case 3: 
				System.out.println("\n====[ Vectors vs Stacks vs Queues ]=====\n");
				mod03();
				break;
			case 4:
				System.out.println("\n====[ Sets vs Maps ]=====\n");
				String xLoop2 = "";
				int x2 = -1;
				do {System.out.println("\n1- SetsMapsTest 2- Custom Sets Maps");
					String sel2 = in.nextLine();
					sel2 = sel2.charAt(0) < '1' || sel2.charAt(0) > '2' ? "1" : sel2;
					int s2 = Integer.parseInt(sel2);
					switch (s2) {
					case 1:
						SetsMapsMainTest.main();	
						break;
					case 2:
						MainSetsMapsCustom.main(in);
						break; 

					}
					System.out.println("\n========\nEnter (1) go back to Menu\nElse exit this Menu\n========\n");
					xLoop2 = in.nextLine();
					xLoop2 = xLoop2.charAt(0) != '1' ? "2" : xLoop2;
					  x2 = Integer.parseInt(xLoop2);
				} while (x2 == 1);
 			
				break;
			case 5:
				System.out.println("\n====[ Recursion]=====\n");
				RecMainProgram123.main();
				break;
			case 6: 
				System.out.println("\n====[ Sorting Algorithms ]=====\n");
				UserSortTest.main();
				break; 

			}
			System.out.println("\n========\nEnter (1) go back to [Mod Projects] Menu\nElse exit this Menu\n========\n");
			xLoop = in.nextLine();
			xLoop = xLoop.charAt(0) != '1' ? "2" : xLoop;
			x = Integer.parseInt(xLoop);
		} while (x == 1);

	}

	private static void mod03() {

		String xLoop = "";
		int x = -1;
		do {
			
			System.out.println("1 - [Speed Test] -> Vector, Stacks,  & Queues");
			System.out.println("2 - Vector, Stacks,  & Queues <- [Methods]");
			String sel = in.nextLine();
			sel = sel.charAt(0) < '1' || sel.charAt(0) > '2' ? "3" : sel;
			int s = Integer.parseInt(sel);
			switch (s) {
			case 1:
				SpeedTestVectorStacksQueues.main();
				break;
			case 2:
				TestVectorStacksQueuesMethods.main();
				break; 
			case 3:
				System.out.println("no selection in mod03 vec, stk, que menu");
				break;  

			}
			System.out.println("\n========\nEnter (1) go back to [Vectors vs Stack vs Queues] Menu\nElse exit this Menu\n========\n");
			xLoop = in.nextLine();
			xLoop = xLoop.charAt(0) != '1' ? "2" : xLoop;
			  x = Integer.parseInt(xLoop);
		} while (x == 1);
	}

	private static void mod02() {
		
		String xLoop = "";
		int x = -1;
		do {
			
			System.out.println("1 - ArrayList");
			System.out.println("2 - LinkedList");
			String sel = in.nextLine();
			sel = sel.charAt(0) < '1' || sel.charAt(0) > '2' ? "3" : sel;
			int s = Integer.parseInt(sel);
			switch (s) {
			case 1:
				TestPersonMyArrayList.main();
				break;
			case 2:
				TestPersonLinkedList.main();
				break; 
			case 3:
				System.out.println("no selection in mod02 list menu");
				break; 

			}
			System.out.println("\n========\nEnter (1) go back to [ArrayList vs LinkedList] Menu\nElse exit this Menu\n========\n");
			xLoop = in.nextLine();
			xLoop = xLoop.charAt(0) != '1' ? "2" : xLoop;
			  x = Integer.parseInt(xLoop);
		} while (x == 1);

	}

}
