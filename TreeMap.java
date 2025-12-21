/*treeMap--->
predefined class in java.util package
jdk 1.2
maintain the sorted order(i.e, sorting based on key ascending order)
underlined Ds is -->binary tree */
 import java.util.TreeMap;

public class ExampleForTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Object> tm = new TreeMap<>();
        
        tm.put("name", "akhil");
        tm.put("age", "19"); // Changed to String or wrap in Object for consistency
        tm.put("email", "akhil@gmail.com");
        
        System.out.println(tm);
        System.out.println("______________________");
        
        for(Object key : tm.keySet()){
            System.out.println("Key: " + key);
        }
        
        System.out.println("_____________________");
        
        for(Object entry : tm.entrySet()){
            System.out.println("Entry: " + entry);
        }
    }
}
