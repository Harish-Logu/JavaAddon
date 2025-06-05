package Day1;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		int b=2000;
		System.out.println("Insert your ATM card");
		System.out.println("Enter Your Pin");
		try (Scanner in = new Scanner(System.in)) {
			int Pin = in.nextInt();
			if(Pin == 9042) 
			{
				System.out.println("Enter the Amount:");
				int a=in.nextInt();
				if(a<=b) 
				{
					System.out.println("Withdrawn");
				}
			else 
			{
			System.out.println("Invalid Amt");
}
			}
			else {
				System.out.println("Invalid pin");
				
			}
		}
	}
	
}