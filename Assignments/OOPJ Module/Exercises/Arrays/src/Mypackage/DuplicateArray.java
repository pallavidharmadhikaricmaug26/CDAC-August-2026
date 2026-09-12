package Mypackage;

public class DuplicateArray {

	public static void main(String[] args) {
		
		System.out.println("Enter size of Array:");
		int size = ConsoleInput.getInt();
		
		int [] arr = new int [size];
		
		for(int i = 0; i < size ;i++)
		{
			System.out.println("Enter the Array elements :");
			arr[i] = ConsoleInput.getInt();
		}
		
		System.out.println("Duplicate values:");
		
		for (int i = 0; i < size; i++) 
		{
			for (int j = i + 1; j < size; j++) 
			{
				if (arr[i] == arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
		

	}

}
