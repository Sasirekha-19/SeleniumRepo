package week3.day1;

public class Chrome extends Browser1{

	 public void openIncognito() {
		 System.out.println("open the incognito tab");
	 }
	 public void  clearCache() {
		 System.out.println("Give clearcache");
	 }
	 public static void main(String[] args) {
		Chrome cc = new Chrome();
		System.out.println(cc.browserName);
		System.out.println(cc.browserVersion);
		 cc.openURL();
		 cc.navigateBack();
		 cc.CloseBrowser();
		 cc.clearCache();
		 cc.openIncognito();
	}
}
