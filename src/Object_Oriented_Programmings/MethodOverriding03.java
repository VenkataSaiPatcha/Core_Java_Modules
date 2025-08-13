package Object_Oriented_Programmings;

class Animal
{
	public void eat()
	{
		System.out.println("Generic Animal is eating");
	}
}
class Dog extends Animal
{
	@Override
	public void eat()
	{
		System.out.println("Dog animal is eating");
	}
}
class puppy extends Animal
{
	
}
public class MethodOverriding03 
{
	public static void main(String[] args) 
	{
		Animal a1 = new puppy();
		a1.eat();
		Animal a2 = new Dog();
		a2.eat();
	}

}
