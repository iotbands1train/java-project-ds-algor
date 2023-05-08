package mod06.sortingAlgorithms;

import java.util.Comparator;

import models.mod01mod09.Accounts;
import models.mod01mod09.Person;
import models.mod01mod09.Users;

public class MergeSortClass {
	// STUDENT NEEDS TO CODE AccountSort, and PersonSort Code see - UserSort
	/*
	 * Accounts Users[] startMergeSortAccounts(Users[] list, Comparator<Accounts>
	 * compUser) void mergeSortAccounts(Users[] list, Comparator<Accounts> compUser)
	 * void mergeAccounts(Users[] list1, Users[] list2, Users[] temp,
	 * Comparator<Accounts> compUser)
	 * 
	 * Person Users[] startMergeSortPerson(Users[] list, Comparator<Person>
	 * compUser) void mergeSortPerson(Users[] list, Comparator<Person> compUser)
	 * void mergePerson(Users[] list1, Users[] list2, Users[] temp,
	 * Comparator<Person> compUser)
	 * 
	 * total = 9 methods with MergeSortClass
	 * 
	 * missing 6 methods(Accounts(3) & Person(3)
	 */

	//======================================== by User  =========================================

	public static Users[] startMergeSortUsers(Users[] list, Comparator<Users> compUser) {
		mergeSortUsers(list, compUser);
		return list;
	}

	public static void mergeSortUsers(Users[] list, Comparator<Users> compUser) {
		if (list.length > 1) {
			// Merge sort the first half
			Users[] firstHalf = new Users[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSortUsers(firstHalf, compUser);

			// Merge sort the second half
			int secondHalfLength = list.length - list.length / 2;
			Users[] secondHalf = new Users[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSortUsers(secondHalf, compUser);

			// Merge firstHalf with secondHalf into list
			mergeUsers(firstHalf, secondHalf, list, compUser);
		}
	}

	/** Merge two sorted lists */
	public static void mergeUsers(Users[] list1, Users[] list2, Users[] temp, Comparator<Users> compUser) {
		int current1 = 0; // Current index in list1
		int current2 = 0; // Current index in list2
		int current3 = 0; // Current index in temp
		while (current1 < list1.length && current2 < list2.length) {
			if (compUser.compare(list1[current1], list2[current2]) < 0)
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length) {
			temp[current3++] = list1[current1++];
		}
		while (current2 < list2.length) {
			temp[current3++] = list2[current2++];
		}
	}

	//======================================== by Accounts  =========================================
	
	
	
	public static Users[] startMergeSortAccounts(Users[] list, Comparator<Accounts> compAccount) {
		mergeSortAccounts(list, compAccount);
		return list;
	}

	public static void mergeSortAccounts(Users[] list, Comparator<Accounts> compAccount) {
		if (list.length > 1) {
			// Merge sort the first half
			Users[] firstHalf = new Users[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSortAccounts(firstHalf, compAccount);

			// Merge sort the second half
			int secondHalfLength = list.length - list.length / 2;
			Users[] secondHalf = new Users[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSortAccounts(secondHalf, compAccount);

			// Merge firstHalf with secondHalf into list
			mergeAccounts(firstHalf, secondHalf, list, compAccount);
		}
	}

	/** Merge two sorted lists */
	public static void mergeAccounts(Users[] list1, Users[] list2, Users[] temp, Comparator<Accounts> compAccount) {
		int current1 = 0; // Current index in list1
		int current2 = 0; // Current index in list2
		int current3 = 0; // Current index in temp
		while (current1 < list1.length && current2 < list2.length) {
			if (compAccount.compare(list1[current1].getAccount(), list2[current2].getAccount()) < 0)
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length) {
			temp[current3++] = list1[current1++];
		}
		while (current2 < list2.length) {
			temp[current3++] = list2[current2++];
		}
	}

	

	//======================================== by Person  =========================================
	
	
	public static Users[] startMergeSortPersons(Users[] list, Comparator<Person> compPerson) {
		mergeSortPersons(list, compPerson);
		return list;
	}

	public static void mergeSortPersons(Users[] list, Comparator<Person> compPerson) {
		if (list.length > 1) {
			// Merge sort the first half
			Users[] firstHalf = new Users[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSortPersons(firstHalf, compPerson);

			// Merge sort the second half
			int secondHalfLength = list.length - list.length / 2;
			Users[] secondHalf = new Users[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSortPersons(secondHalf, compPerson);

			// Merge firstHalf with secondHalf into list
			mergePersons(firstHalf, secondHalf, list, compPerson);
		}
	}

	/** Merge two sorted lists */
	public static void mergePersons(Users[] list1, Users[] list2, Users[] temp, Comparator<Person> compPerson) {
		int current1 = 0; // Current index in list1
		int current2 = 0; // Current index in list2
		int current3 = 0; // Current index in temp
		while (current1 < list1.length && current2 < list2.length) {
			if (compPerson.compare(list1[current1].getPerson(), list2[current2].getPerson()) < 0)
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length) {
			temp[current3++] = list1[current1++];
		}
		while (current2 < list2.length) {
			temp[current3++] = list2[current2++];
		}
	}

}
