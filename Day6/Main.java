package Day6;

public class Main extends Thread {
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println("Heloo Thread");
	}
}
class Execute{
	public static void main(String[] args) {
		Main m=new Main();
		
//		for(int i=1;i<=10;i++)
//			System.out.println("The numbers are:");
		m.start();

	}
	}


