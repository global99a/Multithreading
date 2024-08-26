package multithreading;

public class ThreadClass {

 	public static void main(String[] args) {
		System.out.println("Welcome to threads");
		//this are the default methods in threads
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
	}

}
