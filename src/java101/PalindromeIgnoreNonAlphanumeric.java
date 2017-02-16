package java101;
import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
   
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//Scanner Creation
		
		System.out.print("Enter a string");
		String s = input.nextLine();
		
		//Display
		
		System.out.print(s+isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s){
		String s1=filter(s);
		String s2=filter(s1);
		//reverse
		return s2.equals(s1);
	}
	
	public static String filter(String s){
		
	}
}
