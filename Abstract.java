

abstract class Parent2
{
    public Parent2()
    {
        System.out.println("I am a constructor of parent 2 calss");
    }

    public void sayHello()
    {
        System.out.println("Heello");
    }

    // as we are writing the method as anstact therefore we have to write the class abstract
    abstract public void greet();
    abstract public void greet2();
    abstract public void greet3();
}

class Child2 extends Parent2
{   @Override 
    public void greet()
    {
        System.out.println("Good morning");
    }
    @Override
    public void greet2()
    {
        System.out.println("Good afternoon");
    }
    @Override 
    public void greet3()
    {
        System.out.println("Good evening");
    }
}




public class Abstract
{   public static void main(String args[])
    {
        Child2 c2= new Child2();
    }

}