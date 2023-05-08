package x.start.main;

import java.util.Iterator;
import java.util.List;

import mod09.treesAlgorithms.UserTreeManager;
import models.mod01mod09.Users;

public class Cosc2436StudentProject {

	public static void main() {
		List<Users> list = UserTreeManager.loadDataLinkedList();
		// call student code here. create code.
		int i=0;
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Users users = (Users) iterator.next();
		
			System.out.println(i+" "+users);
			i++;
		}
		System.out.println("Student Project - start");
		
		System.out.println("==========code=here============");
		
		

		//create as many methods possible to solve question
		
		
		System.out.println("end - Student Project");
	}
	

}
