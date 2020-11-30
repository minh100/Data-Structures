package Stack;

public interface Stack {

  /**
   * @param element - element to be added
   * Will check if whether or not pushing the element will cause an overflow
   *      If overflow then using dynamic array we can create a larger array and copy the smaller array over O(n)
   *      else it will just add the element to the top of te array O(1)
   */
  void push(Object element);

  /**
   * @return - removes the top most element in the stack and return that value
   * If stack is empty return an indexOutOfBound exceptions
   */
  Object pop();

  /**
   * @return the top value without removing it
   */
  Object getTop();

  /**
   * @return true if the stack is empty else false if stack is not empty
   */
  boolean isEmpty();

  /**
   * @return - the size of the current stack
   */
  int getSize();

}

