public class Cons

{

int i;
int j;

Cons(int a,int b)

{

i=a;
j=b;

}

void print()
{
System.out.println("The addition of " +i+ "and" +j+ " gives " +(i+j));

}

public static void main(String args[])

    {

        Cons c;

        c=new Cons(10,10);
        c.print();
        System.out.println("    ");
        c=new Cons(50,50);
        c.print();
        System.out.println("    ");

    }
}