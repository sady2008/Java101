package java101;

public class Test {
	public static void main(String[] args){
		A a= new A();
		a.p(10);
		a.p(10.0);
	}

}

class B{
	public void p(double i){
		System.out.print(i*2);
	}
}

class A extends B{
	public void p(int i){
		System.out.print(i);
	}
}
