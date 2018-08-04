package SecondLargestNumber;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,temp;

System.out.println("Ener the numbers:");
Scanner scan = new Scanner(System.in);
n = scan.nextInt();
int a[] = new int[n];
for(int i=1;i<n;i++)
{
 a[i] = scan.nextInt();
}
	for(int j=1;j<n;j++) 
	{
	int i = 0;
	if(a[i]>a[j])
	{
		temp= a[i];
		a[i]= a[j];
		a[j]=temp;
	}
}
	
System.out.println(" the second largest number:" +a[n-2]);
}
}