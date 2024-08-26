package multithreading;

public class Lifecycle {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread();
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		t1.sleep(100);
	
		Thread t2=new Thread();
		t2.start();
		System.out.println(t1.getState());
		//t1.start();//exception

	}

}
