package mod06.sortingAlgorithms;

import java.util.Comparator;

import models.mod01mod09.Accounts; 

public class UsersAccountComparator implements Comparator<Accounts> {

	@Override
	public int compare(Accounts o1, Accounts o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}
