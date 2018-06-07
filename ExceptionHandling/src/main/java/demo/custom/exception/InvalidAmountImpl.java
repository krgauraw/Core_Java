package demo.custom.exception;

/**
 * @author gauraw
 *
 */
public class InvalidAmountImpl {
	public static void main(String[] args) throws Exception {
		int amount = 500;

		if (amount < 1000) {
			throw new InvalidAmountException("Insufficient Balance!!!! You can't Transfer Money");
		}
	}
}