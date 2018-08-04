package LearningArithmeticOperators;

import java.util.Scanner;

public class LearningArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 50;
		
		System.out.println("Enter your choice:");
		Scanner scan = new Scanner(System.in);
		int arith = scan.nextInt();
			switch (arith)
		{
		case 1:
		{
			int additional;
			additional = n1+n2;
			System.out.println(" Additional of two values:" + additional);
			break;
		}
		case 2:
		{
			int subract;
			subract = n2-n1;
			System.out.println(" Subraction of two numbers:" + subract);
			break;
		}
		case 3:
		{
			int multi;
			multi = n1*n2;
			System.out.println(" Muliply of two numbers:" + multi);
			break;
		}	
		case 4:
		{
			int devide;
			devide = n2/n1;
			System.out.println(" Devition of two numbers:" + devide);
			break;	
		}
	
		case 5:
		{
			int rem;
			rem = n2%n1;
			System.out.println(" Reminder of two numbers:" + rem);
			break;
			}
		default:
		{
		System.out.println(" you choice is incorrect");
		break;
		}
		
	}
	
	}}
