interface college
{
    double PI=3.1459649;
    void money(float mon);
    void files(String file);
    void teachers(int faculty);
}

class student implements college
{   
    public void money(float ruppes)
    {
        System.out.println("we have mooney money....");
    }

    public void files(String file)
    {
        System.out.println("This the file from the keyword "+file);
    }
    
    public void teachers(int faculty)
    {
        System.out.println("total faculty in college "+faculty);
    }
}

public class interface_2
{
    public static void main(String [] args)
    {
        student s1=new student();
        System.out.println(student.PI);

        s1.teachers(2);
        s1.money(93.32f);

        s1.files("sjdkdjad");
    }
}