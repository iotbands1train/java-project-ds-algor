package mod02.dataStructure.arrayListLinkedList;

import java.util.Collection;

public interface PersonList<Person> extends Collection<Person> {
	/** Add a new element at the specified index in this list */
	  public void add(int index, Person e);

	  /** Return the element from this list at the specified index */
	  public Person get(int index);

	  /** Return the index of the first matching element in this list.
	   *  Return -1 if no match. */
	  public int indexOf(Object e);

	  /** Return the index of the last matching element in this list
	   *  Return -1 if no match. */
	  public int lastIndexOf(Person e);

	  /** Remove the element at the specified position in this list
	   *  Shift any subsequent elements to the left.
	   *  Return the element that was removed from the list. */
	  public Person remove(int index);

	  /** Replace the element at the specified position in this list
	   *  with the specified element and returns the new set. */
	  public Person set(int index, Person e);
	  
	  @Override /** Add a new element at the end of this list */
	  public default boolean add(Person e) {
	    add(size(), e);
	    return true;
	  }

	  @Override /** Return true if this list contains no elements */
	  public default boolean isEmpty() {
	    return size() == 0;
	  }

	  @Override /** Remove the first occurrence of the element e 
	   *  from this list. Shift any subsequent elements to the left.
	   *  Return true if the element is removed. */
	  public default boolean remove(Object e) {
	    if (indexOf(e) >= 0) {
	      remove(indexOf(e));
	      return true;
	    }
	    else
	      return false;
	  }

	  @Override
	  public default boolean containsAll(Collection<?> c) {
	    // Left as an exercise
	    return true;
	  }

	  @Override
	  public default boolean addAll(Collection<? extends Person> c) {
	    // Left as an exercise
	    return true;
	  }

	  @Override
	  public default boolean removeAll(Collection<?> c) {
	    // Left as an exercise
	    return true;
	  }

	  @Override
	  public default boolean retainAll(Collection<?> c) {
	    // Left as an exercise
	    return true;
	  }

	  @Override
	  public default Person[] toArray() {
	    // Left as an exercise
	    return null;
	  }

	  @Override
	  public default <T> T[] toArray(T[] array) {
	    // Left as an exercise
	    return null;
	  }
}