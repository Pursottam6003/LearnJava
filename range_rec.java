
public class range_rec {
    public static void main(String[] argc)
    {
        int result =range(1,100);
        System.out.println(result);

    }

    public static int range(int start,int end)
    {
        if(end>start)
        {
            return end+range(start,end-1);
        }

        else{
            return start;
        }
    }
}

