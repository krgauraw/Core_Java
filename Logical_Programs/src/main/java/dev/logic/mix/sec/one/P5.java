package dev.logic.mix.sec.one;

class A {
}

class B extends A {
}

class C extends B {
}

public class P5 {
	public static void main(String[] args) {

		A a1 = new B();
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof C);

	}
}
