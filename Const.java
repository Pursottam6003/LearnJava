public class Const {

    public static void main (String[] args)
    {
        //Myemployee rahul= new Myemployee("Pursottam sah",38);
        
        Myemployee rahul= new Myemployee(38);


        // rahul.setName("papa");
        // rahul.setId(34);

        System.out.println(rahul.getName());
        System.out.println(rahul.getid());
    }
}

class Myemployee // it is a class
{
    private int id;
    private String name;

    public Myemployee(String myname,int myid) //creating the constuctor  of same name as the class 
    {
        id=myid;
        name=myname;
    }

    public Myemployee(int myid) //creating the constuctor 
    {
        id=myid;
    }

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