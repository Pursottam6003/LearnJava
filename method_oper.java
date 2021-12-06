
public class method_oper
{
    public static void main(String[] args)
    {
        int a =34;
        int b=45;
        int result=calculation(a,b);
        System.out.println("the answer is"+result);
    }
    
    static int calculation(int x,int y)
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