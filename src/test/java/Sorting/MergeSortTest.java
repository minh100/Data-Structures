package Sorting;

import static org.junit.Assert.*;
import org.junit.Test;

public class MergeSortTest {

  @Test
  public void positiveTest() {
    int[] actual = { 5, 1, 6, 2, 3, 4 };
    int[] stay = { 5, 1, 6, 2, 3, 4 };
    int[] expected = { 1, 2, 3, 4, 5, 6 };
    MergeSort m = new MergeSort();
    int[] results = m.mergeSort(actual);
    assertArrayEquals(expected, results);
    assertArrayEquals(actual, stay);
    for(int i: results) {
      System.out.print(i + " ");
    }
  }
}
