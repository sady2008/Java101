package java101;
import java.util.Scanner;

public class CharCount {
	public static void main(String[] args) throws Exception{
		String Filename = new Scanner(System.in).next();
		java.io.File file = new java.io.File(Filename);
		Scanner input = new Scanner(file);
	    int countNum = 0; 
	    int countUpperCase = 0; 
	    int countLowerCase = 0; 
	    int countOther = 0; 
	         
		while(input.hasNext()){
			String s = input.next();
	 
	        for(int i = 0; i < s.length(); i++) { 
	            char c = s.charAt(i); 
	             
	            if(c >= 'A' && c <= 'Z') { 
	                countUpperCase ++; 
	            } else if(c >= 'a' && c <= 'z') { 
	                countLowerCase ++; 
	            } else if(c >= '0' && c <= '9'){ 
	                countNum ++; 
	            } else { 
	                countOther ++; 
	            } 
	        } 
		}
		System.out.print(countLowerCase);
	}

}
