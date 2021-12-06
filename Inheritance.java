public class Inheritance {
    public static void main(String [] args)
    {
        Dog da= new Dog();
        // we can acces both the sub class and superclass 
        da.setName("German dog");
        da.seteyes("Blue eyes wiith orange");
        da.setlags(4);
        da.setsound("Bhau == Bhau");

        System.out.println("The following are the properties of the dog by the help of inheritence ");

        System.out.println("Name : " + da.getName() + " Eyes " + da.getleyes() + " lags : " + da.getlegs() + " voice :  " + da.getsound());
    }
}

class Animal
{
    public String name;
    public int lags;
    public String eyes;

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

    public void seteyes(String es)
    {
        this.eyes=es;
    }

    public String getleyes()
    {
        return eyes;
    }
    
    public void printMe()
    {
        System.out.println("I am a constructor\n");
    }

}

class Dog extends Animal
{
    public String voice;
    
    public void setsound(String s)
    {
        this.voice = s;

    }

    public String getsound()
    {
        return voice;
    }


}
