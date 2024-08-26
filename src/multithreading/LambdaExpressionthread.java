package multithreading;

public class LambdaExpressionthread {

	public static void main(String[] args) throws Exception {
		Runnable r1=()->
		{
			for(int i=0;i<10;i++)
			{
			System.out.println("HI");
			}
		};
		
		Runnable r2=()->{
			for(int i=0;i<10;i++)
			{
			System.out.println("Hello");
			}
			};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		//t1.join();//after t1, t2 executes
		t1.sleep(1000);
		t2.start();
		
		System.out.println(Thread.currentThread().activeCount());

	}

}
