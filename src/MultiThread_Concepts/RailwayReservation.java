package MultiThread_Concepts;

class TrainSeats implements Runnable
{
	private int availableSeat=1;
	private int wantedSeat;
	
	public TrainSeats(int wantedSeat)
	{
		this.wantedSeat=wantedSeat;
	}
	@Override
	public void run()
	{
		String name = null;
		
		if(availableSeat>=wantedSeat)
		{
			name  = Thread.currentThread().getName();
			System.out.println(wantedSeat+" bearth is reserved for ::"+name);
			availableSeat = availableSeat-wantedSeat;
		}
		else
		{
			System.out.println(availableSeat+" seats are available");
			name = Thread.currentThread().getName();
			System.out.println("Sorry!! "+name+" tickets are not available");
		}
	}
}

public class RailwayReservation {

	public static void main(String[] args) 
	{
		TrainSeats s1 = new TrainSeats(1);
		Thread t1 = new Thread(s1,"venkat");
		Thread t2 = new Thread(s1,"sai");
		t1.start();
		t2.start();
	}

}
