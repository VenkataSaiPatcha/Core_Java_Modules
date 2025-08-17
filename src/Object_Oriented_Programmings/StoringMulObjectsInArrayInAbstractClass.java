package Object_Oriented_Programmings;

abstract class Animal04
{
	public abstract void checkUp();
}
class Lion04 extends Animal04
{
	protected String name;
	public Lion04(String name)
	{
		this.name=name;
	}
	@Override
	public void checkUp()
	{
		System.out.println(name+" lion is roaring");
	}
}
class Elephant extends Animal04
{
	protected String name;
	
	public Elephant(String name)
	{
		this.name=name;
	}
	@Override
	public void checkUp()
	{
		System.out.println(name+" elephant is big in size");
	}
}
class Horse extends Animal04
{
	protected String name;
	public Horse(String name)
	{
		this.name=name;
	}
	@Override
	public void checkUp()
	{
		System.out.println(name+"  horse is runnign fast");
	}
}
public class StoringMulObjectsInArrayInAbstractClass 
{
	public static void main(String[] args) 
	{
		Lion04[] lion = {new Lion04("simba"), new Lion04("MyLion")};
		Elephant[] elephant = {new Elephant("Erawat"), new Elephant("MyElephant")};
		Horse[] horse = {new Horse("Kajal"), new Horse("MyHorse")};
		visitZooForCheckUp(lion);
		System.out.println("----------------");
		visitZooForCheckUp(elephant);
		System.out.println("-------------------");
		visitZooForCheckUp(horse);
	}
	public static void visitZooForCheckUp(Animal04 ...animal)
	{
		for(Animal04 an: animal)
		{
			an.checkUp();
		}
	}
}
