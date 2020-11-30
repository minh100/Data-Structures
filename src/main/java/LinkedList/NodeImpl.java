package LinkedList;

// Implements Node interface
public class NodeImpl<T> implements Node<T> {


  private T _value; // current node's value
  private Node<T> _next;  // current node's next node

  // constructor
  public NodeImpl(T value, Node<T> next) {
    _value = value;
    _next = next;
  }

  @Override
  public T getValue() {
    return _value;
  }

  @Override
  public void setValue(T value) {
    _value = value;
  }

  @Override
  public Node<T> getNext() {
    return _next;
  }

  @Override
  public void setNext(Node<T> next) {
    _next = next;
  }

  @Override
  public boolean hasNext() {
    return getNext() != null;
  }
}
