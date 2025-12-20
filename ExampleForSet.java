/*setfor specifiaction--->
1.insertion order will not be maintained
2.duplicates are not allowed
3.not indexedbased
4.nulll values can be stored

hashse-->
predefined class-->java.util-->jdk 1.2
underlined DS-->hashTable
Initial capacity-->16
fill ratio/load factor-->75%-->16+12
clone defines as copying the same line again*/
import java.util.*;
public class ExampleForSet {
public static void main(String[] args) {
   /*  Set s=new HashSet();
    Set s1=new LinkedHashSet();
    Set s2=new TreeSet();*/
    HashSet hs=new HashSet();
    hs.add(10);
    hs.add("java");
    hs.add("python");
    System.out.println(hs);
    System.out.println(hs.size());
    System.out.println(hs.isEmpty());
    /*clone is defines as copying the same line again */
    System.out.println(hs.clone());
    for(Object obj:hs){
        System.out.println(obj);
    }
}
}
