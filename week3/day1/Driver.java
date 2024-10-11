package week3.day1;

public class Driver {

	public void loadurl(String url,boolean status) {
		System.out.println(url+" "+status);
	}
	
	public void loadurl(String url) {
		System.out.println(url);
	}
	
	public static void main(String[] args) {
		
		Driver d = new Driver();
		d.loadurl("https:www.testleaf.com", true);
		d.loadurl("https:www.google.com");
		
	}
}
