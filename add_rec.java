public class add_rec {
    public static void main(String [] args)
    {
        int result=sum(10);
        System.out.println(result);
    }

    public static int sum(int k)
    {
        if(k<0)
        {
            return 0;
        }
        
        else 
        {
            return k+ sum(k-1);
        }
    }

}
