public class pattern2_rec {
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
            for(int i=n;i>=1;i--)
            {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }
}
