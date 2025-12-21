/*linkedhashset-->
it is predefined class-->java.util
maintain the insertion order
jdk 1.4 */
 import java.util.*;

public class ExampleForLinkedHashSet {
    public static void main(String[] args) {
       LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
       
       lhs.add(10);
       lhs.add(20);
       lhs.add(30);
       lhs.add(40); 
       
       System.out.println(lhs);
       
       for(Integer obj : lhs){
        System.out.println(obj);
       }
    }
}
