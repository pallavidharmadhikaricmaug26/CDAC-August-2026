package Mypacakge;

public class Employees {
	
	int salary;
    int workHours;
    
    public void getInfo() 
    {
    	System.out.println("Salary = " + salary);
        System.out.println("Work Hours = " + workHours);
    }
    
    public void addSal() 
    {
    	if (salary < 500) 
    	{
            salary = salary + 10;
        }
    }
    
    public void addWork() 
    {
        if (workHours > 6) 
        {
            salary = salary + 5;
        }
    }

	public static void main(String[] args) {
		
		Employees e = new Employees();
		
		e.salary = 400;
        e.workHours = 8;
        
        System.out.println("Before adding:");
        
        e.getInfo();
        
        e.addSal();
        e.addWork();
        
        System.out.println("After adding:");
        
        e.getInfo();

	}

}
