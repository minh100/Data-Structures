package Sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSortTest {

  @Test
  public void positiveTest() {
    int[] actual = {5, 1, 6, 2, 3, 4};
    int[] expected = {1, 2, 3, 4, 5, 6};

    QuickSort q = new QuickSort();
    q.quickSort(actual);
    assertArrayEquals(expected, actual);
    for(int i : actual) {
      System.out.println(i);
    }
  }
}
