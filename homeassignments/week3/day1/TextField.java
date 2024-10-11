package homeassignments.week3.day1;

public class TextField extends WebElement {
	
	public void getText() {
		System.out.println("text is retrived");
	}
	
	public static void main(String[] args) {
		
		TextField t = new TextField();
		t.click();
		t.setText("TestLeaf");
		t.getText();
	}
}
