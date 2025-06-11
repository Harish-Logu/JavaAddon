package Day5;
import java.util.ArrayList;
public class ArrayListClass {

	public static void main(String[] args) {
//		int[] arr=new int[5];
		ArrayList<Integer> arr=new ArrayList();
//		accepts all types of value
		ArrayList<Object> arr2=new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.forEach(num->System.out.println(num*num));
		arr2.add("hai java");
		System.out.println(arr);
		System.out.println(arr2);
	}

}
