class A
{
void showA()
{
System.out.println(" A class method");
}
public static void main(String [] args)
{
B ob1= new B();
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
B ob2= new B();
ob2.showA();
ob2.showB();
ob2.showC();

}


class C extends A
{
void showC()
{
System.out.println(" C class method");
}
public static void main(String [] args)
{
C ob3= new C();
ob3.showA();
ob3.showB();
ob3.showC();
}
}