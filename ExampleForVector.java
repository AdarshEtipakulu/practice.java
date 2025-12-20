import java.util.Vector;
public class ExampleForVector {
    public static void main(String[] args) {
        Vector v=new Vector<>();
        v.add(10);
        v.add(29);
        v.add(30);
        v.add(49);
        System.out.println(v);
        System.out.println("______-_---_");
    System.err.println(v.get(2));
    System.out.println(v.isEmpty());
    System.out.println(v.contains(2));
    System.out.println(v.size());
    for(Object i:v){
        System.out.println(i);
    }
    }

    
}
