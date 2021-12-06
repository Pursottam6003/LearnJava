//Java program to show thaat 
// if the static method is redefined by
// aderieved class then it is not 
// overriding it is hiding

class Parent
{
    static void m1()
    {
        System.out.println("From parent"+"static m1()");

    }

    // Non static method which will 
    // be overridden in derieved class
    void m2()
    {
        System.out.println("From parent"+"non static m2()");
    }
}

class Child extends Parent
{
    // this method hides m1()in parent

    static void m1()
    {
        System.out.println("from child static m1()");
    }

    // this method overrides m2() in parent
    @Override
    public void m2()
    {
        System.out.println("From child"+"non static m2()");
    }
}
public class data_hiding {
    public static void main(String args[])
    {
        Parent obj= new Child();
        //as per overriding rules
        // should call the class child static 
        //overriden method 
        // since static method cannot be overrden 
        // it then calls the parent class

        obj.m1();

        // here overriden works
        //and child m2() is called
        obj.m2();
    }
}
