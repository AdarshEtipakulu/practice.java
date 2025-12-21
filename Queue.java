/* Queue--> predefined interface in java util
First in First out for linkedlist,prorityOrder for prorityQueue
duplicates are allowed 
elements can't accesed by index
 */

import java.util.PriorityQueue;

public class ExampleForQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
    pq.add(10);
    pq.add(20);
    pq.add(30);
    pq.add(40);
    System.out.println(pq);
    System.out.println("____________________________________");
    for(Object obj:pq){
        System.out.println(obj);
    }
    System.out.println("_____________________________________");

    System.out.println(pq.poll());
    System.out.println(pq.isEmpty());
    
}
    
}
