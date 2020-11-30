package Stack;

import junit.framework.TestCase;

public class StackArrayImplTest extends TestCase {

  public void testPush() {
    StackArrayImpl stack = new StackArrayImpl();
    stack.push(1);
    stack.push(2);
    assertEquals(2, stack.getTop());
  }

  public void testPop() {
    StackArrayImpl stack = new StackArrayImpl();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    assertEquals(3, stack.pop());
    assertEquals(2, stack.getSize());
  }

  public void testGetTop() {
    StackArrayImpl stack = new StackArrayImpl();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    assertEquals(3, stack.getTop());
    assertEquals(3, stack.getSize());
  }

  public void testIsEmpty() {
    StackArrayImpl stack = new StackArrayImpl();
    assertTrue(stack.isEmpty());
  }

  public void testGetSize() {
    StackArrayImpl stack = new StackArrayImpl();
    assertEquals(0, stack.getSize());
  }
}
