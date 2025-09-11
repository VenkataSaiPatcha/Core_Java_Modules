package MultiThread_Concepts;

public class ThreadPriorityDemo01 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread();
		System.out.println("Thread priority by default ::"+t1.getPriority());
		
	}

}
