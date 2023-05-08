package mod02.dataStructure.arrayListLinkedList;

import models.mod01mod09.Person;

public class PersonLinkedList implements PersonList<Person> {
	  protected Node<Person> head, tail;
	  protected int size = 0; // Number of elements in the list
	  
	  /** Create an empty list */
	  public PersonLinkedList() {
	  }

	  /** Create a list from an array of objects */
	  public PersonLinkedList(Person[] objects) {
	    for (int i = 0; i < objects.length; i++)
	      add(objects[i]); 
	  }

	  /** Return the head element in the list */
	  public Person getFirst() {
	    if (size == 0) {
	      return null;
	    }
	    else {
	      return head.element;
	    }
	  }

	  /** Return the last element in the list */
	  public Person getLast() {
	    if (size == 0) {
	      return null;
	    }
	    else {
	      return tail.element;
	    }
	  }

	  /** Add an element to the beginning of the list */
	  public void addFirst(Person e) {
	    Node<Person> newNode = new Node<>(e); // Create a new node
	    newNode.next = head; // link the new node with the head
	    head = newNode; // head points to the new node
	    size++; // Increase list size

	    if (tail == null) // the new node is the only node in list
	      tail = head;
	  }

	  /** Add an element to the end of the list */
	  public void addLast(Person e) {
	    Node<Person> newNode = new Node<>(e); // Create a new for element e

	    if (tail == null) {
	      head = tail = newNode; // The new node is the only node in list
	    }
	    else {
	      tail.next = newNode; // Link the new with the last node
	      tail = newNode; // tail now points to the last node
	    }

	    size++; // Increase size
	  }

	  @Override /** Add a new element at the specified index 
	   * in this list. The index of the head element is 0 */
	  public void add(int index, Person e) {
	    if (index == 0) {
	      addFirst(e);
	    }
	    else if (index >= size) {
	      addLast(e);
	    }
	    else {
	      Node<Person> current = head;
	      for (int i = 1; i < index; i++) {
	        current = current.next;
	      }
	      Node<Person> temp = current.next;
	      current.next = new Node<>(e);
	      (current.next).next = temp;
	      size++;
	    }
	  }

	  /** Remove the head node and
	   *  return the object that is contained in the removed node. */
	  public Person removeFirst() {
	    if (size == 0) {
	      return null;
	    }
	    else {
	    	Person temp = head.element;
	      head = head.next;
	      size--;
	      if (head == null) {
	        tail = null;
	      }
	      return temp;
	    }
	  }

	  /** Remove the last node and
	   * return the object that is contained in the removed node. */
	  public Person removeLast() {
	    if (size == 0) {
	      return null;
	    }
	    else if (size == 1) {
	    	Person temp = head.element;
	      head = tail = null;
	      size = 0;
	      return temp;
	    }
	    else {
	      Node<Person> current = head;

	      for (int i = 0; i < size - 2; i++) {
	        current = current.next;
	      }

	      Person temp = tail.element;
	      tail = current;
	      tail.next = null;
	      size--;
	      return temp;
	    }
	  }

	  @Override /** Remove the element at the specified position in this 
	   *  list. Return the element that was removed from the list. */
	  public Person remove(int index) {   
	    if (index < 0 || index >= size) {
	      return null;
	    }
	    else if (index == 0) {
	      return removeFirst();
	    }
	    else if (index == size - 1) {
	      return removeLast();
	    }
	    else {
	      Node<Person> previous = head;

	      for (int i = 1; i < index; i++) {
	        previous = previous.next;
	      }

	      Node<Person> current = previous.next;
	      previous.next = current.next;
	      size--;
	      return current.element;
	    }
	  }

	  @Override /** Override toString() to return elements in the list */
	  public String toString() {
	    StringBuilder result = new StringBuilder("[");

	    Node<Person> current = head;
	    for (int i = 0; i < size; i++) {
	      result.append(current.element);
	      current = current.next;
	      if (current != null) {
	        result.append(", "); // Separate two elements with a comma
	      }
	      else {
	        result.append("]"); // Insert the closing ] in the string
	      }
	    }

	    return result.toString();
	  }

	  @Override /** Clear the list */
	  public void clear() {
	    size = 0;
	    head = tail = null;
	  }

	  @Override /** Return true if this list contains the element e */
	  public boolean contains(Object e) {
	    // Left as an exercise 
	    return true;
	  }

	  @Override /** Return the element at the specified index */
	  public Person get(int index) {
	    // Left as an exercise 
	    return null;
	  }

	  @Override /** Return the index of the first matching element in 
	   *  this list. Return -1 if no match. */
	  public int indexOf(Object e) {
	    // Left as an exercise
	    return 0;
	  }

	  @Override /** Return the index of the last matching element in 
	   *  this list. Return -1 if no match. */
	  public int lastIndexOf(Person e) {
	    // Left as an exercise
	    return 0;
	  }

	  @Override /** Replace the element at the specified position 
	   *  in this list with the specified element. */
	  public Person set(int index, Person e) {
	    // Left as an exercise
	    return null;
	  }

	  @Override /** Override iterator() defined in Iterable */
	  public java.util.Iterator<Person> iterator() {
	    return new LinkedListIterator();
	  }
	  
	  private class LinkedListIterator 
	      implements java.util.Iterator<Person> {
	    private Node<Person> current = head; // Current index 
	    
	    @Override
	    public boolean hasNext() {
	      return (current != null);
	    }

	    @Override
	    public Person next() {
	    	Person e = current.element;
	      current = current.next;
	      return e;
	    }

	    @Override
	    public void remove() {
	      // Left as an exercise
	    }
	  }
	  
	  protected static class Node<Person> {
		  Person element;
	    Node<Person> next;

	    public Node(Person element) {
	      this.element = element;
	    }
	  }
	  
	  @Override /** Return the number of elements in this list */
	  public int size() {
	    return size;
	  }
}
