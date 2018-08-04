package DisplayTheLargestNumber;

public class DisplayTheLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbers = {22,32,42,-22,-9};
int max = numbers[0];

System.out.println(" Prin the largest value from the given series");

for(int a: numbers)
			
{
 if(a > max)
 {
	
	 max = a;	
	 
}

	}
System.out.println(max); 
}
}