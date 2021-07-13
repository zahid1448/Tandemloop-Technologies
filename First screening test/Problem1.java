package org.btm.vinnovateLab;
import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		
		double num1,num2;
		Scanner sc=new Scanner(System.in);
        System.out.println("eneter a number");

       num1=sc.nextDouble();
       num2=sc.nextDouble();

System.out.println("eneter the operator you want to perform the operation(+-/*)"+" ");
char op=sc.next().charAt(0);

double db=0;
switch (op) {

case '+':
	db=num1+num2;
	break;
case '-':
	db=num1-num2;
	break;
case '*':
	db=num1*num2;
	break;
case '/':
	db=num1/num2;
	break;
	
default:
	System.out.println("not valid operator");
	return;
	
}
System.out.println(num1+" "+op+" "+num2+" ="+db);
	}
}
/*eneter a number
2
2
eneter the operator you want to perform the operation(+-/*) 
*
2.0 * 2.0 =4.0
*/