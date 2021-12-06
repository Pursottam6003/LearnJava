import java.util.Scanner;

public class cgpa {

    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the phy marks :");
        int a=scn.nextInt();
        System.out.println("Enter the chemistey marks :");
        int b=scn.nextInt();
        System.out.println("Enter the maths marks :");
        int c=scn.nextInt();

        float marks= a+b+c;
        System.out.println("The sum of the marks of three subjects is ");
        System.out.println(marks);

        double per;
        per = marks*9.5/300;
        System.out.println("The CGPA score of the three subjects ");
        System.out.println(per);
        scn.close();
    }



}
