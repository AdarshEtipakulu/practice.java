/*linkedhashMap-->
predefined class in java.util
jdk1.4
insertion order is maintianed
underlined Ds-->Linked list and hashtable
 */
 import java.util.LinkedHashMap;

public class ExampleLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Object> lhm = new LinkedHashMap<>();
        
        lhm.put("name", "balu");
        lhm.put("age", 19);
        
        System.out.println(lhm);
        System.out.println("________________________");
        
        System.out.println(lhm.get("name"));
        System.out.println("__________________");
        
        for(Object i : lhm.keySet()){
            System.out.println(i);
        }
        
        System.out.println("__________________");
        
        for(Object i : lhm.entrySet()){
            System.out.println(i);
        }
    }
}
