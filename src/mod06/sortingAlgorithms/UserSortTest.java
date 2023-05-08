package mod06.sortingAlgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import models.mod01mod09.Accounts;
import models.mod01mod09.Person;
import models.mod01mod09.Users;

public class UserSortTest {

	// (Instructor notes)
	// start: provides System.currentTimeMillis()
	// times: (System.currentTimeMillis()-start)*.001
	// @purpose : to time speed algorithms for sorting
	// @related : start() and end() methods
	private static long start;
	private static double timeSecs;

	/**
	 * @purpose start program , ask user to select User Person Accounts to sort by
	 *          #number of people either 100,1k,10k,35417(all)
	 * @param args
	 */

	public static void main() {

		int again = 0;
		Users[] randomArr = null;
		do {
			List<Users> list = loadDataLinkedList();
			print(list);
			System.out.println("================\nWelcome - data loaded");
			System.out.println("Return Random List of Users[1-" + list.size() + "] by :");
			System.out.println("1 - 100 Users");
			System.out.println("2 - 1k Users");
			System.out.println("3 - 10k Users\n4 - All Users[" + list.size() + "]\n===================");
			int select = 0;
			char input = ' ';
			input = new Scanner(System.in).nextLine().charAt(0);
			input = input < '1' || input > '4' ? '1' : input;
			select = Integer.parseInt(input + "");
			System.out.println(select);
			randomArr = randomUsers(list, select);
			print(randomArr);
			int k = 0;
			do {
				algorithmMenu(randomArr);
				System.out.println("================\n1-Back SortAlgos\n===================");
				k = Integer.parseInt(new Scanner(System.in).nextLine());
			} while (k == 1);
			System.out.println("1-Reload Main Menu\nElse-Exit");
			again = Integer.parseInt(new Scanner(System.in).nextLine());
		} while (again == 1);
	}
	 
	/**
	 * @purpose produce random Users based of main menu option. main
	 * @param list
	 * @param select
	 * @return
	 */
	private static Users[] randomUsers(List<Users> list, int select) {
		int size = list.size();
		int returnSize = select == 4 ? size : select == 3 ? 10_000 : select == 2 ? 10_000 : 100;
		Users[] arr = new Users[returnSize];
		int random = new Random().nextInt(0, size);
		for (int i = 0; i < arr.length; i++) {
			random = new Random().nextInt(0, size);
			Users users = list.get(random);
			arr[i] = users;
		}
		return arr;
	}


	/**
	 * @purpose Main Algorithm Menu select between various algorithms for sorting
	 * 
	 * @param randomArr
	 */
	private static void algorithmMenu(Users[] randomArr) {
		System.out.println("============================\nSorting Algorithms Menu Types");
		System.out.println("         1-SortBy InsertionSort");
		System.out.println("         2-SortBy BubbleSort");
		System.out.println("         3-SortBy MergeSort");
		System.out.println("         4-SortBy QuickSort\n===========================");
		int select = 0;
		char input = ' ';
		input = new Scanner(System.in).nextLine().charAt(0);
		input = input < '1' || input > '4' ? '1' : input;
		select = Integer.parseInt(input + "");

		Users[] r = shuffle(randomArr);
		print(r);
		switch (select) {
		case 1:
			switchInsertionSortProgram(r);
			break;
		case 2:
			switchBubbleSortProgram(r);
			break;
		case 3:
			switchMergeSortProgram(r);
			break;
		case 4:// QuickSort
			switchQuickSortProgram(r);
			break;
		}
		end();
		print(r);
		System.out.println("Sort and Print time = " + timeSecs);

	}

	/**
	 * @purpose menu for quick sort
	 * @StudentInstructor Instructor already completed
	 * @param randomArr
	 */
	private static void switchInsertionSortProgram(Users[] randomArr) {

		System.out.println("============= InsertionSort Program==================");
		printFirstLast(randomArr);
		System.out.println("1-Get SortBy UsersNumberComparator");
		System.out.println("2-Get SortBy UsersDateComparator");
		System.out.println("3-Get SortBy UsersAccountComparator");
		System.out.println("4-Get SortBy UsersPersonComparator");
		int select = 0;
		char input = ' ';
		input = new Scanner(System.in).nextLine().charAt(0);
		input = input < '1' || input > '4' ? '1' : input;
		select = Integer.parseInt(input + "");
		start();
		switch (select) {
		case 1:
			System.out.println("  SortBy UsersNumberComparator");
			randomArr = InsertionSortClass.insertionSortUsers(randomArr, new UsersNumberComparator());
			printFirstLast(randomArr);
			break;
		case 2:
			System.out.println("  SortBy UsersDateComparator");
			randomArr = InsertionSortClass.insertionSortUsers(randomArr, new UsersDateComparator());
			printFirstLast(randomArr);
			break;
		case 3:
			System.out.println("  SortBy UsersAccountComparator");
			randomArr = InsertionSortClass.insertionSortAccounts(randomArr, new UsersAccountComparator());
			printFirstLast(randomArr);
			break;
		case 4:
			System.out.println(" SortBy UsersPersonComparator");
			randomArr = InsertionSortClass.insertionSortPerson(randomArr, new UsersPersonComparator());
			printFirstLast(randomArr);
			break;
		}
	}

