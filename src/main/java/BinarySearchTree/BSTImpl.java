package BinarySearchTree;

import java.util.*;
import java.util.Stack;

public class BSTImpl<T extends Comparable<T>> implements BST<T> {

  private T _element;
  private BST<T> _left;
  private BST<T> _right;
  private int size = 0;

  public BSTImpl(T element) {
    _element = element;
    _left = new BSTImpl<>();
    _right = new BSTImpl<>();
    size = 1;
  }

  public BSTImpl(){ }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public int getHeight() {
    if(isEmpty()){
      return 0;
    }
    return Math.max(_left.getHeight(),_right.getHeight()) +1;
  }

  @Override
  public BST<T> insert(T element) {
    size++;
    if(this.isEmpty()){
      return new BSTImpl<>(element);
    }
    else if(_element.compareTo(element) >= 0 ){
      if(_left.isEmpty()){
        _left = new BSTImpl<>(element);
        return this;
      } else {
        _left.insert(element);
      }
    }
    else if(_element.compareTo(element) < 0 ){
      if(_right.isEmpty()){
        _right = new BSTImpl<>(element);
        return this;
      } else {
        _right.insert(element);
      }
    }
    return this;
  }

  @Override
  public BST<T> remove(T element) {
    if(isEmpty()){
      return new BSTImpl<>();
    }
    if(contains(element)){
      size--;
      if(_element.compareTo(element) > 0 ) {
        return _left.remove(element);
      } else if (_element.compareTo(element) < 0) {
        return _right.remove(element);
      } else {
        if(_left.isEmpty()) {
          return _right;
        } else if(_right.isEmpty()){
          return _left;
        } else {
          _element = _right.findMin();
          _right = _right.remove(_element);
        }
      }
    }
    return this;
  }

  @Override
  public T findMin() {
    if (!_left.isEmpty()) {
      return _left.findMin();
    }
    return _element;

  }

  @Override
  public T findMax() {
    if (!_right.isEmpty()) {
      return _right.findMax();
    }
    return _element;
  }

  @Override
  public boolean contains(T element) {
    if(this.isEmpty()){
      return false;
    }
    if(_element.compareTo(element) == 0) return true;
    else if(_element.compareTo(element) >= 0) return _left.contains(element);
    else if(_element.compareTo(element) < 0) return _right.contains(element);

    return false;

  }

  @Override
  public boolean isEmpty() {
    return getSize() == 0;
  }

  @Override
  public T getElement() {
    return _element;
  }

  @Override
  public BST<T> getLeft() {
    return _left;
  }

  @Override
  public BST<T> getRight() {
    return _right;
  }

  public void inOrderPrint() {
    if(isEmpty()) return;

    _left.inOrderPrint();
    System.out.println(_element + " ");
    _right.inOrderPrint();
  }

  @Override
  public List<T> inOrderPrint(BST<T> root) {
    List<T> list = new ArrayList<>();
    if(root.getElement() == null) return list;
    Stack<BST<T>> stack = new Stack<>();
    while( root.getElement() != null || !stack.empty()) {
      while( root.getElement() != null) {
        stack.push(root);
        root = root.getLeft();
      }
      root = stack.pop();
      list.add(root.getElement());
      root = root.getRight();
    }
    return list;
  }

  @Override
  public boolean isBST(BST<Integer> root) {
    if(root == null) return true;
    Stack<BST<Integer>> stack = new Stack<>();
    BST<Integer> pre = null;
    while( root.getElement() != null || !stack.empty()) {
      while(root.getElement() != null) {
        stack.push(root);
        root = root.getLeft();
      }

      root = stack.pop();
      if(pre != null && root.getElement() <= pre.getElement()) return false;
      pre = root;
      root = root.getRight();


    }
    return true;
  }

  @Override
  public int sumRangeBST(BST<Integer> root, int l, int r) {
    if(root == null) return 0;

    if(root.getElement() < l) return sumRangeBST(root.getRight(), l, r);
    else if(root.getElement() > r) return sumRangeBST(root.getLeft(), l, r);
    else {
      return root.getElement() + sumRangeBST(root.getLeft(), l, r) + sumRangeBST(root.getRight(), l, r);
    }
  }




}

