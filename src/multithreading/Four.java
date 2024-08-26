package multithreading;

public class Four implements Runnable {

	

	@Override
	public void run() {
		System.out.println("Run");
		
	}
	
	public static void main(String[] args) {

		Four obj=new Four();
		Thread t1=new Thread(obj);
		t1.start();

	}

}
