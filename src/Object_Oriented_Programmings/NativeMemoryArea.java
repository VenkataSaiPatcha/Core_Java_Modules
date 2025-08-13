package Object_Oriented_Programmings;


class NativeClass
{
	public native void declare();
	
	
	static
	{
		System.loadLibrary("myLib");
	}
}
public class NativeMemoryArea 
{
	public static void main(String[] args) 
	{
		NativeClass n1 = new NativeClass();
		n1.declare();
		
	}
}
