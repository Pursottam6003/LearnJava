public class Var_args
{
   
    static int sum(int ...arr) //... arethe variadic arguments
    {
        int result=0;
        for(int a :arr)
        {
            result=result+a;
        }
        return result;
    }
   public static void main(String[] args)
   {
       System.out.println("The sum of the array is "+sum(3,5,6,8,912));
       System.out.println("The sum of the array is "+sum(3,5,6,8,9,4,6,8,45,56));
   }     
   
}