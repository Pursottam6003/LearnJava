interface Bicycle
{   
    int c=45;
    void applybrakes(int decrement);
    void speedup(int decrement);
    void blowHorn_mx();
    void blowHorn_pro();
}

class Herocycle implements Bicycle
{
    public void blowHorn()
    {
        System.out.println("pee pee poo poo");
    }

    public void applybrakes(int decrement)
    {
        System.out.println("Applying brakes hold on ...");
    }

    public void speedup(int increment)
    {
        System.out.println("Applying speedup");
    }

    public void blowHorn_mx()
    {
        System.out.println("teri meri galla hogi mashuur ");
    }

    public void blowHorn_pro()
    {
        System.out.println("Bhag mirkha bhag");
    }

}

public class Interface_bicycle
{
    public static void main(String args[])
    {
        Herocycle b1 = new Herocycle();
        
        System.out.println(Herocycle.c);
        b1.applybrakes(1);

        

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);

        b1.blowHorn_mx();
        b1.blowHorn_pro();
    }
}
    

