package LinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListImplTest {

  @Test
  public void getSize() {
    LinkedList<Integer> list = new LinkedListImpl<Integer>();
    list.add(7);
    assertEquals("expected list to be 1", 1, list.getSize());

  }

  @Test
  public void isEmpty() {
    LinkedList<Integer> list = new LinkedListImpl<Integer>();
    list.add(7);
    list.add(10);
    assertFalse("expected false", list.isEmpty());
  }

  @Test
  public void clear() {
    LinkedList<Integer> list = new LinkedListImpl<Integer>();
    list.add(7);
    list.clear();
    assertEquals("expected 0", 0, list.getSize());
  }

  @Test
  public void contains() {
    LinkedList<Integer> list = new LinkedListImpl<Integer>();
    list.add(7);
    list.add(10);
    list.add(1);
    list.add(12);
    list.add(5);
    assertTrue("expected contains to be true", list.contains(5));
  }

  @Test
  public void toArray() {
    LinkedList<Integer> list = new LinkedListImpl<Integer>();
    list.add(7);
    list.add(10);
    list.add(1);
    list.add(12);
    list.add(5);

    Integer[] expectedArray = new Integer[]{7,10,1,12,5};
    assertArrayEquals( "expected array: [7,10,1,12,5]", expectedArray, list.toArray());

  }

  @Test
  public void append() {
    LinkedList<Integer> list = new LinkedListImpl<Integer>();
    list.add(7);
    list.add(10);
    list.add(1);
    assertEquals("expected 7 at index 0", (Integer)7, list.get(0));
    assertEquals("expected 10 at index 1", (Integer)10, list.get(1));
    assertEquals("expected 1 at index 2", (Integer)1, list.get(2));

  }

  @Test
  public void removeElement() {
    LinkedList<Integer> list = new LinkedListImpl<Integer>();
    list.add(7);
    list.add(10);
    list.add(1);
    list.add(12);
    list.add(5);
    list.remove((Integer)1);
    Integer[] expected = new Integer[]{7, 10, 12, 5};
    assertArrayEquals("expected for 1 to be removed", expected, list.toArray());

  }

  @Test
  public void get() {
    LinkedList<Integer> list = new LinkedListImpl<Integer>();
    list.add(7);
    list.add(10);
    list.add(1);
    list.add(12);
    list.add(5);
    assertEquals("expected index 0 to be 7",(Integer)(7), list.get(0));

  }

  @Test
  public void set() {
    LinkedList<Integer> list = new LinkedListImpl<Integer>();
    list.add(7);
    list.add(10);
    list.set(0, 4);
    assertEquals("Expected 0th element to be 4", (Integer)4, list.get(0));
  }

  @Test
  public void add() {
    LinkedList<Integer> list = new LinkedListImpl<Integer>();
    list.add(3);
    list.add(2);
    list.add(0, 4);
    assertEquals("Expected 0th element to be 4", (Integer)4, list.get(0));
    assertEquals("Expected 1st element to be 3", (Integer)3, list.get(1));
    assertEquals("Expected 2nd element to be 2", (Integer)2, list.get(2));
  }

  @Test
  public void removeIndex() {
    LinkedList<Integer> list = new LinkedListImpl<Integer>();
    list.add(3);
    list.add(2);
    list.remove(0);
    assertEquals("Expected 0th element to be 2", (Integer)2, list.get(0));
  }

  @Test
  public void indexOf() {
    LinkedList<Integer> list = new LinkedListImpl<Integer>();
    list.add(7);
    list.add(10);
    list.add(1);
    list.add(12);
    list.add(5);
    assertEquals("Expected 1 to be at index 2", 2, list.indexOf(1));
  }

  @Test
  public void lastIndexOf() {
    LinkedList<Integer> list = new LinkedListImpl<Integer>();
    list.add(7);
    list.add(10);
    list.add(1);
    list.add(1);
    list.add(5);
    assertEquals("Expected last 1 to be at index 3", 3, list.lastIndexOf(1)) ;
  }

  @Test
  public void reverse(){
    LinkedList<Integer> list = new LinkedListImpl<Integer>();
    list.add(7);
    list.add(10);
    list.add(1);
    list.add(1);
    list.add(5);
    list.reverse();
    assertEquals("Expected index 0 to be 5", (Integer)5, list.get(0));
    assertEquals("Expected index 1 to be 1", (Integer)1, list.get(1));
    assertEquals("Expected index 2 to be 1", (Integer)1, list.get(2));
    assertEquals("Expected index 3 to be 10", (Integer)10, list.get(3));
    assertEquals("Expected index 4 to be 7", (Integer)7, list.get(4));

  }

  @Test
  public void printList(){
    LinkedList<Integer> list = new LinkedListImpl<Integer>();
    list.add(7);
    list.add(10);
    list.add(1);
    list.add(1);
    list.add(5);
    list.printList();
  }


}


