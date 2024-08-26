package multithreading;

public class Three extends Thread {
	
	@Override
	public void run() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Three o=new Three();
		o.start();
		//o.run();


	}

}
