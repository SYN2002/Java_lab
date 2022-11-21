package com.Lot;

import java.util.Arrays;

public class Q33 {
	public static void main(String[] args) {
		String str="This is a very good practice to use good constructor in coding of a good class, good is always good";	
		String []str1=str.split(" ");
		for(int i=0;i<str1.length;i++)
			System.out.println(str1[i]);
		Arrays.sort(str1);
		System.out.println(Arrays.toString(str1));
	}
}
