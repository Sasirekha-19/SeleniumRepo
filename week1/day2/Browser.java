package week1.day2;

public class Browser {

	public String launchBrowser(String BrowserName) {
		
		System.out.println("Browser launched successfully");
		return "Chrome";
		
	}
    void loadUrl()
	{
		System.out.println("Application url loaded successfully");
}


public static void main(String[] args) {
	
	Browser br = new Browser();
	String launchBrowser = br.launchBrowser("Chrome");
	System.out.println("Browser Name:" +launchBrowser);
	br.loadUrl();
}
}