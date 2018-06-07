package demo.polymorphism;

/**
 * Runtime Polymorphism demo
 * 
 * @author gauraw
 *
 */

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	@Override
	void eat() {
		System.out.println("eating bread...");
	}
}

class Cat extends Animal {
	@Override
	void eat() {
		System.out.println("eating rat...");
	}
}

class Lion extends Animal {
	@Override
	void eat() {
		System.out.println("eating meat...");
	}
}

public class P2 {

	public static void main(String[] args) {

		Animal a; // Reference Variable.

		a = new Animal();
		a.eat();

		if (a instanceof Animal) {
			System.out.println("Object a is an Animal");
		}

		if (a instanceof Object) {
			System.out.println("Object a is an Object");
		}

		a = new Dog();
		a.eat();

		if (a instanceof Dog) {
			System.out.println("Object a is a Dog");
		}

		a = new Cat();
		a.eat();

		if (a instanceof Cat) {
			System.out.println("Object a is a Cat");
		}

		a = new Lion();
		a.eat();

		if (a instanceof Lion) {
			System.out.println("Object a is a Lion");
		}

	}
}