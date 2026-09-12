package Mypackage;

public class Date {

	private int day;
	private int month;
	private int year;
	
	//Setter /mutator
		public void setDate(int dd , int mm , int yy)
		{
			year = yy;
			if(mm < 1 || mm > 12)
				month = 1;
			else
				month = mm;
			
			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			{
				if(dd < 1 || dd > 31 )
					day = 1 ;
				else
					day = dd;
			}
			
			else if(month == 4  || month == 6 || month == 9 || month == 11)
			{
				if(dd < 1 || dd > 30) 
					day = 1;
				else
					day = dd;
			}
			else
			{
				if ((yy % 400 == 0) || (yy % 4 == 0 && yy % 100 != 0))
				{
					if(dd < 1 || dd > 29)
						day = 1;
					else 
						day = dd;
				}
				  
				else
				{
					if(dd < 1  || dd > 28)
						day = 1;
					else
						day = dd;
				}
				
			}
		}
		
		
		public void addDays(int days)
		{
			for(int i = 1; i < days ; i++ )
			{
				day++;
				
				int DaysInMonth = 0;
				if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				{
					DaysInMonth = 31;
				}
				else if(month == 4  || month == 6 || month == 9 || month == 11)
				{
					DaysInMonth = 30;
				}
				else
				{
					if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
					{
						DaysInMonth = 29;
					}
					else
					{
						 DaysInMonth = 28;
					}
				}
				
				if(days > DaysInMonth)
				{
					day = 1;
					month = month++;
					
					if(month > 12)
					{
						month = 1;
						year = year++;
					}
				}
			}
		}
		
		String[] months = {"January","February","March","April","May","June","July","August","Septembe","October","November","December"
				};
		
		public void addMonths(int months) 
		{
			for(int i = 1; i < months ; i++)
			{
				month++;
				
				if(month > 12)
				{
					month = 1;
					year++;
				}
				
				int DaysInMonths = 0;
				
				if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				{
					DaysInMonths = 31;
				}
				else if(month == 4 || month == 6 || month == 9 || month ==  11)
				{
					DaysInMonths = 30;
				}
				else
				{
					if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
					{
						DaysInMonths = 29;
					}
					else 
					{
						DaysInMonths = 28;
					}
				}
				if (day > DaysInMonths)
				{
					day = DaysInMonths;
				}
			}
			
		}
		
		
		
		public void addYears(int years)
		{
		    year = year + years;

		    if(month == 2 && day == 29)
		    {
		        if(!((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)))
		        {
		            day = 28;
		        }
		    }
		}
		
		
		public int getDay()
		{
		       return day;
		}
		
		public int getMonth()
		{
			return month;
		}
		
		public int getYear()
		{
			return year;
		}
		
		public String getMonthName()
		{
		    return months[month - 1];
		}

}

