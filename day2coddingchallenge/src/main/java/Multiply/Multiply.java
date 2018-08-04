package Multiply;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the first number:");
Scanner scan = new Scanner(System.in);
int n1=scan.nextInt();
System.out.println("enter the second number:");
int n2=scan.nextInt();
for(int i=1;i<=n2;i++)
		{
	//System.out.println("the Multiply of two numbers:\n"+n1+"*"+i+"="+(n1*i));
	System.out.println(n1+"*"+i+"="+(n1*i));
		}

}
}