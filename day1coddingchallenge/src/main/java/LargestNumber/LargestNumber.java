package LargestNumber;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
int n,max;

System.out.println("Enter how many numbers you want:");
Scanner  scan = new Scanner(System.in);
n = scan.nextInt();
int a[] = new int[n];
System.out.println("Enter the numbers:");
for(int i = 0;i<n;i++)
{
a[i] = scan.nextInt();	
}
max = a[0];	
for(int i = 0;i<n;i++)
{
	if(max<a[i])
	{
max = a[i];
	}
	
	}
System.out.println("the largest number is:"+max);
for(int j=0;j<n;j++)
{
	if(max<a[j])
	{
		int i=0;
		max = a[i];
		a[i] = a[j];
		a[j] = max;
		
	}
}
System.out.println("the second largest number:" +a[n-2]);
	
	}	
	
}
	
