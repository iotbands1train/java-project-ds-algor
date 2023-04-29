package mod06.sortingAlgorithms;

import java.util.Comparator;

import models.mod01mod09.Accounts;
import models.mod01mod09.Person;
import models.mod01mod09.Users;

public class InsertionSortClass {
	/*
	 * Instructor completed, already
	 * 
	 * only has 3 methods
	 * 
	 * 
	 * 1 for User, 1 for Person, and only 1 Accounts
	 * 
	 */
	
	

	//======================================== by Users  =========================================
	

	public static Users[] insertionSortUsers(Users[] arr, Comparator<Users> compUser) {
		for (int i = 1; i < arr.length; i++) {
			Users currentElement = arr[i];
			int k;
			for (k = i - 1; k >= 0 && compUser.compare(arr[k], currentElement) > 0; k--) {
				arr[k + 1] = arr[k];
			}
			arr[k + 1] = currentElement;
		}
		return arr;
	}

	//======================================== by Accounts  =========================================
 
	public static Users[] insertionSortAccounts(Users[] arr, Comparator<Accounts> compUser) {
		for (int i = 1; i < arr.length; i++) {
			Users currentElement = arr[i];
			int k;
			for (k = i - 1; k >= 0 && compUser.compare(arr[k].getAccount(), currentElement.getAccount()) > 0; k--) {
				arr[k + 1] = arr[k];
			}
			arr[k + 1] = currentElement;
		}
		return arr;
	}
	

	//======================================== by Persons  =========================================
	public static Users[] insertionSortPerson(Users[] arr, Comparator<Person> compUser) {
		for (int i = 1; i < arr.length; i++) {
			Users currentElement = arr[i];
			int k;
			for (k = i - 1; k >= 0 && compUser.compare(arr[k].getPerson(), currentElement.getPerson()) > 0; k--) {
				arr[k + 1] = arr[k];
			}
			arr[k + 1] = currentElement;
		}
		return arr;
	}
}
