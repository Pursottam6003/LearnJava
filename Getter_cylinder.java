public class Getter_cylinder {
    public static void main (String [] args)
    {
        System.out.println("Creating the for the cylinder \n");

        Cylinder cl = new Cylinder();
        float rad=6;
        float h=10;
        cl.setRad(rad);
        cl.setHeight(h);
        
        System.out.println("The entered radius and height is "+ cl.getRad() +" " +cl.getHeight());
        System.out.println("The surface area  of cylinder is "+cl.getArea(rad,h) + "volume is "+ cl.getVol(rad,h));

    }
}

class Cylinder
{
    private float radius;
    private float height;

    public void setRad(float r)
    {
        this.radius=r;
    }

    public float getRad()
    {
        return radius;
    }

    public void setHeight(float h)
    {
        this.height=h;
    }
    
    public float getHeight()
    {
        return height;
    }
    public float getArea(float rad,float h)
    {   
        radius=rad;
        height=h;
        return (2*3.14f * radius *(height+radius));
    }

    public float getVol(float rad,float h)
    {   
        radius=rad;
        height=h;
        return (3.14f*radius*radius*height);
    }
}