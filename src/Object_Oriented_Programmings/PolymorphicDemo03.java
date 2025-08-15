package Object_Oriented_Programmings;

class Animal03
{
	public void roar()
	{
		System.out.println("Generic Animal is roaring");
	}
}
class Lion03 extends Animal03
{
	@Override
	public void roar()
	{
		System.out.println("Lion animal is roaring");
	}
	
	public void roam()
	{
		System.out.println("Lion03.roam()");
		
	}
}
class Dog03 extends Animal03
{
	
	@Override
	public void roar()
	{
		System.out.println("Dog animal is roaring");
	}
}

public class PolymorphicDemo03 
{
	public static void main(String[] args) 
	{
		Animal03 a1 = null;
		a1= new Lion03();
		animalRoar(a1);
		 
		a1 = new Dog03();
		animalRoar(a1);
		
	}
	public static void animalRoar(Animal03 animal)
	{
		if(animal instanceof Lion03)
		{
			Lion03 l1 = (Lion03)animal;
			l1.roar();
			l1.roam();
		}
		else
		{
			System.out.println(animal.toString()+" not an insatnce");
		}
		
	}

}
