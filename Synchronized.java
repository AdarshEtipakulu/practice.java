class Printer implements Runnable{
    syncronised public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name+"printing started");
        for(int i=1;i<=5;i++){
            synchronized(this){
            System.out.println(name+"is printing");
            }
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println("some problem occured");
            }
        }
        System.out.println(name+"completed the printing");
    }
}
public class DisAdvantageOfMultiThreading {
    public static void main(String[] args) {
        Printer p=new Printer();
        Thread t1=new Thread(p);
        Thread t2=new Thread(p);
        Thread t3=new Thread(p);
        t1.setName("alekhya");
        t2.setName("balu");
        t3.setName("bujjipapa");
        t1.start();
        t2.start();
        t3.start();
    }
    
}
