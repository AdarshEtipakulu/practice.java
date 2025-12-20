import java.util.*;

class Dog{
    private String name;
    private String breed;
    public Dog(String name,String breed){
        super();
        this.name=name;
        this.breed=breed;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    @Override
    public String toString(){
        return "dog[name"+name+",breed="+breed+"]";
    }
}
public class ExampleForHashSet {
    public static void main(String[] args) {
        Dog d=new Dog("husky","lab");
        HashSet hs=new HashSet();
        hs.add(d);
        for(Object obj:hs){
            System.out.println(obj);
        }
    }
}
