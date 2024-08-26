package multithreading;

public class ThreadOne {

	public static void main(String[] args) {
//		Thread t1=new Thread();
//		Thread t2=new Thread();
//		Thread t3=new Thread();
//		Thread t4=new Thread();
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
		 
//		System.out.println(t1);//Thread[Thread-0,5,main]
//		System.out.println(Thread.activeCount());
		
		Employee1 emp=new Employee1("emp");
		emp.start();
		
		Manager m1=new Manager();
		m1.start();
		System.out.println(Thread.activeCount());
	}

}
class Employee1 extends Thread{
	public Employee1(String tname){
		super(tname);
	}
	@Override
	public void run() {
		System.out.println("This is run from thread employee"+Thread.currentThread().getName()+ " "+ Thread.currentThread().getId());
		
	}
	
}
class Manager extends Thread{
	
	@Override
	public void run() {
		System.out.println("This is run from thread manager"+Thread.currentThread().getName()+ " "+ Thread.currentThread().getId());
		
	}
	
}







//class A{
//	
//	public void show()
//	{
//	System.out.println(Thread.currentThread().getName());
//	}
//}
