package Mypackage;

public class ReverseOfArray {

	public static void main(String[] args) {
		
		System.out.println("Enter size of array:");
        int size = ConsoleInput.getInt();
        
        int[] arr = new int[size];
        
        for(int i = 0; i < size; i++)
        {
       	 System.out.println("Enter element:" );
       	 arr[i] = ConsoleInput.getInt();
        }
        
        System.out.println("Reverse Array:");

        for (int i = size - 1; i >= 0; i--)
        {

            System.out.println(arr[i]);
        }

	}

}
