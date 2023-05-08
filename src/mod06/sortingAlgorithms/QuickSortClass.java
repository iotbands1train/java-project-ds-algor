package mod06.sortingAlgorithms;

import java.util.Comparator;

import models.mod01mod09.Accounts;
import models.mod01mod09.Person;
import models.mod01mod09.Users;

public class QuickSortClass { 
	
	//STUDENT NEEDS TO CODE AccountSort, and PersonSort Code see - UserSort
		/*
		 * Accounts
		 * Users[] startQuickSortAccounts(Users[] arr, Comparator<Accounts> compUser) 
		 * void quickSortAccounts(Users[] list, Comparator<Accounts> compUser)
		 * void quickSortAccounts(Users[] list, int first, int last, Comparator<Accounts> compUser)
		 * int partitionAccounts(Users[] list, int first, int last, Comparator<Accounts> compUser)
		 * 
		 * 
		 * Person
		 * Users[] startQuickSortPerson(Users[] arr, Comparator<Person> compUser) 
		 * void quickSortPerson(Users[] list, Comparator<Person> compUser)
		 * void quickSortPerson(Users[] list, int first, int last, Comparator<Person> compUser)
		 * int partitionPerson(Users[] list, int first, int last, Comparator<Person> compUser)
		 * 
		 * 
		 * total = 12 methods with MergeSortClass
		 * 
		 * missing 8 methods(Accounts(4) & Person(4)
		 */
	

	//======================================== by Uses  =========================================

	public static Users[] startQuickSortUsers(Users[] arr, Comparator<Users> compUser) { 
		quickSortUsers(arr,compUser);
		return arr;
	}

	public static void quickSortUsers(Users[] list, Comparator<Users> compUser) {
		quickSortUsers(list, 0, list.length - 1,compUser);
	}

	private static void quickSortUsers(Users[] list, int first, int last, Comparator<Users> compUser) {
		if (last > first) {
			int pivotIndex = partitionUser(list, first, last,compUser);
			quickSortUsers(list, first, pivotIndex - 1,compUser);
			quickSortUsers(list, pivotIndex + 1, last,compUser);
		}
	}

	/** Partition the array list[first..last] */
	private static int partitionUser(Users[] list, int first, int last, Comparator<Users> compUser) {
		Users pivot = list[first]; // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; // Index for backward search

		while (high > low) {
			// Search forward from left
			while (low <= high &&compUser.compare(list[low] ,pivot) <= 0)
				low++;

			// Search backward from right
			while (low <= high && compUser.compare(list[high] ,pivot) > 0)
				high--;

			// Swap two elements in the list
			if (high > low) {
				Users temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}

		while (high > first && compUser.compare(list[high] ,pivot)  >= 0 )
			high--;

		// Swap pivot with list[high]
		if (compUser.compare(pivot,list[high])  > 0 ) {
			list[first] = list[high];
			list[high] = pivot;
			return high;
		} else {
			return first;
		}
	}


	//======================================== by Accounts  =========================================

	public static Users[] startQuickSortAccounts(Users[] arr, Comparator<Accounts> compAccount) { 
		quickSortAccounts(arr,compAccount);
		return arr;
	}
	public static void quickSortAccounts(Users[] list, Comparator<Accounts> compAccount) {
		quickSortAccounts(list, 0, list.length - 1,compAccount);
	}
	private static void quickSortAccounts(Users[] list, int first, int last, Comparator<Accounts> compAccount) {
		if (last > first) {
			int pivotIndex = partitionAccounts(list, first, last,compAccount);
			quickSortAccounts(list, first, pivotIndex - 1,compAccount);
			quickSortAccounts(list, pivotIndex + 1, last,compAccount);
		}
	}
	/** Partition the array list[first..last] */
	private static int partitionAccounts(Users[] list, int first, int last, Comparator<Accounts> compAccount) {
		Users pivot = list[first]; // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; // Index for backward search

		while (high > low) {
			// Search forward from left
			while (low <= high &&compAccount.compare(list[low].getAccount() ,pivot.getAccount()) <= 0)
				low++;

			// Search backward from right
			while (low <= high && compAccount.compare(list[high].getAccount() ,pivot.getAccount()) > 0)
				high--;

			// Swap two elements in the list
			if (high > low) {
				Users temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}

		while (high > first && compAccount.compare(list[high].getAccount() ,pivot.getAccount())  >= 0 )
			high--;

		// Swap pivot with list[high]
		if (compAccount.compare(pivot.getAccount(),list[high].getAccount())  > 0 ) {
			list[first] = list[high];
			list[high] = pivot;
			return high;
		} else {
			return first;
		}
	}

	
	
	//======================================== by Persons  =========================================
 


	public static Users[] startQuickSortPerson(Users[] arr, Comparator<Person> compAccount) { 
		quickSortPerson(arr,compAccount);
		return arr;
	}
	public static void quickSortPerson(Users[] list, Comparator<Person> compAccount) {
		quickSortPerson(list, 0, list.length - 1,compAccount);
	}
	private static void quickSortPerson(Users[] list, int first, int last, Comparator<Person> compAccount) {
		if (last > first) {
			int pivotIndex = partitionPerson(list, first, last,compAccount);
			quickSortPerson(list, first, pivotIndex - 1,compAccount);
			quickSortPerson(list, pivotIndex + 1, last,compAccount);
		}
	}
	/** Partition the array list[first..last] */
	private static int partitionPerson(Users[] list, int first, int last, Comparator<Person> compAccount) {
		Users pivot = list[first]; // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; // Index for backward search

		while (high > low) {
			// Search forward from left
			while (low <= high &&compAccount.compare(list[low].getPerson() ,pivot.getPerson()) <= 0)
				low++;

			// Search backward from right
			while (low <= high && compAccount.compare(list[high].getPerson() ,pivot.getPerson()) > 0)
				high--;

			// Swap two elements in the list
			if (high > low) {
				Users temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}

		while (high > first && compAccount.compare(list[high].getPerson() ,pivot.getPerson())  >= 0 )
			high--;

		// Swap pivot with list[high]
		if (compAccount.compare(pivot.getPerson(),list[high].getPerson())  > 0 ) {
			list[first] = list[high];
			list[high] = pivot;
			return high;
		} else {
			return first;
		}
	}
 
 
 

}