package MultiThread_Concepts;

class Foo extends Thread
{
	
}
public class ThreadPriorityDemo03 
{
	public static void main(String[] args) 
	{
		Thread t= Thread.currentThread();
		t.setPriority(Thread.MAX_PRIORITY);//10
		
		Foo f1 = new Foo();
		System.out.println("Child-1 thread priority is ::"+f1.getPriority());//10
//		f1.setPriority(11);
//		System.out.println("Child-2 thread priority is ::"+f1.getPriority());//10
	}

}
