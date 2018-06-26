package democollection;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
      //  demo01.demoList();
      //  demo01.demoMap();
        demo01.demoSet();
    }
    private void demoMap() {
        Map<String , Integer> names = new HashMap<>();
        names.put("n1", 20);
        names.put("n2", 30);
        names.put("n2", 40);
        Set<String> keys = names.keySet();
        for (String key: keys) {
            System.out.println(key + "-" + names.get(key));
        }
    }
    
    private void demoSet() {
      Set<String> names = new HashSet<>();
      names.add("n1");
      names.add("n2");
      names.add("n3");
      for (String name: names) {
          System.out.println(name);
      }
    }
    
    private void demoList() {
        System.out.println("Call demoList");
        //Generic
        List<String> names = new ArrayList<>();
        names.add("Name1");
        names.add("Name2");
//        for (int i = 0; i<names.size();i++) {
//            System.out.println((String)names.get(i));
//        }
        for (String name: names) {
            System.out.println(name);
        }
        names.forEach(name -> System.out.println(name));
    }
}
