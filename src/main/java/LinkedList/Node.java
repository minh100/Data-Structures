package LinkedList;

// Node interface
public interface Node<T> {

  //declaration of methods

  /**
   *
   * @return value of node
   */
  T getValue();

  /**
   *
   * @param value
   * Sets the value of a node
   */
  void setValue(T value);

  /**
   *
   * @return the value of next node
   */
  Node<T> getNext();

  /**
   *
   * @param next
   * sets value of next node
   */
  void setNext(Node<T> next);

  /**
   *
   * @return true if there is a next node
   */
  boolean hasNext();


}


