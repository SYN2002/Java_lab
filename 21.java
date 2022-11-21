import java.util.*;
import java.io.*;
class A21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum_e=0, sum_o=0;
		for(int i=1;i<=n;i++){
			if(i%2 == 0){
				sum_e = sum_e + (i*i);
			}
			if(i%2 == 1){
				sum_o = sum_o + (i*i);
			}
		}
		System.out.println(sum_o - sum_e);
	}
}
			
