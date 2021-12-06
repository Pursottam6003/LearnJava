// Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism 


interface  telephone2 
{
    void pickCall();
    void recieveCall();
} 

interface phone2 
{
    void call();
    void with();
    void lift();
    void disconnected();
}

class CellPhone
{
    void recording_audio()
    {
        System.out.println("Hello hello babya baye ..");
    }
}


class Smartphone extends CellPhone implements telephone2, phone2
{   
   
    public void call()
    {
        System.out.println("Hello is it ....care");
    }
   
    public void with()
    {
        System.out.println(" I am on a call with my gf");
    }
   
    public void lift()
    {
        System.out.println("Hello your lift is good now ");
    }
   
    public void disconnected()
    {
        System.out.println("call is disconnected");
    }
   
    public  void pickCall()
    {
        System.out.println("Hello Hello");

    }
    
    public void recieveCall()
    {
        System.out.println("bye ...");
    }
}
public class Telephone {
    public static void main(String args[])
    {
        telephone2 tl = new Smartphone();
        tl.pickCall();
        tl.recieveCall();   
    }    
}
