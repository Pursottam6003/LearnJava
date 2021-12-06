public class var_args_avg {
    public static void main (String[] args)
    {   
        float result;
        result= myaverage(4,5,7,8,9,0,8,11);
        System.out.println("The result of average is : " +result);

    }

    static float myaverage(int ...arr)
    {
        int len=arr.length;
        int sum=0;
        for(int a: arr)
        {
            sum=sum+a;
        }
        System.out.println(sum);
        float ans;
        ans=sum/len;

        return ans;
        
    }
}
