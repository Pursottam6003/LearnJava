public class patten_rec {
    public static void main(String[] args)
    {
        int num=6;
        pattern(num);
        
    }

    static void pattern(int n)
    {
        if(n>0)
        {
            pattern(n-1);
            for(int i=0;i<n;i++)
            {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }
}
