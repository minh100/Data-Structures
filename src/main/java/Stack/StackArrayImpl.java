package Stack;

public class StackArrayImpl implements Stack {

  private Object[] array;
  private int top;
  private static final int DEFAULTSIZE = 100;

  public StackArrayImpl() {
    array = new Object[DEFAULTSIZE];
    top = -1;

  }

  @Override
  public void push(Object element) {

    if (this.top >= 100) {
      Object[] tempArray = array;
      array = new Object[tempArray.length * 2];
      for (int i = 0; i < tempArray.length; i++) {
        array[i] = tempArray[i];
      }
    }

    array[++top] = element;
  }

  @Override
  public Object pop() {
    if(isEmpty()) throw new IndexOutOfBoundsException("Stack is empty");
    return array[top--];
  }

  @Override
  public Object getTop() {
    return array[top];
  }

  @Override
  public boolean isEmpty() {
    return top == -1;
  }

  @Override
  public int getSize() {
    return top + 1;
  }
}

