//Create an abstract class pen with methods write () and refill () as abstract methods 
// Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()

abstract  class pen
{
    abstract void write_pen();
    abstract void refil();
}

class fountain extends pen
{   
    @Override
    public void write_pen()
    {
        System.out.println("Ok i am writting my friend");
    }

    @Override
    public void refil()
    {
        System.out.println("oh you need to add me inside your pen");
    }

    void change_nib()
    {
        System.out.println("Please change your nib its not picking grip ");
    }
}
public class Creat_pen {
    public static void main(String args[])
    {
        fountain wr= new fountain();
        wr.write_pen();
        wr.refil();
        wr.change_nib();
    }
    
}
