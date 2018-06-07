package dev.logic.mix.sec.one;

/**
 * Restrict Object Creation not more than 2 or 3 or any number
 * 
 * @author gauraw
 *
 */
public class RestrictObjectCreation {

	private static RestrictObjectCreation obj;
	private static int objCount = 0;

	private RestrictObjectCreation() {
		System.out.println("Singleton(): Private constructor invoked");
		objCount++;
	}

	public static RestrictObjectCreation getInstance() {
		// Only 3 objects are allowed. After that 3rd object will be returned every time
		if (objCount < 3) {
			obj = new RestrictObjectCreation();
		}

		return obj;
	}
}
