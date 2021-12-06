public class Custom_class
{
   
    public static void main(String[] args)
    {
        System.out.println("This is our custom class created by me\n");
        // created an object 

        Getter rahul = new Getter();
        //setting properties attributes
        rahul.id_no=102;
        rahul.name="Pursottam";
        rahul.blood_group='A';
        rahul.salary=400000000;

        // System.out.println("Your id number is "+rahul.id_no);
        // System.out.println("Your name is "+rahul.name);


        Getter chandra=new Getter();// institating a new employee object 
        //setting attributes
        chandra.id_no=103;
        chandra.name="Chandraskhaar Tripathi";
        chandra.blood_group='B';
        chandra.salary=450000000;
        // System.out.println("Your id is"+chandra.id_no);
        // System.out.println("Your name is "+chandra.name);
        rahul.printDetails();
        chandra.printDetails();

        int salary=rahul.getsalary();
        chandra.getsalary();
        System.out.println(salary);

    }
}

class Employee
{
    int id_no;
    String name;
    char blood_group;
    int salary;
    // created a method in the class thats helps in printing 
    public void printDetails()
    {
        System.out.println(" Hey employee Your id is "+id_no);
        System.out.println(" and Your name is "+name);
        System.out.println("Wow your blood group is "+blood_group);
        System.out.println("Salary is "+salary);
    }

    public int getsalary()
    {
        return salary;
    }
}