import java.util.*;
public class q39 
{
    static int fact(int k)
    {
        if(k<=1)
        return 1;
        else
        return k*fact(k-1);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of terms");
        int n = sc.nextInt();
        double sum =0.0;
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                sum+=1.0/fact(i);
            }
            else
            {
                sum-=1.0/fact(i);
            }
        }
        System.out.println("The sum of the series is : "+sum);
    }
}
