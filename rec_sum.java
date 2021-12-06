public class rec_sum {
    public static void main(String [] args)
    {
        System.out.println("Enter the number that you want the sum");
        int num=4;
        int result;
        
        result = rec_sum(num);
        System.out.println(result);

    }

    static int rec_sum(int n)
    {
        if(n==1)
        {
            return 1;
        }

        else 
        {
            return rec_sum(n-1)+n;
        }
    }
    
}
