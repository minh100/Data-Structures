package Stack;

public class StackListImpl implements Stack{

  private Node list;

  public StackListImpl(){
    list = null;
  }

  @Override
  public void push(Object element) {
    list = new Node(element, list);
  }

  @Override
  public Object pop() {
    if(list == null) throw new IndexOutOfBoundsException("Stack is empty");
    Object element = list.element;
    list = list.next;
    return element;
  }

  @Override
  public Object getTop() {
    return list.element;
  }

  @Override
  public boolean isEmpty() {
    return list == null;
  }

  @Override
  public int getSize() {
    int count = 0;
    Node head = list;
    while(head != null){
      count++;
      head = head.next;
    }

    return count;
  }
}

