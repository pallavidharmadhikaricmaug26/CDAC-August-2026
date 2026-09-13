package Mypackage;

public class SalesPerson extends Employee
{
	private String region;
	private double salesTarget;

	public SalesPerson(int id, String name, String address, String phoneNumber, double salary,
			String region, double salesTarget)
	{
		super(id, name, address, phoneNumber, salary);
		this.region = region;
		this.salesTarget = salesTarget;
	}

	@Override
	public String getType() { 
		return "SalesPerson"; 
	}

	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Region      : " + region);
		System.out.println("Sales Target: " + salesTarget);
	}

	@Override
	public String toFileString()
	{
		return "SALESPERSON|" + id + "|" + name + "|" + address + "|" + phoneNumber + "|" + salary
				+ "|" + region + "|" + salesTarget;
	}
}