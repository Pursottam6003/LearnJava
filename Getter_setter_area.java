public class Getter_setter_area {
    public static void main(String [] args)
    {
        System.out.println("We want the area and perimeter of circle by using getter and setter");
        Circle cr = new Circle(); //creating new object circle of name cr

        int rad=7; // initialising the variable rad 
        cr.setRad( rad);
        System.out.println("You have entered the radius as "+cr.getRad());
        System.out.println("The perimeter of the cicle is "+cr.peri(rad));
        System.out.println("The area of the cicle is "+cr.area(rad));

    }

}

class Circle
{
    private int radius;

    public void setRad(int rad)
    {
        this.radius=rad;
    }

    public int getRad()
    {
        return radius;
    }

    public float peri(int rs) // passing the argument values from main
    {
        radius=rs;
        return 2*3.14f*radius; // perimeter 2*PI*r
    }
    public float area(int rss)
    {
        radius=rss;
        return 3.14f*radius*radius; //returning the radius PI*r^2
    }
}