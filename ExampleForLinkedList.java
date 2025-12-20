import java.util.*;

public class ExampleForLinkedList {
    public static void main(String[] args) {
        // Using List interface
        List l = new LinkedList();
        l.add("java");
        l.add(10);
        l.add(35.5);
        l.add("love");
        l.add(null);
        
        System.out.println("the list: " + l);
        for(Object i : l) {
            System.out.println(i);
        }
        
        System.out.println("First element: " + l.get(0));
        System.out.println("Is empty? " + l.isEmpty());
        System.out.println("_______________");

        // Using LinkedList class directly
        LinkedList l1 = new LinkedList<>();
        l1.add(10);
        l1.add("balu");
        l1.add(null);
        l1.add("python");

        System.out.println("the linkedlist: " + l1);
        
        for(Object i : l1) {
            System.out.println(i);
        }
        System.out.println("First element of l1: " + l1.get(0));
    }
}
