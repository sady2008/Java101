package java101;

import java.io.IOException;

public class WriteData {
	public static void main(String args[]) throws IOException{
		java.io.File file = new java.io.File("scores.txt");
		if(file.exists()){
			System.out.print("File already exsit");
			System.exit(1);
		}
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		output.print("John ");
		output.println(90);
		
		output.close();
	}
	

}
