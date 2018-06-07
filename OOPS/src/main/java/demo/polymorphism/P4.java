package demo.polymorphism;

/**
 * 
 * @author gauraw
 *
 */
class Bank {
	public String getBankName() {
		return "Bank Name";
	}
}

class ICICI extends Bank {
	@Override
	public String getBankName() {
		return "ICICI Bank";
	}
}

class SBI extends Bank {
	@Override
	public String getBankName() {
		return "SBI Bank";
	}
}

class PNB extends Bank {
	@Override
	public String getBankName() {
		return "PNB Bank";
	}
}

public class P4 {
	public static void main(String[] args) {

		Bank bank;

		bank = new Bank();
		System.out.println(bank.getBankName());

		bank = new ICICI();
		System.out.println(bank.getBankName());

		bank = new SBI();
		System.out.println(bank.getBankName());

		bank = new PNB();
		System.out.println(bank.getBankName());
	}
}