import java.util.ArrayDeque;
import java.util.Deque;
public class ExampleForArrayDeque {
    public static void main(String[] args) {
        //Deque d=new ArrayDeque();
        ArrayDeque<Integer> d=new ArrayDeque<>();
        d.add(10);
        d.add(20);
        d.add(23);
        System.out.println(d);
        System.out.println("__________________________");
        System.out.println(d.poll());
        System.out.println("___________________________");
        for(Object obj:d){
            System.out.println(obj);
        }
        System.out.println("__________________________");
        System.out.println(d.remove(20));
        System.out.println(d);
    }
    
}
