public class Method_overloading {
    static void greet()
    {
        System.out.println("Good Morning \n");
    }

    static void greet(int a)
    {
        System.out.println("Good morning "+a);
    }

    static void greet(int a,int b)
    {
        System.out.println("Hello the calculation is "+(a+b));
    }

    public static void main(String[] args)
    {
        greet();
        greet(23,45);
    }
}
