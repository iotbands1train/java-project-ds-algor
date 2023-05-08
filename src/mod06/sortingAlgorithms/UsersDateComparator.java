package mod06.sortingAlgorithms;

import java.util.Comparator;

import models.mod01mod09.Users;

public class UsersDateComparator implements Comparator<Users> {

	@Override
	public int compare(Users o1, Users o2) { 	 
		return o1.getDate().compareTo(o2.getDate());
	}

}
