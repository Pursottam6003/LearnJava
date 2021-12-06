import java.util.Scanner;

public class sum {
    public static void main(String [] args)
    {
        System.out.println("Enter three numbers :\n");
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        System.out.println("Enter the third number");
        c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("The sum of the numbers are :");
        System.out.println(sum);
        
    }
}
