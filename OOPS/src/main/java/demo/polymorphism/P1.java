package demo.polymorphism;

/**
 * Polymorphism concept demo. Dynamic Method Dispatch or Run time binding.
 * 
 * @author gauraw
 *
 */
class Shape {
	void draw() {
		System.out.println("Drawing Shape..");
	}
}

class Rectangle extends Shape //sub class 1
{
	@Override
	void draw() {
		System.out.println("Drawing Rectangle..");
	}
}

class Triangle extends Shape // sub class 2
{
	@Override
	void draw() {
		System.out.println("Drawing Triangle..");
	}
}

//class to test polymorphism.
public class P1 {

	public static void main(String[] args) {

		Shape s; //super class reference variable

		s = new Shape(); // super class object
		s.draw();

		if (s instanceof Shape) {
			System.out.println("Object s is a Shape");
		}

		if (s instanceof Object) {
			System.out.println("Object s is an Object");
		}

		s = new Rectangle(); // sub class 1 object
		s.draw(); // at compile time, method signature is checked from Shape class but at runtime draw() of Rectangle class will be invoked.

		if (s instanceof Rectangle) {
			System.out.println("Object s is a Rectangle");
		}

		s = new Triangle(); //sub class 2 object
		s.draw(); // at compile time, method signature is checked from Shape class but at runtime draw() of Triangle class will be invoked.

		if (s instanceof Triangle) {
			System.out.println("Object s is a Triangle");
		}

	}
}