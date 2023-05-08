package mod06.sortingAlgorithms;

import java.util.Comparator;

import models.mod01mod09.Person; 

public class UsersPersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return  o1.compareTo(o2);
	}

}
