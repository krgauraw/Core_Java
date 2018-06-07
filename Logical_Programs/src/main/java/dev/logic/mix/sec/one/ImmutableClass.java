package dev.logic.mix.sec.one;

/*
 * Immutable class:

Make class final so that it should not be inherited.
All the variables should be private so should not be accessible outside of class. 
Make all variables final so that value can not be changed.
A constructor to assign values to variables in class.
Do not add any setter methods.
*/

/**
 * @author gauraw
 *
 */
public final class ImmutableClass {

	private final int a;
	private final int b;

	ImmutableClass(int x, int y) {
		a = x;
		b = y;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
}
