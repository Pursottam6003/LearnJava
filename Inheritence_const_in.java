public class Inheritence_const_in 
{
    public static void main(String [] args)
    {
        // Base b = new Base();
        // Derieve d = new Derieve();
        //Child_class c = new Child_class(); ---> parent class -> child class -> grandchild class  || super class -> class ->subclass
        Child_class c = new Child_class(4,7,9);

    }
}

class Base
{

    Base() //constructor
    {
        System.out.println("I am a constructor of base class\n");
    }

    Base(int x) //constructor
    {
        System.out.println("I am a constructor of base class x value \n"+x);
    }
   

}

class Derieve extends Base
{   
    Derieve()
    {
        System.out.println("I am a derieve class constructor\n");
    }

    Derieve(int x ,int y)
    {   super(x);
        System.out.println("I am a overloaded class constructor of value  \n"+y);
    }
}

class Child_class extends Derieve 
{   
    Child_class()
    {
        System.out.println("I am a child derieve class \n");
    }
     
    Child_class(int x,int y,int z)
    {   
        super(x,y);
        System.out.println("I am a overloaded child derieve class  of x and y values \n"+x +" " +y);
    }
}