package Practice;
abstract class KFC {
    public KFC() {

        System.out.println("KFC guidelines");
    }

    public void makeItem() {
        System.out.println("I will give the guidelines how to make Chicken");
    }
    abstract void billing();
    abstract void offer();

}
class MyKFC extends KFC{
    public MyKFC(){
        System.out.println("KFC franchise by GOKula Krishnan");
    }
    public void billing(){
        System.out.println("Gokula Krishnan Gives java based technology for billing system");
    }
    public void offer(){
        System.out.println("I will give 30% off for every month");
    }
}
public class AbstractExample {
    public static void main(String[] args) {

        KFC k=new MyKFC();
        k.makeItem();
        k.billing();
        k.offer();

    }
        //Children c=new Children();
        //c.meth1();
        //c.meth2();
    }