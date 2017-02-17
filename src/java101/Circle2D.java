package java101;
import java.math.*;

public class Circle2D {
	private double x,y,radius;
	
	
	public Circle2D(){
		this(0.0,0.0,1.0);
	}
	
	public Circle2D(double x,double y,double radius){
		this.x=x;
		this.y=y;
		this.radius=radius;
		System.out.println("Circle2D built" + x + y + radius);
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	public double getParameter(){
		return Math.PI*2*radius;
	}


}
