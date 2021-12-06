import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        do 
        {
            System.out.println("Enter  for Rock ,1 for paper ,2 for scissor \n");

            int user_input=sc.nextInt();

            Random random =new Random();

            int comp_input=random.nextInt(3);

            System.out.println("Starting the game \n");

            if(user_input == comp_input)
            {
                System.out.println(" Draw !\n");
            }

            else if(user_input== 0 && comp_input==2 || user_input==1 && comp_input==0 || user_input==2 && comp_input==1 )
            {
                System.out.println("You win !");
                break;
            }

            else 
            {
                System.out.println("Computer win !");
                break;
            }

        }while(true);
    }
}
