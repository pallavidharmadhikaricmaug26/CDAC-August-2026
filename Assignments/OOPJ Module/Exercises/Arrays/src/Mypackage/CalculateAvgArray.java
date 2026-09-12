package Mypackage;

public class CalculateAvgArray {

	public static void main(String[] args) {
		
		 System.out.println("Enter size of array:");
         int size = ConsoleInput.getInt();
         
         int[] arr = new int[size];
         
         for(int i = 0; i < size; i++)
         {
        	 System.out.println("Enter element:" );
        	 arr[i] = ConsoleInput.getInt();
         }
         
         int sum = 0;
         
         for(int i = 0; i < size; i++ ) 
         {
        	 sum = sum + arr[i];
        	 
         }
         double avg = (double) sum / size ;
     	
         System.out.println("The Avereage Value of an Array elements :" + avg);

	}

}
