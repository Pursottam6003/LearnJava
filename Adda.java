class A
{

void showA()
{
System.out.println(" A class method");
}


public static void main(String [] args)
{
A ob1= new A();
ob1.showA();
ob1.showB();
ob1.showC();

}

}

class B extends A

{
void showB()
{
System.out.println(" B class method");
}
ob1.showA();
ob1.showB();
ob1.showC();
}
class C extends A
{
void showC()
{
System.out.println(" C class method");

}
}
