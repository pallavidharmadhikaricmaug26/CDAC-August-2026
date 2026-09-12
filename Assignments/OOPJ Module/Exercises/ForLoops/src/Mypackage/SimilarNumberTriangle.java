package Mypackage;

public class SimilarNumberTriangle {

	public static void main(String[] args) {
		
		int num = 6;
		
		for(int rows = 1 ; rows <= num; rows++ )
		{
			for(int cols = 1; cols <= rows; cols++)
			{
				System.out.print(cols);
			}
			System.out.println();
		}
	}

}
