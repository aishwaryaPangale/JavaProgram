import java.util.*;
abstract class Animal
{
	abstract void makeSound();
	{
	}
}
class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("I am Dogiii");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("I am mau ");
	}
}
public class AnimalApp
{
	public static void main(String x[])
	{
		Dog d = new Dog();
		d.makeSound();
		Cat c = new Cat();
		c.makeSound();
	}
}
