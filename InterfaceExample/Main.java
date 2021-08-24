package InterfaceExample;


interface Member{
    void CallBack();
}

class Store{
Member []mem=new Member[100];
int count=0;

public void register(Member m){
    mem[count++]=m;
}
public void invitesale(){
    for(int i=0;i<count;i++)
        mem[i].CallBack();
}
}

class Customer implements Member{

    private String name;
    private String ID;
    public Customer(String name,String ID){

        this.name=name;
        this.ID=ID;
    }
     public void CallBack(){
        System.out.println("Visting "+this.name+" "+this.ID);
    }
}

public class Main {

    public static void main(String[] args) {

        Store s=new Store();
        Customer c1=new Customer("Gokula Krishnan","567A23");
        Customer c2=new Customer("Mirunalini ","887B45");
        s.register(c1);
        s.register(c2);
        s.invitesale();

    }
}
