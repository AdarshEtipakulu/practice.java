import java.util.ArrayList;
import java.util.List;

public class ExampeForCollection {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        for(Object i : l) {
            System.out.println(i);
        }

        // Fixed: added () to size method
        System.out.println("Size of list: " + l.size()); 
        
        // Checks if 20 exists in the list (returns true)
        System.out.println("Contains 20? " + l.contains(20)); 
        
        // Gets the element at index 0 (returns 10)
        System.out.println("Element at index 0: " + l.get(0)); 

        System.out.println("______________");

        ArrayList al = new ArrayList();
        al.add(50);
        al.add(60);
        al.add(70);
        al.add(80);
        System.out.println("arraylist: " + al);
    }
}
