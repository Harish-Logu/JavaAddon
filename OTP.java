package methods;
import java.util.Random;
import java.util.Scanner;

public class OTP {

	static int  OTP() {
		Random ran= new Random();
		return 1000 + ran.nextInt(5000);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number:");
		long num = in.nextLong();
		long a = 9042169325L;
		if (num==a) {
			int otp =OTP();
			System.out.println("One time Password is "+otp);
            System.out.println("Verified YOur Number");
		}
		else {
			System.out.println("invalid");
		}

	}
}


