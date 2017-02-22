package java101;
import java.util.Scanner;

public class ReadFileFromURL {
	public static void main(String[] args){
		System.out.print("Enter a URL:");
		String URLString = new Scanner(System.in).next();
		
		try{
			java.net.URL url = new java.net.URL(URLString);
			int count = 0;
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext()){
				String line = input.nextLine();
				count += line.length();
			}
			System.out.print(count);
		}
		catch(java.net.MalformedURLException ex){
			System.out.print("BAD URL");
		}
		catch(java.io.IOException ex){
			System.out.print("dsa");
		}
	}
}
