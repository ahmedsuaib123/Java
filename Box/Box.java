import java.util.Scanner;
public class Box{
	private double length;
	private double width;
	private double height;
	private String color;
	
	//constructor
	public Box(){}
	public Box(double len,double wid,double hei,String col){
		
		setLength(len);
		setWidth(wid);
		setHeight(hei);
		setColor(col);
	}
		
	//setter method
	public void setLength(double len){
		if(len>=0){
			length=len;
		}
		else{
			System.out.println("Invalid Value");
		}		
	}
	
	public void setWidth(double wid){
		if(wid>=0){
			width=wid;
		}
		else{
			System.out.println("Invalid Value");
		}
	}
	
		public void setHeight(double hei){
		if(hei>=0){
			height=hei;
		}
		else{
			System.out.println("Invalid Value");
		}
	}
	
	public void setColor(String col){
		color=col;
		}
		
		
	//getter method
	public double getLength(){return length;}
	public double getWidth(){return width;}
	public double getHeight(){return height;}
	public String getColor(){return color;}
	
	//returnType MethodName(parameter){body}
	public void display(){
		System.out.println(length);
	    System.out.println(width);
	    System.out.println(height);
		System.out.println(color);
	}		
	
	public void userInput(){
		Scanner sc = new Scanner(System.in);
		
	    this.length = sc.nextDouble();
		this.width = sc.nextDouble();
		this.height = sc.nextDouble();
	}
}