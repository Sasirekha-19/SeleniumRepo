package challenge.java;

public class JavaChallenge1 {

	public static void main(String[] args) {
		
		//Example 1:
		String s = "Hello World";
		String substring = s.substring(6);
		System.out.println("Last word in the string:" +substring);
		System.out.println("The Length of the last word is:" +substring.length());
		
		//Example 2:
		String s1 = "  fly me  to  the moon ";
		String substring1 = s1.substring(18,22);
		System.out.println("Last word in the string:" +substring1);
		int length = substring1.length();
		System.out.println("The Length of the last word is:" +length);
		
		//Example 3
		String s2 = "luffy is still joyboy";
        String substring2 = s2.substring(15);
		System.out.println("Last word in the string:" +substring2);
		int length1 = substring2.length();
		System.out.println("The Length of the last word is:" +length1);
		

	}

}
