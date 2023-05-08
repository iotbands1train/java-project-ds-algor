package mod06.sortingAlgorithms;

import java.util.Comparator;

import models.mod01mod09.Users;

public class UsersNumberComparator implements Comparator<Users>{

	@Override
	public int compare(Users o1, Users o2) {
		return o1.getUserNumber() > o2.getUserNumber() ? 
		    	1 : o1.getUserNumber() == o2.getUserNumber() ? 0 : -1;
	}

}
