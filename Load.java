class Load
{
    String fname; // first name
    String lname; // last name
    int age;
    String prof;
    Load fload(String fname, String lname, int age, String prof)
    {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.prof = prof;
        return this;
    }

    Load fload(String fn, String ln)
    {
    fname = fn;
    lname = ln;
    return this;
    }
    Load fload(String fnme,String lnme,String pr)
    {
    fname = fnme;
    lname = lnme;
    prof = pr;
    return this; 
    }
    Load fload(String fna,String lna, int ag)
    {
    fname = fna;
    lname = lna;
    age = ag;
    return this;
    }

    void print()

    {
    System.out.println(fname +"  " +"  "  +prof);
    System.out.println("    ");
    }

public static void main(String args[])

{
    Load loads = new Load();
    System.out.println("The various values supplied are as follows:");
    System.out.println();
    loads.fload("Aswath","Narayanan",24,"Engineer");
    loads.print();
    loads.fload("Shankar","Athreya");
    loads.print();
    loads.fload("Gautam","Bhaskaran","Doctor");
    loads.print();
    loads.fload("Nakul","Mahadevan",28);
    loads.print();
}

}