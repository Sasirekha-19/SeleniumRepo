package week3.day1;

public class Chrome extends Browser{

	 public void openIncognito() {
		 System.out.println("open the incognito tab");
	 }
	 public void  clearCache() {
		 System.out.println("Give clearcache");
	 }
	 public static void main(String[] args) {
		Chrome cc = new Chrome();
		System.out.println(cc.browserName);
		 cc.openURL();
		 cc.navigateBack();
		 cc.CloseBrowser();
		 cc.clearCache();
		 cc.openIncognito();
	}
}
