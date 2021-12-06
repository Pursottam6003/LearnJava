import java.util.Scanner;

public class greet_name {
    public static void main(String [] args)
    {
        System.out.println("Enter your name : ");
        Scanner sc=new Scanner(System.in);

        String name=sc.next();
        System.out.println("Hello " +name +"How are you ?");
        
    }
}
