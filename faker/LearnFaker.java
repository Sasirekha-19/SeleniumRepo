package faker;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

public class LearnFaker {

	public static void main(String[] args) {
		
		Faker fak = new Faker();
		
		Name name = fak.name();
		
		String[][] data= new String [10][10];
		
		for(int i=0;i<10;i++) {
			String firstName = fak.name().firstName();
			for(int j=0;j<10;j++) {
				//System.out.println(firstName);
				data[j][i]=firstName;
			}
		}
		for(int i=0;i<10;i++) {
			String lastName = fak.name().lastName();
			for(int j=0;j<10;j++) {
				//System.out.println(lastName);
				data[j][i]=lastName;
			}
		}
		
	}

}
