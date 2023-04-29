package mod09.treesAlgorithms;

import java.util.Iterator;

import models.mod01mod09.Accounts;
import models.mod01mod09.Person;
import models.mod01mod09.Users;

public class SearchDataUser {

	public static void main(UsersBST<Users> tree) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.println("Return users with similar:");
		System.out.println("1 - Fname");
		System.out.println("2 - Lname");
		System.out.println("3 - City");
		String userdata = "";
		int similar = Integer.parseInt(input.nextLine());
		if (similar == 1) {
			userdata = "[Firstname]";
		} else if (similar == 2) {
			userdata = "[Lastname]";
		} else {
			userdata = "[City]";
		}

		System.out.print("Enter a " + userdata + " : ");
		String pattern = input.nextLine();
		UsersBST<Users> treeFound=new UsersBST<Users>();

		for (Iterator iterator = tree.iterator(); iterator.hasNext();) {
			Users users = (Users) iterator.next();
			Accounts a = users.getAccount();
			Person p = users.getPerson();
			Long uid = users.getUserNumber();
			String text = "";
			if (similar == 1) {
				userdata = "[Firstname]";
				text = p.getFname();
			} else if (similar == 2) {
				userdata = "[Lastname]";
				text = p.getLname();
			} else {
				userdata = "[City]";
				text = p.getCity();
			}

			int index = match(text, pattern);
			if (index >= 0)
				treeFound.add(users); 
		}
		int i=0;
		for (Iterator iterator = treeFound.iterator(); iterator.hasNext();) {
			Users users = (Users) iterator.next();
			System.out.println("["+i+"]"+" : "+users.getPerson());
			i++;
		}
	}

	// Return the index of the first match. -1 otherwise.
	public static int match(String text, String pattern) {
		for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
			if (isMatched(i, text, pattern))
				return i;
		}

		return -1;
	}

	// Test if pattern matches text starting at index i
	private static boolean isMatched(int i, String text, String pattern) {
		for (int k = 0; k < pattern.length(); k++) {
			if (pattern.charAt(k) != text.charAt(i + k)) {
				return false;
			}
		}

		return true;
	}

}
