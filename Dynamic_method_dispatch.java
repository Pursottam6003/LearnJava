public class Dynamic_method_dispatch {
    public static void main(String [] args)
    {   /*
        phone ph= new phone();
        ph.power();
        ph.showTime();

        Smart_phone sp = new Smart_phone();
        sp.music();
        sp.showTime();

        */

        // power ph ---> phone is a refeewnce
        // smart phone is an object creating in the run time 
        // yaha hum smart phone ko phone bol sakte h 
        // but phone nokia wla ko smartphone nai bol sakte

        phone ph = new Smart_phone();
        ph.power();
        ph.showTime();
       //ph.music(); // Not allowed this is known as dunamic memory dispatch 

    }
}

class phone
{
    public int a;

    public void power()
    {
        System.out.println("Screen is starting Nokia\n");
    }

    public void showTime()
    {
        System.out.println("Time is 8 :30 pm");
    }
}

class Smart_phone extends phone
{
    public void power()
    {
        System.out.println("Screen is turing on in smartphone ...\n");
    }

    public void music()
    {
        System.out.println("Music is stared in smartphone ...\n");
    }
}