package Mypackage;

public class Rectangle
{
	protected double length;
	protected double breadth;

	public Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	public void printArea()
	{
		System.out.println("Area: " + (length * breadth));
	}

	public void printPerimeter()
	{
		System.out.println("Perimeter: " + (2 * (length + breadth)));
	}
}