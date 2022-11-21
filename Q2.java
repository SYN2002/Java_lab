package com.Lot;
import java.util.*;
public class Q2{
	public static void main(String args[]){
		System.out.println("Main");
		Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = s.nextInt();
			}
			 int largest1 = a[0];
			 int  largest2 = a[1];
			 int temp;
			 if (largest1 < largest2)
			   {
			       temp = largest1;
			       largest1 = largest2;
			       largest2 = temp;
			    }
			 
			    for (int i = 2; i < n; i++)
			    {
			        if (a[i] > largest1)
			        {
			            largest2 = largest1;
			            largest1 = a[i];
			        }
			        else if (a[i] > largest2 && a[i] != largest1)
			        {
			            largest2 = a[i];
			        }
			    }
			    System.out.println("Max number 1:"+largest1);
			    System.out.println("Max number 2:"+largest2);
	}
}
