package Mypackage;

public class Manager extends Employee
{
	private String department;
	private int teamSize;

	public Manager(int id, String name, String address, String phoneNumber, double salary,
			String department, int teamSize)
	{
		super(id, name, address, phoneNumber, salary);
		this.department = department;
		this.teamSize = teamSize;
	}

	@Override
	public String getType() { 
		return "Manager"; 
	}

	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Department  : " + department);
		System.out.println("Team Size   : " + teamSize);
	}

	@Override
	public String toFileString()
	{
		return "MANAGER|" + id + "|" + name + "|" + address + "|" + phoneNumber + "|" + salary
				+ "|" + department + "|" + teamSize;
	}
}