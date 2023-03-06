package main.demo.enums;

public class EnumDemo {
	public static void main(String[] args) {
		PaymentType pt = PaymentType.DEBIT_CARD;
//		System.out.println(pt);

		PaymentType[] values = PaymentType.values(); // gives array of all values
		for (PaymentType paymentType : values) {
			System.out.println(paymentType + "->" + paymentType.ordinal()); // ordinal -> int number is assigned to each
																			// constant
			System.out.println(paymentType + "->" + paymentType.getFees()); 
		}
	}
}

enum PaymentType {
	CREDIT_CARD(5), DEBIT_CARD(10), CASH(1);

	int fees;

	PaymentType(int i) {
		this.fees = i;
	}

	public int getFees() {
		return this.fees;
	}
}


// Enum can be created as below also using class			
class PaymentT {
	static final PaymentT CREDIT_CARD = new PaymentT(); 
}