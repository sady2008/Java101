package java101;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestInputMismatch {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		try{
			int a = input.nextInt();
		}
		catch(InputMismatchException ex){
			System.out.print("SB");
		}
		
	}

}
