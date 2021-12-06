

public class Method_load
{
    static void greet()
    {
        System.out.println("Good Morning");
    }

    static void greet(int a)
    {
        System.out.println("Good morming "+a);
    }

    static void greet(int a,int b)
    {
        System.out.println("yooo a and b " +a + b);
 
    }
    public static void main(String[] args)
    {
        greet();
        greet(3);
        greet(4,6);

    }
}