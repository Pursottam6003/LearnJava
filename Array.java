import java.util.Scanner;
public class Array
{
    public static void main(String [] args)
    {
        int size;
        System.out.println("Enter the size of array ");
        Scanner sc=new Scanner(System.in);
        size =sc.nextInt();
        int[] array = new int[size];
        
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]);
        }
        //Type[] arr= new Type[size];

    }
}