package Programs;

public class singlelevel {
	void Message() {
		System.out.println("Nishanth");
	}
	
}
class subclass extends singlelevel{
	void View() {
		System.out.println("Sakthi Das");
	}
	
}
class Main{
	public static void main(String[]args) {
	subclass ref=new subclass();
	ref.Message();
	ref.View();
	}
}