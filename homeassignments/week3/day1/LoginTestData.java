package homeassignments.week3.day1;

public class LoginTestData extends TestData {

	private void enterUsername() {

			System.out.println("Demo1");
	}
		protected void enterPassword(){
			System.out.println("pass@23");
		}

		public static void main(String[] args) {
			
			LoginTestData log = new LoginTestData();
			log.enterCredentials("Demo", "pass@123");
			System.out.println(log.navigateToHomePage());
			log.enterUsername();
			log.enterPassword();
		}
}
