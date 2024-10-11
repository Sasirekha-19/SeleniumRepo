package homeassignment.week3.day2.abstraction;

public class JavaConnection extends MySqlConnection {

    @Override
	public void disconnect() {
		System.out.println("disconnect from the database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("execute the update");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("execute a query");
		
	}

	public static void main(String[] args) {
		
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
		
	}
}
