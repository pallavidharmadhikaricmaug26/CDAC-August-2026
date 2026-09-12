package Mypackage;

public class SimilarReverseTriangle {

	public static void main(String[] args) {
		
		int num = 6;
		
		for(int rows = num ; rows >= 1; rows-- )
		{
			for(int cols = 1; cols <= rows; cols++)
			{
				System.out.print(cols);
			}
			System.out.println();
		}
	}

}
