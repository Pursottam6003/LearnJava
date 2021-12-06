class Parent{
	
	Parent()
	{
	System.out.println("parent constructor");

	}
	void display(int c){
		System.out.println("parent class with value "+c);
	}
}
class Child extends Parent
{
	Child()
    {
	   System.out.println("child constructor");
	}
	
	void display()
	{
		System.out.println("child class");
	}


}   

    public class Par 
{
    public static void main(String [] args){
		//Parent Papa = new Parent();
        //Papa.display();
		Child Hero  = new Child();
		Hero.display(4);	
		Hero.display();
	
		
    }
}



        
    
