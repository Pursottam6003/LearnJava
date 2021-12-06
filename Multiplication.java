import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args)
    {
        System.out.println("Enter the element that you want mutiplication table\n");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        
        // multi obj =new multi();
        //obj.multi(num);
        multi(num);
        
        sc.close();
    }

    static void multi(int n)
    {
        for (int i=1;i<11;i++)
        {
            System.out.format("%d  X  %d = %d",n,i,n*i);
            System.out.println("\n");
        }
    }
}
