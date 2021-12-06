import java.util.Scanner;
public class pattern {
   // public static void main(String [] args)
    /*{   

        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print(" * "); 
               
            }
            System.out.println("\n");
        }
    } 
    */
    
    public static void main(String[] args)
    {
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(" * ");

            }
            System.out.println("\n");
        }
    }
}
