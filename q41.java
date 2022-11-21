class A extends q41
{
    void display()
    {
        System.out.println("Child class");
    }
}

public class q41 
{
    static{
        System.out.println("Parent block");
    }
    
    public static void main(String args[])
    {
        A ob = new A();
        ob.display();
    }
}