	/**
	 * @purpose menu for Bubble sort
	 * @StudentInstructor to needs to complete Sortby UsersAccountComparator, &
	 *                    UsersPersonComparator
	 * @param randomArr
	 */
	private static void switchBubbleSortProgram(Users[] randomArr) {

		System.out.println("============= Bubble Sort Program==================");
		printFirstLast(randomArr);
		System.out.println("1-Get SortBy UsersNumberComparator");
		System.out.println("2-Get SortBy UsersDateComparator");
		System.out.println("3-Get SortBy UsersAccountComparator");
		System.out.println("4-Get SortBy UsersPersonComparator");

		int select = 0;
		char input = ' ';
		input = new Scanner(System.in).nextLine().charAt(0);
		input = input < '1' || input > '4' ? '1' : input;
		select = Integer.parseInt(input + "");
		start();

		switch (select) {
		case 1:
			System.out.println("  SortBy UsersNumberComparator");
			randomArr = BubbleSortClass.startBubbleSortUsers(randomArr, new UsersNumberComparator());
			printFirstLast(randomArr);
			break;
		case 2:
			System.out.println("  SortBy UsersDateComparator");
			randomArr = BubbleSortClass.startBubbleSortUsers(randomArr, new UsersDateComparator());
			printFirstLast(randomArr);
			break;
		case 3:
			System.out.println("  SortBy UsersAccountComparator");
			randomArr=BubbleSortClass.startBubbleSortAccount(randomArr, new UsersAccountComparator());
			printFirstLast(randomArr);
			break;
		case 4:
			System.out.println(" SortBy UsersPersonComparator");
			randomArr=BubbleSortClass.startBubbleSortPerson(randomArr, new UsersPersonComparator());
			printFirstLast(randomArr);
			break;
		}
	}

	/**
	 * @purpose menu for quick sort
	 * @StudentInstructor to needs to complete Sortby UsersAccountComparator, &
	 *                    UsersPersonComparator
	 * @param randomArr
	 */
	private static void switchMergeSortProgram(Users[] randomArr) {

		System.out.println("============= Merge  Sort Program==================");
		printFirstLast(randomArr);
		System.out.println("1-Get SortBy UsersNumberComparator");
		System.out.println("2-Get SortBy UsersDateComparator");
		System.out.println("3-Get SortBy UsersAccountComparator");
		System.out.println("4-Get SortBy UsersPersonComparator");

		int select = 0;
		char input = ' ';
		input = new Scanner(System.in).nextLine().charAt(0);
		input = input < '1' || input > '4' ? '1' : input;
		select = Integer.parseInt(input + "");
		start();

		switch (select) {
		case 1:
			System.out.println("  SortBy UsersNumberComparator");
			randomArr = MergeSortClass.startMergeSortUsers(randomArr, new UsersNumberComparator());
			printFirstLast(randomArr);
			break;
		case 2:
			System.out.println("  SortBy UsersDateComparator");
			start();
			randomArr = MergeSortClass.startMergeSortUsers(randomArr, new UsersDateComparator());
			printFirstLast(randomArr);
			break;
		case 3:
			System.out.println("  SortBy UsersAccountComparator");
			 randomArr=MergeSortClass.startMergeSortAccounts(randomArr, new UsersAccountComparator());
			printFirstLast(randomArr);
			break;
		case 4:
			System.out.println(" SortBy UsersPersonComparator");
			 randomArr=MergeSortClass.startMergeSortPersons(randomArr, new UsersPersonComparator());
			printFirstLast(randomArr);
			break;
		}

	}


	/**
	 * @purpose menu for quick sort
	 * @StudentInstructor to needs to complete Sortby UsersAccountComparator, &
	 *                    UsersPersonComparator
	 * @param randomArr
	 */
	private static void switchQuickSortProgram(Users[] randomArr) {

		System.out.println("============= Quick  Sort Program==================");
		printFirstLast(randomArr);
		System.out.println("1-Get SortBy UsersNumberComparator");
		System.out.println("2-Get SortBy UsersDateComparator");
		System.out.println("3-Get SortBy UsersAccountComparator");
		System.out.println("4-Get SortBy UsersPersonComparator");

		int select = 0;
		char input = ' ';
		input = new Scanner(System.in).nextLine().charAt(0);
		input = input < '1' || input > '4' ? '1' : input;
		select = Integer.parseInt(input + "");
		start();

		switch (select) {
		case 1:
			System.out.println("  SortBy UsersNumberComparator");
			randomArr = QuickSortClass.startQuickSortUsers(randomArr, new UsersNumberComparator());
			printFirstLast(randomArr);
			break;
		case 2:
			System.out.println("  SortBy UsersDateComparator");
			randomArr = QuickSortClass.startQuickSortUsers(randomArr, new UsersDateComparator());
			printFirstLast(randomArr);
			break;
		case 3:
			System.out.println("  SortBy UsersAccountComparator");
			randomArr=QuickSortClass.startQuickSortAccounts(randomArr, new UsersAccountComparator());
			printFirstLast(randomArr);
			break;
		case 4:
			System.out.println(" SortBy UsersPersonComparator");
			randomArr=QuickSortClass.startQuickSortPerson(randomArr, new UsersPersonComparator());
			printFirstLast(randomArr);
			break;
		}
	}

