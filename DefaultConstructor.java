package Programs;

public class DefaultConstructor {
	String language;
	String name;
	int year;
	DefaultConstructor(String name, int year, String lang){
		this.name=name;
		this.year=year;
		this.language=lang;
	}
	DefaultConstructor(DefaultConstructor copy){
		this.name=copy.name;
		this.year=copy.year;
		this.language=copy.language;
	}
	void display() {
		System.out.println("Userdefine Constructor"+" "+name+" "+year+" "+language);
	}

	public static void main(String[] args) {
		System.out.println("original1 1constructor");
		DefaultConstructor ref=new DefaultConstructor("JAVA",1995,"Programming");
		ref.display();
		System.out.println("copy constructor");
		DefaultConstructor ref2=new DefaultConstructor(ref);
		ref2.display();
	}

}
