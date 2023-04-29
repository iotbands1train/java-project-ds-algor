package mod02.dataStructure.arrayListLinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import models.mod01mod09.Person;

public class TestPersonLinkedList {
	private static long startMyPerson;
	private static long endMyPerson;
	private static double timeMyPersonTime;

	public static void main() {
	    // Time Start
		start();
	    PersonList<Person> list = readFileMyPerson();
	    int i=1;
	    for (Person person : list) {
	    	System.out.println(i + " "+person);
	    	i++;
	    }
	    
	    
	    // Time Start
	    end();
	    
	    System.out.println("Time for this collection[LinkedList] of Creating and Reading Data = > "+timeMyPersonTime);
		
    }
	 
	
	private static void start() {
		startMyPerson = System.currentTimeMillis();
	}

	private static void end() {
		endMyPerson = System.currentTimeMillis();
		timeMyPersonTime = (endMyPerson - startMyPerson) * .001;
		// timesMyPerson.add(timeMyPersonTime);
	}
	
	public static PersonList<Person> readFileMyPerson() {
		int len = 0;
		Scanner r = null;
		PersonList<Person> db = new PersonLinkedList();
		File file = new File("database");
		try {
			int i = 0, j = 0;
			r = new Scanner(file);
			while (r.hasNextLine()) {
				String str = (String) r.nextLine();
				str = str.substring(str.indexOf("[") + 1);
				str = str.replace(']', ' ');
				String s = str;
				if (str.length() > 0) {
					String id = s.substring(s.indexOf("=") + 1, s.indexOf(", fname"));
					String fname = s.substring(s.indexOf("fname=") + "fname=".length(), s.indexOf(", lname"));
					String lname = s.substring(s.indexOf("lname=") + "lname=".length(), s.indexOf(", street"));
					String street = s.substring(s.indexOf("street=") + "street=".length(), s.indexOf(", city"));
					street = street.replace('•', ' '); String city = s.substring(s.indexOf("city=") + "city=".length(), s.indexOf(", state"));
					String state = s.substring(s.indexOf("state=") + "state=".length(), s.indexOf(", zip"));
					String zip = s.substring(s.indexOf("zip=") + "zip=".length(), s.indexOf(", type"));
					String type = s.substring(s.indexOf("type=") + "type=".length());
					Person person = new Person(Long.parseLong(id), fname, lname, street, city, state, zip, type);
					db.add(person);
					i++;
					}
				}
			    r.close();
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} 
		return db; 
		
	}

}
