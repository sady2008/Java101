package java101;

public class SimpleGeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	//Define Parameters

	public SimpleGeometricObject(){
		dateCreated=new java.util.Date();
	}
	
	public SimpleGeometricObject(String color,boolean filled){
		dateCreated = new java.util.Date();
		
		this.color=color;
		this.filled=filled;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
}
