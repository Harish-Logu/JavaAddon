package Day5;

public class Trycatch {

	public static void main(String[] args) {
		int[] mynumbers = {1,2,3};
		try {
		System.out.println(mynumbers[10]);
	}
	catch(Exception e){
	 System.out.println("Error Checked");	
		
	}
		finally {
		System.out.println("Try catch is finished");
		
		}
}
}
