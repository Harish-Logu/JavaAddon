package Day6;
import java.util.ArrayList;
public class Task {

	public static void main(String[] args) {
		ArrayList<Object> arr=new ArrayList<Object>();
		System.out.println("--------------------------");
		arr.add("Subash");
		arr.add("A");
		arr.add("Computer Science");
		arr.add("3 Year");
		arr.add("RVScas");
		arr.set(0, "Hari");
		//arr.remove(0);
		arr.get(0);
		arr.add("---------------------------");
		arr.add("Jack");
		arr.add("A");
		arr.add("Computer Science");
		arr.add("3 Year");
		arr.add("RVScas");
		arr.set(6, "NS Gaming");
		//arr.remove(0);
		//arr.get(0);
		for(Object data:arr) {
			System.out.println(data);
		}

	}

}
