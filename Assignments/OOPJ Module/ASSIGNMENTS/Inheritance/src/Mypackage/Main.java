package Mypackage;


public class Main
{
	public static void main(String[] args)
	{
		Parent p = new Parent();
		Child c = new Child();

		p.display();   
		c.display();   
		p = c;
		p.display();   
		
	
	//Member Q2
		
		PrimeMembers pm = new PrimeMembers();
		
		System.out.print("Enter name: ");
		pm.setName(ConsoleInput.getString());

		System.out.print("Enter age: ");
		pm.setAge(ConsoleInput.getInt());

		System.out.print("Enter phone number: ");
		pm.setPhoneNumber(ConsoleInput.getString());

		System.out.print("Enter address: ");
		pm.setAddress(ConsoleInput.getString());

		System.out.print("Enter salary: ");
		pm.setSalary(ConsoleInput.getDouble());

		System.out.print("Enter joining year: ");
		pm.setJoiningYear(ConsoleInput.getInt());

		System.out.print("Enter joining fees: ");
		pm.setJoiningFees(ConsoleInput.getDouble());

		System.out.print("Is active (true/false): ");
		pm.setActive(ConsoleInput.getBoolean());
		
		System.out.println("\n--- Member Details ---");
		pm.display();
		
		
		//Rectangle Class Q.3
		
		Rectangle rect = new Rectangle(5, 3);
		System.out.println("Rectangle:");
		rect.printArea();
		rect.printPerimeter();

		Square sq = new Square(4);
		System.out.println("\nSquare:");
		sq.printArea();
		sq.printPerimeter();
		
		
		//Shape Q.4
		
		SquareShape sq1 = new SquareShape();
		
		sq1.displayShape();
		sq1.displayRectangle();
		sq1.displaySquare();
	}
}