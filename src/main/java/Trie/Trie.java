package Trie;

public class Trie {

  private TrieNode root;
  public Trie() {
    root = new TrieNode();
  }

  public void insert(String word) {
    if(word == null) return;
    TrieNode current = root;
    for(char c: word.toCharArray()) {
      if(current.children.get(c) == null) {
        current.children.put(c, new TrieNode());
      }
      current = current.children.get(c);
    }
    current.isWord = true;
  }

  public boolean search(String word) {
    if(word == null) return false;
    TrieNode current = root;
    for(char c: word.toCharArray()) {
      if(current.children.get(c) == null) {
        return false;
      }
      current = current.children.get(c);
    }
    return true;
  }

  public boolean startsWith(String prefix) {
    if(prefix == null) return false;
    TrieNode current = root;
    for(char c: prefix.toCharArray()) {
      if(current.children.get(c) == null) {
        return false;
      }
      current = current.children.get(c);
    }
    return true;
  }
}
