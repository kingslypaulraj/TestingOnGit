package SumOfArray;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n, sum=0;
System.out.println("Enter the n of elements:");
Scanner add = new Scanner(System.in);
n = add.nextInt();
int a[]= new int[n];
System.out.println(" Enter the elements");
for(int i=0;i<n;i++)
{
	a[i]=add.nextInt();
	sum=sum+a[i];
	
	}
System.out.println("The sum of the given elements:"+ sum);

}}
