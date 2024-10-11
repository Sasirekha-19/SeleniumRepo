package week3.day2;

public abstract class CanaraBank implements Payments {

	public void upiPayments() {
		System.out.println("Gpay");
	}
		
	public void cardPayments() {
		System.out.println("Debit and credit cards");
		}
	public abstract void recordPaymentDetails();
}
