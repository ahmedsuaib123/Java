   public class Start{
   public static void main(String[] args) {
        
        Triangle t = new Triangle();
        Triangle t1 = new Triangle(5,5,5);
		Triangle t2 = new Triangle(5,5,6);
        Triangle t3 = new Triangle(5,6,7);
		
		t.showInfo();
		t.testTriangle();
		
		t1.showInfo();
		t1.testTriangle();
		
		t2.showInfo();
		t2.testTriangle();
		
		t3.showInfo();
		t3.testTriangle();




    }
}
