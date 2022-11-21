abstract class TwoD
{
    double s1=0.0;
    double s2=0.0;
    public TwoD()
    {
        this.s1=s1;
        this.s2=s2;
    }
    abstract void area(double s1,double s2);
}

class Rect extends TwoD
{
    void area(double a,double b)
    {
        double c = a*b;
        System.out.println("The area of the rectangle is : "+c);
    }
}

class Tri extends TwoD
{
    void area(double a,double b)
    {
        double c = 0.5*a*b;
        System.out.println("The area of the triangle is : "+c);
    }
}

public class Main
{
    public static void main(String args[])
    {
        Rect ob = new Rect();
        ob.area(4.0,3.0);
        Tri ob1 = new Tri();
        ob1.area(4.0,3.0);
    }
}
