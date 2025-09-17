package MultiThread_Concepts;

class TrainTickets
{
	private  int availableTickets = 5;
	public synchronized void bookTrainTickets(int numberOfTickets)
	{
		while(availableTickets<numberOfTickets)
		{
			System.out.println("Not enough tickets are available waiting for cancelation");
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		availableTickets = availableTickets-numberOfTickets;
		System.out.println("Booked "+numberOfTickets+"  tickets remaining tickets are :"+availableTickets);
		notify();
	}
	public synchronized void cancelTickets(int numberOfTickets)
	{
		availableTickets = availableTickets+numberOfTickets;
		System.out.println("Cancled no of tickets ::"+numberOfTickets+" then availabe tickets are ::"+availableTickets);
		notify();
	}
	
}

public class SynchronizationDemo04
{
public static void main(String[] args)
{
	TrainTickets ticketSystem = new TrainTickets();
	Thread thread = new Thread()
			{
		@Override
			public void run()
			{
			int [] tickets = {2,4,4};
			for(int ticket :tickets)
			{
				ticketSystem.bookTrainTickets(ticket);
				try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
				
			}
			};
			thread.start();
			
			Thread thread2 = new Thread()
					{
				@Override
				public void run()
				{
					int cancelTickets[] = {1,3,2};
					for(int cancel : cancelTickets)
					{
						ticketSystem.cancelTickets(cancel);
						try
						{
							Thread.sleep(1000);
						}
						catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
					}
					
				}
					};
				thread2.start();
	
}
}
