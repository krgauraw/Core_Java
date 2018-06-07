package demo.polymorphism;

/**
 * 
 * @author gauraw
 *
 */
interface Vegetarian {
	public void eat();
}

class Animal_1 implements Vegetarian {

	@Override
	public void eat() {
		System.out.println("Animal is eating..");
	}
}

public class Cow extends Animal_1 {
	@Override
	public void eat() {
		System.out.println("cow is eating grass...");
	}

	public static void main(String[] args) {

		Animal_1 animal;

		animal = new Animal_1();
		animal.eat();

		animal = new Cow();
		animal.eat();

		System.out.println(animal instanceof Animal_1);
		System.out.println(animal instanceof Cow);
		System.out.println(animal instanceof Vegetarian);
		System.out.println(animal instanceof Object);

	}
}