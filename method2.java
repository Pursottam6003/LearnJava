
public class method2
{
    public static void main(String[] args)
    {
        int a =34;
        int b=45;
        //int result=calculation(a,b);
        method2 obj=new method2();
        int ans;
        ans=obj.calculation(a,b);


        System.out.println("the answer is"+ans);
    }
    
    int calculation(int x,int y)
    {
        if(x>y)
        {
            return x*y;
        }
        else
        {
            return x+y;
        }
    }
}