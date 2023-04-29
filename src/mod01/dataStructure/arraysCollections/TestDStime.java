package mod01.dataStructure.arraysCollections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import models.mod01mod09.Person;

public class TestDStime {
	private static long endC;
	private static long startC;
	private static long end;
	private static long start;
	private static double tC;
	private static double t;
	

	public static void main() {
		startArr();
		Person[] peoples = createPerson();
		printArr(peoples);
		endArr();
		
		startCol();
		Collection<Person> peoples2 = createPersonC();
		printArr(peoples2);
		endCol();
		
		System.out.println("Person Array => " + t + " secs");
		System.out.println("Person Collection => " +tC + " secs");
		String winner = t < tC ? "Person Array is Faster" : "Person Collection is Faster";
		System.out.println(winner);
	}
	
	 
		
		private static void endCol() {
			endC = System.currentTimeMillis();
			tC = (endC - startC) * .001;
		}
		
		private static void startCol () {
		startC = System.currentTimeMillis ();
		}
		
		private static void endArr() {
		end = System.currentTimeMillis();
		t = (end - start) * .001;
		}
		
		private static void startArr() {
		start = System.currentTimeMillis();
		}
		
		private static void printArr(Collection<Person> peoples) {
			int i = 0;
			for (Iterator<Person> iterator = peoples.iterator(); iterator.hasNext();) {
				Person person = (Person) iterator.next();
				if (person != null)
					System.out.println(i + " : " + person);
				i++;
			}
		}
		
		private static void printArr(Person[] peoples) {
			for (int i = 0; i < peoples.length; i++) {
				Person person = peoples[i];
				if (person != null)
					System.out.println(i + " : " + person);
			}
		}
		
		public static Collection<Person> createPersonC() {
			File idFile = new File("personIDs");
			File fnameFile = new File("personFnames");
			File lnameFile = new File("personLnames");
			File streetFile = new File("personStreet");
			File citFile = new File("personCity");
			File staFile = new File("personState");
			File zipFile = new File("personZip");
			File typeFile = new File("personType");
			
			Collection<Person> peoples = new ArrayList<>();
			
			Scanner o1 = null, o2 = null, o3 = null, o4 = null, o5 = null, o6 = null, o7 = null, o8 = null;
			try {
				o1 = new Scanner(idFile);
				o2 = new Scanner(fnameFile);
				o3 = new Scanner(lnameFile);
				o4 = new Scanner(streetFile);
				o5 = new Scanner(citFile);
				o6 = new Scanner(staFile);
				o7 = new Scanner(zipFile);
				o8 = new Scanner(typeFile);
			}   catch(FileNotFoundException e1) {
				e1.printStackTrace();
			}
			
			String ids = "", fname = "", lname = "", street = "", city = "", state = "", zip = "", type = "";
			while (o8.hasNextLine()) {
				
				try {
					ids = (String) o1.nextLine();
					fname = (String) o2.nextLine();
					lname = (String) o3.nextLine();
					street = (String) o4.nextLine();
					city = (String) o5.nextLine();
					state = (String) o6.nextLine();
					zip = (String) o7.nextLine();
					type = (String) o8.nextLine();
				}   catch (Exception e) {
				}
				
				Long id = Long.parseLong(ids);
				Person person = new Person(id, fname, lname, street, city, state, zip, type);
				peoples.add(person);	
			}
			
			o1.close();
			o2.close();
			o3.close();
			o4.close();
			o5.close();
			o6.close();
			o7.close();
			o8.close();
			return peoples;
		}
		
		public static Person[] createPerson() {
			File idFile = new File("personIDs");
			File fnameFile = new File("personFnames");
			File lnameFile = new File("personLnames");
			File streetFile = new File("personStreet");
			File citFile = new File("personCity");
			File staFile = new File("personState");
			File zipFile = new File("personZip");
			File typeFile = new File("personType");
			int ct = 0;
			
			Scanner o1 = null, o2 = null, o3 = null, o4 = null, o5 = null, o6 = null, o7 = null, o8 = null;
			try {
				o1 = new Scanner(idFile);
				while (o1.hasNextLine()) {
					o1.nextLine();
					ct++;
				}
				o1.close();
				o1 = new Scanner(idFile);
				o2 = new Scanner(fnameFile);
				o3 = new Scanner(lnameFile);
				o4 = new Scanner(streetFile);
				o5 = new Scanner(citFile);
				o6 = new Scanner(staFile);
				o7 = new Scanner(zipFile);
				o8 = new Scanner(typeFile);
			}   catch(FileNotFoundException e1) {
				e1.printStackTrace();
				
			}
			
			Person[] peoples = new Person[ct];
			for (int i = 0; i < peoples.length; i++) {
				
				try {
					String id = (String) o1.nextLine();
					String fname = (String) o2.nextLine();
					String lname = (String) o3.nextLine();
					String street = (String) o4.nextLine();
					String city = (String) o5.nextLine();
					String state = (String) o6.nextLine();
					String zip = (String) o7.nextLine();
					String type = (String) o8.nextLine();
					
					peoples[i] = new Person(Long.parseLong(id), fname, lname, street, city, state, zip, type);
				}   catch(Exception e) {
					
				}
				
			}
			o1.close();
			o2.close();
			o3.close();
			o4.close();
			o5.close();
			o6.close();
			o7.close();
			o8.close();
			return peoples;
		}
		
		
	}