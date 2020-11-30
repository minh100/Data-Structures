package HashMap;

import static org.junit.Assert.*;
import org.junit.Test;

public class HashMapImplTest {

  @Test
  public void simpleTest(){
    HashMapImpl map = new HashMapImpl();
    map.put("bob", "1");
    map.put("steve","2");
    map.put("age",3);
    map.put("age",4);
    assertEquals("1", map.get("bob"));
    assertEquals(3, map.get("age"));
  }
}
