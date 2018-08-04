package StringRecursiveReversal;

import java.util.Scanner;

public class StringRecursiveReversal {

   String reverse = "";
private String reverseString;
    
   public String reverseString(String str){
        
       if(str.length() == 1){
           return str;
       } else {
           reverse += str.charAt(str.length()-1)
                   +reverseString(str.substring(0,str.length()-1));
           return reverse;
       }
   }
    
   public static void main(String a[]){
       System.out.println("Enter the string:");
       Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();	   
	   StringRecursiveReversal srr = new StringRecursiveReversal();
       System.out.println("Result: "+srr.reverseString(str));
       
   }
}