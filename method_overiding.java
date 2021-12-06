class A
{   
    int num;
    public void purso()
    {
        num=4;
    }

    public void method1()
    {
        System.out.println("I am method 1 of class A");
    }

    public void method2()
    {
        System.out.println("I am method 2 of class A");
    }
    
}


class B extends A
{   
    

    public void method3()
    {   
        System.out.println("I am method 3 of class B");
    }

    public void method2()
    {
        System.out.println("I am method 2 of class B"); // here there will is method overriding of class B it is calling his own function 
    }
    
}
public class method_overiding {
    public static void main(String args[])
    {
        // A hello = new A();
        // hello.method1();

        B hello =new B();
        hello.method2();

        
        
    }
}
