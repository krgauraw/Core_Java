package demo.polymorphism;

/**
 * @author gauraw
 *
 */
class Account {
	float getRateOfInterest() {
		return 0f;
	}
}

class SavingAccount extends Account {
	@Override
	float getRateOfInterest() {
		return 3.4f;
	}
}

class CurrentAccount extends Account {
	@Override
	float getRateOfInterest() {
		return 4.3f;
	}
}

class FixedDepositAccount extends Account {
	@Override
	float getRateOfInterest() {
		return 9.7f;
	}
}

// to test polymorphism.
public class P3 {

	public static void main(String[] args) {

		Account acc; //super class reference

		acc = new Account();
		System.out.println(acc.getRateOfInterest());

		if (acc instanceof Account) {
			System.out.println("acc is-a Account");
		}

		acc = new SavingAccount();
		System.out.println(acc.getRateOfInterest());

		if (acc instanceof SavingAccount) {
			System.out.println("acc is-a SavingAccount");
		}

		acc = new CurrentAccount();
		System.out.println(acc.getRateOfInterest());

		if (acc instanceof CurrentAccount) {
			System.out.println("acc is-a CurrentAccount");
		}

		acc = new FixedDepositAccount();
		System.out.println(acc.getRateOfInterest());

		if (acc instanceof FixedDepositAccount) {
			System.out.println("acc is-a FixedDepositAccount");
		}

		if (acc instanceof Object) {
			System.out.println("acc is-a Object");
		}
	}
}