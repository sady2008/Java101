package java101;

public class CastingDemo {
	public static void main(String[] args){
		Ax a = new Ax(3); 
	}

}
class Ax extends Bx{
	public Ax(int t){
		System.out.print("A");
	}
}

class Bx{
	public Bx(){
		System.out.print("B");
	}
}