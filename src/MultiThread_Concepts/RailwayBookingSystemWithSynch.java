package MultiThread_Concepts;

class RailwayTickets implements Runnable
{
	private int availableTicket = 1;
	private int wantedTicket ;
	
	public RailwayTickets(int wantedTicket)
	{
		this.wantedTicket = wantedTicket;
	}
	
	@Override
	public synchronized void run() 
	{
		String name = null;
		if(availableTicket>= wantedTicket)
		{
			name = Thread.currentThread().getName();
			System.out.println(name+" have got the reservation in :"+wantedTicket+" ticket");
			availableTicket = availableTicket-wantedTicket;
		}
		else
		{
			name = Thread.currentThread().getName();
			System.out.println("Sorry "+name+" set is already booked");
		}
	}
}
public class RailwayBookingSystemWithSynch 
{
	public static void main(String[] args) throws InterruptedException
	{
		RailwayTickets r1 = new RailwayTickets(1);
		Thread t1 = new Thread(r1,"Sai");
		Thread t2 = new Thread(r1,"Venky");
		t2.start();
		t1.start();
//		t1.join();
		
		
	}

}
