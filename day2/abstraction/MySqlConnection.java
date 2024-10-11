package homeassignment.week3.day2.abstraction;

public abstract class MySqlConnection implements DatabaseConnection{

	public void connect() {
		System.out.println("connect to database");
	}
	
	public abstract void executeQuery();
}
