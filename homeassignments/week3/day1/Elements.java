package homeassignments.week3.day1;

public class Elements extends Button{

	public static void main(String[] args) {
		
		Elements e = new Elements();
		Button b = new Button();
		CheckBoxButton c = new CheckBoxButton();
		RadioButton R = new RadioButton();
		e.click();
		e.setText("TestLeaf");
		e.submit();
		b.click();
		b.setText("TestLeaf");
		b.submit();
		c.click();
		c.setText("TestLeaf");
		c.submit();
		c.clickCheckButton();
		R.click();
		R.setText("TestLeaf");
		R.submit();
		System.out.println(R.selectRadioButton());
		
	}

}
