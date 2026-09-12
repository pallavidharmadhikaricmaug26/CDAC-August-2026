package Mypackage;

public class RightAngleTriangle {
	
	public static void main(String[] args) {
		
		int num = 5;
		
		for(int temp = 1; temp <= num ; temp++)
		{
			for(int temp1 = 1; temp1 <= temp ;temp1++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
