package Mypacakge;

public class Employee {
	
	int empId;
    String name;
    double salary;
    
    public void display() 
    {
    	System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.empId = 101;
        e1.name = "Rahul";
        e1.salary = 25000;
        
        Employee e2 = new Employee();
        
        e2.empId = 102;
        e2.name = "Priya";
        e2.salary = 30000;
        
        Employee e3 = new Employee();

        e3.empId = 103;
        e3.name = "Amit";
        e3.salary = 28000;
        
        e1.display();
        e2.display();
        e3.display();
	}

}
