public class Overriding
{
    public static void main (String [] args)
    {   
        A1 ma = new A1();
        ma.meth_1();
        ma.meth_2(); 

        B1 ba= new B1();
        ba.meth_1();
        ba.meth_2();
    }
}

class A1
{
    public int x;
    public int name()
    {
        return 38;
    }
    public void meth_1() // method 1 it is not a constructor
    {
        System.out.println("This is a method 1 of class A\n");
    }

    public void meth_2() // method 1 it is not a constructor
    {
        System.out.println("This is a method  2 of class A\n");
    }

}
 
class B1 extends A1 
{   @Override 
    public void meth_1() // method 1 it is not a constructor
    {
        System.out.println("This is a method 1 of class B\n");
    }
    
    public void meth_2() // method 1 it is not a constructor
    {
        System.out.println("This is a method  2 of class B\n");
    }

}