package programmer.zaman.now.collection;

import com.sun.tools.javac.Main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
  public static void main(String[] args) {

    Map<String, String> map = new LinkedHashMap<>();

    map.put("first", "Eko");
    map.put("last", "Khannedy");
    map.put("middle", "Kurniawan");

    Set<String> keys = map.keySet();
    for (var key : keys) {
      System.out.println(key);
    }

  }
}
