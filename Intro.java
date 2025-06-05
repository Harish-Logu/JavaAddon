package Day1;
import java.util.*;
public class Intro {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
        	System.out.println("Enter your first value");
			int s = in.nextInt();
		 	System.out.println("Enter your second value");
			int e = in.nextInt();
			for (int i = s; i < e; i++) {
			    if (i % 2 == 0) {
			        System.out.println(i);
			    }
			}
		}
    }
}
