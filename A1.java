class A
{
void showA()
{
System.out.println(" A class method");
}

}

class B extends A

{
void showB()
{
System.out.println(" B class method");
}

public static void main(String [] args)
{
B ob1= new B();
ob1.showA();
ob1.showB();
ob1.showC();
}
}


class C extends A
{
void showC()
{
System.out.println(" C class method");
}
public static void main(String [] args)
{
C ob1= new C();
ob1.showA();
ob1.showB();
ob1.showC();
}
}