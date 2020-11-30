package LinkedList;

// Implements the linked list interface
public class LinkedListImpl<T> implements LinkedList<T> {

  private T element;
  public int size = 0;
  private Node<T> head = null;
  Node<T> tailNode;

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public void clear() {
    head = null;
    size = 0;
  }

  @Override
  public boolean contains(T element) {
    return (indexOf(element) != -1);
  }

  @Override
  public T[] toArray() {
    Object[] array = new Object[size];

    for (int i = 0; i < size; i++) {
      array[i] = get(i);
    }

    return (T[]) array;

  }

  @Override
  public void add (T element) {
    if (head == null) {
      head = new NodeImpl<T>(element, null);
      tailNode = head;
      size++;
    } else {
      Node<T> newNode = new NodeImpl<T>(element, null);
      tailNode.setNext(newNode);
      tailNode = tailNode.getNext();
      size++;
    }
  }

  @Override
  public boolean remove(T element) {

    int index = indexOf(element);

    if (index != -1) {
      remove(index);
      return true;
    }

    return false;
  }

  @Override
  public T get(int index) {

    if (index > size || index < 0) {
      throw new IndexOutOfBoundsException();
    }
    if (head == null) {
      return null;
    }
    Node<T> currentNode = head;
    for (int i = 0; i < index; i++) {
      currentNode = currentNode.getNext();
    }
    return currentNode.getValue();

  }

  @Override
  public T set(int index, T element) {

    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException();
    }

    Node<T> currentNode = head;
    T previousElement;
    for (int i = 0; i < index; i++) {
      currentNode = currentNode.getNext();
    }

    previousElement = currentNode.getValue();
    currentNode.setValue(element);
    return previousElement;

  }

  @Override
  public void add(int index, T element) {

    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException();
    }

    if (index == size) {
      add(element);
      return;
    }

    Node<T> currentNode = head;

    if (index == 0) {
      head = new NodeImpl<T>(element, head);
      return;
    }

    for (int i = 0; i < index; i++) {
      currentNode = currentNode.getNext();
    }

    Node<T> newNode = new NodeImpl<T>(element, currentNode.getNext());
    currentNode.setNext(newNode);
    size++;


  }

  @Override
  public T remove(int index) {

    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException();
    }

    Node<T> currentNode = head;
    T indexValue;

    if (index == 0) {
      indexValue = head.getValue();
      head = head.getNext();
      size--;
      return indexValue;
    }

    for (int i = 0; i < index - 1; i++) {
      currentNode = currentNode.getNext();
    }

    indexValue = currentNode.getNext().getValue();
    currentNode.setNext(currentNode.getNext().getNext());
    size--;
    return indexValue;


  }

  @Override
  public int indexOf(T element) {
    Node<T> currentNode = head;

    for (int i = 0; i < size; i++) {
      if (currentNode.getValue().equals(element)) {
        return i;
      }
      currentNode = currentNode.getNext();

    }
    return -1;
  }

  @Override
  public int lastIndexOf(T element) {
    Node<T> currentNode = head;
    int currentIndex = 0;

    if (contains(element)) {
      for (int i = 0; i < size; i++) {
        if (currentNode.getValue() == element) {
          currentIndex = i;
        }
        currentNode = currentNode.getNext();
      }
      return currentIndex;
    }
    return -1;

  }

  @Override
  public void reverse() {

    Node<T> previousNode = null;
    Node<T> currentNode = head;
    Node<T> nextNode = null;

    while(currentNode != null) {
      nextNode = currentNode.getNext();
      currentNode.setNext(previousNode);
      previousNode = currentNode;
      currentNode = nextNode;
    }
    head = previousNode;


  }

  @Override
  public void printList() {
    Node<T> currentNode = head;

    while(currentNode != null) {
      System.out.print(currentNode.getValue() + " ");
      currentNode = currentNode.getNext();
    }

  }
}

