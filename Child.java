class Parent
{	
	Parent(){};
	int a;
	Parent(int x)
    {   
        x=a;
	   System.out.println("parent constructor");
	
	}
	void display()
    {
		System.out.println("parent class");
	}
}

class Derieve extends Parent
{
	Derieve()
    {
        System.out.println("This is our child class");
    }
	void display()
    {
		
		System.out.println("child class");
		
	}
	public static void main(String []args)
    {
	
		Parent Papa=new Parent(6);
		Papa.display();
		Derieve d= new Derieve();
		d.display();
	}
}