package org.btm.vinnovateLab;
import java.util.Scanner;
public class Problem3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		int a=sc.nextInt();
		String s="";
		
	for (int i = 1; i <=a; i++) {
		if(i%2!=0)
			
		s=printInner(i);
		
		
		System.out.println("input a="+i+" the values are:"+s);
	}
	}
 static String printInner(int n) {
	
	String str="";
	for (int j = 1,num=1; j <=n; j++,num+=2)
		
		str+=(num+" ");
	
	return str;
}
}
/*
enter a number
6
input a=1 the values are:1 
input a=2 the values are:1 
input a=3 the values are:1 3 5 
input a=4 the values are:1 3 5 
input a=5 the values are:1 3 5 7 9 
input a=6 the values are:1 3 5 7 9 
*/