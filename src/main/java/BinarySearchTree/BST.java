package BinarySearchTree;
import java.util.List;

public interface BST<T extends Comparable<T>> {

  /**
   * @return number of elements in the tree
   */
  int getSize();

  /**
   * @return longest path from root to a leaf
   */
  int getHeight();

  /**
   * @param element to be inserted
   * @return mutated tree or new tree
   */
  BST<T> insert(T element);

  /**
   * @param element to be removed
   * @return mutated tree or empty tree
   */
  BST<T> remove(T element);

  /**
   * @return smallest element in tree
   */
  T findMin();

  /**
   * @return largest element in tree
   */
  T findMax();

  /**
   * @param element element to be searched for
   * @return true if element is present in tree else false
   */
  boolean contains(T element);

  /**
   * @return true if tree size is 0
   */
  boolean isEmpty();

  /**
   * @return element of current node
   */
  T getElement();

  /**
   * @return gets left node
   */
  BST<T> getLeft();

  /**
   * @return gets right node
   */
  BST<T> getRight();


  /**
   * Recursively print contents in a tree in order
   */
  void inOrderPrint();

  /**
   * Iteratively print contents in a tree in order
   *
   * @param root to start printing
   * @return a linked list
   */
  List<T> inOrderPrint(BST<T> root);

  /**
   * Checks to see if the tree follows the axioms of a BST
   *
   * @param root the starting point
   * @return true if the tree is a BST
   */
  boolean isBST(BST<Integer> root);


  /**
   * @param root - the starting point
   * @param l - left end of range
   * @param r - right end of range
   * @return the sum of the inclusive values between the ranges in the tree
   */

  int sumRangeBST(BST<Integer> root, int l, int r);

}

