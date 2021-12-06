public class Lab2 {
    public static void main(String [] args)
    {
        Bank b1 = new Bank("State Bank of India","586945DRA","Tinsukia");
        Person p1= new Person();
        
        
    }
}

class Bank
{
    String Bank_name;
    String IFSC_no;
    String Location;

    Bank(String bn, String code ,String loc)
    {
        this.Bank_name=bn;
        this.IFSC_no=code;
        this.Location=loc;
    }

}

class Person extends Bank
{
    long Ac_no;
    String Name;
    String Occupation;
    long contact_no;
 
    double Acc_bal;

   
    

    int intrest(int income)
    {   
        int i;
        if(income > 8000  && income <100000 )
        {   
            i=8;
        }

        else if(income > 100000&& income <500000)
        {
            i=7;
        }

        else 
        {
            i=6;
        }

        return i;

    }

}