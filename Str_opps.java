import javax.lang.model.util.ElementScanner6;

//import java.util.Scanner;
public class Str_opps
{
    public static void main(String[] args)
    {   
        // System.out.println("Enter the string");
        // Scanner sc = new Scanner(System.in);

        // String name2=sc.next();
        // System.out.println(name2.toUpperCase());


        String name= "    Pursottam        ";
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.length());
        // System.out.println(name.concat(name2));

        //System.out.println(name.replace(" ", "-"));
        System.out.println(name.substring(2));
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   ")); 

        int checker=name.indexOf("  ");
        int checker_trip=name.indexOf("   ");

        if(checker==-1)
        {
            System.out.println("It  does not contains double spaces");
        }

        else
        {
            System.out.println("It  contains double spaces");
        }

        if(checker_trip==-1)
        {
            System.out.println("It  contains triple spaces");
        }
        
        else 
        {
            System.out.println("It  contains  triple spaces");
        }
        // program to detech double and single spaces in a string 

    }
}