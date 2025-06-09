package Programs;

class superclass{
	void method1() {
		System.out.println("Superclass");
	}
}

class subclass1 extends superclass{
	void method2() {
		System.out.println("Subclass1");
	}
	
}
class subclass2 extends subclass1{
	void method3() {
		System.out.println("Subclass2");
	}
	
}
public class Multilevel {

	public static void main(String[] args) {
		subclass2 ref = new subclass2();
		ref.method1();
		ref.method3();
		subclass1 ref2=new subclass1();
		ref2.method2();

	}

}
