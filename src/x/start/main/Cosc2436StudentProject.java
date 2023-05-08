package x.start.main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import mod09.treesAlgorithms.UserTreeManager;
import models.mod01mod09.Users;

public class Cosc2436StudentProject {

	public static void main() {
		List<Users> list = UserTreeManager.loadDataLinkedList();

		System.out.println("Student Project - start");
		System.out.println("========== Code Here ============");

		// Display the loaded users
		int i = 0;
		for (Users user : list) {
			System.out.println(i + " " + user);
			i++;
		}

		int again = 1;
		do {

			List<Users> results = mainProgram(list);
			resultsProgram(results);
			System.out.println("========\n Enter 1 for Again\n======");

			String a = new Scanner(System.in).nextLine();
			again = Integer.parseInt(a);
		} while (again == 1);

		System.out.println("End - Student Project");
	}

	private static void resultsProgram(List<Users> results) {

		System.out.println("Enter search criteria:");
		System.out.println("1. City Name");
		System.out.println("2. zip Code");
		int choice = new Scanner(System.in).nextInt();

		System.out.println("Enter search value:");
		String searchValue = new Scanner(System.in).nextLine();

		switch (choice) {
		case 1:
			results = searchByCity(results, searchValue);
			break;
		case 2:
			results = searchByZip(results, searchValue);
			break;
		default:
			System.out.println("Invalid choice. No matching users found.");

		}

		if (results.isEmpty()) {
			System.out.println("No matching users found.");
		} else {
			System.out.println("Matching users:");
			printResults(results);
		}
	}

	private static List<Users> searchByZip(List<Users> results, String searchValue) {
		List<Users> r=new LinkedList<>();
		for (Users user : results) {
			if (user.getPerson().getZip().trim().equalsIgnoreCase(searchValue.trim())) {
				r.add(user);
			}
		}
		return r;
	}

	/** The method for finding a key in the list */
	public static  List<Users>  linearSearchCity(List<Users> list, String keyCity) {
		List<Users> r=new LinkedList<>();
		for (int i = 0; i < list.size()-1; i++) {
			if (keyCity.trim().equalsIgnoreCase(list.get(i).getPerson().getCity().trim()))
				r.add(list.get(i));
		}
		return r;
	}

	private static List<Users> searchByCity(List<Users> results, String searchValue) {
		List<Users> r=new LinkedList<>();
		for (Users user : results) {
			if (user.getPerson().getCity().trim().equalsIgnoreCase(searchValue.trim())) {
				r.add(user);
			}
		}
		return r;
	}

	private static List<Users> mainProgram(List<Users> list) {

		System.out.println("Enter search criteria:");
		System.out.println("1. Last Name");
		System.out.println("2. First Name");
		System.out.println("3. Username");
		int choice = new Scanner(System.in).nextInt();

		System.out.println("Enter search value:");
		String searchValue = new Scanner(System.in).nextLine();

		List<Users> results = new LinkedList<>();
		switch (choice) {
		case 1:
			results = searchByLastName(list, searchValue);
			break;
		case 2:
			results = searchByFirstName(list, searchValue);
			break;
		case 3:
			results = searchByUser(list, searchValue);
			break;
		default:
			System.out.println("Invalid choice. No matching users found.");

		}

		if (results.isEmpty()) {
			System.out.println("No matching users found.");
		} else {
			System.out.println("Matching users:");
			printResults(results);
		}
		return results;
	}

	private static void printResults(List<Users> results) {
		int i = 0;
		for (Users user : results) {
			System.out.println(i + ": " + user);
			i++;
		}
	}

	public static List<Users> searchByLastName(List<Users> list, String lastName) {
		List<Users> results = new LinkedList<>();

		for (Users user : list) {
			if (user.getPerson().getLname().trim().equalsIgnoreCase(lastName.trim())) {
				results.add(user);
			}
		}

		return results;
	}

	public static List<Users> searchByFirstName(List<Users> list, String firstName) {
		List<Users> results = new LinkedList<>();

		for (Users user : list) {
			if (user.getPerson().getFname().trim().equalsIgnoreCase(firstName.trim())) {
				results.add(user);
			}
		}

		return results;
	}

	public static List<Users> searchByUser(List<Users> list, String username) {
		List<Users> results = new LinkedList<>();

		for (Users user : list) {
			if (user.getAccount().getUser().trim().equalsIgnoreCase(username.trim())) {
				results.add(user);
			}
		}

		return results;
	}
}
