package demo.custom.exception;

/**
 * @author gauraw
 *
 */
public class InvalidAmountNewImpl {
	public static void checkAmount(int amt) throws InvalidAmountException {
		if (amt < 1000) {
			throw new InvalidAmountException("Insufficient Balance!!!! You can't Transfer Money");
		}

	}

	public static void main(String[] args) throws Exception {

		int amount = 500;
		checkAmount(amount);
	}
}