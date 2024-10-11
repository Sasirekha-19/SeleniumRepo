package homeassignment.week3.day2;

public class JavaConnection implements DatabaseConnection {

    @Override
	public void connect() {
		System.out.println("Connect to database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect from the database");
	}

	@Override
	public void executeUpdate() {
		System.out.println("execute the update");
		
	}

	public static void main(String[] args) {
		 
		JavaConnection j = new JavaConnection();
		j.connect();
		j.disconnect();
		j.executeUpdate();
		
	}
}
