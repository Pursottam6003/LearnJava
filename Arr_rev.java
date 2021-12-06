import java.util.Scanner;

public class Arr_rev 
{
    public static void main(String[] args)
    {
        int size;
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the size of array");
        size=Sc.nextInt();

        int[] array =new int[size];
        System.out.println("Enter the elements \n");
        for(int i=0;i<size;i++)
        {
            array[i]=Sc.nextInt();
        }

        System.out.println("Printing the array before reversal\n");

        for(int i=0;i<size;i++)
        {
            System.out.print(" " +array[i]);
        }
        
        System.out.println("\n");

        for(int i=0;i<size/2;i++)
        {
            int temp;
            temp=array[i];
            array[i]=array[size-i-1];
            array[size-i-1]=temp;
        }

        System.out.println("Printing the array after reversal\n");
        for(int i=0;i<size;i++)
        {
            System.out.print(" "+array[i]);
        }

        Sc.close();
        
    }
}
