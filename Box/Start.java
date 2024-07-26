import java.util.Scanner;
public class Start{
	public static void main(String []args){
		 
		/* Box b = new Box();
		 Box b1 = new Box(6,7,8,"Black");
		
		b.setLength(10);
		b.setWidth(11);
		b.setHeight(12);
		b.setColor("Red");
		
		b.display();
		b1.display();
		
		
		System.out.println(b.getLength() + b1.getLength() );
		System.out.println(b.getWidth() + b1.getWidth() );
		System.out.println(b.getHeight() + b1.getHeight() );
		System.out.println(b.getColor() + b1.getColor() );
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		double length = sc.nextDouble();
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		
		Box b = new Box();
		b.display();
		*/
		
		Box b = new Box();
		b.userInput();
		b.display();
		
	}
}