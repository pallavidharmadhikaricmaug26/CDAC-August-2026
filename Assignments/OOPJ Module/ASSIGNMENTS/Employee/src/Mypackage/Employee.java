package Mypackage;

public abstract class Employee
{
	protected int id;
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected double salary;

	public Employee(int id, String name, String address, String phoneNumber, double salary)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}

	public int getId() { 
		return id; 
	}
	
	public String getName() { 
		return name;
	}
	
	public String getAddress() { 
		return address; 
	}
	
	public String getPhoneNumber() {
		return phoneNumber; 
	}
	
	public double getSalary() {
		return salary; 
	}

	public abstract String getType();
	
	public abstract String toFileString();

	public void displayDetails()
	{
		System.out.println("ID          : " + id);
		System.out.println("Name        : " + name);
		System.out.println("Address     : " + address);
		System.out.println("Phone       : " + phoneNumber);
		System.out.println("Salary      : " + salary);
		System.out.println("Type        : " + getType());
	}
}