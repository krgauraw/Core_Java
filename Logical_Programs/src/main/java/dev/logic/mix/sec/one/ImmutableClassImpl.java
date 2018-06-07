package dev.logic.mix.sec.one;

public class ImmutableClassImpl {

	public static void main(String[] args) {

		ImmutableClass obj = new ImmutableClass(10, 20);
		System.out.println("a=" + obj.getA());
		System.out.println("b=" + obj.getB());

	}
}
