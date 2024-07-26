public class Triangle {
    private int x;
    private int y;
    private int z;
    
    public Triangle() {
    }
    
    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        
    }
    
    public void setZ(int z) {
        this.z = z;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getZ() {
        return z;
    }
    
	public void showInfo(){
		System.out.println("Side 1 : " +x);
		System.out.println("Side 2 : " +y);
		System.out.println("Side 3 : " +z);
	}
    
    public void testTriangle() {
        if (x == y && y == z) {
            System.out.println("Equilateral"+"\n");
        } else if (x == y || y == z ) {
           System.out.println("Isosceles"+"\n");
        } else {
            System.out.println("Scalene"+"\n");
        }
    }
}   
 