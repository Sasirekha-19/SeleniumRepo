package week3.day1;

public class Edge extends Browser1 {

	public void  takeSnap() {
		System.out.println("take a snap");
	}
	public void clearCookies() {
		System.out.println("clear the cookies");
	}
	public static void main(String[] args) {
		
		Edge ee = new Edge();
	    String browserName1 = ee.browserName;
	    System.out.println(browserName1);
	    float browserVersion1 = ee.browserVersion;
	    System.out.println(browserVersion1);
		ee.CloseBrowser();
		ee.navigateBack();
		ee.openURL();
		ee.takeSnap();
		ee.clearCookies();
	}
}
