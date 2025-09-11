package MultiThread_Concepts;

class UserThread01 extends Thread
{
	
}
public class ThreadPriorityDemo02 
{
	public static void main(String[] args) 
	{
		int priority = Thread.currentThread().getPriority();
		System.out.println("Main thread priority is ::"+priority);
		
		UserThread01 u1 = new UserThread01();
		System.out.println("user thread priority is ::"+u1.getPriority());
	}

}
