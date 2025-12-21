/*Map-->
predefined interface in java.util
jdk 1.2
map is the part of collection framework which doesn't extends the collection frame work and inside the map 
map is used to organization the data in terms of key and value pairs 
1.keys can't be duplicated
2.values can be duplicated
3.one key and value together we call it is as entry

implementation classes
1.hashmap
2.linkedhashmap
3.treemap
hash table

important method used wrt maps:
1.put()
2.get()
3.clear()
4.keSet()

Hashmap-->
predefined class in java.util package
jdk 1.2
insertion order is not maintianed
underlined data structure is hash table
*/
import java.util.HashMap;
public class ExampleForMap {
    public static void main(String[] args) {
        //Map m=new HashMap()
        HashMap hm=new HashMap();
        hm.put("name","balu");
        hm.put("place ","tirupathi");
        System.out.println(hm);
        System.out.println("______________________");
        System.out.println(hm.get("name"));
        System.out.println("__________________________");
        for(Object obj:hm.values()){
            System.out.println(obj);
        }
        for(Object obj:hm.entrySet()){
            System.out.println(obj);
        }
    }
    }

