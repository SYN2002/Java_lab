package com.Aot.test;

public class Exception4 {
	void m1()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		try {
			Exception4 e=new Exception4();
			e=null;
			e.m1();
		}
		catch(NullPointerException npe){
			System.out.println(npe);
		}
		
	}

}
