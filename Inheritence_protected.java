class parent
{
    protected int a=20;
}

class child extends parent
{
    int b=30;
}

class grandchild extends child
{
    void add()
    {
        int sum= a+b;
        System.out.println("the sum of the number is "+sum);
    }
}

public class Inheritence_protected
{
    public static void main(String args[])
    {
        grandchild g1=new grandchild();
        g1.add();
    }
}