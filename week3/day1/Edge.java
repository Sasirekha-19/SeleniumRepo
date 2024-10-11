package week3.day1;

public class Edge extends Browser {

	public void  takeSnap() {
		System.out.println("take a snap");
	}
	public void clearCookies() {
		System.out.println("clear the cookies");
	}
	public static void main(String[] args) {
		
		Edge ee = new Edge();
		ee.CloseBrowser();
		ee.navigateBack();
		ee.openURL();
		ee.takeSnap();
		ee.clearCookies();
	}
}
