package com.Aot.test;
import java.util.*;
class PayOutOfBoundsException extends Exception{
	
}
public class Exception6 {

	public static void main(String[] args) {
		System.out.println("Enter Salary:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		try {
			if(n<10000)
				throw new PayOutOfBoundsException();
			else
				System.out.println("Hello");
		}
		catch(PayOutOfBoundsException poobe) {
			System.out.println("Exception Handled");
		}
	}

}
