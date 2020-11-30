package LinkedList;

/*
  Linked list interface
  Contains methods for linked lists
 */
public interface LinkedList<T> {

  /**
   *
   * @return the size of the list
   */
  int getSize();

  /**
   *
   * @return true if the list contains no elements
   */
  boolean isEmpty();

  /**
   * removes all elements in the list
   */
  void clear();

  /**
   *
   * @param element to be searched for
   * @return true if the list has the element
   */
  boolean contains(T element);

  /**
   * Returns an array containing all of the elements of the list
   * in sequence. The size and contents of the array created
   * are the size and contents of the list at the time
   * that the method is called.
   *
   * @return the list as an array
   */
  T[] toArray();

  /**
   * adds the element to the end of the list
   *
   * @param element to be added to the end of the list
   */
  void add(T element);

  /**
   * Removes the first occurrence of the specified element
   * from this list, if it is present
   *
   * @param element to be removed
   * @return true if the list contains the element to be removed
   */
  boolean remove(T element);


  /**
   *
   * @param index of element to be returned
   * @return the element at the specified index
   */
  T get(int index);

  /**
   * Replaces the element at the specified position in this list
   * with the specified element.
   *
   * @param index of element to replace
   * @param element to be stored at a position
   * @return the element previously at this location
   */
  T set(int index, T element);

  /**
   * Inserts the specified element at the specified position in
   * this list (optional operation). Shifts the element currently
   * at that position (if any) and any subsequent elements to the
   * right (adds one to their indices).
   *
   * The value of index must be in the range of 0 to the size of the
   * list. Adding an element at index size will add the element to
   * the end of the list.
   *
   * @param index   at which the specified element is to be inserted
   * @param element to be inserted
   */
  void add(int index, T element);

  /**
   * Removes the element at the specified position in this list.
   * Shifts any subsequent elements to the left
   * (subtracts one from their indices).
   *
   * @param index of element to be removed
   * @return element that is removed
   */
  T remove(int index);

  /**
   * Finds the first occurrence of an element from the list, if present
   *
   * @param element to find position of
   * @return the index of the first occurrence of an element
   * or -1 if the element is not present
   */
  int indexOf(T element);

  /**
   * Finds the last occurrence of an element from the list
   *
   * @param element to find position of
   * @return the index of the last occurrence of an element
   * or -1 if the element is not present
   */
  int lastIndexOf(T element);

  /**
   * Reverse a linked list
   */
  void reverse();


  /**
   * Prints the linked list's content
   */
  void printList();

}

