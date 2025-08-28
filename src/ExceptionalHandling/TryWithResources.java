package ExceptionalHandling;

import java.io.Closeable;
import java.io.IOException;

class DataBaseResources implements AutoCloseable
{
	@Override
	public void close() throws java.lang.Exception
	{
		System.out.println("Data Base Resources closed");
	}
}
class FileResources implements Closeable
{
	@Override
	public void close() throws IOException 
	{
		System.out.println("File resource is closed");
		
	}
}
public class TryWithResources 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Main method started");
		DataBaseResources d1 = new DataBaseResources();
		FileResources f1 = new FileResources();
		try(d1;f1)
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero");
		}
		System.out.println("Main method ended");
	}

}
