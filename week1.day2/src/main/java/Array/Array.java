package Array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] friendsName = {"Shanthi", "Mona", "Vaishu", "Anitha","Pavithra"};
		int[] age = {20,11,12,17,10};
		char[][] grade = {{'A','B','C','D','E'},{'A','B','F','D','E'},
				{'A','B','C','D','F'},{'A','F','C','D','F'},{'A','F','C','D','F'}};
		System.out.println("whos details should be printed");
		Scanner scan = new Scanner(System.in);
		int index = scan.nextInt();
		index = index-1;
		System.out.println(friendsName[index] + " who is with the age " + age[index] + " is scored marks in");
		System.out.println(" Grade in 1st subject is: " + grade[index][0]);//shanthi
		System.out.println(" Grade in 2nd subject is: " + grade[index][1]);//kingsly
		System.out.println(" Grade in 3rd subject is: " + grade[index][2]);
		System.out.println(" Grade in 4th subject is: " + grade[index][3]);
		//System.out.println(" Grade in 5th subject is: " + grade[index][4]);
		Champak:
	}
	}

