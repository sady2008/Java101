package java101;
import java101.StackOfIntegers;

public class TestStack {
	public static void main(String[] args){
		StackOfIntegers stack = new java101.StackOfIntegers();
		
		for(int i=0;i<10;i++)
			stack.push(i);
		
		while(!stack.empty())
			System.out.print(stack.pop());
	}

}

