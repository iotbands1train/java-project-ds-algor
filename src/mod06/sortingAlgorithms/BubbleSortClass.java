package mod06.sortingAlgorithms;

import java.util.Comparator;

import models.mod01mod09.Accounts;
import models.mod01mod09.Person;
import models.mod01mod09.Users;

public class BubbleSortClass {

	//STUDENT NEEDS TO CODE AccountSort, and PersonSort Code see - UserSort
	// Account
	/*
	 * startBubbleSortAccounts(Users[] list, Comparator<Accounts> compAcct)
	 * bubbleSortAccounts(Users[] list, Comparator<Accounts> compAcct)
	 */
	
	//Person
	/*
	 * startBubbleSortPerson(Users[] list, Comparator<Person> compPer)
	 * bubbleSortPerson(Users[] list, Comparator<Person> compPer)
	 * 
	 * total = 6 methods
	 * 
	 * 
	 *  missing 4 methods(Accounts(2) & Person(2)
	 * 
	 * 
	 * 
	 */

	public static Users[] startBubbleSortUsers(Users[] list, Comparator<Users> compUser) {
		bubbleSortUsers(list, compUser);
		return list;
	}

	public static void bubbleSortUsers(Users[] list, Comparator<Users> compUser) {
		boolean needNextPass = true;
		for (int k = 1; k < list.length && needNextPass; k++) {
			// Array may be sorted and next pass not needed
			needNextPass = false;
			for (int i = 0; i < list.length - k; i++) {
				//compUser.compare(list[i], list[i + 1]) > 0
				if ( compUser.compare(list[i], list[i + 1])> 0) {
					// Swap list[i] with list[i + 1]
					Users temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					needNextPass = true; // Next pass still needed
				}
			}
		}
	}

	public static Users[] startBubbleSortAccount(Users[] list, Comparator<Accounts> compAccount) {
		bubbleSortAccounts(list, compAccount);
		return list;
	}


	public static void bubbleSortAccounts(Users[] list, Comparator<Accounts> compAccount) {
		boolean needNextPass = true;
		for (int k = 1; k < list.length && needNextPass; k++) {
			// Array may be sorted and next pass not needed
			needNextPass = false;
			for (int i = 0; i < list.length - k; i++) {
				//compAccount.compare(list[i], list[i + 1]) > 0
				if ( compAccount.compare(list[i].getAccount(), list[i + 1].getAccount())> 0) {
					// Swap list[i] with list[i + 1]
					Users temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					needNextPass = true; // Next pass still needed
				}
			}
		}
	}

	public static Users[] startBubbleSortPerson(Users[] list, Comparator<Person> compPerson) {
		bubbleSortPerson(list, compPerson );
		return list;
	}

	private static void bubbleSortPerson(Users[] list, Comparator<Person> compPerson) {
		boolean needNextPass = true;
		for (int k = 1; k < list.length && needNextPass; k++) {
			// Array may be sorted and next pass not needed
			needNextPass = false;
			for (int i = 0; i < list.length - k; i++) {
				//compAccount.compare(list[i], list[i + 1]) > 0
				if ( compPerson.compare(list[i].getPerson(), list[i + 1].getPerson())> 0) {
					// Swap list[i] with list[i + 1]
					Users temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					needNextPass = true; // Next pass still needed
				}
			}
		}
	}
 
	
}
