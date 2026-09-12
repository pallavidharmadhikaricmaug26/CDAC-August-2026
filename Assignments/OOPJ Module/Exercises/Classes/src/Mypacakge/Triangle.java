package Mypacakge;

public class Triangle {
	
	int side1;
	int side2;
	int side3;
	
	
	public int calculatePerimeter() 
	{
        return side1 + side2 + side3;
    }

    public double calculateArea()
    {
        return 0.5 * side1 * side2;
    };

	public static void main(String[] args) {
		
		  Triangle t = new Triangle();
		  
		  t.side1 = 3;
		  t.side2 = 4;
		  t.side3 = 5;
		  
		  System.out.println("Perimeter = " + t.calculatePerimeter());
		  System.out.println("Area = " + t.calculateArea());

	}

}
