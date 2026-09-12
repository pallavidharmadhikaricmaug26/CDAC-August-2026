package Mypackage;

public class DataMenumain {

	public static void main(String[] args) {
		
		Date objDate = new Date();
		
		System.out.println("Enter the day");
		int day = ConsoleInput.getInt();
		
		System.out.println("Enter the Month");
		int month = ConsoleInput.getInt();
		
		System.out.println("Enter the Year");
	    int year = ConsoleInput.getInt();
	    
	    objDate.setDate(day, month, year);
		
		System.out.println("Enter number of days to add");
		int daysToAdd = ConsoleInput.getInt();
		
		objDate.addDays(daysToAdd);
		
		
		System.out.println("Enter number of Months to add");
		int monthsToAdd = ConsoleInput.getInt();
		
		objDate.addMonths(monthsToAdd);
		
		
		
		System.out.println("Enter number of Year to add");
		int yearToAdd = ConsoleInput.getInt();
		
		objDate.addYears(yearToAdd);
		
		System.out.println(objDate.getDay() + "/" + objDate.getMonth() + "/" + objDate.getYear());
		
		System.out.println(objDate.getMonthName());

	}

}
