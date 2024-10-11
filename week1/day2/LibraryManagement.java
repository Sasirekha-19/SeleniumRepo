package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		
		Library lb = new Library();
		
		lb.addBook("story");
		System.out.println(lb.addBook("story"));
		lb.issueBook();

	}

}
