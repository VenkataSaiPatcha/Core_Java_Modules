package Object_Oriented_Programmings;
class DifferentValues
{
	public void acceptHetro(Object ...obj)
	{
		for(Object o1 : obj)
		{
			System.out.println(o1);
		}
	}
}
public class VarArgsDemo04
{
	public static void main(String[] args) 
	{
		DifferentValues d1 = new DifferentValues();
		//d1.acceptHetro(10,20,309.0,"Hello",'D',new Character('A'), new String("Welcome"),10.1,"hyd-01");
	}

}
