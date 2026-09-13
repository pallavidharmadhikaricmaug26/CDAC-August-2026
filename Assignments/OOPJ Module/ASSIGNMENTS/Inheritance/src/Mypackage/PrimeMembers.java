package Mypackage;

public class PrimeMembers extends Member
{
	private int joiningYear;
	private double joiningFees;
	private boolean isActive;

	public int getJoiningYear() { 
		return joiningYear; 
	}
	
	public double getJoiningFees() { 
		return joiningFees; 
	}
	
	public boolean isActive() {
		return isActive; 
	}

	public void setJoiningYear(int joiningYear) { 
		this.joiningYear = joiningYear;
	}
	
	public void setJoiningFees(double joiningFees) { 
		this.joiningFees = joiningFees; 
	}
	
	public void setActive(boolean active) { 
		isActive = active; 
	}

	public void display()
	{
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Phone: " + getPhoneNumber());
		System.out.println("Address: " + getAddress());
		System.out.println("Salary: " + getSalary());
		System.out.println("Joining Year: " + joiningYear);
		System.out.println("Joining Fees: " + joiningFees);
		System.out.println("Active: " + isActive);
	}
}