package Stack;

public class Node {
  public Object element;
  public Node next;

  public Node(Object e){
    this(e, null);
  }
  public Node(Object e, Node n){
    this.element = e;
    this.next = n;
  }

}

