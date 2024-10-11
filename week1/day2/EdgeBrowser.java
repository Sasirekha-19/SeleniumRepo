package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		
				Browser br = new Browser();
				
				br.launchBrowser("Chrome");
				String launchBrowser = br.launchBrowser("Chrome");
				System.out.println("Browser Name:" +launchBrowser);
				br.loadUrl();
			}
	}