	/**
	 * @purpose shuffles the collection of (x)number of people after print of
	 *          completed sort , so that a shuffle deck for the next selection
	 * @param r
	 * @return
	 */
	private static Users[] shuffle(Users[] r) {
		HashSet<Users> set = new HashSet<>();

		for (int i = 0; i < r.length; i++) {
			int rand = new Random().nextInt(0, r.length - 1);
			Users users = r[rand];
			set.add(users);
		}
		Vector<Users> vect = new Vector<>(set);
		Users[] randArr = new Users[vect.size()];
		for (int i = 0; i < vect.size(); i++) {
			int rand = new Random().nextInt(0, vect.size() - 1);
			Users users = vect.get(rand);
			randArr[i] = users;
		}

		return randArr;
	}

	
	/**
	 * call for variable field end
	 */
	private static void end() {
		timeSecs = (System.currentTimeMillis() - start) * .001;

	}

	/**
	 * call for variable field start
	 */
	private static void start() {
		start = System.currentTimeMillis();

	}

	/**
	 * @purpose prints a User collection at index#begin and index#end
	 * @param randomArr
	 */
	private static void printFirstLast(Users[] randomArr) {
		Users first = randomArr[0];
		int end = randomArr.length - 1;
		Users last = randomArr[end];
		System.out.println("First -> " + first);
		System.out.println("Last -> " + last);

	}

	/**
	 * @purpose prints all data from toString of User class from collection
	 * @param randomArr
	 */
	private static void print(Users[] randomArr) {
		System.out.println("====Print====");
		for (int i = 0; i < randomArr.length; i++) {
			Users users = randomArr[i];
			System.out.println("(" + i + ")" + users);
		}

	}

	/**
	 * @purpose prints all data from toString of User class from collection
	 * @param randomArr
	 */
	private static void print(List<Users> list) {
		int i = 0;
		for (Users users : list) {
			System.out.println("(" + i++ + ")" + users);
		}
	}

	/**
	 * @purpose loads data at start
	 * , gets data from method reading files
	 * @return
	 */
	private static List<Users> loadDataLinkedList() {
		List<Users> list = new LinkedList<>(accountPersonListFromFile());
		return list;
	}

	/**
	 * @purpose gets data from files in project
	 * @FilesInProject persons, & accounts
	 * @return List<Users>
	 */
	private static List<Users> accountPersonListFromFile() {
		List<Users> list = new LinkedList<Users>();

		long uiid = 0;
		try {
			Scanner r1 = new Scanner(new File("datafiles/persons"));
			Scanner r2 = new Scanner(new File("datafiles/accounts"));
			while (r1.hasNextLine() && r2.hasNextLine()) {
				String s = (String) r1.nextLine();
				Long id = Long.parseLong(s.substring(s.indexOf("id=") + "id=".length(), s.indexOf(", fname=")));
				String fname = s.substring(s.indexOf("fname=") + "fname=".length(), s.indexOf(", lname="));
				String lname = s.substring(s.indexOf("lname=") + "lname=".length(), s.indexOf(", street="));
				String street = s.substring(s.indexOf("street=") + "street=".length(), s.indexOf(", city="));
				String city = s.substring(s.indexOf("city=") + "city=".length(), s.indexOf(", state="));
				String state = s.substring(s.indexOf("state=") + "state=".length(), s.indexOf(", zip="));
				String zip = s.substring(s.indexOf("zip=") + "zip=".length(), s.indexOf(", type="));
				String type = s.substring(s.indexOf("type=") + "type=".length(), s.indexOf("]"));
				String a = (String) r2.nextLine();
				Long accountID = Long
						.parseLong(a.substring(a.indexOf("accountID=") + "accountID=".length(), a.indexOf(", user=")));
				String user = a.substring(a.indexOf("user=") + "user=".length(), a.indexOf(", pass="));
				String pass = a.substring(a.indexOf("pass=") + "pass=".length(), a.indexOf(" ]"));
				// uiid = new Random().nextLong(88800001, 88900001);
				uiid++;
				Person person = new Person(id, fname, lname, street, city, state, zip, type);
				Accounts account = new Accounts(accountID, user, pass);
				Long dateNov22 = 1667390520000L;
				Long currentDate = System.currentTimeMillis();
				Long randomMillis = new Random().nextLong(dateNov22, currentDate);
				Users userAcctPer = new Users(uiid, account, person, new Date(randomMillis));
				list.add(userAcctPer);
			}
			r1.close();
			r2.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

}
