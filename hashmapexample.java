import java.util.HashMap;

public class hashmapexample {
  public static void main(String[] args) {
      HashMap<Integer, String> map = new HashMap<>();

      
      map.put(1," Java");
      map.put(2, " Python");
      map.put(3, " C++");

      
      System.out.println(map);

      
      System.out.println(map.get(2));

      System.out.println(map.containsValue(" Python"));
      System.out.println(map.containsKey(3));

     
      map.remove(3);

      System.out.println(map);
  }
}

// HAsHMAP
// put(key,value)	Insert element
// get(key)	Get value
// remove(key)	Remove pair
// containsKey(key)	Check key
// containsValue(value)	Check value
// size()	Number of elements
// clear()	Remove all
// isEmpty()	Check empty

// HASTSET
// add()	Insert
// remove()	Delete
// contains()	Search
// size()	Count
// clear()	Remove all
// isEmpty()	Check empty