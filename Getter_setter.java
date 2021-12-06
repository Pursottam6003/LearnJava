public class Getter_setter {
    
    public static void main(String[] args)
    {
        MyEmployee rahul= new MyEmployee();

        rahul.setName("Pursottam sah");
        rahul.setId(37);
        System.out.println(rahul.getName());
        System.out.println(rahul.getid());
    }
}

class MyEmployee
{
    private int id;
    private String name;

    public void setName(String n)
    {
        this.name=n;
    }

    public String getName()
    {
        return name;
    }

    public void setId(int i)
    {
        this.id =i;
    }
    public int getid()
    {
        return id;
    }
}