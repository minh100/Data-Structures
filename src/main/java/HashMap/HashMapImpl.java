package HashMap;

public class HashMapImpl {

  private HashEntry[] entries;

  public HashMapImpl() {
     this.entries = new HashEntry[16];
  }

  public void put(String key, Object value) {
    int hash = getHash(key, this.entries.length);

    HashEntry currEntry = new HashEntry(key, value);

    if(entries[hash] == null) {
      entries[hash] = currEntry;
    }
    else {
      HashEntry temp = entries[hash];
      while(temp.next != null) {
        temp = temp.next;
      }

      temp.next = currEntry;
    }
  }

  public Object get(String key) {
    int hash = getHash(key, this.entries.length);
    if(entries[hash] != null) {
      HashEntry temp = entries[hash];

      while(!temp.key.equals(key) && temp.next != null) {
        temp = temp.next;
      }

      return temp.value;
    }

    return null;

  }

  private int getHash(String key, int mapSize) {
    int hash = 13;

    for(int i = 0; i < key.length(); i++) {
      hash = (13 * hash * key.charAt(i)) % mapSize;
    }

    if(hash >= this.entries.length) {
      HashEntry[] newMap = new HashEntry[hash * 2];
      for(int i = 0; i < this.entries.length; i++) {
        newMap[i] = this.entries[i];
      }

      this.entries = newMap;
    }

    return hash;
  }



}
