package week3.day2;

public class Amazon extends CanaraBank {


	public void cashOnDelivery() {
		
		System.out.println("cash on delivery available");
		}

	public void internetBanking() {
	
		System.out.println("HDFC net banking");
		}

	public void recordPaymentDetails() {
		System.out.println("payment details recorded");
		}


public static void main(String[] args) {
	
	
	Amazon a = new Amazon();
	a.cashOnDelivery();
	a.internetBanking();
	a.recordPaymentDetails();
	a.cardPayments();
	a.upiPayments();
}
}
