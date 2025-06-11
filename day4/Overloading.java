package day4;

public class Overloading {
	
		public void sum(int a,int b) {
			System.out.println("the sum is"+(a+b));
		}
		public void sum(double a,double b) {
			System.out.println("the sum is"+(a+b));
		}
		
}

 class testoverloading{
	public static void main(String[] args) {
		Overloading a3=new Overloading();
		a3.sum(10, 98);
		a3.sum(10,22);

	}	
}