package Object_Oriented_Programmings;

class Animal02
{
	public void roam()
	{
		System.out.println("Generic animal is roaming");
	}
}
class Lion extends Animal02
{
	@Override
	public void roam()
	{
		System.out.println("Lion animal is roaming");
	}
}
class Dog02 extends Animal02
{
	public void roam()
	{
		System.out.println("Dog animal is roaming");
	}
}
public class PolymorphicDemo02 
{
	public static void main(String[] args) 
	{
		Animal02 a1 = null;
		a1 = new Lion();
		animalRoam(a1);
		a1 = new Dog02();
		animalRoam(a1);
		
	}
	public static void animalRoam(Animal02 animal)
	{
		animal.roam();
	}
}
