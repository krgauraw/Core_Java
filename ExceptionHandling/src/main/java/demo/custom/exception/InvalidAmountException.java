package demo.custom.exception;

/**
 * @author gauraw
 *
 */
public class InvalidAmountException extends Exception {
	InvalidAmountException(String msg) {
		super(msg);
	}
}