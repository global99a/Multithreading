package multithreading;

public class Threadtwo {

	public static void main(String[] args) {
		Student s=new Student();
		Thread t1=new Thread(s);
		t1.start();
		
		Manageer m1=new Manageer();
		Thread t2=new Thread(m1);
		t2.start();
		
		System.out.println();

	}

}
class Student implements Runnable{

	@Override
	public void run() {
		System.out.println(" Student Runnable run method");
		
	}
	
}
class Manageer implements Runnable{

	@Override
	public void run() {
		System.out.println(" Manager Runnable run method");
		
	}
	
}
