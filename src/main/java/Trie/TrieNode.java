package Trie;

import java.util.HashMap;

public class TrieNode {

  public HashMap<Character, TrieNode> children;
  public boolean isWord = false;
  public TrieNode() {
    children = new HashMap<>();
  }
}
