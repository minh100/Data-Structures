package HashMap;

public class HashEntry<T> {

  String key;
  Object value;

  HashEntry<Object> next;

  public HashEntry(String k, Object v) {
    this.key = k;
    this.value = v;
    this.next = null;
  }

}
