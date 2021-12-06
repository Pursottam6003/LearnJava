import java.util.Scanner;
import java.lang.Math;

class Calculator
{
    int a;
    int b;
    void message(int a,int b)
    {
        System.out.println("Hello");
        int c =a+b;
        System.out.println("Sum is "+c);
    }
   
}

class Sc_calculator
{   
    void message2(float a ,float b)
    {   float answer=a+b;
        System.out.println("yo bro"+answer);
    }
}

class HybridCalculator
{   
    void message3(float d ,float e)
    {   
        //float result = Math.sin(d);
        double ans= Math.sin(d+e);
        System.out.println("Hola"+Math.sin(d)+Math.sin(e));
        System.out.println(ans);
    }
    
}

public class Cal {
    public static void main(String args[])
    {   
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        Calculator cl = new Calculator();
        
        Sc_calculator s = new Sc_calculator();
        HybridCalculator hc = new HybridCalculator();
        s.message2(a, b);
        cl.message(a, b);
        hc.message3(a, b);

        sc.close();
        
    }
    
}
