package mod04.dataStructure.setsMaps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import models.mod01mod09.Accounts;
import models.mod01mod09.Person;

public class SetsMapsMainTest {

	private static Scanner in = new Scanner(System.in);

	public static void main() {
		int ans = 1;
		do {
			System.out.println("..starting program");
			startProgram();
			System.out.println("\nEnter 1 to Start Again" + "\nElse then Exit Program");
			ans = Integer.parseInt(in.nextLine());
		} while (ans == 1);
		System.out.println("====  PROGRAM ENDED  ===");
	}
	 

	private static void startProgram() {
		int ans = 1;
		do {
			System.out.println("Welcome to Sets and Maps");
			System.out.println("1 - START");
			ans = Integer.parseInt(in.nextLine());
			if (ans == 1)
				mainMenu();
			else
				System.out.println("=====Program-Exit=====");
		} while (ans == 1);
	}

	private static void mainMenu() {
		int ans = 0;
		do {
			mainMenuMessage();
			ans = Integer.parseInt(in.nextLine());
			switch (ans) {
			case 1:
				setsMenu();
				break;
			case 2:
				mapsMenu();
				break;
			default:
				System.out.println("Error@ MainMenu");
				System.exit(1);
			}
			System.out.println("Enter 1-MainMenu - Or Exit MainMenu");
			ans = Integer.parseInt(in.nextLine());
		} while (ans == 1);
	}

	private static void mainMenuMessage() {
		System.out.println("====== mainMenu ======");
		System.out.println("1 - Set Menu ");
		System.out.println("2 - Maps Menu ");
		System.out.println("======================= ");
	}

	// Sets
	private static void setsMenu() {
		List<Person> list = loadPeople();
		System.out.println("FIRST-> " + list.get(0).getFname() + ", " + list.get(0).getLname());
		System.out.println(
				"LAST-> " + list.get(list.size() - 1).getFname() + ", " + list.get(list.size() - 1).getLname());

		int ans2 = 0;
		do {
			Set<Person> set = new HashSet<>(list);
			System.out.println("====== mainMenu ======");
			System.out.println("1 - [HASH] Set Menu ");
			System.out.println("2 - [LINKED HASH] Set Menu ");
			System.out.println("3 - [TREE-NAVI-SORTED HASH] Set Menu ");
			System.out.println("======================= ");
			int ans = Integer.parseInt(in.nextLine());

			switch (ans) {
			case 1:
				System.out.println("..fetching data to hash_set");
				hashSetMenu(set);
				break;
			case 2:
				System.out.println("..fetching data to linked-hash_set");
				linkedSetMenu(set);
				break;
			case 3:
				System.out.println("..fetching data to tree_set");
				treeSetMenu(set);
				break;
			default:
				System.out.println("Error @ setsMenu");
				System.exit(1);
			}

			System.out.println("==== 1 - Sets Menu Or Else exit =====");
			ans2 = Integer.parseInt(in.nextLine());
		} while (ans2 == 1);
	}

