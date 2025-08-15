package Object_Oriented_Programmings;

class Instance
{
	
}
public class InstanceofDemo1 
{
	public static void main(String[] args) 
	{
		Instance i1 = new Instance();
		if(i1 instanceof Instance)
		{
			System.out.println("InstanceofDemo1.main()");
		}
	}

}
