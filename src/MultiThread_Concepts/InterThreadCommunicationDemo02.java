package MultiThread_Concepts;

class ITC extends Thread
{
	private int val = 0;
	
	@Override
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			val = val+i;
		}
	}
	public int getIntValue()
	{
		return this.val;
	}
}
public class InterThreadCommunicationDemo02 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Main method started");
		ITC  t1= new ITC();
		
		t1.start();
		Thread.sleep(1);
		System.out.println(t1.getIntValue());
		System.out.println("Main method ended");
		
		
		
	}

}
