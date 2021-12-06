import java.util.Scanner;
public class Conversion 
{
    public static void main(String [] args)
    {
        int km;
        System.out.println("Enter the kilometer");
        Scanner sc=new Scanner(System.in);

        km=sc.nextInt();
        float miles = km/1.62f;
        System.out.println("The value of kilometers in miles is "+ miles);

    }
}
