import java.util.Scanner;
public class Arr_average
{
    public static void main(String [] args)
    {
        System.out.println("Enter the size of array :");
        Scanner Sc= new Scanner(System.in);

        int n;
        n=Sc.nextInt();
        int [] array= new int[n];
        System.out.println("enter the elements \n");

        for(int i=0;i<n;i++)
        {
            array[i]=Sc.nextInt();
        }

        float sum=0;

        for(int i=0;i<n;i++)
        {
            sum+=array[i];
        }

        float average;
        average=(sum)/n;

        System.out.println("The average of two numbers is "+average);
        Sc.close();
    }
}