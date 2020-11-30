package Stack;

import junit.framework.TestCase;

public class StackListImplTest extends TestCase {

  public void testPush() {
    StackListImpl stack = new StackListImpl();
    stack.push(1);
    assertEquals(1, stack.getTop());
  }

  public void testPop() {
    StackListImpl stack = new StackListImpl();
    stack.push(1);
  }

  public void testGetTop() {
    StackListImpl stack = new StackListImpl();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    assertEquals(4, stack.getTop());
  }

  public void testIsEmpty() {
    StackListImpl stack = new StackListImpl();
    assertTrue(stack.isEmpty());
  }

  public void testGetSize() {
    StackListImpl stack = new StackListImpl();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    assertEquals(4, stack.getSize());
    System.out.println(stack.getTop());
  }
}
