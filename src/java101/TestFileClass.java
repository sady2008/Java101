package java101;

public class TestFileClass {
	public static void main(String[] args){
		java.io.File file = new java.io.File("image/us.gif");
		System.out.print(file.exists());
	}

}
