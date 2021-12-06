public class Inheritence_test {
    public static void main(String[] args)
    {
        // animal al = new animal();
        // al.setName("Mamallia");
        // al.seteyes(2);
        // a1.setlags(4);

        // a1.setspecial("Meow - Meow");

        //System.out.println(al.getName() +al.getlegs() + al.getleyes() +al.getspecial());

        Cat ct = new Cat();

        ct.setName("Mammalia");
        ct.seteyes(3);
        ct.setlags(4);
        ct.setspecial("Meow -- Meow");

        System.out.println("Name of superclass is : \t"+ct.getName() + " Eyes :\t"+ct.getleyes() + "Lags : \t" + ct.getlegs() + " Special abilities \t " +ct.getspecial() );

    }
}

class animal
{
    public String name;
    public int lags;
    public int eyes;

    public void setName(String n) {
        this.name = n;
    }
    public String getName()
    {
        return name;
    } 

    public void setlags(int lg)
    {
        this.lags=lg;
    }

    public int getlegs()
    {
        return lags;
    }

    public void seteyes(int es)
    {
        this.eyes=es;
    }

    public int getleyes()
    {
        return eyes;
    }
    
    public void printMe()
    {
        System.out.println("I am a constructor\n");
    }

}

class Cat extends animal
{
    public String voice;
    //public String love="milk";

    public void setspecial(String n)
    {
        this.voice = n;
    }
    public String getspecial()
    {
        return voice;
    }
    
    
}