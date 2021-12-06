
public class Lab3 
{
    public static void main(String [] args)
    {
        Customer c1 = new Customer(3454343,"IBSEF45","Pursottam");
        c1.Details("Tinsukia", 825905265, 50000000, "Engineer", "no locker");

        Customer c2 = new Customer(3457795,"IBSE232","Sahil");
        c2.Details("Tinsukia", 825905265, 20000, "Engineer", "no locker");

        double x=c1.Eligible();
        double y=c2.Eligible();

        System.out.println(x);
        System.out.println(y);
    }    
}

class Customer
{
    String name;
    long account_number;
    String Address;
    long con_no;
    String IFSC;
    double bal;
    String Occupation;
    String Bank_ser;
    
    Customer(long x,String IFSC ,String name)
    {
        this.account_number=x;
        this.name=name;
        this.IFSC=IFSC;
    }

    public void Details(String address,long count,double b,String o,String ser)
    {
        this.bal=b;
        this.Address=address;
        this.con_no=count;
        this.Occupation=o;
        this.Bank_ser=ser;
    }

    public double Eligible()
    {
        if(bal >=500000 && bal <= 1000000 && Occupation != "farmer" && Bank_ser !="locker")
        {
            return (double)8.0;
        }

        else if(bal <=50000 && Bank_ser !="locker" &&Occupation !="farmer")
        {
            return (double) 7.0;
        }
        else if(bal >=50000 && Bank_ser !="locker" &&Occupation !="farmer")
        {
            return (double) 6.50;
        }

        else 
        {
            return (double)6.0;
        }
    }
}