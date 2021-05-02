package Sorting;

public class MergeSort {

  // sorting by splitting an array into sub-arrays and swap the elements in order
  // nlogn time which is the best time any sorting function can do
  public int[] mergeSort(int[] array) {

    // makes a copy of the original array
    int[] copyArray = array.clone();
    mergeSortHelper(copyArray, copyArray.length);
    return copyArray;
  }

  public void mergeSortHelper(int[] array, int size) {
    // Test if size is 1
    if (size < 2) {
      return;
    }

    int mid = size / 2;  // find the size for left and right sub arrays

    // initialize and declare new sub arrays
    int[] leftArray = new int[mid];
    int[] rightArray = new int[size - mid];

    for (int i = 0; i < mid; i++) {
      leftArray[i] = array[i];
    }

    for (int j = mid; j < size; j++) {
      rightArray[j - mid] = array[j];
    }

    // split sub-arrays into more sub-arrays
    mergeSortHelper(leftArray, mid);
    mergeSortHelper(rightArray, size - mid);

    // sort the sub-arrays
    merge(array, leftArray, rightArray, mid, size - mid);
  }

  public void merge(int[] newArray, int[] lArray, int[] rArray, int lIdx, int rIdx) {

    int i = 0, j = 0, k = 0;

    // compares the left and right sub-arrays and sorts them
    while (i < lIdx && j < rIdx) {
      if (lArray[i] <= rArray[j]) {
        newArray[k++] = lArray[i++];
      } else {
        newArray[k++] = rArray[j++];
      }
    }

    // remaining left sub-array elements gets added into the array
    while (i < lIdx) {
      newArray[k++] = lArray[i++];
    }

    // remaining right sub-array elements gets added into the array
    while (j < rIdx) {
      newArray[k++] = rArray[j++];
    }

  }
}
