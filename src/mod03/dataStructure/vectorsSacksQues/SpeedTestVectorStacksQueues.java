package mod03.dataStructure.vectorsSacksQues;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

import mod02.dataStructure.arrayListLinkedList.PersonArrayList;
import models.mod01mod09.Person;

public class SpeedTestVectorStacksQueues {
	
	
	private static long start;
	private static long end;
	private static double timeV;
	private static double timeS;
	private static double timeQ;

	public static void main() {
		start();
		Vector<Person> vector=peopleVector(); 
		endV(); 
		print(vector);
		start();
		Stack<Person> stack=peopleStack(); 
		endS(); 
		print(stack);
		Queue<Person> queue=peopleQueue(); 
		endQ(); 
		print(queue);
		System.out.println("Vector time taken = "+timeV);
		System.out.println("Stack time taken = "+timeS);
		System.out.println("Queue time taken = "+timeQ);
		winnerResults();
		
//		Stack<Person> stackAL=new Stack<>(); 
//		stackAL.addAll(peopleArrayList());
//		Queue<Person> queueLL=new LinkedList<>(peopleLinkedList()); 
	}
 

	private static void winnerResults() {
		String[] names = {"Vector","Stack","Queue"};
		Double[] times = {timeV,timeS,timeQ};
		String name="";
		double low=times[0]; 
		for (int i = 1; i < times.length; i++) {
			 if(times[i]<low) {
				 low=times[i];
				 name=names[i];
			 }
		} 
		System.out.println("Winner is -> "+name+" = "+low); 
	}

	private static Queue<Person> peopleQueue() {
		Queue<Person> pbank=new  LinkedList<>();
		Person p =null;
		int len = 0;
		Scanner r = null; 
		File file = new File("persons");
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
					String street = s.substring(s.indexOf("street=") + "street=".length(), s.indexOf(", city")).replace('+', ' '); 
					String city = s.substring(s.indexOf("city=") + "city=".length(), s.indexOf(", state"));
					String state = s.substring(s.indexOf("state=") + "state=".length(), s.indexOf(", zip"));
					String zip = s.substring(s.indexOf("zip=") + "zip=".length(), s.indexOf(", type"));
					String type = s.substring(s.indexOf("type=") + "type=".length());
					Person person1 = new Person(Long.parseLong(id), fname, lname, street, city, state, zip, type);

					pbank.add(person1);
					i++;
				}
			}
			r.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pbank;
	}

	private static void print(Queue<Person> queue) {
		int i=0;int r=0;
		System.out.println();
		for (Iterator iterator = queue.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next(); 
			System.out.println("[("+i+") "+person.getId()+"],"); i++; 
		}
		System.out.println();
	}

	private static void endQ() {
		end = System.currentTimeMillis();
		timeQ = (end - start) * .001;		
	}

	private static void endS() {
		end = System.currentTimeMillis();
		timeS = (end - start) * .001;
		// timesMyPerson.add(timeMyPersonTime);
	}

	private static void endV() {
		end = System.currentTimeMillis();
		timeV = (end - start) * .001;
		// timesMyPerson.add(timeMyPersonTime);
	}

	private static void start() {
		start = System.currentTimeMillis();
	}

	private static void print(Vector<Person> vectorAL) {
		int i=0; 
		System.out.println();
		for (Iterator iterator = vectorAL.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next(); 
			System.out.println("[("+i+") "+person.getId()+"],"); 
			 i++; 
		}
		System.out.println();
		
	}

	private static  Stack<Person> peopleStack() {
		Stack<Person> pbank=new  Stack<>();
		Person p =null;
		int len = 0;
		Scanner r = null; 
		File file = new File("persons");
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
					String street = s.substring(s.indexOf("street=") + "street=".length(), s.indexOf(", city")).replace('+', ' '); 
					String city = s.substring(s.indexOf("city=") + "city=".length(), s.indexOf(", state"));
					String state = s.substring(s.indexOf("state=") + "state=".length(), s.indexOf(", zip"));
					String zip = s.substring(s.indexOf("zip=") + "zip=".length(), s.indexOf(", type"));
					String type = s.substring(s.indexOf("type=") + "type=".length());
					Person person1 = new Person(Long.parseLong(id), fname, lname, street, city, state, zip, type);

					pbank.add(person1);
					i++;
				}
			}
			r.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pbank;
	}


	private static  Vector<Person> peopleVector() {
		Vector<Person> pbank=new  Vector<>();
		Person p =null;
		int len = 0;
		Scanner r = null; 
		File file = new File("persons");
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
					String street = s.substring(s.indexOf("street=") + "street=".length(), s.indexOf(", city")).replace('+', ' '); 
					String city = s.substring(s.indexOf("city=") + "city=".length(), s.indexOf(", state"));
					String state = s.substring(s.indexOf("state=") + "state=".length(), s.indexOf(", zip"));
					String zip = s.substring(s.indexOf("zip=") + "zip=".length(), s.indexOf(", type"));
					String type = s.substring(s.indexOf("type=") + "type=".length());
					Person person1 = new Person(Long.parseLong(id), fname, lname, street, city, state, zip, type);

					pbank.add(person1);
					i++;
				}
			}
			r.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pbank;
	}

	private static  PersonArrayList<Person> peopleArrayList() {
		 PersonArrayList<Person> pbank=new  PersonArrayList<>();
		Person p =null;
		int len = 0;
		Scanner r = null; 
		File file = new File("persons");
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
					String street = s.substring(s.indexOf("street=") + "street=".length(), s.indexOf(", city")).replace('+', ' '); 
					String city = s.substring(s.indexOf("city=") + "city=".length(), s.indexOf(", state"));
					String state = s.substring(s.indexOf("state=") + "state=".length(), s.indexOf(", zip"));
					String zip = s.substring(s.indexOf("zip=") + "zip=".length(), s.indexOf(", type"));
					String type = s.substring(s.indexOf("type=") + "type=".length());
					Person person1 = new Person(Long.parseLong(id), fname, lname, street, city, state, zip, type);

					pbank.add(person1);
					i++;
				}
			}
			r.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pbank;
	}

}
