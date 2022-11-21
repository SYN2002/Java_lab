/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class q40
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		System.out.println("Enter the roll no.");
		int r = sc.nextInt();
		int k=4;int sum=0;int w=0;
		String str="";
		while(k>0)
		{
		    int a=r%10;
		    sum=a+(sum*10);
		    r=r/10;
		    k--;
		}
		int l=4;
		while(l>0)
		{
		    int d=sum%10;
		    w=d+(w*10);
		    sum=sum/10;
		    l--;
		}
		String b=Integer.toString(w);
		int n=s.length();
		char c[] = s.toCharArray();
		str=str+c[0];
		for(int i=0;i<n;i++)
		{
		    if(c[i] == ' ')
		    {
		        str=str+c[i+1];
		    }
		}
		str=str+b;
		System.out.println(str);
		
	}
}
