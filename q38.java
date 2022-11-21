/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class q38
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		int n=s.length();
		// char c[] = s.toCharArray();
		System.out.println("The length of the array with spaces is : "+n);
		int x=n;
		int i=0;
		while(s.charAt(i) ==' ')
		{
		    x=x-1;
		    i++;
		}
		
		int j=n-1;
		while(s.charAt(j) ==' ')
		{
		    x=x-1;
		    j--;
		}
		
		System.out.println("The length of the array without front and end spaces is : "+x);
	}
}
