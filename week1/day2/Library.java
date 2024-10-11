package week1.day2;

public class Library {

	String addBook(String bookTitle) {
		
		System.out.println("Book added successfully");
		return "story";
	}
	
	public void issueBook() {
		
		System.out.println("Book issued suucessfully");
	}

	public static void main(String[] args) {
		
		Library lb = new Library();
		System.out.println(lb.addBook("story"));
		lb.issueBook();
	}
}