package DisplayingPassFail;

import java.util.Scanner;

public class DisplayingPassFail {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
		System.out.println("Enter your choice to prin result:");
		
		Scanner scan = new Scanner(System.in);
		int result = scan.nextInt();
		
		switch (result)
		
		{
		
		case 1:
		{
			System.out.println(" you have passed in your exam");
			break;
		}
		
		case 2:
		{
		System.out.println(" you have failed in your exam");
		break;
		}
		
		default:
		{
			System.out.println(" you have not attended exam");
			break;
		}
		
	}
	}
}
