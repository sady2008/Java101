package java101;
import java.util.*;

public class InputMismatchExceptionDemo {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		
		do{
			try{
				System.out.print("Enter an Integer");
				int number = input.nextInt();
				
				continueInput=false;
			}
			catch(InputMismatchException ex){
				System.out.print("Input another");
				input.nextLine();
			}
		}while(continueInput);
	}

}
