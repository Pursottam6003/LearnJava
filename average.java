import java.util.Scanner;

public class average {
    public static void main(String [] args)
    {
        
        System.out.println("Taking input from the useer");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=s.nextInt();
        System.out.println("Enter second number");
        int b=s.nextInt();
        System.out.println("Enter the third number");
        int c=s.nextInt();

        float sum=a+b+c;
        float average=(sum)/3;
        System.out.println("The sum of the 3 numbers are :");
        System.out.println(sum);
        System.out.println("The average of the 3 numbers are :");
        System.out.println(average);
        s.close();

    }
}
