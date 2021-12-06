public class Const_student {
    
    public static void main(String[] args)
    {
        Student s1 =new Student("Pursottam Sah",490);

        System.out.println("The name of the student is "+s1.getName());
        System.out.println("obtained marks "+s1.getmarks());
    }
}

class Student 
{
    private int marks;
    private String candidate;


    public Student(String name, int mar ) //created the constructor of the same class name
    {
        marks=mar;
        candidate=name;
    }

    public void setName(String name)
    {
        this.candidate=name;
    }

    public String getName()
    {
        return candidate;
    }

    public void setmarks(int m)
    {
        this.marks=m;
    }

    public int getmarks()
    {
        return marks;
    }

}