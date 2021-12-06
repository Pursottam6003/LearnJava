import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.util.Random;

public class Guess_number {
    public static void main(String [] args)
    {
        System.out.println("Welcome to Guess the Number Game");

        Scanner sc= new Scanner(System.in);
        // we will first create the random number 
        Random  random = new Random();

        int comp_Num= random.nextInt(30);
        int times=1;

        do
        {
            System.out.println("Enter Your guess number brtween 1 to 30 \n");

            int user_input=sc.nextInt();

            if(user_input > comp_Num)
            {
                System.out.println("You guess nnumber is less then this !!!");
                System.out.println(" Try again !!!");
                times++;
            }

            else if( user_input < comp_Num)
            {
                System.out.println("You guess nnumber is more then this !!!");
                System.out.println(" Try again !!!");
                times++;
            }

            else 
            {
                System.out.format("You correct the  guess in %d chances  and the  Magic Random number is %d\n",times,comp_Num);
                break;
            }


        }while(true);
        

    }
}
