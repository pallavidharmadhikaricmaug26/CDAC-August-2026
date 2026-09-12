package Mypackage;

public class SortAnArray {

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
	         
	         for(int i = 0; i < size ; i++)
	         {
	        	 sum = sum + arr[i];
	         }
	         
	         System.out.println("Sum of array elements:" + sum);

	         
		}

	}

