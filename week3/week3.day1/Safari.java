package week3.day1;

//Method Overriding

public class Safari extends Browser1{

	public void openURL() {
		System.out.println("open the new url");
}


public static void main(String[] args) {
	
	Safari s = new Safari();
	s.openURL();
}
}