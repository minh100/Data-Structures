package BinarySearchTree;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;

public class BSTImplTest {

    @Test
    public void getSize() {
        BST<Integer> tree = new BSTImpl<>(5);
        tree.insert(10);
        tree.insert(3);
        tree.insert(6);
        assertEquals("Expected size to be 4", 4, tree.getSize());
    }

    @Test
    public void getHeight() {
        BST<Integer> tree = new BSTImpl<>(5);
        tree.insert(10);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(4);
        assertEquals("Expected height to be 3", 3, tree.getHeight());
    }

    @Test
    public void insert() {
        BST<Integer> tree = new BSTImpl<>(5);
        tree.insert(10);
        tree.insert(3);
        tree.insert(6);
        assertEquals("Expected size to be 4", 4, tree.getSize());
    }

    @Test
    public void remove() {
        BST<Integer> tree = new BSTImpl<>(5);
        tree.insert(10);
        tree.insert(3);
        tree.insert(6);
        tree.remove(3);
        assertEquals("Expected size to be 3",3,tree.getSize());
    }

    @Test
    public void findMin() {
        BST<Integer> tree = new BSTImpl<>(5);
        tree.insert(10);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        assertEquals("Expected min to be 1", (Integer)1, tree.findMin());
    }

    @Test
    public void findMax() {
        BST<Integer> tree = new BSTImpl<>(5);
        tree.insert(10);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(4);
        assertEquals("expected 10 to be the greatest number", (Integer) 10, tree.findMax());
    }

    @Test
    public void contains() {
        BST<Integer> tree = new BSTImpl<>(5);
        tree.insert(10);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(4);
        assertTrue("Expected 4 to be in tree", tree.contains(4));

    }

    @Test
    public void isEmpty() {
        BST<Integer> tree = new BSTImpl<>();
        assertTrue("Expected true", tree.isEmpty());
    }

    @Test
    public void getElement() {
        BST<Integer> tree = new BSTImpl<>(5);
        assertEquals("Expected element to be 5", (Integer)5, tree.getElement());
    }

    @Test
    public void getLeft() {
        BST<Integer> tree = new BSTImpl<>(5);
        tree.insert(2);
        assertEquals("Expected left to be 2", (Integer)2, tree.getLeft().getElement());
    }

    @Test
    public void getRight() {
        BST<Integer> tree = new BSTImpl<>(5);
        tree.insert(10);
        assertEquals("Expected left to be 10", (Integer)10, tree.getRight().getElement());
    }

    @Test
    public void inOrderPrint() {
        BST<Integer> tree = new BSTImpl<>(5);
        tree.insert(10);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(4);
        tree.inOrderPrint();
    }

    @Test
    public void testInOrderPrint() {
        BST<Integer> tree = new BSTImpl<>(5);
        tree.insert(10);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(4);
        List<Integer> list = tree.inOrderPrint(tree);
        System.out.println(list.toString());
    }

    @Test
    public void isBST() {
        BST<Integer> tree = new BSTImpl<>(5);
        tree.insert(10);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(4);
        assertTrue(tree.isBST(tree));
    }
}
