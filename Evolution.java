// Create a class monkey with jump ( ) and bite ( ) methods Create a class human whichinherits this monkey class and implements basicanimal interface with eat ( ) and sleep methods 

abstract class Monkey 
{   
    // System.out.println("This is a monkey name jaggu");
    abstract void jump();
    abstract void bite();
}

interface traits
{
    void basicanimal();
    void eat();
    void sleep();
}

class Human extends Monkey implements traits
{   
    @Override
    public void jump()
    {
        System.out.println("Jump man");
    }
    @Override
    public void bite()
    {
        System.out.println("ooh honey bite is also simestimes dengerous");
    }
    @Override
    public void basicanimal()
    {
        System.out.println("A normal man can have 32 teeths");
    }
    @Override
    public void eat()
    {
        System.out.println("You should chew slowly");
    }
    @Override
    public void sleep()
    {
        System.out.println(" Go to sleep");
    }
}

public class Evolution {
    public static void main(String args[])
    {
        Human hm= new Human();
        hm.sleep();
        hm.jump();
        hm.basicanimal();
    }
    
}