	// Sets - Types
	private static void treeSetMenu(Set<Person> list2) {
		int ans = 0;
		do {
			TreeSet<Person> tmap = new TreeSet<>(list2);
			NavigableSet<Person> nmap = tmap;
			SortedSet<Person> smap = tmap;
			System.out.println("====== TreeSet ======");
			System.out.println("1 - Display size ");
			System.out.println("2 - Display - iterator - next ");
			System.out.println("3 - Display - first ");
			System.out.println("4 - Display - last ");
			System.out.println("======================= ");
			int sel = Integer.parseInt(in.nextLine());
			switch (sel) {
			case 1:
				int size = tmap.size();
				System.out.println("Size of tmap = " + size);
				break;
			case 2:
				Person acct = tmap.iterator().next();
				System.out.println("Iterator next => " + acct);
				break;
			case 3:
				System.out.println("Poll - First => " + nmap.first());
				break;
			case 4:
				System.out.println("First - Key => " + smap.last());
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + sel);
			}
			System.out.println("Enter 1-TreeSet  Or  Exit TreeSet");
			ans = Integer.parseInt(in.nextLine());

		} while (ans == 1);

	}

	private static void hashSetMenu(Set<Person> set2) {
		// size
		// iterator - next
		HashSet<Person> set = new HashSet<>(set2);
		System.out.println("====== Hash ======");
		System.out.println("1 - Display size ");
		System.out.println("2 - Display - iterator - next ");
		System.out.println("======================= ");
		int sel = Integer.parseInt(in.nextLine());
		switch (sel) {
		case 1:
			int size = set.size();
			System.out.println("Size of map = " + size);
			break;
		case 2:
			Person person = set.iterator().next();
			System.out.println("Iterator next => " + person);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + sel);
		}

	}

	private static void linkedSetMenu(Set<Person> list2) {
		LinkedHashSet<Person> set = new LinkedHashSet<>(list2);
		System.out.println("====== Linked-Hash  ======");
		System.out.println("1 - Display size ");
		System.out.println("2 - Display - iterator - next ");
		System.out.println("======================= ");
		int sel = Integer.parseInt(in.nextLine());
		switch (sel) {
		case 1:
			int size = set.size();
			System.out.println("Size of set = " + size);
			break;
		case 2:
			Person person = set.iterator().next();
			System.out.println("Iterator next => " + person);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + sel);
		}
	}

	// Maps
	private static void mapsMenu() {
		List<Accounts> list = loadAccts();
		System.out.println("FIRST-> " + list.get(0).getUser() + ", " + list.get(0).getPass());
		System.out
				.println("LAST-> " + list.get(list.size() - 1).getUser() + ", " + list.get(list.size() - 1).getPass());

		List<Person> list2 = loadPeople();
		System.out.println("FIRST-> " + list2.get(0).getFname() + ", " + list2.get(0).getLname());
		System.out.println(
				"LAST-> " + list2.get(list2.size() - 1).getFname() + ", " + list2.get(list2.size() - 1).getLname());

		int len = list.size() - 1;
		int x = -1;
		System.out.println("How many people ? (1-" + (len) + ")");
		System.out.println("==============");
		System.out.println("1 - [" + (int) (len * .005) + "] people");
		System.out.println("2 - [" + (int) (len * .425) + "] people");
		System.out.println("3 - [" + (int) (len * .685) + "] people");
		System.out.println("4 - [" + (int) (len * .981) + "] people"); 
		System.out.println("5 - [ x ] people"); 
		System.out.println("==============");
		int se = Integer.parseInt(in.nextLine());
		System.out.println("... fetching - people (please wait)");
		switch (se) {
		case 1:
			x = (int) (len * .005);
			break;
		case 2:
			x = (int) (len * .05);
			break; 
		case 3:
			x = (int) (len * .20);
			break; 
		case 4:
			x = (int) (len * .99);
			break;
		case 5:
			System.out.println("Enter x - amount");
			x =  Integer.parseInt(in.nextLine());
			break;
		default:
			x = list.size() - 1;
			break;

		}

		System.out.println("");
		Map<Accounts, Person> map = mapAcctPer(list, list2, x);
		int ans1 = 0;
		do {
			System.out.println("====== Maps Menu ======");
			System.out.println("1 - [HASH] Maps Menu ");
			System.out.println("2 - [LINKED HASH] Maps Menu ");
			System.out.println("3 - [TREE-NAVI-SORTED HASH] Maps Menu ");
			System.out.println("======================= ");

			int ans = Integer.parseInt(in.nextLine());

			if (ans == 1)
				System.out.println("..fetching data to hashmap");
			else if (ans == 2)
				System.out.println("..fetching data to linked-hashmap");
			else
				System.out.println("..fetching data to treemap");

			switch (ans) {
			case 1:
				hashMapsMenu(map);
				break;
			case 2:
				linkedMapsMenu(map);
				break;
			case 3:
				treeMapsMenu(map);
				break;
			default:
				System.out.println("Error@ mapsMenu");
				System.exit(1);
			}
			System.out.println("Enter 1-Maps - Or Exit Maps");
			ans1 = Integer.parseInt(in.nextLine());
		} while (ans1 == 1);
	}

	// Maps - Types
	private static void treeMapsMenu(Map<Accounts, Person> map) {
		int ans = 0;
		do {
			TreeMap<Accounts, Person> tmap = new TreeMap<>(map);
			NavigableMap<Accounts, Person> nmap = tmap;
			SortedMap<Accounts, Person> smap = tmap;
			System.out.println("====== TreeMap ======");
			System.out.println("1 - Display size ");
			System.out.println("2 - Display - iterator - next ");
			System.out.println("3 - Display - poll - first ");
			System.out.println("4 - Display - first ");
			System.out.println("5 - Display - last ");
			System.out.println("======================= ");
			int sel = Integer.parseInt(in.nextLine());
			switch (sel) {
			case 1:
				int size = tmap.size();
				System.out.println("Size of tmap = " + size);
				break;
			case 2:
				Accounts acct = map.keySet().iterator().next();
				Person perp = map.values().iterator().next();
				System.out.println("Iterator next => " + acct + " ~ " + perp);
				break;
			case 3:
				System.out.println("Poll - First => " + nmap.pollLastEntry());
				break;
			case 4:
				System.out.println("First - Key => " + smap.firstKey());
				break;
			case 5:
				System.out.println("Last - Key => " + smap.lastKey());
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + sel);
			}
			System.out.println("=========\nEnter 1-TreeMap Menu - \nEnter (anyKey) for Map Menu\n=============");
			ans = Integer.parseInt(in.nextLine());

		} while (ans == 1);

	}

	private static void hashMapsMenu(Map<Accounts, Person> map) {
		// size
		// iterator - next
		int ans = 0;
		do {
			System.out.println("====== Hash ======");
			System.out.println("1 - Display size ");
			System.out.println("2 - Display - iterator - next ");
			System.out.println("======================= ");
			int sel = Integer.parseInt(in.nextLine());
			switch (sel) {
			case 1:
				int size = map.size();
				System.out.println("Size of map = " + size);
				break;
			case 2:
				Accounts acct = map.keySet().iterator().next();
				Person perp = map.values().iterator().next();
				System.out.println("Iterator next => " + acct + " ~ " + perp);
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + sel);
			}
			System.out.println("Enter 1-Hash - Or Exit Hash");
			ans = Integer.parseInt(in.nextLine());
		} while (ans == 1);
	}

	private static void linkedMapsMenu(Map<Accounts, Person> map) {
		int ans = 0;
		do {
			System.out.println("====== Linked-Hash  ======");
			System.out.println("1 - Display size ");
			System.out.println("2 - Display - iterator - next ");
			System.out.println("======================= ");
			int sel = Integer.parseInt(in.nextLine());
			switch (sel) {
			case 1:
				int size = map.size();
				System.out.println("Size of map = " + size);
				break;
			case 2:
				Accounts acct = map.keySet().iterator().next();
				Person perp = map.values().iterator().next();
				System.out.println("Iterator next => " + acct + " ~ " + perp);
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + sel);
			}
			System.out.println("Enter 1-Linked-Hash - Or Exit Linked-Hash");
			ans = Integer.parseInt(in.nextLine());
		} while (ans == 1);
	}

	// Get Data to Maps
	private static Map<Accounts, Person> mapAcctPer(List<Accounts> db, List<Person> db2, int ans) {
		Map<Accounts, Person> map = new HashMap<>();

		for (int i = 0; i < db.size(); i++) {
			Accounts acct = db.get(i);
			for (int j = 0; j < db2.size(); j++) {
				Person person = db2.get(j);
				if (i < ans)
					map.put(acct, person);
			}
		}

		return map;
	}

	// loading data
	public static List<Person> loadPeople() {
		int len = 0;
		Scanner r = null;
		List<Person> db = new ArrayList<>();
		File file = new File("datafiles/database");
		try {
			int i = 0, j = 0;
			r = new Scanner(file);
			while (r.hasNextLine()) {
				String str = (String) r.nextLine();
				str = str.substring(str.indexOf("[") + 1);
				str = str.replace(']', ' ');
				String s = str;
				if (str.length() > 0) {
					String id = s.substring(s.indexOf("=") + 1, s.indexOf(", fname"));
					String fname = s.substring(s.indexOf("fname=") + "fname=".length(), s.indexOf(", lname"));
					String lname = s.substring(s.indexOf("lname=") + "lname=".length(), s.indexOf(", street"));
					String street = s.substring(s.indexOf("street=") + "street=".length(), s.indexOf(", city"));
					street = street.replace('•', ' ');
					String city = s.substring(s.indexOf("city=") + "city=".length(), s.indexOf(", state"));
					String state = s.substring(s.indexOf("state=") + "state=".length(), s.indexOf(", zip"));
					String zip = s.substring(s.indexOf("zip=") + "zip=".length(), s.indexOf(", type"));
					String type = s.substring(s.indexOf("type=") + "type=".length());
					Person person = new Person(Long.parseLong(id), fname, lname, street, city, state, zip, type);
					db.add(person);
					i++;
				}
			}
			r.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return db;

	}

	public static List<Accounts> loadAccts() {
		int len = 0;
		Scanner r = null;
		List<Accounts> db = new ArrayList<>();
		File file = new File("datafiles/accounts");
		try {
			int i = 0, j = 0;
			r = new Scanner(file);
			while (r.hasNextLine()) {
				String str = (String) r.nextLine();
				str = str.substring(str.indexOf("[") + 1);
				str = str.replace(']', ' ');
				String s = str;
				if (str.length() > 0) {
					String id = s.substring(s.indexOf("accountID=") + "accountID=".length(), s.indexOf(", "));
					String user = s.substring(s.indexOf("user=") + "user=".length(), s.indexOf(", pass="));
					String pass = s.substring(s.indexOf("pass=") + "pass=".length());
					Accounts acct = new Accounts(Long.parseLong(id), user, pass);
					db.add(acct);
					i++;
				}
			}
			r.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return db;

	}

}
