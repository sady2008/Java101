package java101;
import java.io.*;
import java.util.*;


public class ReplaceText {
	public static void main(String[] args)throws Exception{
		//Check parameter used
		if(args.length!=4){
			System.out.println("Usage: java Replace");
			System.exit(1);
		}
		File sourceFile = new File(args[0]);
		if(!sourceFile.exists()){
			System.out.print("doesnt exist");
			System.exit(2);
		}
		
		File targetFile = new File(args[1]);
		if(!targetFile.exists()){
			System.out.print("Already");
			System.exit(3);
			//Detect the target file existence
		}
		
		try(Scanner input = new Scanner(sourceFile);
			PrintWriter output = new PrintWriter(targetFile);
				){
			while(input.hasNext()){
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(args[2], args[3]);
				output.println(s2);
			}
		}
	}

}
