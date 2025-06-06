package methods;

public class MultiDimensional {

	public static void main(String[] args) {
		int[][] number = {{1,2},{10,20}};
		int n=2;
//		int sum;
		for (int i=0;i<n;i++) 
		{
//			System.out.print(i);
			System.out.println(" ");
			for(int j=0;j<n;j++) 
			{
//				sum = j*10;
				System.out.print(" ");
				System.out.print (number[i][j]);
			}
			
		}
        
        }
	
}
