package java101;
import java.util.Scanner;

public class ReadData {
	public static void main(String[] args) throws Exception{
	java.io.File file= new java.io.File("scores.txt");
	
	Scanner input = new Scanner(file);
	
	while(input.hasNext()){
		String name= input.next();
		int score = input.nextInt();
		
	}
	input.close();
	}
}
