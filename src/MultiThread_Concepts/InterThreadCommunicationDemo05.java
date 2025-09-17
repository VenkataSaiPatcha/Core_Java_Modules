package MultiThread_Concepts;

class ITCTickets
{
	private int availableTickets = 5;
	
	public synchronized void bookTicket(int numberOfTickets)  // 2
	{
		while(availableTickets<numberOfTickets)
		{
			System.out.println("No enough tickets available waiting for canclation....");
			try
			{
				wait(); // lock is released
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			availableTickets = availableTickets - numberOfTickets;
			System.out.println("Booked "+numberOfTickets+"After booking remaining tickets are ::"+availableTickets);
			// 3  0
			notify();
		}
	}
	
	public synchronized void cancelTickets(int numberOfTickets)
	{
		availableTickets = availableTickets+numberOfTickets;
		System.out.println("Cancled "+numberOfTickets+" then available tickers are"+availableTickets);
		notify();
	}
}
public class InterThreadCommunicationDemo05 
{
	public static void main(String[] args) 
	{
		ITCTickets it = new ITCTickets(); 
		
		Thread bookingTicket = new Thread()
				{
					@Override
					public void run()
					{
						int [] ticketsToBook = {2,4,4};
						for(int ticket:ticketsToBook)
						{
							it.bookTicket(ticket);
							try
							{
								Thread.sleep(1000); // gives some time between booking
							}
							catch (InterruptedException e) 
							{
								e.printStackTrace();
							}
						}
					}
				};
				bookingTicket.start();
				
				Thread cancelTickets = new Thread()
						{
					@Override
					public void run()
					{
						int cancelTickets [] = {1,3,2};
						
						for(int ticket:cancelTickets)
						{
							it.cancelTickets(ticket);
						}
					}
						};
						cancelTickets.start();
				
	}

}
