public class fibo {
    public static void main(String[] args)
    {
        int terms=6;
        //finding the nth term of the fibonachhi series
        int ans=fibo(terms); //calling the func
        System.out.println(ans);
    }
    static int fibo(int n)
    {
        if(n==1)
        {
            return 0;
        }

        else if(n==2)
        {
            return 1;
        }
        else 
        {
            return fibo(n-1) +fibo(n-2);
        }
    }
}
