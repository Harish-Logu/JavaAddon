package Day01;
import java.util.Scanner;
public class Task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }

    
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
                return true;
            }
        else {
        return false;
    }
}
}