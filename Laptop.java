package Programs;

public class Laptop {
	String name;
	float size;
	Laptop(String name,float size){
		this.name=name;
		this.size=size;
	}
	Laptop(Laptop copy){
		this.name=copy.name;
		this.size=copy.size;
	}
	void display() {
		System.out.println("Laptop"+" "+name+" "+size);
	}
	
	public static void main(String[] args) {
		System.out.println("ASUS TUF");
		Laptop ref=new Laptop("ASUS",5);
		ref.display();
		System.out.println("Copy");
		Laptop ref2=new Laptop("ASUS TUF",5);
		ref.display();
	

	}

}
