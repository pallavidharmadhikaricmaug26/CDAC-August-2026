package Mypackage;

public class Engineer extends Employee
{
	private String specialization;
	private int experienceYears;

	public Engineer(int id, String name, String address, String phoneNumber, double salary,
			String specialization, int experienceYears)
	{
		super(id, name, address, phoneNumber, salary);
		this.specialization = specialization;
		this.experienceYears = experienceYears;
	}

	@Override
	public String getType() { 
		return "Engineer"; 
	}

	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Specialization : " + specialization);
		System.out.println("Experience(yrs): " + experienceYears);
	}

	@Override
	public String toFileString()
	{
		return "ENGINEER|" + id + "|" + name + "|" + address + "|" + phoneNumber + "|" + salary
				+ "|" + specialization + "|" + experienceYears;
	}
}