package Mypackage;

public class NumberTriangle {

	public static void main(String[] args) {
		
		int num = 4;
		int number = 1;
		
		for(int temp = 1; temp <= num ; temp++)
		{
			for(int temp1 = 1; temp1 <= temp; temp1++)
			{
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}

}
