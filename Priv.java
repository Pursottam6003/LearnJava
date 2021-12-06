
class Priv
{
    private int x=10;

    void var()
    {

        System.out.println("The private value is " +x);

    }

    public static void main(String args[])
    {

        Priv p1=new Priv(); 
        p1.var();

    }
}

