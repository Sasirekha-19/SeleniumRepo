package homeassignment.week3.day2.abstraction;

public interface DatabaseConnection {

	public void connect();
	
	public void disconnect();
	
	public void executeUpdate();
	
}
