package homeassignments.week3.day1;

public class APIClient {

	public void sendRequest(String endpoint) {
		
		System.out.println(endpoint);
	}
	
	public void sendRequest(String endpoint,String requestBody,Boolean requestStatus) {
		
		System.out.println(endpoint+","+requestBody+","+requestStatus);
	}
	
	public static void main(String[] args) {
		
		APIClient api = new APIClient();
		api.sendRequest("https://api.github.com/users/{username}");
		api.sendRequest("https://api.github.com/users/{username}","data sent by the API client to API server",true);
	}
}
