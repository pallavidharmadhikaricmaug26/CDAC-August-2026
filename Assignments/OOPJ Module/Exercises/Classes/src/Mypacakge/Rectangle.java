package Mypacakge;

public class Rectangle {
	
	int length;
	int breadth;
	
	public int calculateArea() {
        return length * breadth;
    }
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		r1.length = 10;
        r1.breadth = 5;

        Rectangle r2 = new Rectangle();
        
        r2.length = 20;
        r2.breadth = 10;
        
        System.out.println("Area of First Rectangle = " + r1.calculateArea());
        System.out.println("Area of Second Rectangle = " + r2.calculateArea());

	}

}
