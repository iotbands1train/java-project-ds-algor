package mod03.dataStructure.vectorsSacksQues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

import mod02.dataStructure.arrayListLinkedList.PersonList;
import mod02.dataStructure.arrayListLinkedList.TestPersonLinkedList;
import mod02.dataStructure.arrayListLinkedList.TestPersonMyArrayList;
import models.mod01mod09.Person;

public class TestVectorStacksQueuesMethods {
	static Scanner in=new Scanner(System.in);
	public static void main() {
		load();
		mainMenu() ;	
	}
	
	 
	
	private static void load() {
		// TODO Auto-generated method stub
		//list = data from files
	}

	public static void mainMenu() {
		int ans = 0;
		do {
		
		System.out.println("====== mainMenu ======");
		System.out.println("1 - Vector Menu ");
		System.out.println("2 - Stack Menu ");
		System.out.println("3 - Queue Menu ");
		System.out.println("======================= ");
		int select= Integer.parseInt(in.nextLine());
		int again=1;
		while(again==1) {
			
			switch(select) {
			case 1 : vectorMenu(); break;
			case 2 : stackMenu(); break;
			case 3 : queueMenu(); break;
			default : return;
			}
			
			System.out.println("Enter 1-Again - for main menu Or Exit Program");
		    again= Integer.parseInt(in.nextLine());
		}

		System.out.println("Enter 1-Menu - Or Exit ");
		ans = Integer.parseInt(in.nextLine());
	} while (ans == 1);
		
		end();		
	}
    private static void end() {
		// TODO Auto-generated method stub
    	System.out.println("");
    	System.out.println("====== End of Program ======");
		
	}


	public static void vectorMenu() {
		
        PersonList<Person> list = TestPersonMyArrayList.readFileMyPerson();
        print(list);
    	
    	System.out.println("====== VectorMenu ======");
		System.out.println("1 - First Element ");
		System.out.println("2 - Last Element ");
		System.out.println("3 - Get element by index ");
		System.out.println("4 - Get size of vector ");
		System.out.println("5 - Remove Element ");
		System.out.println("6 - Add Element ");
		System.out.println("======================= ");
		int select= Integer.parseInt(in.nextLine());
		int again=1;
		do {
			Vector<Person> v = new Vector<>();
			add(v,list);
			
			switch(select) {
			case 1 : 
				System.out.println("The first element in this vector :");
				System.out.println("-> " + v.firstElement());
				break;
			case 2 :
				System.out.println("The last element in this vector :");
				System.out.println("-> " + v.lastElement());
				break;
			case 3 : 
				System.out.println("Return of element by index :");
				System.out.println("-> " + v.get(new Random().nextInt(0,v.size()-1)));
				break;
			case 4 : 
				System.out.println("Get size of this vector :");
				System.out.println("-> " + v.size());
				break;
			case 5 : 
				System.out.println("Remove element from vector :");
				System.out.println("-> " + v.remove(v.get(new Random().nextInt(0,v.size()-1))));
				System.out.println(" -> new size ="+v.size());
				break;
			case 6 : 
				System.out.println("Add element to vector :");
			    System.out.println("-> " + v.add(RandomPerson.randomPerson()));
			    System.out.println(" -> new size ="+v.size());
			break;
			default : return;
			}
			
			System.out.println("Enter 1-Again - for vector menu");
		    again= Integer.parseInt(in.nextLine());
		}while(again==1);
	}
    private static void add(Vector<Person> v, PersonList<Person> list) {
    	for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			v.add(person);
		}
		
	}

	public static void stackMenu() {
    	
    	 PersonList<Person> list = TestPersonMyArrayList.readFileMyPerson();
    	 print(list);
    	

    	System.out.println("====== StackMenu ======");
		System.out.println("1 - Top Element ");
		System.out.println("2 - Remove Top Element ");
		System.out.println("3 - Add Element ");
		System.out.println("4 - Get index by Element ");
		System.out.println("5 - Remove All Elements ");
		System.out.println("======================= ");
		int select= Integer.parseInt(in.nextLine());
		int again=1;
		while(again==1) {
			Stack <Person> s = new Stack<>();
			add(s,list);
			
			switch(select) {
			case 1 : 
				System.out.println("Top element in this stack :");
				System.out.println("-> " + s.peek());
				break;
			case 2 :
				System.out.println("Remove element from stack :");
				System.out.println("-> " + s.pop());
				break;
			case 3 : 
				System.out.println("Add element to stack :");
				System.out.println("-> " + s.push(RandomPerson.randomPerson()) );
				break;
			case 4 : 
				System.out.println("Get index by Element in stack :");
				System.out.println("-> " + s.search(s.get(new Random().nextInt(0,s.size()-1))));
				break;
			case 5 : 
				System.out.println("All elements remove froom stack :");
				s.clear();
				System.out.println("-> " + s.size());
				break;
			default : 
				return;
			}
			
			System.out.println("Enter 1-Again - for stack menu");
		    again= Integer.parseInt(in.nextLine());
		}

    }
    public static void queueMenu() {
    	
    	 PersonList<Person> list = TestPersonLinkedList.readFileMyPerson();
 		print(list);

    	System.out.println("====== QueueMenu ======");
		System.out.println("1 - Head Element ");
		System.out.println("2 - Remove Element ");
		System.out.println("3 - Add Element ");
		System.out.println("======================= ");
		int select= Integer.parseInt(in.nextLine());
		int again=1;
		while(again==1) {
			Queue<Person> q = new LinkedList<>();
			add(q,list);
			
			switch(select) {
			case 1 : 
				System.out.println("The top Element in the queue :");
				System.out.println("-> " + q.peek());
				break;
			case 2 :
				System.out.println("Remove element from the queue :");
				System.out.println("-> " + q.poll() + " size =" +q.size());
				break;
			case 3 : 
				System.out.println("Add element to the queue :");
				System.out.println("-> " + q.offer(RandomPerson.randomPerson())  + " size =" +q.size());
				break;
			default : return;
			}
			
			System.out.println("Enter 1-Again - for queue menu");
		    again= Integer.parseInt(in.nextLine());
		}
}

	private static void add(Queue<Person> q, PersonList<Person> list) {
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			q.add(person);
		}
		
		
	}

	private static void print(PersonList<Person> list) {
		int i =1;
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			System.out.println(i +" : "+person);
			i++;
		}
		
	}


}

