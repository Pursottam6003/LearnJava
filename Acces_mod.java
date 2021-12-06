class Myemployee
{
    private int id;
    private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
        
    }
    public  void setId(int i)
    {
        Id=4;
    }
    public int getId();
    {
        return Id;
    }

}

public class Acces_modifiers
{
    public static void main(String[] args)
    {
        Myemployee rahul= new Myemployee();
        // rahul.id=30;
        // rahul.name="Pursottam Sah";
        rahul.SetName("Pursottam Sah");
        System.out.println(rahul.getName());

    }
}