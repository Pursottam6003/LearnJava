public class Student {
    public static void main(String[] args)
    {
        System.out.println("Details of student \n");
        Details rahul= new Details();
        
        rahul.name="Pursottam";
        rahul.roll=37;
        rahul.salary=40000000;
        rahul.blood_group='A';

        //creating a new object
        Details chandra= new Details();
        chandra.name="chandra Shekhar Tripathi";
        chandra.roll=38;
        chandra.salary=45000000;
        chandra.blood_group='B';

        rahul.printData();
        chandra.printData();



    }
}

class Details
{
    int roll;
    String name;
    int salary;
    char blood_group;

    void printData()
    {
        System.out.println(" Hey employee Your id is "+roll);
        System.out.println(" and Your name is "+name);
        System.out.println("Wow your blood group is "+blood_group);
        System.out.println("Salary is "+salary);
    }
}